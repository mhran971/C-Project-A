package AST;

public class DeclarationNumber implements HtmlElementContent{
    //declarationName  Number?
   DeclarationName declarationName;
    String Number;

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "DeclarationNumber=" +
                '\n' + "DeclarationName=" + declarationName +
                '\n' +"Number=" + Number
                ;
    }
}
