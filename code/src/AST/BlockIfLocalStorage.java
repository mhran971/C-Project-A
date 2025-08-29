package AST;

public class BlockIfLocalStorage implements BlockIf{
    //LocalStorage Dot declarationName LeftParen contentLocalStorage RightParen eos
    String LocalStorage;
    DeclarationName declarationName;
    ContentLocalStorage contentLocalStorage;

    public String getLocalStorage() {
        return LocalStorage;
    }

    public void setLocalStorage(String localStorage) {
        LocalStorage = localStorage;
    }

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public ContentLocalStorage getContentLocalStorage() {
        return contentLocalStorage;
    }

    public void setContentLocalStorage(ContentLocalStorage contentLocalStorage) {
        this.contentLocalStorage = contentLocalStorage;
    }

    @Override
    public String toString() {
        return "BlockIfLocalStorage=" +
                '\n' +"LocalStorage=" + LocalStorage +
                '\n'+ declarationName +
                '\n' +"contentLocalStorage=" + contentLocalStorage
                ;
    }
}
