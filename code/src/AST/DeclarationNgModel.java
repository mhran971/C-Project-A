package AST;

import java.util.ArrayList;
import java.util.List;

public class DeclarationNgModel implements HtmlElementContent{
    //LeftBracket  NgModel RightBracket Assign stringLiteral (declarationName Assign stringLiteral Div)?  Greater
    String NgModel;
    DeclarationName declarationName;
    List<StringLiteral>stringLiteral=new ArrayList<StringLiteral>();

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

    public String getNgModel() {
        return NgModel;
    }

    public void setNgModel(String ngModel) {
        NgModel = ngModel;
    }

    @Override
    public String toString() {
        return "DeclarationNgModel=" +
                '\n' +"NgModel=" + NgModel +
                '\n' +"declarationName=" + declarationName +
                '\n' +"stringLiteral=" + stringLiteral
                ;
    }
}
