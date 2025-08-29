package AST;

public class BlockIfNullLiteral implements  BlockIf{
    //keyword Dot declarationName Assign NullLiteral eos
    Keyword keyword;
    DeclarationName declarationName;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    @Override
    public String toString() {
        return "BlockIfNullLiteral=" +
                '\n' + keyword +
                '\n' + declarationName
                ;
    }
}
