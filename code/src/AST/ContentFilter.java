package AST;

import java.util.ArrayList;
import java.util.List;

public class ContentFilter {
    // LeftParen STRING Colon Any RightParen Arrow filterArrow*
    String STRING;
    List<FilterArrow>filterArrow=new ArrayList<FilterArrow>();
    String Any;

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public List<FilterArrow> getFilterArrow() {
        return filterArrow;
    }

    public void setFilterArrow(List<FilterArrow> filterArrow) {
        this.filterArrow = filterArrow;
    }

    public String getAny() {
        return Any;
    }

    public void setAny(String any) {
        Any = any;
    }

    @Override
    public String toString() {
        return '\n' +"STRING=" + STRING +
                '\n' + "filterArrow=" + filterArrow +
                '\n' +"Any=" + Any + '\n'
                ;
    }
}
