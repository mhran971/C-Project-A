package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDelete implements ClassBody{
    // declarationName LeftParen STRING Colon Number RightParen LeftBrace functionDeleteContent* RightBrace
    DeclarationName declarationName;
    String STRING,Number;
    List<FunctionDeleteContent>functionDeleteContent=new ArrayList<FunctionDeleteContent>();

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public List<FunctionDeleteContent> getFunctionDeleteContent() {
        return functionDeleteContent;
    }

    public void setFunctionDeleteContent(List<FunctionDeleteContent> functionDeleteContent) {
        this.functionDeleteContent = functionDeleteContent;
    }

    @Override
    public String toString() {
        return "FunctionDelete=" +
                '\n' + declarationName +
                '\n' +"STRING=" + STRING +
                '\n' + "Number=" + Number +
                '\n' + "functionDeleteContent=" + functionDeleteContent
                ;
    }
}
