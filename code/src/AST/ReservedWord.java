package AST;
public class ReservedWord  {
    //AngularCore| Angular| Component| RouterOutlet| CommonModule| Input| OnInit|Click
    String AngularCore;
    String Angular;
    String Component;
    String RouterOutlet;
    String CommonModule;
    String Input;
    String OnInit;
    String Click;
    String RouterLink;
    String FormsModule;
    String Router;
    String Router_;


    public String getAngularCore() {
        return AngularCore;
    }

    public void setAngularCore(String angularCore) {
        AngularCore = angularCore;
    }

    public String getAngular() {
        return Angular;
    }

    public void setAngular(String angular) {
        Angular = angular;
    }

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public String getRouterOutlet() {
        return RouterOutlet;
    }

    public void setRouterOutlet(String routerOutlet) {
        RouterOutlet = routerOutlet;
    }

    public String getCommonModule() {
        return CommonModule;
    }

    public void setCommonModule(String commonModule) {
        CommonModule = commonModule;
    }

    public String getInput() {
        return Input;
    }

    public void setInput(String input) {
        Input = input;
    }

    public String getOnInit() {
        return OnInit;
    }

    public void setOnInit(String onInit) {
        OnInit = onInit;
    }

    public String getClick() {
        return Click;
    }

    public void setClick(String click) {
        Click = click;
    }

    public String getRouterLink() {
        return RouterLink;
    }

    public void setRouterLink(String routerLink) {
        RouterLink = routerLink;
    }

    public String getFormsModule() {
        return FormsModule;
    }

    public void setFormsModule(String formsModule) {
        FormsModule = formsModule;
    }

    public String getRouter() {
        return Router;
    }

    public void setRouter(String router) {
        Router = router;
    }

    public String getRouter_() {
        return Router_;
    }

    public void setRouter_(String router_) {
        Router_ = router_;
    }

    public String getValue() {
        if (AngularCore != null) return AngularCore;
        if (Angular != null) return Angular;
        if (Component != null) return Component;
        if (RouterOutlet != null) return RouterOutlet;
        if (CommonModule != null) return CommonModule;
        if (Input != null) return Input;
        if (OnInit != null) return OnInit;
        if (RouterLink != null) return RouterLink;
        if (FormsModule != null) return FormsModule;
        if (Router != null) return Router;
        if (Router_ != null) return Router_;
        if (Click != null) return Click;
        return "";
    }


    @Override
    public String toString() {
        if(AngularCore!=null){
            return AngularCore;
        }
        else if(Angular !=null){
            return Angular;
        }
        else if(Component!=null){
            return Component;
        }
        else if(RouterOutlet!=null){
            return  RouterOutlet;
        }
        else if(CommonModule !=null){
            return CommonModule;
        }
        else if(Input!=null){
            return Input;
        }
        else if(OnInit!=null){
            return OnInit;
        }
        else if(RouterLink!=null){
            return RouterLink;
        }
        else if(FormsModule!=null){
            return FormsModule;
        }
        else if(Router!=null){
            return Router;
        }
        else if(Router_!=null){
            return Router_;
        }
        return Click;
    }
}