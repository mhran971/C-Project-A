package AST;

import java.util.ArrayList;
import java.util.List;

public class CssProperty {
    //css Colon cssValue operators
    Css css;
    List<CssValue> cssValue=new ArrayList<CssValue>();

    public Css getCss() {
        return css;
    }

    public void setCss(Css css) {
        this.css = css;
    }

    public List<CssValue> getCssValue() {
        return cssValue;
    }

    public void setCssValue(List<CssValue> cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return  '\n'+"property=" + css
                ;
    }
}