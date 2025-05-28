def highlight_differences(original_text, corrected_text):
    from difflib import ndiff
    diff = ndiff(original_text.splitlines(), corrected_text.splitlines())
    highlighted = []
    for line in diff:
        if line.startswith('+ '):
            highlighted.append(f"<span style='color: green;'>{line[2:]}</span>")
        elif line.startswith('- '):
            highlighted.append(f"<span style='color: red; text-decoration: line-through;'>{line[2:]}</span>")
        else:
            highlighted.append(line[2:])
    return '<br>'.join(highlighted)