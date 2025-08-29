package AST;

public class ElseStatement {
    //keyword LeftBrace contentElse RightBrace
    Keyword keyword;
    ContentElse contentElse;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public ContentElse getContentElse() {
        return contentElse;
    }

    public void setContentElse(ContentElse contentElse) {
        this.contentElse = contentElse;
    }

    @Override
    public String toString() {
        return "" +
                '\n' + keyword +
                '\n'+"contentElse=" + contentElse
                ;
    }
}
