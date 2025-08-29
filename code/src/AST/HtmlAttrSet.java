package AST;

public class HtmlAttrSet implements Elements{
    //Greater htmlAttributes Less Div
    HtmlAttributes htmlAttributes;

    public HtmlAttributes getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(HtmlAttributes htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    @Override
    public String toString() {
        return "HtmlAttrSet=" +
                  htmlAttributes
                ;
    }
}
