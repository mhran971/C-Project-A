package AST;

import java.util.ArrayList;
import java.util.List;

public class FilterArrow {
    // declarationName QuestionDot declarationName AndAnd?
    // |declarationName Dot declarationName NotEqual2 declarationName Dot declarationName
    List<DeclarationName>declarationName=new ArrayList<DeclarationName>();

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    @Override
    public String toString() {
        return  ""+'\n'+declarationName
                ;
    }
}
