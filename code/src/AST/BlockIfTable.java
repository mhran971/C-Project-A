package AST;

public class BlockIfTable implements BlockIf{
    //keyword Dot reservedWord Dot declarationName LeftParen LeftBracket stringLiteral RightBracket RightParen eos
    Keyword keyword;
    ReservedWord reservedWord;
    DeclarationName declarationName;
    StringLiteral stringLiteral;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "BlockIfTable=" +
                '\n'  + keyword +
                '\n' +"reservedWord=" + reservedWord +
                '\n' + declarationName +
                '\n' +"stringLiteral=" + stringLiteral
                ;
    }
}
