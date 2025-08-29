package AST;

import java.util.ArrayList;
import java.util.List;

public class ContentElse {
    // keyword Dot declarationName Assign LeftBracket Ellipsis keyword Dot declarationName
    //      (Comma Ellipsis declarationName)? RightBracket eos

    List<Keyword>keyword=new ArrayList<Keyword>();
    List<DeclarationName> declarationName=new ArrayList<DeclarationName>();

    public List<Keyword> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<Keyword> keyword) {
        this.keyword = keyword;
    }

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    @Override
    public String toString() {
        return  ""+'\n' + keyword +
                '\n' + declarationName
                ;
    }
}
