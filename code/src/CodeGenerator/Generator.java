package CodeGenerator;
import AST.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Generator {
    String name=null;
    String Space = "\t\t";
    String bodyListInner=null;
    String rout="window.location.href";
    String getElement="document.getElementById";
    public void generate(Program program,String outputFile) {
        try {
            FileWriter fw = new FileWriter(outputFile);
            generate("<!DOCTYPE html>\n", fw);
            generate("<html>\n", fw);
            generate("<head>\n", fw);
            generate("<title>Angular App</title>\n", fw);
            generate("<style>\n", fw);
            if (program.getSourceElements() != null) {
                for (Statement stmt : program.getSourceElements().getStatement()) {
                    if (stmt.getCssElement() != null) {
                        generate(stmt.getCssElement(), Space, fw);
                    }
                }
            }
            generate("</style>\n", fw);
            generate("</head>\n", fw);
            generate("<body>\n", fw);
            generate("<script type='module'>\n", fw);
            if (program.getSourceElements() != null) {
                for (Statement stmt : program.getSourceElements().getStatement()) {
                    if (stmt.getExportStatement() != null) {
                        generate(stmt.getExportStatement(), Space, fw);
                    }
                }
            }
            generate("</script>\n", fw);
            if (program.getSourceElements() != null) {
                for (Statement stmt : program.getSourceElements().getStatement()) {
                    if (stmt.getHtmlElements() != null) {
                        generate(stmt.getHtmlElements(), "", fw);
                    }
                }
            }

            generate("<div id='app'></div>\n", fw);
            generate("<div id='main-product'></div>\n", fw);
            generate("<div class='side-products'></div>\n", fw);
            generate("</body>\n</html>\n", fw);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generate(String s, FileWriter fw) {
        try {
            System.out.print("\n");
            fw.append(s);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generate(ExportStatement exportStatement, String s, FileWriter fw)throws IOException {
        fw.write("export "+exportStatement.getKeyword().getName()+" "+ exportStatement.getDeclarationName().getSTRING());
        fw.write(" {\n");
        fw.write(" constructor(){\n");
        for (ClassBody body : exportStatement.getClassBody()) {
            if (body instanceof FullClassBody) {
                generate((FullClassBody) body, s, fw);
            } else if (body instanceof PropertyString) {
                generate((PropertyString) body, s, fw);
            }
            else if (body instanceof MethodDeclaration) {
                generate((MethodDeclaration) body, s, fw);
            }
            else if (body instanceof FunctionNgOnInit) {
                generate((FunctionNgOnInit) body, s, fw);
            }
            else if (body instanceof FunctionDelete ) {
                generate((FunctionDelete ) body, s, fw);
            }
            else if (body instanceof FunctionAdd) {
                generate((FunctionAdd) body, s, fw);
            }
        }
        if(Objects.equals(exportStatement.getDeclarationName().getSTRING(), "ProductPageComponent")){
            generateRenderProducts(s, fw);
            generateRenderSideProducts(s, fw);
            fw.write("const page = new ProductPageComponent();\n");
            fw.write("renderSideProducts(page.products, page);\n renderProduct(page.selectedProduct);\n");
        }
    }

    private void generate(FullClassBody fullClassBody, String s, FileWriter fw) throws IOException {
        for (PropertyList propList : fullClassBody.getPropertyLists()) {
            generate(propList, s , fw);
        }
        if (fullClassBody.getPropertyDeclarationCom() != null) {
            generate(fullClassBody.getPropertyDeclarationCom(), s, fw);
        }
        if (fullClassBody.getMethodDeclaration() != null) {
            generate(fullClassBody.getMethodDeclaration(), s, fw);
        }
    }

    private void generate(PropertyList propertyList, String s, FileWriter fw) throws IOException{
        fw.write(s + "this."+propertyList.getDeclarationName().getSTRING());
        bodyListInner=propertyList.getDeclarationName().getSTRING();
        if (propertyList.getSTRING() != null&& Objects.equals(propertyList.getDeclarationName().getSTRING(), "defaultProducts")) {
            fw.write( " = [");
        } else {
            fw.write(" = ");
        }
        for (BodyList body : propertyList.getBodyList()) {
            generate(body, s, fw);
        }
        if (Objects.equals(propertyList.getDeclarationName().getSTRING(), "defaultProducts")){
            fw.write("];\n");
        }
    }

   private void generate(BodyList bodyList, String s, FileWriter fw) throws IOException {
        fw.write(s + "{\n");
        List<BodyListInner> inners = bodyList.getBodyListInner();
        for (int i = 0; i < inners.size(); i++) {
            BodyListInner inner = inners.get(i);
            generate(inner, s, fw);
            if (i < inners.size() - 1) {
                fw.write(",\n");
            } else {
                fw.write("\n");
            }
        }
        if(Objects.equals(bodyListInner, "product")){
            fw.write(s + "}\n");
        }
        else {
            fw.write(s + "},\n");
        }

    }


    private void generate(BodyListInner bodyListInner, String s, FileWriter fw) throws IOException {
        String key = bodyListInner.getDeclarationName().getSTRING();
        fw.write(s + key + ": ");
        if (bodyListInner.getStringLiteral() == null || "''".equals(bodyListInner.getStringLiteral().getStringLiteral())) {
            fw.write("''");
        } else {
            String value = bodyListInner.getStringLiteral().getStringLiteral();
            fw.write(value);
        }

    }


    private void generate(PropertyDeclarationCom com, String s, FileWriter fw) throws IOException {
        if (com.getDeclarationName().size() >= 2 && com.getKeyword().size() >= 2) {
            String name = com.getDeclarationName().get(0).getSTRING();
            String assignedValue = com.getKeyword().get(1).getName();
            fw.write(s + "this."+name +" = " + (assignedValue != null ? assignedValue : "null") + ";\n");
            fw.write(s + "this.ngOnInit();\n}\n");
        } else {
            fw.write(s + "// Error in PropertyDeclarationCom\n");
        }
    }

    private void generate(MethodDeclaration method, String s, FileWriter fw) throws IOException {
        fw.write(s + method.getDeclarationName().getSTRING() + "(");
        if (method.getParameterList() != null) {
            generate(method.getParameterList(), "", fw);
        }
        fw.write(") {\n");
        if (method.getMethodBody() != null) {
            generate(method.getMethodBody(), s + "  ", fw);
        }
        fw.write(s + "}\n");

    }

    private void generate(ParameterList parameterList, String s, FileWriter fw) throws IOException {
        if (parameterList.getParameter() != null) {
            generate(parameterList.getParameter(), s, fw);
        }
        for (ParameterComma comma : parameterList.getParameterComma()) {
            fw.write(", ");
            generate(comma, s, fw);
        }
    }

    private void generate(ParameterComma comma, String s, FileWriter fw) throws IOException {
        if (comma.getParameter() != null) {
            generate(comma.getParameter(), s, fw);
        }
    }

    private void generate(Parameter parameter, String s, FileWriter fw) throws IOException {
        String name = parameter.getDeclarationName().getSTRING();
        fw.write(name );

    }

    private void generate(MethodBody body, String s, FileWriter fw) throws IOException {
        for (StatementMethod stmt : body.getStatementMethod()) {
            generate(stmt, s, fw);
        }
    }

    private void generate(StatementMethod statementMethod, String s, FileWriter fw) throws IOException {
        String prop = statementMethod.getDeclarationName().getSTRING();
        DeclarationString declarationString = statementMethod.getDeclarationString();
        String value = "";
        if (declarationString instanceof Type) {
            value = ((Type)declarationString).getName();
        } else if (declarationString instanceof DeclarationName) {
            value = ((DeclarationName) declarationString).getSTRING();
        } else if (declarationString instanceof StringLiteral) {
            value = ((StringLiteral) declarationString).getStringLiteral();
        }
        fw.write(s +"this."+ prop + " = " + value + ";\n");
        fw.write(s +"renderProduct(product);\n");
        fw.write(s +" renderSideProducts(this.products,this);\n");
    }
    private void generate(FunctionNgOnInit functionNgOnInit, String s, FileWriter fw) throws IOException {
        fw.write(s +functionNgOnInit.getNgOnInit()+"() {\n");
        for (BodyNgOnInit body : functionNgOnInit.getBodyNgOnInit()) {
            generate(body, s + "  ", fw);
        }
        fw.write(s + "}\n");
    }
    private void generate(BodyNgOnInit bodyNgOnInit, String s, FileWriter fw) throws IOException {
        generate(bodyNgOnInit.getIfStatement(), s, fw);
        if (bodyNgOnInit.getElseStatement() != null) {
            generate(bodyNgOnInit.getElseStatement(), s, fw);
        }
    }

    private void generate(IfStatement ifStatement, String s, FileWriter fw) throws IOException {
        fw.write(s + "if (");
        generate(ifStatement.getExpressionIf(), fw);
        fw.write(") {\n");
        for (BlockIf block : ifStatement.getBlockIf()) {
            generate(block, s + "  ", fw);
        }
        fw.write(s + "}\n");
    }

    public void generate(ElseStatement elseStatement, String s, FileWriter fw) throws IOException {
        fw.write(s + "else" + " {\n");
        generate(elseStatement.getContentElse(), s + "  ", fw);
        fw.write(s + "}\n");
    }

    public void generate(ContentElse content, String s, FileWriter fw) throws IOException {
        List<Keyword> keywords = content.getKeyword();
        List<DeclarationName> names = content.getDeclarationName();
        if (keywords.size() >= 2 && names.size() >= 2) {
            String keyword1 = keywords.get(0).getName();
            String keyword2 = keywords.get(1).getName();
            String name1 = names.get(0).getSTRING();
            String name2 = names.get(1).getSTRING();
            String line = s + keyword1 + "." + name1 + " = [..." + keyword2 + "." + name2;
            if (names.size() >= 3) {
                String name3 = names.get(2).getSTRING();
                line += ", ..." + name3;
            }
            line += "];\n";
            fw.write(line);
        } else {
            fw.write(s + "// خطأ في عناصر contentElse\n");
        }
    }

    private void generate(ExpressionIf expressionIf, FileWriter fw) throws IOException {
        if (!expressionIf.getTypeof().isEmpty()) {
            fw.write("typeof " + expressionIf.getWindow() + " !== " + expressionIf.getStringLiteral().get(0).getStringLiteral() + " && ");
            fw.write("typeof " + expressionIf.getLocalStorage() + " !== " + expressionIf.getStringLiteral().get(1).getStringLiteral());
        } else {
            fw.write(expressionIf.getKeyword().getName() + "." +
                    expressionIf.getDeclarationName().get(0).getSTRING()+ "?."
                    + expressionIf.getDeclarationName().get(1).getSTRING() + " == "
                    + expressionIf.getDeclarationName().get(2).getSTRING()+ "." + expressionIf.getDeclarationName().get(3).getSTRING());
        }
    }

    private void generate(BlockIf blockIf, String s, FileWriter fw) throws IOException {
        if (blockIf instanceof BlockIfJSON) {
            generate((BlockIfJSON) blockIf, s, fw);
        } else if (blockIf instanceof BlockIfFilter) {
            generate((BlockIfFilter)blockIf, s, fw);
        }
        else if (blockIf instanceof BlockIfElse) {
            generate((BlockIfElse) blockIf, s, fw);
        }
       else if (blockIf instanceof BlockIfLocalStorage) {
            generate((BlockIfLocalStorage)blockIf, s, fw);
        }
        else if (blockIf instanceof BlockIfNullLiteral) {
            generate((BlockIfNullLiteral) blockIf, s, fw);
        }
         else if (blockIf instanceof BlockIfEllipsis) {
            generate((BlockIfEllipsis) blockIf, s, fw);
        }
        else if (blockIf instanceof BlockIfTable) {
            generate((BlockIfTable) blockIf, s, fw);
        }
    }

    private void generate(BlockIfJSON  blockIfJSON , String s, FileWriter fw) throws IOException{
        fw.write(s);
        fw.write(blockIfJSON.getKeyword().getName() + " ");
        fw.write(blockIfJSON.getSTRING() + " = ");
        fw.write(blockIfJSON.getJSONParse() + "(");
        generate(blockIfJSON.getContentJSON(), "", fw);
        fw.write(");\n");
    }

    public void generate(ContentJSON contentJSON, String s, FileWriter fw) throws IOException {
        String localStorage = contentJSON.getLocalStorage();
        String methodName =contentJSON.getDeclarationName().getSTRING();
        List<StringLiteral> literals = contentJSON.getStringLiteral();
        if (!literals.isEmpty()) {
            String key = literals.get(0).getStringLiteral();
            fw.write(localStorage + "." + methodName + "(" + key + ")");
            if (literals.size() >= 2) {
                String defaultVal = literals.get(1).getStringLiteral();
                fw.write("||" + defaultVal);
            }
        }
    }

    public void generate(BlockIfFilter blockIfFilter, String s, FileWriter fw) throws IOException {
        fw.write(s);
        fw.write(blockIfFilter.getKeyword().getName() + " ");
        fw.write(blockIfFilter.getSTRING() + " = ");
        List<DeclarationName> names = blockIfFilter.getDeclarationName();
        if (names.size() >= 2) {
            fw.write(names.get(0).getSTRING() + "." + names.get(1).getSTRING());
        }
        fw.write("(");
        generate(blockIfFilter.getContentFilter(), "", fw);
        fw.write(");\n");
    }

    public void generate(ContentFilter contentFilter, String s, FileWriter fw) throws IOException {
        fw.write(contentFilter.getSTRING() );
        fw.write(" => ");
        List<FilterArrow> filters = contentFilter.getFilterArrow();
        for (int i = 0; i < filters.size(); i++) {
            generate(filters.get(i), "", fw);
            if (i < filters.size() - 1) {
                fw.write(" && ");
            }
        }
    }

    public void generate(FilterArrow arrow, String s, FileWriter fw) throws IOException {
        List<DeclarationName> names = arrow.getDeclarationName();
        if (names.size() == 2) {
            fw.write(names.get(0).getSTRING() + "?.");
            fw.write(names.get(1).getSTRING());
        } else if (names.size() == 4) {
            fw.write(names.get(0).getSTRING() + "." + names.get(1).getSTRING());
            fw.write("!=");
            fw.write(names.get(2).getSTRING() + "." + names.get(3).getSTRING());
        }
    }

    public void generate(BlockIfElse block, String s, FileWriter fw) throws IOException {
        generate(block.getContentElse(), s, fw);
    }

    private void generate(BlockIfLocalStorage blockIfLocalStorage, String s, FileWriter fw) throws IOException {
        fw.write(s);
        if (blockIfLocalStorage.getLocalStorage() != null) {
            fw.write(blockIfLocalStorage.getLocalStorage());
        }
        fw.write(".");
        if (blockIfLocalStorage.getDeclarationName() != null) {
            fw.write(blockIfLocalStorage.getDeclarationName().getSTRING());
        }
        fw.write("(");
        if (blockIfLocalStorage.getContentLocalStorage() != null) {
            generate(blockIfLocalStorage.getContentLocalStorage(), s, fw);
        }
        fw.write(");\n");
    }

    private void generate(ContentLocalStorage contentLocalStorage, String s, FileWriter fw) throws IOException {
        if (contentLocalStorage.getStringLiteral() != null) {
            fw.write(contentLocalStorage.getStringLiteral().getStringLiteral());
        }
        if(Objects.equals(name, "addProduct")){
            fw.write(",JSON.stringify(storedProducts)");
        }else {
            fw.write(",JSON.stringify(UpdatedSaved)");
        }
    }
    private void generate(BlockIfNullLiteral blockIfNullLiteral, String s, FileWriter fw) throws IOException {
        fw.write(s);
        if (blockIfNullLiteral.getKeyword() != null) {
            fw.write(blockIfNullLiteral.getKeyword().getName());
        }
        fw.write(".");
        if (blockIfNullLiteral.getDeclarationName() != null) {
            fw.write(blockIfNullLiteral.getDeclarationName().getSTRING());
        }
        fw.write(" = null;\n");
    }
    private void generate(BlockIfEllipsis block, String s, FileWriter fw) throws IOException {
        List<DeclarationName> declarationNames = block.getDeclarationName();
        if (declarationNames == null || declarationNames.isEmpty()) return;
        fw.write(s);
        fw.write(declarationNames.get(0).getSTRING());
        if (declarationNames.size() > 1) {
            fw.write(".");
            fw.write(declarationNames.get(1).getSTRING());
        }
        fw.write("(");
        fw.write("{ ... ");
        if (block.getKeyword() != null) {
            fw.write(block.getKeyword().getName());
            fw.write(".");
        }
        if (declarationNames.size() > 2) {
            fw.write(declarationNames.get(2).getSTRING());
        }
        fw.write(" });\n");
    }

    private void generate(BlockIfTable blockIfTable, String s, FileWriter fw) throws IOException {
        fw.write(s+ rout+"= \"GeneratedProduct-page.html\";\n");
    }

    private void generate(FunctionDelete  functionDelete , String s, FileWriter fw) throws IOException{
        fw.write(s +functionDelete.getDeclarationName().getSTRING() + "("
                + functionDelete.getSTRING() + "){\n");
        for (FunctionDeleteContent content : functionDelete.getFunctionDeleteContent()) {
            generate(content, s + "  ", fw);
        }
        fw.write(s + "}}\n");

    }

    private void generate(FunctionDeleteContent content, String s, FileWriter fw) throws IOException {
        if (content.getIfStatement() != null) {
            generate(content.getIfStatement(), s, fw);
            return;
        }
        if (!content.getKeyword().isEmpty() && content.getDeclarationName().size() >= 4 && content.getSTRING().size() >= 2) {
            fw.write(s);
            fw.write(content.getKeyword().get(0).getName() + " ");
            fw.write(content.getDeclarationName().get(0).getSTRING() + " = ");
            fw.write(content.getKeyword().get(1).getName() + ".");
            fw.write(content.getDeclarationName().get(1).getSTRING() + ".");
            fw.write(content.getDeclarationName().get(2).getSTRING());
            fw.write("(" + content.getDeclarationName().get(3).getSTRING() + "," + content.getSTRING().get(0) + ")");
            fw.write("["  + content.getSTRING().get(1) + "];\n");
        }
    }

    private void generate(FunctionAdd functionAdd, String s, FileWriter fw)throws IOException {
        fw.write( ";}\n"+s +functionAdd.getDeclarationName().getSTRING() + "() {\n");
        name=functionAdd.getDeclarationName().getSTRING();
        fw.write(s + "  this.product.id ="+ getElement+"('product.id').value;\n");
        fw.write(s + "  this.product.name = "+getElement+"('product.name').value;\n");
        fw.write(s + "  this.product.image = "+getElement+"('product.image').value;\n");
        fw.write(s + "  this.product.details ="+getElement+"('product.details').value;\n");
        for (FunctionAddContent content : functionAdd.getFunctionAddContent()) {
            BlockIf block = content.getBlockIf();
            if (block != null) {
                generate(block, s + "  ", fw);
            }
        }
        fw.write(s + "}}\n");
        fw.write(s + "const addComp = new AddProductComponent();\n" +
                "window.addProduct = () => addComp.addProduct();\n");

    }

    private void generate(PropertyString propertyString, String s, FileWriter fw) throws IOException{
        String name = propertyString.getDeclarationName().getSTRING();
        String type = propertyString.getType().getName();
        String value = propertyString.getStringLiteral().getStringLiteral();
        fw.write(s + name + ": " + type + " = " + value + ";\n");
    }


    //======================================== HTML ====================================
    //======================================== HTML ====================================

    private void generate(HtmlElements htmlElements, String s, FileWriter fw) throws IOException {
        generate(htmlElements.getHtmlElement(), s, fw);
    }

    private void generate(HtmlElement htmlElement, String s, FileWriter fw) throws IOException {
        for (HtmlTagNameStart start : htmlElement.getHtmlTagNameStart()) {
            generate(start, s, fw);
        }
        for (HtmlElementContent content : htmlElement.getHtmlElementContent()) {
            generate(content, s, fw);
        }
        for (HtmlTagNameEnd end : htmlElement.getHtmlTagNameEnd()) {
            generate(end, s, fw);
        }
    }

    private void generate(HtmlTagNameStart tagStart, String s, FileWriter fw) throws IOException {
        fw.write("<" + tagStart.getTagName().getName());
        if (tagStart.getKeyword() != null && tagStart.getStringLiteral() != null) {
            fw.write(" " + tagStart.getKeyword().getName() + "=" + tagStart.getStringLiteral().getStringLiteral());
        }
        if(tagStart.getGreater()!=null){
            fw.write(tagStart.getGreater()+"\n");
        }
    }
    private void generate(HtmlTagNameEnd tagEnd, String s, FileWriter fw) throws IOException {
        fw.write("</" + tagEnd.getTagName() + ">\n");
    }

    private void generate(HtmlElementContent content, String s, FileWriter fw) throws IOException {
        if (content instanceof NestedHtml) {
          // generate((NestedHtml) content, s, fw);
        } else if (content instanceof HtmlContentMany) {
          // generate((HtmlContentMany) content, s, fw);
        } else if (content instanceof HtmlContentBrace) {
            generate((HtmlContentBrace) content, s, fw);
        }
        else if (content instanceof HtmlButton) {
            generate((HtmlButton) content, s, fw);
        }
        else if (content instanceof DeclarationNumber) {
            generate((DeclarationNumber) content, s, fw);
        }
        else if (content instanceof DeclarationNgModel) {
            generate((DeclarationNgModel) content, s, fw);
        }
    }


    private void generate(HtmlContentBrace htmlContentBrace, String s, FileWriter fw) throws IOException {
        String tagName = htmlContentBrace.getTagName().getName();
        fw.write("<" + tagName);

        if (htmlContentBrace.getHtmlBrace() != null) {
            String attrName = htmlContentBrace.getHtmlBrace().getReservedWord().getValue();
            String attrValue = htmlContentBrace.getHtmlBrace().getStringLiteral().getStringLiteral();
           fw.write(" " + "onclick" + "=" + attrValue);
        }
        fw.write(">");
        if (htmlContentBrace.getContentHtml() != null) {
            //generate(htmlContentBrace.getContentHtml(), s, fw);
        }
        fw.write("</" + tagName + ">\n");
    }


  private void generate(HtmlButton htmlButton, String s, FileWriter fw) throws IOException {

    if (htmlButton.getStringLiteral() != null && !htmlButton.getStringLiteral().isEmpty()) {
        for (int i = 0; i < htmlButton.getStringLiteral().size(); i++) {
            String attrName = null;
            String attrValue = htmlButton.getStringLiteral().get(i).getStringLiteral();

            if (i == 0 && htmlButton.getSTRING() != null) {
                attrName = htmlButton.getSTRING();
            } else if (i == 0 && htmlButton.getReservedWord() != null) {
                attrName = htmlButton.getReservedWord().getValue();
            } else if (i == 1 && htmlButton.getKeyword() != null) {
                attrName = htmlButton.getKeyword().getName();
            }

            if (attrName != null && attrValue != null) {
                if ("(click)".equals(attrName)) {
                    fw.write(" onclick=\"" + attrValue.replace("'", "") + "\"");
                } else if ("routerLink".equals(attrName)) {
                    fw.write(" onclick="+rout+"='GeneratedAddProduct.html'");
                } else {
                    fw.write("\n "+s+  attrName + "=" + attrValue );
                }
            }
        }
    }

    fw.write(">");

    if (htmlButton.getDeclarationName() != null && !htmlButton.getDeclarationName().isEmpty()) {
        for (DeclarationName name : htmlButton.getDeclarationName()) {
            fw.write(name.getSTRING() + " ");
        }
    } else if (htmlButton.getSTRING() != null) {
        fw.write(htmlButton.getSTRING());
    }
  }



    private void generate(DeclarationNumber declarationNumber, String s, FileWriter fw) throws IOException {
        fw.write(declarationNumber.getDeclarationName().getSTRING());
        if (declarationNumber.getNumber() != null) {
            fw.write(" "+declarationNumber.getNumber());
        }
        fw.write("\n");

    }

    private void generate(DeclarationNgModel declarationNgModel, String s, FileWriter fw) throws IOException {
        if (declarationNgModel.getNgModel() != null && !declarationNgModel.getNgModel().isEmpty()) {
            fw.write(" id=" );
            if (!declarationNgModel.getStringLiteral().isEmpty()) {
                fw.write(declarationNgModel.getStringLiteral().get(0).getStringLiteral());
            }
            fw.write(" ");
        }
        if (declarationNgModel.getDeclarationName() != null && declarationNgModel.getStringLiteral().size() > 1) {
            fw.write(declarationNgModel.getDeclarationName().getSTRING() + "=");
            fw.write(declarationNgModel.getStringLiteral().get(1).getStringLiteral() + " ");
        }

        fw.write("/>\n");
        if(Objects.equals(declarationNgModel.getStringLiteral().get(0).getStringLiteral(), "'product.details'")){
            fw.write( " <button onclick='addProduct()'>Add</button>");
        }

    }

    //======================================== CSS ====================================
    //======================================== CSS ====================================

    private void generate(CssElement cssElement, String s, FileWriter fw) throws IOException {
        StringBuilder selectorBuilder = new StringBuilder();
        if (cssElement.getTagName() != null) {
            selectorBuilder.append(cssElement.getTagName().getName());
        }
        if (cssElement.getSelector() != null && !cssElement.getSelector().isEmpty()) {
            if (selectorBuilder.length() > 0) selectorBuilder.append(", ");
            for (int i = 0; i < cssElement.getSelector().size(); i++) {
                generate(cssElement.getSelector().get(i), selectorBuilder);
                if (i < cssElement.getSelector().size() - 1) {
                    selectorBuilder.append(", ");
                }
            }
        }
        fw.write(s + "."+selectorBuilder + " {\n");
        for (CssProperty property : cssElement.getCssProperty()) {
            generate(property, s + "  ", fw);
        }
        fw.write(s + "}\n\n");
    }

    private void generate(Selector selector, StringBuilder sb) {
        if (selector.getSTRING() != null) {
            sb.append(selector.getSTRING());
        }
        if (selector.getTextarea() != null) {
            sb.append(selector.getTextarea());
        }
        if (selector.getSelectorInternal() != null) {
            for (SelectorInternal si : selector.getSelectorInternal()) {
                sb.append(":");
                sb.append(si.getSTRING());
            }
        }
    }

    private void generate(CssProperty property, String s, FileWriter fw) throws IOException {
        fw.write(s +property.getCss().getName() + ": ");

        for (int i = 0; i < property.getCssValue().size(); i++) {
            generate(property.getCssValue().get(i), fw);
            if (i < property.getCssValue().size() - 1) {
                fw.write(" ");
            }
        }
        fw.write(";\n");
    }

    private void generate(CssValue cssValue, FileWriter fw) throws IOException {
        if (cssValue.getDecimalLiteral_UNIT() != null) {
            DecimalLiteral_UNIT body = cssValue.getDecimalLiteral_UNIT();
            if (body instanceof UnitNumberList) {
                generate((UnitNumberList) body, fw);
            } else if (body instanceof UnitSolidColor) {
                generate((UnitSolidColor) body, fw);
            } else if (body instanceof BackgroundColorUnit) {
                generate((BackgroundColorUnit) body, fw);
            }
            return;
        }
        if (cssValue.getRow() != null) {
            fw.write("row");
        } else if (cssValue.getFlex() != null) {
            fw.write("flex");
        } else if (cssValue.getBorder_Box() != null) {
            fw.write("border-box");
        } else if (cssValue.getCenter() != null) {
            fw.write("center");
        } else if (cssValue.getColumn() != null) {
            fw.write("column");
        } else if (cssValue.getAuto() != null) {
            fw.write("auto");
        } else if (cssValue.getPointer() != null) {
            fw.write("pointer");
        } else if (cssValue.getHEXCHAR() != null) {
            fw.write(cssValue.getHEXCHAR());
        } else if (cssValue.getSTRING() != null) {
            fw.write(cssValue.getSTRING());
        }
    }

    private void generate(UnitNumberList unit, FileWriter fw) throws IOException {
        for (DecimalLiteral dl : unit.getDecimalLiteral()) {
            fw.write(dl.getDecimalLiteral());
        }
        fw.write(unit.getDecimalLiteralUnit().getDecimalLiteral_UNIT());
    }

    private void generate(UnitSolidColor unit, FileWriter fw) throws IOException {
        fw.write(unit.getDecimalLiteralUnit().getDecimalLiteral_UNIT()+" "+unit.getSolid()+" "+unit.getHEXCHAR());
    }

    private void generate(BackgroundColorUnit unit, FileWriter fw) throws IOException {
        fw.write(unit.getCss().getName() + " " + unit.getDecimalLiteralUnit().getDecimalLiteral_UNIT());
    }

    private void generateRenderProducts(String s, FileWriter fw) throws IOException {
        fw.write(s + "function renderProduct(product) {\n");
        fw.write(s + "  if (!product) return;\n");
        fw.write(s + "  const container = document.querySelector('.main-product');\n");
        fw.write(s + "  container.innerHTML = '';\n");
        fw.write(s + "  const h3Id = document.createElement('h3');\n");
        fw.write(s + "  h3Id.textContent = product.id;\n");
        fw.write(s + "  const h3Name = document.createElement('h3');\n");
        fw.write(s + "  h3Name.textContent = product.name;\n");
        fw.write(s + "  const img = document.createElement('img');\n");
        fw.write(s + "  img.src = product.image;\n");
        fw.write(s + "  img.className = 'product-image';\n");
        fw.write(s + "  const pDetails = document.createElement('p');\n");
        fw.write(s + "   pDetails.textContent = product.details;\n");
        fw.write(s + "  container.appendChild(h3Id);\n");
        fw.write(s + "  container.appendChild(h3Name);\n");
        fw.write(s + "  container.appendChild(img);\n");
        fw.write(s + "  container.appendChild(pDetails);\n");
        fw.write(s + "}\n");
    }
    private void generateRenderSideProducts(String s, FileWriter fw) throws IOException {
        fw.write(s + "function renderSideProducts(products, component) {\n");
        fw.write(s + "  const side = document.querySelector('.side-products');\n");
        fw.write(s + "  side.innerHTML = '';\n");
        fw.write(s + "  products.forEach(product => {\n");
        fw.write(s + "    const div = document.createElement('div');\n");
        fw.write(s + "    div.style.cursor = 'pointer';\n");
        fw.write(s + "    div.style.display = 'flex';\n");
        fw.write(s + "    div.style.alignItems = 'center';\n");
        fw.write(s + "    div.style.marginBottom = '5px';\n");
        fw.write(s + "    const img = document.createElement('img');\n");
        fw.write(s + "    img.src = product.image;\n");
        fw.write(s + "    img.style.width = '40px';\n");
        fw.write(s + "    img.style.height = '40px';\n");
        fw.write(s + "    img.style.marginRight = '10px';\n");
        fw.write(s + "    div.appendChild(img);\n");
        fw.write(s + "    const nameSpan = document.createElement('span');\n");
        fw.write(s + "    nameSpan.textContent = product.name;\n");
        fw.write(s + "    div.appendChild(nameSpan);\n");
        fw.write(s + "    div.onclick = () => { component.selectProduct(product); renderProduct(product); };\n");
        fw.write(s + "    side.appendChild(div);\n\n");
        fw.write(s + "    const btn = document.createElement('button');\n");
        fw.write(s + "    btn.textContent = 'Delete';\n");
        fw.write(s + "    btn.onclick = (e) => { \n");
        fw.write(s + "      e.stopPropagation(); // لمنع تفعيل div.onclick عند الحذف\n");
        fw.write(s + "      const index = component.products.indexOf(product);\n");
        fw.write(s + "      if(index !== -1) { component.deleteProduct(index); renderSideProducts(component.products, component); }\n");
        fw.write(s + "    };\n");
        fw.write(s + "    side.appendChild(btn);\n");
        fw.write(s + "  });\n");
        fw.write(s + "}\n");

    }

}

