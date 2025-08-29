package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeleteContent {
    //keyword declarationName Assign keyword Dot declarationName Dot
    //         declarationName LeftParen declarationName Comma STRING RightParen LeftBracket STRING  RightBracket eos
    //         |ifStatement
    List<Keyword>keyword=new ArrayList<Keyword>();
    List<DeclarationName>declarationName=new ArrayList<DeclarationName>();
    List<String>STRING=new ArrayList<String>();
    IfStatement ifStatement;

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

    public List<String> getSTRING() {
        return STRING;
    }

    public void setSTRING(List<String> STRING) {
        this.STRING = STRING;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    @Override
    public String toString() {
        if(ifStatement!=null){
            return "ifStatement=" + ifStatement
                    ;
        }
        return ""+'\n'+ keyword +
                '\n' + declarationName +
                '\n'+"STRING=" + STRING+'\n'
                  ;
    }
}
