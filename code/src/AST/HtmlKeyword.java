package AST;
public class HtmlKeyword {
    //NGFOR| NGIF| ALT| SR
    String NGFOR;
    String NGIF;
    String ALT;
    String SRC;

    public String getNGFOR() {
        return NGFOR;
    }

    public void setNGFOR(String NGFOR) {
        this.NGFOR = NGFOR;
    }

    public String getNGIF() {
        return NGIF;
    }

    public void setNGIF(String NGIF) {
        this.NGIF = NGIF;
    }

    public String getALT() {
        return ALT;
    }

    public void setALT(String ALT) {
        this.ALT = ALT;
    }

    public String getSRC() {
        return SRC;
    }

    public void setSRC(String SRC) {
        this.SRC = SRC;
    }

    public String getName() {
        if (NGFOR != null) return NGFOR;
        if (NGIF != null) return NGIF;
        if (ALT != null) return ALT;
        if (SRC != null) return SRC;
        return "";
    }

    @Override
    public String toString() {
        if(NGFOR!=null){
            return NGFOR+ '\n'
                    ;
        }
        else if(NGIF!=null){
            return NGIF+ '\n'
                    ;
        }
        else if(ALT!=null){
            return ALT+ '\n'
                    ;
        }
        return SRC + '\n'
                ;
    }
}