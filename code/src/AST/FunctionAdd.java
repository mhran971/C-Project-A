package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionAdd implements ClassBody {
    // declarationName LeftParen RightParen LeftBrace functionAddContent* RightBrace
    DeclarationName declarationName;
    List<FunctionAddContent>functionAddContent=new ArrayList<FunctionAddContent>();

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public List<FunctionAddContent> getFunctionAddContent() {
        return functionAddContent;
    }

    public void setFunctionAddContent(List<FunctionAddContent> functionAddContent) {
        this.functionAddContent = functionAddContent;
    }

    @Override
    public String toString() {
        return "FunctionAdd=" +
                '\n' + declarationName +
                '\n'+"functionAddContent=" + functionAddContent
                ;
    }
}
