package AST;
public class HtmlTagNameStart {
    // Less tagName (keyword Assign stringLiteral)? Greater
    TagName tagName;
    Keyword keyword;
    StringLiteral stringLiteral;
    String Greater;

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getGreater() {
        return Greater;
    }

    public void setGreater(String greater) {
        Greater = greater;
    }

    @Override
    public String toString() {
        if(keyword!=null){
            return '\n'+""+keyword +
                    "stringLiteral=" + stringLiteral +'\n'
                    ;
        }
        return ""
                ;
    }
}