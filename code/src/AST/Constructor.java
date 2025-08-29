package AST;

import java.util.ArrayList;
import java.util.List;

public class Constructor implements ClassBody {
    //Constructor LeftParen type reservedWord Colon reservedWord RightParen LeftBrace RightBrace
    String Constructor;
    Type type;
    List<ReservedWord>reservedWord=new ArrayList<ReservedWord>();

    public String getConstructor() {
        return Constructor;
    }

    public void setConstructor(String constructor) {
        Constructor = constructor;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<ReservedWord> getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(List<ReservedWord> reservedWord) {
        this.reservedWord = reservedWord;
    }

    @Override
    public String toString() {
        return "Constructor=" +
                '\n' +"Constructor=" + Constructor +
                '\n' +"type=" + type +
                '\n' +"reservedWord=" + reservedWord
                ;
    }
}
