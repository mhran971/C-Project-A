package app;
import AST.Program;
import CodeGenerator.Generator;
import Visitor.BaseVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import SymbolTable.*;
import SymbolTable.Scope.GlobalScope;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


/*
public class Main {
    public static void main(String[] args) throws IOException {
       //String source = "code/Files/add-product.txt";
        String source = "code/Files/product-page.txt";

        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        parser.removeErrorListeners();
        lexer.removeErrorListeners();
        parser.addErrorListener(SyntaxError.INSTANCE);
        lexer.addErrorListener(SyntaxError.INSTANCE);
        ParseTree tree = parser.program();
        BaseVisitor visitor = new BaseVisitor();
        Program prog = (Program) visitor.visit(tree);
        SymbolTable symbolTable = visitor.getSymbolTable();
        System.out.println("🔶Abstract parse tree(AST):\n" + prog);
        System.out.println("\n🔶🔶Symbol table:");
        try {
            PrintStream fileOut = new PrintStream("code\\Result\\SymbolTable.txt");
            for (GlobalScope global : symbolTable.getGlobalScopes()) {
                symbolTable.printTree(global, "", System.out);
                symbolTable.printTree(global, "", fileOut);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.checkErrors();

        Generator generator = new Generator();
        generator.generate(prog);


    }
}

*/
public class Main {
    public static void main(String[] args) throws IOException {
        String[] sources = {
                "code/Files/add-product.txt",
                "code/Files/product-page.txt"
        };
        String[] outputs = {
                "code\\Result\\GeneratedAddProduct.html",
                "code\\Result\\GeneratedProduct-page.html"
        };

        for (int i = 0; i < sources.length; i++) {
            String source = sources[i];
            //String source = "code/Files/TestWithError.txt";
            CharStream cs = CharStreams.fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);

            parser.removeErrorListeners();
            lexer.removeErrorListeners();
            parser.addErrorListener(SyntaxError.INSTANCE);
            lexer.addErrorListener(SyntaxError.INSTANCE);

            ParseTree tree = parser.program();
            BaseVisitor visitor = new BaseVisitor();
            Program prog = (Program) visitor.visit(tree);

            SymbolTable symbolTable = visitor.getSymbolTable();
            System.out.println("\n🔶🔶Symbol table:");
            try {
                PrintStream fileOut = new PrintStream("code\\Result\\SymbolTable.txt");
                for (GlobalScope global : symbolTable.getGlobalScopes()) {
                    symbolTable.printTree(global, "", System.out);
                    symbolTable.printTree(global, "", fileOut);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("🔶 AST from: " + source + "\n" + prog);

            Generator generator = new Generator();
            generator.generate(prog, outputs[i]);  // تمرير اسم ملف الخرج
        }
    }
}
