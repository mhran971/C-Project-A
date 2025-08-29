package AST;
import java.util.ArrayList;
import java.util.List;

public class FullClassBody implements ClassBody{
    //propertyList propertyDeclarationCom? methodDeclaration
    List<PropertyList> propertyLists=new ArrayList< PropertyList>();
    PropertyDeclarationCom propertyDeclarationCom;
    MethodDeclaration methodDeclaration;

    public FullClassBody(List<PropertyList> propertyLists, PropertyDeclarationCom propertyDeclarationCom, MethodDeclaration methodDeclaration) {
        this.propertyLists = propertyLists;
        this.propertyDeclarationCom = propertyDeclarationCom;
        this.methodDeclaration = methodDeclaration;
    }

    public List<PropertyList> getPropertyLists() {
        return propertyLists;
    }

    public void setPropertyLists(List<PropertyList> propertyLists) {
        this.propertyLists = propertyLists;
    }

    public PropertyDeclarationCom getPropertyDeclarationCom() {
        return propertyDeclarationCom;
    }

    public void setPropertyDeclarationCom(PropertyDeclarationCom propertyDeclarationCom) {
        this.propertyDeclarationCom = propertyDeclarationCom;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    @Override
    public String toString() {
        return "fullClassBody=" +
                '\n'+"propertyList=" + propertyLists +
                '\n'+"propertyDeclarationCom=" + propertyDeclarationCom +
                '\n'+"methodDeclaration=" + methodDeclaration;
    }
}