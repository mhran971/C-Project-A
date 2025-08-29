package AST;

public class BlockIfJSON implements BlockIf{
    //keyword STRING Assign JSONParse LeftParen  contentJSON RightParen eos
    Keyword keyword;
    String STRING;
    String JSONParse;
    ContentJSON contentJSON;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getJSONParse() {
        return JSONParse;
    }

    public void setJSONParse(String JSONParse) {
        this.JSONParse = JSONParse;
    }

    public ContentJSON getContentJSON() {
        return contentJSON;
    }

    public void setContentJSON(ContentJSON contentJSON) {
        this.contentJSON = contentJSON;
    }

    @Override
    public String toString() {
        return "BlockIfJSON=" +
                '\n' + keyword +
                '\n' +"STRING=" + STRING +
                '\n' + "JSONParse=" + JSONParse +
                '\n' +"contentJSON=" + contentJSON
                ;
    }
}
