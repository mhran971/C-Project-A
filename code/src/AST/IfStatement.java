package AST;

import java.util.ArrayList;
import java.util.List;

public class IfStatement {
    //If LeftParen expressionIf RightParen LeftBrace blockIf* RightBrace
    ExpressionIf expressionIf;
    List<BlockIf>blockIf=new ArrayList<BlockIf>();

    public ExpressionIf getExpressionIf() {
        return expressionIf;
    }

    public void setExpressionIf(ExpressionIf expressionIf) {
        this.expressionIf = expressionIf;
    }

    public List<BlockIf> getBlockIf() {
        return blockIf;
    }

    public void setBlockIf(List<BlockIf> blockIf) {
        this.blockIf = blockIf;
    }

    @Override
    public String toString() {
        return  '\n'+"expressionIf=" + expressionIf +
                '\n'+"blockIf=" + blockIf
                ;
    }
}
