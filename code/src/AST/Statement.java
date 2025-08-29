
package AST;
public  interface Statement {
    default ImportStatement getImportStatement() { return null; }
    default InterfaceStatement getInterfaceStatement() { return null; }
    default ComponentStatement getComponentStatement() { return null; }
    default ExportStatement getExportStatement() { return null; }
    default HtmlElements getHtmlElements() { return null; }
    default CssElement getCssElement() { return null; }
}
    // importStatement| interfaceStatement| componentStatement
    // | exportStatement | htmlElements | cssElement
