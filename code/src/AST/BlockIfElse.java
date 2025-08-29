package AST;

public class BlockIfElse implements BlockIf{
    //contentElse
    ContentElse contentElse;

    public ContentElse getContentElse() {
        return contentElse;
    }

    public void setContentElse(ContentElse contentElse) {
        this.contentElse = contentElse;
    }

    @Override
    public String toString() {
        return "BlockIfElse=" +
                '\n'+"contentElse=" + contentElse
                ;
    }
}
