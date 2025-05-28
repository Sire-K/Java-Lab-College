from flask import Flask, render_template, request
import language_tool_python

app = Flask(__name__)
tool = language_tool_python.LanguageTool('en-US')

def highlight_differences(original: str, corrected: str) -> str:
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

@app.route('/', methods=['GET', 'POST'])
def index():
    original = ''
    output = ''
    highlighted = ''
    mode = 'grammar'  # no alternative modes now

    if request.method == 'POST':
        original = request.form.get('text_input', '')

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
