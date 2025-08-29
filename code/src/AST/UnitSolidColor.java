package AST;

public class UnitSolidColor implements DecimalLiteral_UNIT{
    //decimalLiteralUnit Solid HEXCHAR
    String Solid;
    String HEXCHAR;
    DecimalLiteralUnit decimalLiteralUnit;

    public String getSolid() {
        return Solid;
    }

    public void setSolid(String solid) {
        Solid = solid;
    }

    public String getHEXCHAR() {
        return HEXCHAR;
    }

    public void setHEXCHAR(String HEXCHAR) {
        this.HEXCHAR = HEXCHAR;
    }

    public DecimalLiteralUnit getDecimalLiteralUnit() {
        return decimalLiteralUnit;
    }

    public void setDecimalLiteralUnit(DecimalLiteralUnit decimalLiteralUnit) {
        this.decimalLiteralUnit = decimalLiteralUnit;
    }

    @Override
    public String toString() {
        return "UnitSolidColor=" +
                "Solid=" + Solid + '\'' +
                "HEXCHAR=" + HEXCHAR + '\'' +
                "decimalLiteralUnit=" + decimalLiteralUnit
                ;
    }
}
