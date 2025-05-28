from flask import Flask, render_template, request
import language_tool_python
import os
import openai

app = Flask(__name__)
tool = language_tool_python.LanguageTool('en-US')

# OpenAI
openai.api_key = os.getenv('OPENAI_API_KEY')

def highlight_differences(original: str, corrected: str) -> str:
    """
    Highlight differences between original and corrected text by wrapping changes in <mark> tags.
    """
    import difflib
    matcher = difflib.SequenceMatcher(None, original, corrected)
    highlighted = ''
    last_pos = 0
    for block in matcher.get_matching_blocks():
        start, size = block.b, block.size
        if start > last_pos:
            segment = corrected[last_pos:start]
            highlighted += f"<mark>{segment}</mark>"
        highlighted += corrected[start:start+size]
        last_pos = start + size
    return highlighted

def paraphrase_novelistic(text: str) -> str:
    """
    Use OpenAI GPT to paraphrase text in a novelistic, literary tone.
    """
    prompt = (
        "Paraphrase the following text in a rich, novelistic style, preserving meaning:\n"
        f"\"\"\"{text}\"\"\""
    )
    response = openai.ChatCompletion.create(
        model="gpt-3.5-turbo",
        messages=[
            {"role": "system", "content": "You are a literary editor."},
            {"role": "user", "content": prompt}
        ],
        temperature=0.8,
        max_tokens=500
    )
    return response.choices[0].message.content.strip()

@app.route('/', methods=['GET', 'POST'])
def index():
    original = ''
    output = ''
    highlighted = ''
    mode = 'grammar'  # default mode

    if request.method == 'POST':
        original = request.form.get('text_input', '')
        mode = request.form.get('mode', 'grammar')

        if mode == 'novelistic':
            output = paraphrase_novelistic(original)
        else:
            matches = tool.check(original)
            output = language_tool_python.utils.correct(original, matches)

        highlighted = highlight_differences(original, output)

    return render_template(
        'index.html',
        original_text=original,
        output_text=output,
        highlighted_text=highlighted,
        mode=mode
    )

if __name__ == '__main__':
    app.run(debug=True)