package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlButton implements HtmlElementContent{
    //(STRING || reservedWord) Assign stringLiteral (keyword Assign stringLiteral)? Greater  declarationName*
    String STRING;
    ReservedWord reservedWord;
    Keyword keyword;
    List<StringLiteral>stringLiteral=new ArrayList<StringLiteral>();
    List<DeclarationName>declarationName=new ArrayList<DeclarationName>();

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
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

    @Override
    public String toString() {
        if(STRING!=null&&keyword!=null){
            return "HtmlButton=" +
                    '\n' +"STRING=" + STRING +
                    '\n' +"stringLiteral=" + stringLiteral +
                    '\n' +"keyword=" + keyword +
                    '\n' +"stringLiteral=" + stringLiteral +
                    '\n' +"declarationName=" + declarationName
                    ;
        }
        if(STRING!=null){
            return "HtmlButton=" +
                    '\n' +"STRING=" + STRING +
                    '\n' +"stringLiteral=" + stringLiteral +
                    '\n' +"declarationName=" + declarationName
                    ;
        }
        if(reservedWord!=null&&keyword!=null){
            return "HtmlButton=" +
                    '\n' +"ReservedWord=" + reservedWord +
                    '\n' +"stringLiteral=" + stringLiteral +
                    '\n' +"keyword=" + keyword +
                    '\n' +"stringLiteral=" + stringLiteral +
                    '\n' +"declarationName=" + declarationName
                    ;
        }
        return "HtmlButton=" +
                '\n' +"ReservedWord=" + reservedWord +
                '\n' +"stringLiteral=" + stringLiteral +
                '\n' +"declarationName=" + declarationName
                ;
    }
}
