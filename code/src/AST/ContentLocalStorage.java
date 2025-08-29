package AST;

import java.util.ArrayList;
import java.util.List;

public class ContentLocalStorage {
    // stringLiteral Comma declarationName Dot declarationName LeftParen declarationName RightParen
    List<DeclarationName> declarationName=new ArrayList<DeclarationName>();
    StringLiteral stringLiteral;

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
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
        return "ContentLocalStorage=" +
                '\n' + declarationName +
                '\n' +"stringLiteral=" + stringLiteral
                ;
    }
}
