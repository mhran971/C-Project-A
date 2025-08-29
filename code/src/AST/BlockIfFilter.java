package AST;

import java.util.ArrayList;
import java.util.List;

public class BlockIfFilter implements BlockIf{
    //keyword STRING Assign declarationName Dot declarationName LeftParen  contentFilter  RightParen eos
    Keyword keyword;
    String STRING;
    List<DeclarationName>declarationName=new ArrayList<DeclarationName>();
    ContentFilter contentFilter;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    public ContentFilter getContentFilter() {
        return contentFilter;
    }

    public void setContentFilter(ContentFilter contentFilter) {
        this.contentFilter = contentFilter;
    }

    @Override
    public String toString() {
        return "BlockIfFilter=" +
                '\n'  + keyword +
                '\n' +"STRING=" + STRING +
                '\n'  + declarationName +
                '\n' + "contentFilter=" + contentFilter
                ;
    }
}
