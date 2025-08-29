package AST;

public class FunctionAddContent {
    //blockIf
    BlockIf blockIf;

    public BlockIf getBlockIf() {
        return blockIf;
    }

    public void setBlockIf(BlockIf blockIf) {
        this.blockIf = blockIf;
    }

    @Override
    public String toString() {
        return "FunctionAddContent=" +
                "blockIf=" + blockIf
                ;
    }
}
