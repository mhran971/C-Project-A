package AST;
public class HtmlElements implements Statement {
    //htmlElement
    HtmlElement htmlElement;

    @Override
    public HtmlElements getHtmlElements() {
        return this;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        return "htmlElements=" +
                '\n'+"htmlElement=" + htmlElement +'\n'
                ;
    }
}