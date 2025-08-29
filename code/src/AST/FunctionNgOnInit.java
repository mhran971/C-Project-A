package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionNgOnInit implements ClassBody {
    //NgOnInit LeftParen RightParen Colon keyword LeftBrace bodyNgOnInit* RightBrace
    String NgOnInit;
    Keyword keyword;
    List<BodyNgOnInit> bodyNgOnInit=new ArrayList<BodyNgOnInit>();

    public String getNgOnInit() {
        return NgOnInit;
    }

    public void setNgOnInit(String ngOnInit) {
        NgOnInit = ngOnInit;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public List<BodyNgOnInit> getBodyNgOnInit() {
        return bodyNgOnInit;
    }

    public void setBodyNgOnInit(List<BodyNgOnInit> bodyNgOnInit) {
        this.bodyNgOnInit = bodyNgOnInit;
    }

    @Override
    public String toString() {
        return "FunctionNgOnInit=" +
                '\n'+"NgOnInit=" + NgOnInit +
                '\n'+ keyword +
                '\n'+"bodyNgOnInit=" + bodyNgOnInit
                ;
    }
}
