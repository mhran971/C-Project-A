package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpressionIf {
    //Typeof Window NotEqual2 stringLiteral AndAnd Typeof LocalStorage NotEqual2 stringLiteral
    //|keyword Dot declarationName QuestionDot declarationName DoubleEqual declarationName Dot declarationName
    List<String>typeof=new ArrayList<String>();
    String  Window;
    Keyword keyword;
    String LocalStorage;
    List<StringLiteral>stringLiteral=new ArrayList<StringLiteral>();
    List<DeclarationName>declarationName=new ArrayList<DeclarationName>();

    public List<String> getTypeof() {
        return typeof;
    }

    public void setTypeof(List<String> typeof) {
        this.typeof = typeof;
    }

    public String getWindow() {
        return Window;
    }

    public void setWindow(String window) {
        Window = window;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public List<StringLiteral> getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(List<StringLiteral> stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    public String getLocalStorage() {
        return LocalStorage;
    }

    public void setLocalStorage(String localStorage) {
        LocalStorage = localStorage;
    }

    @Override
    public String toString() {

        if(typeof!=null){
            return '\n'+"declarationName=" + typeof +
                    '\n'+ "declarationName=" + Window +
                    '\n'+ "declarationName=" + LocalStorage +
                    '\n'+ "stringLiteral=" + stringLiteral
                    ;
        }
        return ""+'\n' + keyword +
                '\n' + declarationName
                ;
    }
}
