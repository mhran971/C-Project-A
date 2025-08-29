package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributes implements Elements {
    //(tagName (STRING)?)*
    List<TagName> tagName=new ArrayList<TagName>();
    List<String>STRING=new ArrayList<String>();


    public List<TagName> getTagName() {
        return tagName;
    }

    public void setTagName(List<TagName> tagName) {
        this.tagName = tagName;
    }

    public List<String> getSTRING() {
        return STRING;
    }

    public void setSTRING(List<String> STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        if (STRING!=null){
            return "htmlAttributes=" +
                    '\n'+"tagName =" +tagName +
                    '\n'+"STRING=" + STRING
                    ;

        }
        return "htmlAttributes=" +
                '\n'+"tagName =" +tagName
        ;
    }
}