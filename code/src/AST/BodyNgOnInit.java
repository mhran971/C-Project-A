package AST;

public class BodyNgOnInit {
    //ifStatement elseStatement?
    IfStatement ifStatement  ;
    ElseStatement elseStatement;

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    @Override
    public String toString() {
        return  '\n'+"ifStatement=" + ifStatement +
                '\n'+ "elseStatement=" + elseStatement
                ;
    }
}
