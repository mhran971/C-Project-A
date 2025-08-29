package AST;

import java.util.ArrayList;
import java.util.List;

public class BlockIfEllipsis implements BlockIf{
    //declarationName Dot declarationName LeftParen LeftBrace Ellipsis keyword Dot declarationName RightBrace RightParen eos
    List<DeclarationName>declarationName=new ArrayList<DeclarationName>();
    Keyword keyword;

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "BlockIfEllipsis=" +
                '\n' + declarationName +
                '\n' + keyword
                ;
    }
}
