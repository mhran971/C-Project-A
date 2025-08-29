package AST;

import java.util.ArrayList;
import java.util.List;

public class ContentJSON {
    //LocalStorage Dot declarationName LeftParen stringLiteral RightParen OrOr stringLiteral
    String LocalStorage;
    DeclarationName declarationName;
    List<StringLiteral>stringLiteral=new ArrayList<StringLiteral>();

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

    public List<StringLiteral> getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(List<StringLiteral> stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return
                '\n' +"LocalStorage=" + LocalStorage +
                '\n'  + declarationName +
                '\n' +"stringLiteral=" + stringLiteral
                ;
    }
}
