// Generated from E:/Fourth year/Semester2(2024-2025)/Compiler 2/ProjectCompiler2_git/Compiler-Project-Angular/code/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WS=3, NEWLINE=4, Import=5, Export=6, 
		From=7, Out=8, Property=9, Ensure=10, EnsureAlways=11, Check=12, Mixin=13, 
		Extends=14, Super=15, Implements=16, Let=17, Component=18, CommonModule=19, 
		RouterOutlet=20, RouterLink=21, OnInit=22, NgOnInit=23, Typeof=24, Window=25, 
		LocalStorage=26, JSONParse=27, Input=28, Interface=29, NGIF=30, NGFOR=31, 
		SRC=32, ALT=33, Selector=34, Imports=35, TemplateUrl=36, Template=37, 
		StyleUrls=38, Standalone=39, FormsModule=40, StyleUrl=41, Int=42, Float=43, 
		Double=44, Bool=45, New=46, Var=47, String=48, Array=49, Auto=50, Break=51, 
		Case=52, Catch=53, Char=54, Class=55, Const=56, Continue=57, Default=58, 
		Do=59, Else=60, Enum=61, False_=62, Final=63, For=64, Goto=65, If=66, 
		Namespace=67, Nullptr=68, Operator=69, Override=70, Private=71, Protected=72, 
		Public=73, Static=74, Package=75, Return=76, Short=77, Struct=78, Switch=79, 
		This=80, True_=81, Virtual=82, Void=83, While=84, Function_=85, With=86, 
		Throw=87, Any=88, In=89, Try=90, As=91, Number=92, Unique=93, Symbol=94, 
		Undefined=95, Object=96, Constructor=97, Abstract=98, Require=99, Module=100, 
		Declare=101, Angular=102, Common=103, Core=104, Router=105, SomeClass=106, 
		AngularCore=107, Router_=108, LeftParen=109, RightParen=110, LeftBracket=111, 
		RightBracket=112, LeftBrace=113, RightBrace=114, Plus=115, Minus=116, 
		Star=117, Div=118, Mod=119, Xor=120, And=121, Or=122, Tilde=123, Not=124, 
		Assign=125, Less=126, Greater=127, PlusAssign=128, MinusAssign=129, StarAssign=130, 
		DivAssign=131, ModAssign=132, XorAssign=133, AndAssign=134, OrAssign=135, 
		LeftShiftAssign=136, RightShiftAssign=137, Equal=138, DoubleEqual=139, 
		NotEqual=140, NotEqual2=141, LessEqual=142, GreaterEqual=143, AndAnd=144, 
		OrOr=145, PlusPlus=146, MinusMinus=147, Comma=148, Question=149, Colon=150, 
		Doublecolon=151, Semi=152, Dot=153, Ellipsis=154, Underscore=155, Power=156, 
		Hashtag=157, Arrow=158, NullLiteral=159, Quotation=160, Div_=161, LBRACE_LBRACE=162, 
		RBRACE_RBRACE=163, QuestionDot=164, H1=165, H2=166, H3=167, H4=168, IMG_=169, 
		P=170, Click=171, Button=172, Label=173, NgModel=174, Textarea=175, Display=176, 
		Flex_Direction=177, Gap=178, Padding=179, Box_Size=180, Flex=181, Border=182, 
		Text_Align=183, Max_With=184, Height=185, Cursor=186, Transition=187, 
		Pointer=188, Center=189, Solid=190, Background_Color=191, Margin=192, 
		Color=193, FontSize=194, Width=195, Row=196, Column=197, Border_Box=198, 
		DecimalLiteral_UNIT=199, STRING=200, QUOTED_STRING=201, HEXCHAR=202, String_DecimalLiteral=203, 
		DecimalLiteral=204, HexIntegerLiteral=205, At=206, Identifier=207, EVENT_BINDING=208, 
		StringLiteral=209, HTML_COMMENT=210, HTML_CONDITIONAL_COMMENT=211, XML=212, 
		DTD=213, SCRIPT_OPEN=214, STYLE_OPEN=215, TAG_OPEN_1=216, TAG_SLASH=217, 
		TAG_EQUALS=218, TAG_NAME=219, TEXT=220, TAG_WHITESPACE=221, SCRIPT_BODY=222, 
		SCRIPT_SHORT_BODY=223, STYLE_BODY=224, STYLE_SHORT_BODY=225, ATTRIBUT=226, 
		CLASS_SELECTOR=227, ID_SELECTOR=228, UNIT=229;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_statement = 2, RULE_importStatement = 3, 
		RULE_importFromBlock = 4, RULE_importDefault = 5, RULE_importFrom = 6, 
		RULE_importNamespace = 7, RULE_commaReservedWord = 8, RULE_interfaceStatement = 9, 
		RULE_interfaceAttributes = 10, RULE_propertyDeclaration = 11, RULE_componentStatement = 12, 
		RULE_componentOptions = 13, RULE_componentOption = 14, RULE_optionselector = 15, 
		RULE_optionimports = 16, RULE_importsProperties = 17, RULE_reservedWordAndComma = 18, 
		RULE_optiontemplateUrl = 19, RULE_urlStatement = 20, RULE_optionstyleUrls = 21, 
		RULE_exportStatement = 22, RULE_classBody = 23, RULE_propertyList = 24, 
		RULE_bodyList = 25, RULE_bodyListinner = 26, RULE_propertyDeclarationCom = 27, 
		RULE_methodDeclaration = 28, RULE_parameterList = 29, RULE_parameterComma = 30, 
		RULE_parameter = 31, RULE_methodBody = 32, RULE_statementMethod = 33, 
		RULE_functionNgOnInit = 34, RULE_bodyNgOnInit = 35, RULE_ifStatement = 36, 
		RULE_expressionIf = 37, RULE_blockIf = 38, RULE_contentJSON = 39, RULE_contentFilter = 40, 
		RULE_filterArrow = 41, RULE_contentLocalStorage = 42, RULE_elseStatement = 43, 
		RULE_contentElse = 44, RULE_functionDelete = 45, RULE_functionDeleteContent = 46, 
		RULE_constructor = 47, RULE_functionAdd = 48, RULE_functionAddContent = 49, 
		RULE_declarationString = 50, RULE_declarationName = 51, RULE_htmlElements = 52, 
		RULE_htmlElement = 53, RULE_htmlTagNameStart = 54, RULE_htmlTagNameEnd = 55, 
		RULE_htmlElementContent = 56, RULE_contentHtml = 57, RULE_htmlImgAttribute = 58, 
		RULE_elements = 59, RULE_htmlBrace = 60, RULE_htmlAttributes = 61, RULE_cssElement = 62, 
		RULE_selector = 63, RULE_selectorInternal = 64, RULE_cssProperty = 65, 
		RULE_css = 66, RULE_cssValue = 67, RULE_decimalLiteral_UNIT = 68, RULE_decimalLiteralUnit = 69, 
		RULE_decimalLiteral = 70, RULE_tagName = 71, RULE_htmlKeyword = 72, RULE_identifier = 73, 
		RULE_type = 74, RULE_reservedWord = 75, RULE_stringLiteral = 76, RULE_keyword = 77, 
		RULE_eos = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "statement", "importStatement", "importFromBlock", 
			"importDefault", "importFrom", "importNamespace", "commaReservedWord", 
			"interfaceStatement", "interfaceAttributes", "propertyDeclaration", "componentStatement", 
			"componentOptions", "componentOption", "optionselector", "optionimports", 
			"importsProperties", "reservedWordAndComma", "optiontemplateUrl", "urlStatement", 
			"optionstyleUrls", "exportStatement", "classBody", "propertyList", "bodyList", 
			"bodyListinner", "propertyDeclarationCom", "methodDeclaration", "parameterList", 
			"parameterComma", "parameter", "methodBody", "statementMethod", "functionNgOnInit", 
			"bodyNgOnInit", "ifStatement", "expressionIf", "blockIf", "contentJSON", 
			"contentFilter", "filterArrow", "contentLocalStorage", "elseStatement", 
			"contentElse", "functionDelete", "functionDeleteContent", "constructor", 
			"functionAdd", "functionAddContent", "declarationString", "declarationName", 
			"htmlElements", "htmlElement", "htmlTagNameStart", "htmlTagNameEnd", 
			"htmlElementContent", "contentHtml", "htmlImgAttribute", "elements", 
			"htmlBrace", "htmlAttributes", "cssElement", "selector", "selectorInternal", 
			"cssProperty", "css", "cssValue", "decimalLiteral_UNIT", "decimalLiteralUnit", 
			"decimalLiteral", "tagName", "htmlKeyword", "identifier", "type", "reservedWord", 
			"stringLiteral", "keyword", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'import'", "'export'", "'from'", "'out'", 
			"'property'", "'ensure'", "'ensureAlways'", "'check'", "'mixin'", "'extends'", 
			"'super'", "'implements'", "'let'", "'Component'", "'CommonModule'", 
			"'RouterOutlet'", "'RouterLink'", "'OnInit'", "'ngOnInit'", "'typeof'", 
			"'window'", "'localStorage'", "'JSON.parse'", "'input'", "'interface'", 
			"'ngIf'", "'ngFor'", "'src'", "'alt'", "'selector'", "'imports'", "'templateUrl'", 
			"'template'", "'styleUrls'", "'standalone'", "'FormsModule'", "'styleUrl'", 
			"'int'", "'float'", "'double'", "'bool'", "'new'", "'var'", "'string'", 
			"'Array'", "'auto'", "'break'", "'case'", "'catch'", "'char'", "'class'", 
			"'const'", "'continue'", "'default'", "'do'", "'else'", "'enum'", "'false'", 
			"'final'", "'for'", "'goto'", "'if'", "'namespace'", "'nullptr'", "'operator'", 
			"'override'", "'private'", "'protected'", "'public'", "'static'", "'package'", 
			"'return'", "'short'", "'struct'", "'switch'", "'this'", "'true'", "'virtual'", 
			"'void'", "'while'", "'function'", "'with'", "'throw'", "'any'", "'in'", 
			"'try'", "'as'", "'number'", "'unique'", "'symbol'", "'undefined'", "'object'", 
			"'constructor'", "'abstract'", "'require'", "'module'", "'declare'", 
			"'angular'", "'common'", "'core'", "'router'", "'SomeClass'", "'angularCore'", 
			"'Router'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			null, "'%'", null, "'&'", "'|'", "'~'", "'!'", null, "'<'", "'>'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", "'>>='", 
			"'=='", "'==='", "'!='", "'!=='", "'<='", "'>='", "'&&'", "'||'", "'++'", 
			"'--'", "','", "'?'", "':'", "'::'", "';'", "'.'", "'...'", "'_'", "'**'", 
			"'#'", "'=>'", "'null'", "'''", "'div'", "'{{'", "'}}'", "'?.'", "'h1'", 
			"'h2'", "'h3'", "'h4'", "'img'", "'p'", "'(click)'", "'button'", "'label'", 
			"'(ngModel)'", "'textarea'", "'display'", "'flex-direction'", "'gap'", 
			"'padding'", "'box-sizing'", "'flex'", "'border'", "'text-align'", "'max-width'", 
			"'height'", "'cursor'", "'transition'", "'pointer'", "'center'", "'solid'", 
			"'background-color'", "'margin'", "'color'", "'font-size'", "'width'", 
			"'row'", "'column'", "'border-box'", null, null, null, null, null, null, 
			null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WS", "NEWLINE", "Import", 
			"Export", "From", "Out", "Property", "Ensure", "EnsureAlways", "Check", 
			"Mixin", "Extends", "Super", "Implements", "Let", "Component", "CommonModule", 
			"RouterOutlet", "RouterLink", "OnInit", "NgOnInit", "Typeof", "Window", 
			"LocalStorage", "JSONParse", "Input", "Interface", "NGIF", "NGFOR", "SRC", 
			"ALT", "Selector", "Imports", "TemplateUrl", "Template", "StyleUrls", 
			"Standalone", "FormsModule", "StyleUrl", "Int", "Float", "Double", "Bool", 
			"New", "Var", "String", "Array", "Auto", "Break", "Case", "Catch", "Char", 
			"Class", "Const", "Continue", "Default", "Do", "Else", "Enum", "False_", 
			"Final", "For", "Goto", "If", "Namespace", "Nullptr", "Operator", "Override", 
			"Private", "Protected", "Public", "Static", "Package", "Return", "Short", 
			"Struct", "Switch", "This", "True_", "Virtual", "Void", "While", "Function_", 
			"With", "Throw", "Any", "In", "Try", "As", "Number", "Unique", "Symbol", 
			"Undefined", "Object", "Constructor", "Abstract", "Require", "Module", 
			"Declare", "Angular", "Common", "Core", "Router", "SomeClass", "AngularCore", 
			"Router_", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Xor", 
			"And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "LeftShiftAssign", "RightShiftAssign", "Equal", "DoubleEqual", 
			"NotEqual", "NotEqual2", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", 
			"PlusPlus", "MinusMinus", "Comma", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "Ellipsis", "Underscore", "Power", "Hashtag", "Arrow", 
			"NullLiteral", "Quotation", "Div_", "LBRACE_LBRACE", "RBRACE_RBRACE", 
			"QuestionDot", "H1", "H2", "H3", "H4", "IMG_", "P", "Click", "Button", 
			"Label", "NgModel", "Textarea", "Display", "Flex_Direction", "Gap", "Padding", 
			"Box_Size", "Flex", "Border", "Text_Align", "Max_With", "Height", "Cursor", 
			"Transition", "Pointer", "Center", "Solid", "Background_Color", "Margin", 
			"Color", "FontSize", "Width", "Row", "Column", "Border_Box", "DecimalLiteral_UNIT", 
			"STRING", "QUOTED_STRING", "HEXCHAR", "String_DecimalLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "At", "Identifier", "EVENT_BINDING", "StringLiteral", 
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "DTD", "SCRIPT_OPEN", 
			"STYLE_OPEN", "TAG_OPEN_1", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TEXT", 
			"TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTRIBUT", "CLASS_SELECTOR", "ID_SELECTOR", "UNIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805306464L) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 6629018310384033793L) != 0) || _la==STRING || _la==At) {
				{
				setState(158);
				sourceElements();
				}
			}

			setState(161);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				statement();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 805306464L) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 6629018310384033793L) != 0) || _la==STRING || _la==At );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStatementLabelContext extends StatementContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public HtmlStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementLabelContext extends StatementContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExportStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementLabelContext extends StatementContext {
		public ComponentStatementContext componentStatement() {
			return getRuleContext(ComponentStatementContext.class,0);
		}
		public ComponentStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStatementLabelContext extends StatementContext {
		public CssElementContext cssElement() {
			return getRuleContext(CssElementContext.class,0);
		}
		public CssStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementLabelContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceStatementLabelContext extends StatementContext {
		public InterfaceStatementContext interfaceStatement() {
			return getRuleContext(InterfaceStatementContext.class,0);
		}
		public InterfaceStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				importStatement();
				}
				break;
			case Interface:
				_localctx = new InterfaceStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				interfaceStatement();
				}
				break;
			case At:
				_localctx = new ComponentStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				componentStatement();
				}
				break;
			case Export:
				_localctx = new ExportStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				exportStatement();
				}
				break;
			case Less:
				_localctx = new HtmlStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				htmlElements();
				}
				break;
			case Input:
			case LeftBrace:
			case Comma:
			case Dot:
			case Div_:
			case LBRACE_LBRACE:
			case RBRACE_RBRACE:
			case QuestionDot:
			case H1:
			case H2:
			case H3:
			case H4:
			case IMG_:
			case P:
			case Button:
			case Label:
			case Textarea:
			case STRING:
				_localctx = new CssStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				cssElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Import);
			setState(177);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
	 
		public ImportFromBlockContext() { }
		public void copyFrom(ImportFromBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportContext extends ImportFromBlockContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public DefaultImportContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDefaultImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDefaultImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDefaultImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassImportContext extends ImportFromBlockContext {
		public TerminalNode SomeClass() { return getToken(AngularParser.SomeClass, 0); }
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public ClassImportContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceImportContext extends ImportFromBlockContext {
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public TerminalNode As() { return getToken(AngularParser.As, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public NamespaceImportContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamespaceImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamespaceImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamespaceImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importFromBlock);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case From:
			case LeftBrace:
			case StringLiteral:
				_localctx = new DefaultImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrace) {
					{
					setState(179);
					importDefault();
					}
				}

				setState(182);
				importFrom();
				setState(183);
				eos();
				}
				break;
			case SomeClass:
				_localctx = new ClassImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(SomeClass);
				setState(186);
				importFrom();
				}
				break;
			case Star:
				_localctx = new NamespaceImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(Star);
				setState(188);
				match(As);
				setState(189);
				reservedWord();
				setState(190);
				importFrom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LeftBrace);
			setState(195);
			importNamespace();
			setState(196);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(198);
				match(From);
				}
			}

			setState(201);
			stringLiteral();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(202);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceContext extends ParserRuleContext {
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public List<CommaReservedWordContext> commaReservedWord() {
			return getRuleContexts(CommaReservedWordContext.class);
		}
		public CommaReservedWordContext commaReservedWord(int i) {
			return getRuleContext(CommaReservedWordContext.class,i);
		}
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			reservedWord();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(206);
				commaReservedWord();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaReservedWordContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public CommaReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaReservedWordContext commaReservedWord() throws RecognitionException {
		CommaReservedWordContext _localctx = new CommaReservedWordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commaReservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Comma);
			setState(213);
			reservedWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceStatementContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public InterfaceAttributesContext interfaceAttributes() {
			return getRuleContext(InterfaceAttributesContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public InterfaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceStatementContext interfaceStatement() throws RecognitionException {
		InterfaceStatementContext _localctx = new InterfaceStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Interface);
			setState(216);
			declarationName();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980916981856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral) {
				{
				setState(217);
				keyword();
				setState(218);
				declarationName();
				}
			}

			setState(222);
			interfaceAttributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceAttributesContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public InterfaceAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceAttributesContext interfaceAttributes() throws RecognitionException {
		InterfaceAttributesContext _localctx = new InterfaceAttributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LeftBrace);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(225);
				propertyDeclaration();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	 
		public PropertyDeclarationContext() { }
		public void copyFrom(PropertyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodPropertyContext extends PropertyDeclarationContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public MethodPropertyContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributesPropertyContext extends PropertyDeclarationContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public AttributesPropertyContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributesProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyDeclaration);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AttributesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				declarationName();
				setState(234);
				match(Colon);
				setState(235);
				type();
				setState(236);
				eos();
				}
				break;
			case 2:
				_localctx = new MethodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				declarationName();
				setState(239);
				match(LeftParen);
				setState(240);
				match(RightParen);
				setState(241);
				match(Colon);
				setState(242);
				type();
				setState(243);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngularParser.At, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public ComponentOptionsContext componentOptions() {
			return getRuleContext(ComponentOptionsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public ComponentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentStatementContext componentStatement() throws RecognitionException {
		ComponentStatementContext _localctx = new ComponentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(At);
			setState(248);
			match(Component);
			setState(249);
			match(LeftParen);
			setState(250);
			componentOptions();
			setState(251);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentOptionsContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<ComponentOptionContext> componentOption() {
			return getRuleContexts(ComponentOptionContext.class);
		}
		public ComponentOptionContext componentOption(int i) {
			return getRuleContext(ComponentOptionContext.class,i);
		}
		public ComponentOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentOptionsContext componentOptions() throws RecognitionException {
		ComponentOptionsContext _localctx = new ComponentOptionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_componentOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LeftBrace);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3281355014144L) != 0)) {
				{
				{
				setState(254);
				componentOption();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentOptionContext extends ParserRuleContext {
		public ComponentOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentOption; }
	 
		public ComponentOptionContext() { }
		public void copyFrom(ComponentOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionSelectorLabelContext extends ComponentOptionContext {
		public OptionselectorContext optionselector() {
			return getRuleContext(OptionselectorContext.class,0);
		}
		public OptionSelectorLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionSelectorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionSelectorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionSelectorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionStandaloneLabelContext extends ComponentOptionContext {
		public TerminalNode Standalone() { return getToken(AngularParser.Standalone, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptionStandaloneLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionStandaloneLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionStandaloneLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionStandaloneLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionStylesLabelContext extends ComponentOptionContext {
		public OptionstyleUrlsContext optionstyleUrls() {
			return getRuleContext(OptionstyleUrlsContext.class,0);
		}
		public OptionStylesLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionStylesLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionStylesLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionStylesLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionTemplateLabelContext extends ComponentOptionContext {
		public OptiontemplateUrlContext optiontemplateUrl() {
			return getRuleContext(OptiontemplateUrlContext.class,0);
		}
		public OptionTemplateLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionTemplateLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionTemplateLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionTemplateLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionImportsLabelContext extends ComponentOptionContext {
		public OptionimportsContext optionimports() {
			return getRuleContext(OptionimportsContext.class,0);
		}
		public OptionImportsLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionImportsLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionImportsLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionImportsLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentOptionContext componentOption() throws RecognitionException {
		ComponentOptionContext _localctx = new ComponentOptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_componentOption);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new OptionSelectorLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				optionselector();
				}
				break;
			case Imports:
				_localctx = new OptionImportsLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				optionimports();
				}
				break;
			case TemplateUrl:
			case Template:
			case StyleUrl:
				_localctx = new OptionTemplateLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				optiontemplateUrl();
				}
				break;
			case StyleUrls:
				_localctx = new OptionStylesLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				optionstyleUrls();
				}
				break;
			case Standalone:
				_localctx = new OptionStandaloneLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(Standalone);
				setState(267);
				match(Colon);
				setState(268);
				identifier();
				setState(269);
				match(Comma);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionselectorContext extends ParserRuleContext {
		public TerminalNode Selector() { return getToken(AngularParser.Selector, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptionselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionselector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionselector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionselectorContext optionselector() throws RecognitionException {
		OptionselectorContext _localctx = new OptionselectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optionselector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(Selector);
			setState(274);
			match(Colon);
			setState(275);
			stringLiteral();
			setState(276);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionimportsContext extends ParserRuleContext {
		public TerminalNode Imports() { return getToken(AngularParser.Imports, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ImportsPropertiesContext importsProperties() {
			return getRuleContext(ImportsPropertiesContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptionimportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionimports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionimports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionimports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionimports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionimportsContext optionimports() throws RecognitionException {
		OptionimportsContext _localctx = new OptionimportsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optionimports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Imports);
			setState(279);
			match(Colon);
			setState(280);
			importsProperties();
			setState(281);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertiesContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public List<ReservedWordAndCommaContext> reservedWordAndComma() {
			return getRuleContexts(ReservedWordAndCommaContext.class);
		}
		public ReservedWordAndCommaContext reservedWordAndComma(int i) {
			return getRuleContext(ReservedWordAndCommaContext.class,i);
		}
		public ImportsPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsPropertiesContext importsProperties() throws RecognitionException {
		ImportsPropertiesContext _localctx = new ImportsPropertiesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_importsProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LeftBracket);
			setState(284);
			reservedWord();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(285);
				reservedWordAndComma();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedWordAndCommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public ReservedWordAndCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWordAndComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReservedWordAndComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReservedWordAndComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReservedWordAndComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordAndCommaContext reservedWordAndComma() throws RecognitionException {
		ReservedWordAndCommaContext _localctx = new ReservedWordAndCommaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reservedWordAndComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Comma);
			setState(294);
			reservedWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptiontemplateUrlContext extends ParserRuleContext {
		public UrlStatementContext urlStatement() {
			return getRuleContext(UrlStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptiontemplateUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optiontemplateUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptiontemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptiontemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptiontemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptiontemplateUrlContext optiontemplateUrl() throws RecognitionException {
		OptiontemplateUrlContext _localctx = new OptiontemplateUrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optiontemplateUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			urlStatement();
			setState(297);
			match(Colon);
			setState(298);
			stringLiteral();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(299);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UrlStatementContext extends ParserRuleContext {
		public TerminalNode TemplateUrl() { return getToken(AngularParser.TemplateUrl, 0); }
		public TerminalNode StyleUrl() { return getToken(AngularParser.StyleUrl, 0); }
		public TerminalNode Template() { return getToken(AngularParser.Template, 0); }
		public UrlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlStatementContext urlStatement() throws RecognitionException {
		UrlStatementContext _localctx = new UrlStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_urlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2405181685760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionstyleUrlsContext extends ParserRuleContext {
		public TerminalNode StyleUrls() { return getToken(AngularParser.StyleUrls, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public OptionstyleUrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionstyleUrls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionstyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionstyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionstyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionstyleUrlsContext optionstyleUrls() throws RecognitionException {
		OptionstyleUrlsContext _localctx = new OptionstyleUrlsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optionstyleUrls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(StyleUrls);
			setState(305);
			match(Colon);
			setState(306);
			match(LeftBracket);
			setState(307);
			stringLiteral();
			setState(308);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public TerminalNode Implements() { return getToken(AngularParser.Implements, 0); }
		public TerminalNode OnInit() { return getToken(AngularParser.OnInit, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Export);
			setState(311);
			keyword();
			setState(312);
			declarationName();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(313);
				match(Implements);
				setState(314);
				match(OnInit);
				}
			}

			setState(317);
			match(LeftBrace);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NgOnInit || _la==Constructor || _la==STRING) {
				{
				{
				setState(318);
				classBody();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyStringContext extends ClassBodyContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyStringContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeleteProductContext extends ClassBodyContext {
		public FunctionDeleteContext functionDelete() {
			return getRuleContext(FunctionDeleteContext.class,0);
		}
		public FunctionDeleteProductContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeleteProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeleteProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeleteProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAddProductContext extends ClassBodyContext {
		public FunctionAddContext functionAdd() {
			return getRuleContext(FunctionAddContext.class,0);
		}
		public FunctionAddProductContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionAddProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionAddProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionAddProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullClassBodyContext extends ClassBodyContext {
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public PropertyDeclarationComContext propertyDeclarationCom() {
			return getRuleContext(PropertyDeclarationComContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FullClassBodyContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFullClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFullClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFullClassBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodOnlyContext extends ClassBodyContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodOnlyContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorLableContext extends ClassBodyContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ConstructorLableContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNgOnInitTableContext extends ClassBodyContext {
		public FunctionNgOnInitContext functionNgOnInit() {
			return getRuleContext(FunctionNgOnInitContext.class,0);
		}
		public FunctionNgOnInitTableContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionNgOnInitTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionNgOnInitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionNgOnInitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBody);
		try {
			int _alt;
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new FullClassBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(326);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(329); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(331);
					propertyDeclarationCom();
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(334);
					methodDeclaration();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new PropertyStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				declarationName();
				setState(338);
				match(Colon);
				setState(339);
				type();
				setState(340);
				match(Assign);
				setState(341);
				stringLiteral();
				setState(342);
				eos();
				}
				break;
			case 3:
				_localctx = new MethodOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				methodDeclaration();
				}
				break;
			case 4:
				_localctx = new FunctionNgOnInitTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				functionNgOnInit();
				}
				break;
			case 5:
				_localctx = new FunctionDeleteProductContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				functionDelete();
				}
				break;
			case 6:
				_localctx = new ConstructorLableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				constructor();
				}
				break;
			case 7:
				_localctx = new FunctionAddProductContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				functionAdd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(AngularParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(AngularParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(AngularParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(AngularParser.RightBracket, i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<BodyListContext> bodyList() {
			return getRuleContexts(BodyListContext.class);
		}
		public BodyListContext bodyList(int i) {
			return getRuleContext(BodyListContext.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propertyList);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				declarationName();
				setState(352);
				match(Colon);
				setState(353);
				match(STRING);
				setState(354);
				match(LeftBracket);
				setState(355);
				match(RightBracket);
				setState(356);
				match(Assign);
				setState(357);
				match(LeftBracket);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBrace) {
					{
					{
					setState(358);
					bodyList();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(RightBracket);
				setState(365);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				declarationName();
				setState(368);
				match(Assign);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBrace) {
					{
					{
					setState(369);
					bodyList();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<BodyListinnerContext> bodyListinner() {
			return getRuleContexts(BodyListinnerContext.class);
		}
		public BodyListinnerContext bodyListinner(int i) {
			return getRuleContext(BodyListinnerContext.class,i);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public BodyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyListContext bodyList() throws RecognitionException {
		BodyListContext _localctx = new BodyListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bodyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LeftBrace);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(380);
				bodyListinner();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(RightBrace);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(387);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyListinnerContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BodyListinnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyListinner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyListinner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyListinner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyListinner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyListinnerContext bodyListinner() throws RecognitionException {
		BodyListinnerContext _localctx = new BodyListinnerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bodyListinner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			declarationName();
			setState(391);
			match(Colon);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(392);
				stringLiteral();
				}
			}

			setState(395);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationComContext extends ParserRuleContext {
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyDeclarationComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclarationCom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclarationCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclarationCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclarationCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationComContext propertyDeclarationCom() throws RecognitionException {
		PropertyDeclarationComContext _localctx = new PropertyDeclarationComContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_propertyDeclarationCom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			declarationName();
			setState(398);
			match(Colon);
			setState(399);
			declarationName();
			setState(400);
			identifier();
			setState(401);
			keyword();
			setState(402);
			match(Assign);
			setState(403);
			keyword();
			setState(404);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			declarationName();
			setState(407);
			match(LeftParen);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(408);
				parameterList();
				}
			}

			setState(411);
			match(RightParen);
			setState(412);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<ParameterCommaContext> parameterComma() {
			return getRuleContexts(ParameterCommaContext.class);
		}
		public ParameterCommaContext parameterComma(int i) {
			return getRuleContext(ParameterCommaContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			parameter();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(415);
				parameterComma();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterCommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterCommaContext parameterComma() throws RecognitionException {
		ParameterCommaContext _localctx = new ParameterCommaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Comma);
			setState(422);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public DeclarationStringContext declarationString() {
			return getRuleContext(DeclarationStringContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			declarationName();
			setState(425);
			match(Colon);
			setState(426);
			declarationString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<StatementMethodContext> statementMethod() {
			return getRuleContexts(StatementMethodContext.class);
		}
		public StatementMethodContext statementMethod(int i) {
			return getRuleContext(StatementMethodContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(LeftBrace);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980916981856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral) {
				{
				{
				setState(429);
				statementMethod();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementMethodContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public DeclarationStringContext declarationString() {
			return getRuleContext(DeclarationStringContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatementMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatementMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatementMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statementMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			keyword();
			setState(438);
			match(Dot);
			setState(439);
			declarationName();
			setState(440);
			match(Assign);
			setState(441);
			declarationString();
			setState(442);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNgOnInitContext extends ParserRuleContext {
		public TerminalNode NgOnInit() { return getToken(AngularParser.NgOnInit, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<BodyNgOnInitContext> bodyNgOnInit() {
			return getRuleContexts(BodyNgOnInitContext.class);
		}
		public BodyNgOnInitContext bodyNgOnInit(int i) {
			return getRuleContext(BodyNgOnInitContext.class,i);
		}
		public FunctionNgOnInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNgOnInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionNgOnInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionNgOnInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionNgOnInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNgOnInitContext functionNgOnInit() throws RecognitionException {
		FunctionNgOnInitContext _localctx = new FunctionNgOnInitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionNgOnInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(NgOnInit);
			setState(445);
			match(LeftParen);
			setState(446);
			match(RightParen);
			setState(447);
			match(Colon);
			setState(448);
			keyword();
			setState(449);
			match(LeftBrace);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==If) {
				{
				{
				setState(450);
				bodyNgOnInit();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyNgOnInitContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public BodyNgOnInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyNgOnInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyNgOnInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyNgOnInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyNgOnInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyNgOnInitContext bodyNgOnInit() throws RecognitionException {
		BodyNgOnInitContext _localctx = new BodyNgOnInitContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bodyNgOnInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			ifStatement();
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(459);
				elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public ExpressionIfContext expressionIf() {
			return getRuleContext(ExpressionIfContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<BlockIfContext> blockIf() {
			return getRuleContexts(BlockIfContext.class);
		}
		public BlockIfContext blockIf(int i) {
			return getRuleContext(BlockIfContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(If);
			setState(463);
			match(LeftParen);
			setState(464);
			expressionIf();
			setState(465);
			match(RightParen);
			setState(466);
			match(LeftBrace);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980984090720L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral || _la==STRING) {
				{
				{
				setState(467);
				blockIf();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIfContext extends ParserRuleContext {
		public List<TerminalNode> Typeof() { return getTokens(AngularParser.Typeof); }
		public TerminalNode Typeof(int i) {
			return getToken(AngularParser.Typeof, i);
		}
		public TerminalNode Window() { return getToken(AngularParser.Window, 0); }
		public List<TerminalNode> NotEqual2() { return getTokens(AngularParser.NotEqual2); }
		public TerminalNode NotEqual2(int i) {
			return getToken(AngularParser.NotEqual2, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode AndAnd() { return getToken(AngularParser.AndAnd, 0); }
		public TerminalNode LocalStorage() { return getToken(AngularParser.LocalStorage, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode QuestionDot() { return getToken(AngularParser.QuestionDot, 0); }
		public TerminalNode DoubleEqual() { return getToken(AngularParser.DoubleEqual, 0); }
		public ExpressionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIfContext expressionIf() throws RecognitionException {
		ExpressionIfContext _localctx = new ExpressionIfContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionIf);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Typeof:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(Typeof);
				setState(476);
				match(Window);
				setState(477);
				match(NotEqual2);
				setState(478);
				stringLiteral();
				setState(479);
				match(AndAnd);
				setState(480);
				match(Typeof);
				setState(481);
				match(LocalStorage);
				setState(482);
				match(NotEqual2);
				setState(483);
				stringLiteral();
				}
				break;
			case Import:
			case Export:
			case Extends:
			case Let:
			case Interface:
			case New:
			case Break:
			case Case:
			case Class:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Else:
			case For:
			case If:
			case Return:
			case Switch:
			case This:
			case Void:
			case While:
			case Function_:
			case In:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				keyword();
				setState(486);
				match(Dot);
				setState(487);
				declarationName();
				setState(488);
				match(QuestionDot);
				setState(489);
				declarationName();
				setState(490);
				match(DoubleEqual);
				setState(491);
				declarationName();
				setState(492);
				match(Dot);
				setState(493);
				declarationName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfContext extends ParserRuleContext {
		public BlockIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockIf; }
	 
		public BlockIfContext() { }
		public void copyFrom(BlockIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfEllipsisContext extends BlockIfContext {
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode Ellipsis() { return getToken(AngularParser.Ellipsis, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BlockIfEllipsisContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfEllipsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfEllipsis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfFilterContext extends BlockIfContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public ContentFilterContext contentFilter() {
			return getRuleContext(ContentFilterContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BlockIfFilterContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfNullLiteralContext extends BlockIfContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BlockIfNullLiteralContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfTableContext extends BlockIfContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BlockIfTableContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfJSONContext extends BlockIfContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode JSONParse() { return getToken(AngularParser.JSONParse, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public ContentJSONContext contentJSON() {
			return getRuleContext(ContentJSONContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BlockIfJSONContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfJSON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfJSON(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfJSON(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfElseContext extends BlockIfContext {
		public ContentElseContext contentElse() {
			return getRuleContext(ContentElseContext.class,0);
		}
		public BlockIfElseContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfLocalStorageContext extends BlockIfContext {
		public TerminalNode LocalStorage() { return getToken(AngularParser.LocalStorage, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public ContentLocalStorageContext contentLocalStorage() {
			return getRuleContext(ContentLocalStorageContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BlockIfLocalStorageContext(BlockIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockIfLocalStorage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockIfLocalStorage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockIfLocalStorage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockIfContext blockIf() throws RecognitionException {
		BlockIfContext _localctx = new BlockIfContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockIf);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new BlockIfJSONContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				keyword();
				setState(498);
				match(STRING);
				setState(499);
				match(Assign);
				setState(500);
				match(JSONParse);
				setState(501);
				match(LeftParen);
				setState(502);
				contentJSON();
				setState(503);
				match(RightParen);
				setState(504);
				eos();
				}
				break;
			case 2:
				_localctx = new BlockIfFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				keyword();
				setState(507);
				match(STRING);
				setState(508);
				match(Assign);
				setState(509);
				declarationName();
				setState(510);
				match(Dot);
				setState(511);
				declarationName();
				setState(512);
				match(LeftParen);
				setState(513);
				contentFilter();
				setState(514);
				match(RightParen);
				setState(515);
				eos();
				}
				break;
			case 3:
				_localctx = new BlockIfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				contentElse();
				}
				break;
			case 4:
				_localctx = new BlockIfLocalStorageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				match(LocalStorage);
				setState(519);
				match(Dot);
				setState(520);
				declarationName();
				setState(521);
				match(LeftParen);
				setState(522);
				contentLocalStorage();
				setState(523);
				match(RightParen);
				setState(524);
				eos();
				}
				break;
			case 5:
				_localctx = new BlockIfNullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				keyword();
				setState(527);
				match(Dot);
				setState(528);
				declarationName();
				setState(529);
				match(Assign);
				setState(530);
				match(NullLiteral);
				setState(531);
				eos();
				}
				break;
			case 6:
				_localctx = new BlockIfEllipsisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				declarationName();
				setState(534);
				match(Dot);
				setState(535);
				declarationName();
				setState(536);
				match(LeftParen);
				setState(537);
				match(LeftBrace);
				setState(538);
				match(Ellipsis);
				setState(539);
				keyword();
				setState(540);
				match(Dot);
				setState(541);
				declarationName();
				setState(542);
				match(RightBrace);
				setState(543);
				match(RightParen);
				setState(544);
				eos();
				}
				break;
			case 7:
				_localctx = new BlockIfTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				keyword();
				setState(547);
				match(Dot);
				setState(548);
				reservedWord();
				setState(549);
				match(Dot);
				setState(550);
				declarationName();
				setState(551);
				match(LeftParen);
				setState(552);
				match(LeftBracket);
				setState(553);
				stringLiteral();
				setState(554);
				match(RightBracket);
				setState(555);
				match(RightParen);
				setState(556);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentJSONContext extends ParserRuleContext {
		public TerminalNode LocalStorage() { return getToken(AngularParser.LocalStorage, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode OrOr() { return getToken(AngularParser.OrOr, 0); }
		public ContentJSONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentJSON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContentJSON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContentJSON(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContentJSON(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentJSONContext contentJSON() throws RecognitionException {
		ContentJSONContext _localctx = new ContentJSONContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_contentJSON);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(LocalStorage);
			setState(561);
			match(Dot);
			setState(562);
			declarationName();
			setState(563);
			match(LeftParen);
			setState(564);
			stringLiteral();
			setState(565);
			match(RightParen);
			setState(566);
			match(OrOr);
			setState(567);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentFilterContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode Any() { return getToken(AngularParser.Any, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public List<FilterArrowContext> filterArrow() {
			return getRuleContexts(FilterArrowContext.class);
		}
		public FilterArrowContext filterArrow(int i) {
			return getRuleContext(FilterArrowContext.class,i);
		}
		public ContentFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContentFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContentFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContentFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentFilterContext contentFilter() throws RecognitionException {
		ContentFilterContext _localctx = new ContentFilterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_contentFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LeftParen);
			setState(570);
			match(STRING);
			setState(571);
			match(Colon);
			setState(572);
			match(Any);
			setState(573);
			match(RightParen);
			setState(574);
			match(Arrow);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(575);
				filterArrow();
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterArrowContext extends ParserRuleContext {
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode QuestionDot() { return getToken(AngularParser.QuestionDot, 0); }
		public TerminalNode AndAnd() { return getToken(AngularParser.AndAnd, 0); }
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public TerminalNode NotEqual2() { return getToken(AngularParser.NotEqual2, 0); }
		public FilterArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFilterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFilterArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFilterArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterArrowContext filterArrow() throws RecognitionException {
		FilterArrowContext _localctx = new FilterArrowContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_filterArrow);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				declarationName();
				setState(582);
				match(QuestionDot);
				setState(583);
				declarationName();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AndAnd) {
					{
					setState(584);
					match(AndAnd);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				declarationName();
				setState(588);
				match(Dot);
				setState(589);
				declarationName();
				setState(590);
				match(NotEqual2);
				setState(591);
				declarationName();
				setState(592);
				match(Dot);
				setState(593);
				declarationName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentLocalStorageContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public ContentLocalStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentLocalStorage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContentLocalStorage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContentLocalStorage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContentLocalStorage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentLocalStorageContext contentLocalStorage() throws RecognitionException {
		ContentLocalStorageContext _localctx = new ContentLocalStorageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_contentLocalStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			stringLiteral();
			setState(598);
			match(Comma);
			setState(599);
			declarationName();
			setState(600);
			match(Dot);
			setState(601);
			declarationName();
			setState(602);
			match(LeftParen);
			setState(603);
			declarationName();
			setState(604);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public ContentElseContext contentElse() {
			return getRuleContext(ContentElseContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			keyword();
			setState(607);
			match(LeftBrace);
			setState(608);
			contentElse();
			setState(609);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentElseContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public List<TerminalNode> Ellipsis() { return getTokens(AngularParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(AngularParser.Ellipsis, i);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ContentElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContentElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContentElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContentElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentElseContext contentElse() throws RecognitionException {
		ContentElseContext _localctx = new ContentElseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_contentElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			keyword();
			setState(612);
			match(Dot);
			setState(613);
			declarationName();
			setState(614);
			match(Assign);
			setState(615);
			match(LeftBracket);
			setState(616);
			match(Ellipsis);
			setState(617);
			keyword();
			setState(618);
			match(Dot);
			setState(619);
			declarationName();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(620);
				match(Comma);
				setState(621);
				match(Ellipsis);
				setState(622);
				declarationName();
				}
			}

			setState(625);
			match(RightBracket);
			setState(626);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeleteContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<FunctionDeleteContentContext> functionDeleteContent() {
			return getRuleContexts(FunctionDeleteContentContext.class);
		}
		public FunctionDeleteContentContext functionDeleteContent(int i) {
			return getRuleContext(FunctionDeleteContentContext.class,i);
		}
		public FunctionDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeleteContext functionDelete() throws RecognitionException {
		FunctionDeleteContext _localctx = new FunctionDeleteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionDelete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			declarationName();
			setState(629);
			match(LeftParen);
			setState(630);
			match(STRING);
			setState(631);
			match(Colon);
			setState(632);
			match(Number);
			setState(633);
			match(RightParen);
			setState(634);
			match(LeftBrace);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980916981856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral) {
				{
				{
				setState(635);
				functionDeleteContent();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeleteContentContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionDeleteContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeleteContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeleteContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeleteContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeleteContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeleteContentContext functionDeleteContent() throws RecognitionException {
		FunctionDeleteContentContext _localctx = new FunctionDeleteContentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionDeleteContent);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				keyword();
				setState(644);
				declarationName();
				setState(645);
				match(Assign);
				setState(646);
				keyword();
				setState(647);
				match(Dot);
				setState(648);
				declarationName();
				setState(649);
				match(Dot);
				setState(650);
				declarationName();
				setState(651);
				match(LeftParen);
				setState(652);
				declarationName();
				setState(653);
				match(Comma);
				setState(654);
				match(STRING);
				setState(655);
				match(RightParen);
				setState(656);
				match(LeftBracket);
				setState(657);
				match(STRING);
				setState(658);
				match(RightBracket);
				setState(659);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(AngularParser.Constructor, 0); }
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ReservedWordContext> reservedWord() {
			return getRuleContexts(ReservedWordContext.class);
		}
		public ReservedWordContext reservedWord(int i) {
			return getRuleContext(ReservedWordContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(Constructor);
			setState(665);
			match(LeftParen);
			setState(666);
			type();
			setState(667);
			reservedWord();
			setState(668);
			match(Colon);
			setState(669);
			reservedWord();
			setState(670);
			match(RightParen);
			setState(671);
			match(LeftBrace);
			setState(672);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAddContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<FunctionAddContentContext> functionAddContent() {
			return getRuleContexts(FunctionAddContentContext.class);
		}
		public FunctionAddContentContext functionAddContent(int i) {
			return getRuleContext(FunctionAddContentContext.class,i);
		}
		public FunctionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAddContext functionAdd() throws RecognitionException {
		FunctionAddContext _localctx = new FunctionAddContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			declarationName();
			setState(675);
			match(LeftParen);
			setState(676);
			match(RightParen);
			setState(677);
			match(LeftBrace);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980984090720L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral || _la==STRING) {
				{
				{
				setState(678);
				functionAddContent();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAddContentContext extends ParserRuleContext {
		public BlockIfContext blockIf() {
			return getRuleContext(BlockIfContext.class,0);
		}
		public FunctionAddContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAddContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionAddContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionAddContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionAddContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAddContentContext functionAddContent() throws RecognitionException {
		FunctionAddContentContext _localctx = new FunctionAddContentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionAddContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			blockIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStringContext extends ParserRuleContext {
		public DeclarationStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationString; }
	 
		public DeclarationStringContext() { }
		public void copyFrom(DeclarationStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTypedContext extends DeclarationStringContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterTypedContext(DeclarationStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterTyped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterTyped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterTyped(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends DeclarationStringContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public DeclarationContext(DeclarationStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralLabelContext extends DeclarationStringContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralLabelContext(DeclarationStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStringContext declarationString() throws RecognitionException {
		DeclarationStringContext _localctx = new DeclarationStringContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declarationString);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Double:
			case Bool:
			case Var:
			case String:
			case Array:
			case Private:
			case Number:
				_localctx = new ParameterTypedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				type();
				}
				break;
			case STRING:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				declarationName();
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public DeclarationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationNameContext declarationName() throws RecognitionException {
		DeclarationNameContext _localctx = new DeclarationNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_htmlElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			htmlElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<HtmlTagNameStartContext> htmlTagNameStart() {
			return getRuleContexts(HtmlTagNameStartContext.class);
		}
		public HtmlTagNameStartContext htmlTagNameStart(int i) {
			return getRuleContext(HtmlTagNameStartContext.class,i);
		}
		public List<HtmlElementContentContext> htmlElementContent() {
			return getRuleContexts(HtmlElementContentContext.class);
		}
		public HtmlElementContentContext htmlElementContent(int i) {
			return getRuleContext(HtmlElementContentContext.class,i);
		}
		public List<HtmlTagNameEndContext> htmlTagNameEnd() {
			return getRuleContexts(HtmlTagNameEndContext.class);
		}
		public HtmlTagNameEndContext htmlTagNameEnd(int i) {
			return getRuleContext(HtmlTagNameEndContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_htmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(697);
					htmlTagNameStart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(700); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					htmlElementContent();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(708);
					htmlTagNameEnd();
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameStartContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlTagNameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagNameStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagNameStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagNameStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagNameStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameStartContext htmlTagNameStart() throws RecognitionException {
		HtmlTagNameStartContext _localctx = new HtmlTagNameStartContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_htmlTagNameStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(Less);
			setState(715);
			tagName();
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(716);
				keyword();
				setState(717);
				match(Assign);
				setState(718);
				stringLiteral();
				}
				break;
			}
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Greater) {
				{
				setState(722);
				match(Greater);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameEndContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlTagNameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagNameEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagNameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagNameEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagNameEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameEndContext htmlTagNameEnd() throws RecognitionException {
		HtmlTagNameEndContext _localctx = new HtmlTagNameEndContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_htmlTagNameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(Less);
			setState(726);
			match(Div);
			setState(727);
			tagName();
			setState(728);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContentContext extends ParserRuleContext {
		public HtmlElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementContent; }
	 
		public HtmlElementContentContext() { }
		public void copyFrom(HtmlElementContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedHtmlContext extends HtmlElementContentContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public NestedHtmlContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNestedHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNestedHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNestedHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationNumberContext extends HtmlElementContentContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public DeclarationNumberContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentManyContext extends HtmlElementContentContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public List<ContentHtmlContext> contentHtml() {
			return getRuleContexts(ContentHtmlContext.class);
		}
		public ContentHtmlContext contentHtml(int i) {
			return getRuleContext(ContentHtmlContext.class,i);
		}
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlContentManyContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContentMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContentMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContentMany(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentBraceContext extends HtmlElementContentContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public ContentHtmlContext contentHtml() {
			return getRuleContext(ContentHtmlContext.class,0);
		}
		public HtmlBraceContext htmlBrace() {
			return getRuleContext(HtmlBraceContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlContentBraceContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContentBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContentBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContentBrace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationNgModelContext extends HtmlElementContentContext {
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public TerminalNode NgModel() { return getToken(AngularParser.NgModel, 0); }
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public DeclarationNgModelContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationNgModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationNgModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationNgModel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlButtonContext extends HtmlElementContentContext {
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public HtmlButtonContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContentContext htmlElementContent() throws RecognitionException {
		HtmlElementContentContext _localctx = new HtmlElementContentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_htmlElementContent);
		int _la;
		try {
			int _alt;
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(Less);
				setState(731);
				tagName();
				setState(732);
				elements();
				setState(733);
				tagName();
				setState(734);
				match(Greater);
				}
				break;
			case 2:
				_localctx = new HtmlContentManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				match(Less);
				setState(737);
				tagName();
				setState(738);
				contentHtml();
				setState(739);
				contentHtml();
				setState(740);
				contentHtml();
				setState(741);
				contentHtml();
				setState(742);
				match(Div);
				setState(743);
				match(Greater);
				}
				break;
			case 3:
				_localctx = new HtmlContentBraceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(Less);
				setState(746);
				tagName();
				setState(747);
				contentHtml();
				setState(748);
				htmlBrace();
				setState(749);
				match(Greater);
				}
				break;
			case 4:
				_localctx = new HtmlButtonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(751);
					match(STRING);
					}
					break;
				case Assign:
					{
					}
					break;
				case Component:
				case CommonModule:
				case RouterOutlet:
				case RouterLink:
				case OnInit:
				case Input:
				case FormsModule:
				case Angular:
				case Router:
				case AngularCore:
				case Router_:
				case Click:
					{
					setState(753);
					reservedWord();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(756);
				match(Assign);
				setState(757);
				stringLiteral();
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980916981856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral) {
					{
					setState(758);
					keyword();
					setState(759);
					match(Assign);
					setState(760);
					stringLiteral();
					}
				}

				setState(764);
				match(Greater);
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(765);
						declarationName();
						}
						} 
					}
					setState(770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case 5:
				_localctx = new DeclarationNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
				declarationName();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Number) {
					{
					setState(772);
					match(Number);
					}
				}

				}
				break;
			case 6:
				_localctx = new DeclarationNgModelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				match(LeftBracket);
				setState(776);
				match(NgModel);
				setState(777);
				match(RightBracket);
				setState(778);
				match(Assign);
				setState(779);
				stringLiteral();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(780);
					declarationName();
					setState(781);
					match(Assign);
					setState(782);
					stringLiteral();
					setState(783);
					match(Div);
					}
				}

				setState(787);
				match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentHtmlContext extends ParserRuleContext {
		public ContentHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentHtml; }
	 
		public ContentHtmlContext() { }
		public void copyFrom(ContentHtmlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute3Context extends ContentHtmlContext {
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttribute3Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute2Context extends ContentHtmlContext {
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttribute2Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute1Context extends ContentHtmlContext {
		public List<HtmlImgAttributeContext> htmlImgAttribute() {
			return getRuleContexts(HtmlImgAttributeContext.class);
		}
		public HtmlImgAttributeContext htmlImgAttribute(int i) {
			return getRuleContext(HtmlImgAttributeContext.class,i);
		}
		public HtmlImgAttribute1Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexHtmlAttrContext extends ContentHtmlContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public ComplexHtmlAttrContext(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComplexHtmlAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComplexHtmlAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComplexHtmlAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute4Context extends ContentHtmlContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttribute4Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentHtmlContext contentHtml() throws RecognitionException {
		ContentHtmlContext _localctx = new ContentHtmlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_contentHtml);
		try {
			int _alt;
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new HtmlImgAttribute1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(791);
						htmlImgAttribute();
						}
						} 
					}
					setState(796);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new HtmlImgAttribute2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(LeftBracket);
				setState(798);
				htmlKeyword();
				setState(799);
				match(RightBracket);
				setState(800);
				match(Assign);
				setState(801);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new HtmlImgAttribute3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				htmlKeyword();
				setState(804);
				match(Assign);
				setState(805);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new HtmlImgAttribute4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				keyword();
				setState(808);
				match(Assign);
				setState(809);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new ComplexHtmlAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				keyword();
				setState(812);
				match(Assign);
				setState(813);
				stringLiteral();
				setState(814);
				match(Star);
				setState(815);
				htmlKeyword();
				setState(816);
				match(Assign);
				setState(817);
				stringLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttributeContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlImgAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlImgAttributeContext htmlImgAttribute() throws RecognitionException {
		HtmlImgAttributeContext _localctx = new HtmlImgAttributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_htmlImgAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(Star);
			setState(822);
			htmlKeyword();
			setState(823);
			match(Assign);
			setState(824);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	 
		public ElementsContext() { }
		public void copyFrom(ElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReservedBlockContext extends ElementsContext {
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public ReservedBlockContext(ElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReservedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReservedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReservedBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrSetContext extends ElementsContext {
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public HtmlAttrSetContext(ElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttrSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttrSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttrSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elements);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				_localctx = new HtmlAttrSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(Greater);
				setState(827);
				htmlAttributes();
				setState(828);
				match(Less);
				setState(829);
				match(Div);
				}
				break;
			case Component:
			case CommonModule:
			case RouterOutlet:
			case RouterLink:
			case OnInit:
			case Input:
			case FormsModule:
			case Angular:
			case Router:
			case AngularCore:
			case Router_:
			case Click:
				_localctx = new ReservedBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				reservedWord();
				setState(832);
				match(Assign);
				setState(833);
				stringLiteral();
				setState(834);
				identifier();
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(835);
					match(STRING);
					}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
				identifier();
				setState(842);
				match(Div);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBraceContext extends ParserRuleContext {
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBraceContext htmlBrace() throws RecognitionException {
		HtmlBraceContext _localctx = new HtmlBraceContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			reservedWord();
			setState(847);
			match(Assign);
			setState(848);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Input || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 6029057L) != 0)) {
				{
				{
				setState(850);
				tagName();
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(851);
					match(STRING);
					}
				}

				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssElementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<CssPropertyContext> cssProperty() {
			return getRuleContexts(CssPropertyContext.class);
		}
		public CssPropertyContext cssProperty(int i) {
			return getRuleContext(CssPropertyContext.class,i);
		}
		public CssElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssElementContext cssElement() throws RecognitionException {
		CssElementContext _localctx = new CssElementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cssElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(859);
					match(Dot);
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(865);
				tagName();
				}
				break;
			}
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(868);
				match(Comma);
				}
			}

			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==H4) {
				{
				setState(871);
				match(H4);
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Textarea || _la==STRING) {
				{
				{
				setState(874);
				selector();
				}
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880);
			match(LeftBrace);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 1019903L) != 0)) {
				{
				{
				setState(881);
				cssProperty();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode IMG_() { return getToken(AngularParser.IMG_, 0); }
		public List<SelectorInternalContext> selectorInternal() {
			return getRuleContexts(SelectorInternalContext.class);
		}
		public SelectorInternalContext selectorInternal(int i) {
			return getRuleContext(SelectorInternalContext.class,i);
		}
		public TerminalNode Textarea() { return getToken(AngularParser.Textarea, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_selector);
		int _la;
		try {
			int _alt;
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(STRING);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMG_) {
					{
					setState(890);
					match(IMG_);
					}
				}

				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(893);
						selectorInternal();
						}
						} 
					}
					setState(898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(Textarea);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorInternalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public SelectorInternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorInternal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorInternal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorInternal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorInternal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorInternalContext selectorInternal() throws RecognitionException {
		SelectorInternalContext _localctx = new SelectorInternalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_selectorInternal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(902);
				match(Colon);
				}
			}

			setState(905);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			css();
			setState(908);
			match(Colon);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Auto || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 100646911L) != 0)) {
				{
				{
				setState(909);
				cssValue();
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(915);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssContext extends ParserRuleContext {
		public TerminalNode Display() { return getToken(AngularParser.Display, 0); }
		public TerminalNode Flex_Direction() { return getToken(AngularParser.Flex_Direction, 0); }
		public TerminalNode Gap() { return getToken(AngularParser.Gap, 0); }
		public TerminalNode Padding() { return getToken(AngularParser.Padding, 0); }
		public TerminalNode Box_Size() { return getToken(AngularParser.Box_Size, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Border() { return getToken(AngularParser.Border, 0); }
		public TerminalNode Text_Align() { return getToken(AngularParser.Text_Align, 0); }
		public TerminalNode Max_With() { return getToken(AngularParser.Max_With, 0); }
		public TerminalNode Height() { return getToken(AngularParser.Height, 0); }
		public TerminalNode Cursor() { return getToken(AngularParser.Cursor, 0); }
		public TerminalNode Transition() { return getToken(AngularParser.Transition, 0); }
		public TerminalNode Background_Color() { return getToken(AngularParser.Background_Color, 0); }
		public TerminalNode Margin() { return getToken(AngularParser.Margin, 0); }
		public TerminalNode FontSize() { return getToken(AngularParser.FontSize, 0); }
		public TerminalNode Color() { return getToken(AngularParser.Color, 0); }
		public TerminalNode Width() { return getToken(AngularParser.Width, 0); }
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_la = _input.LA(1);
			if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 1019903L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public DecimalLiteral_UNITContext decimalLiteral_UNIT() {
			return getRuleContext(DecimalLiteral_UNITContext.class,0);
		}
		public TerminalNode Row() { return getToken(AngularParser.Row, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Border_Box() { return getToken(AngularParser.Border_Box, 0); }
		public TerminalNode Center() { return getToken(AngularParser.Center, 0); }
		public TerminalNode Column() { return getToken(AngularParser.Column, 0); }
		public TerminalNode Auto() { return getToken(AngularParser.Auto, 0); }
		public TerminalNode Pointer() { return getToken(AngularParser.Pointer, 0); }
		public TerminalNode HEXCHAR() { return getToken(AngularParser.HEXCHAR, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cssValue);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				decimalLiteral_UNIT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(Row);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				match(Flex);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(922);
				match(Border_Box);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(923);
				match(Center);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(924);
				match(Column);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(925);
				match(Auto);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(926);
				match(Pointer);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(927);
				match(HEXCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(928);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteral_UNITContext extends ParserRuleContext {
		public DecimalLiteral_UNITContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral_UNIT; }
	 
		public DecimalLiteral_UNITContext() { }
		public void copyFrom(DecimalLiteral_UNITContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberListContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public UnitNumberListContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundColorUnitContext extends DecimalLiteral_UNITContext {
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public BackgroundColorUnitContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBackgroundColorUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBackgroundColorUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBackgroundColorUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitSolidColorContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public TerminalNode Solid() { return getToken(AngularParser.Solid, 0); }
		public TerminalNode HEXCHAR() { return getToken(AngularParser.HEXCHAR, 0); }
		public UnitSolidColorContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitSolidColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitSolidColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitSolidColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteral_UNITContext decimalLiteral_UNIT() throws RecognitionException {
		DecimalLiteral_UNITContext _localctx = new DecimalLiteral_UNITContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_decimalLiteral_UNIT);
		int _la;
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new UnitNumberListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				decimalLiteralUnit();
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DecimalLiteral) {
					{
					{
					setState(932);
					decimalLiteral();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new UnitSolidColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				decimalLiteralUnit();
				setState(939);
				match(Solid);
				setState(940);
				match(HEXCHAR);
				}
				break;
			case 3:
				_localctx = new BackgroundColorUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				css();
				setState(943);
				decimalLiteralUnit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralUnitContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral_UNIT() { return getToken(AngularParser.DecimalLiteral_UNIT, 0); }
		public DecimalLiteralUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteralUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecimalLiteralUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecimalLiteralUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecimalLiteralUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralUnitContext decimalLiteralUnit() throws RecognitionException {
		DecimalLiteralUnitContext _localctx = new DecimalLiteralUnitContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_decimalLiteralUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(DecimalLiteral_UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode H1() { return getToken(AngularParser.H1, 0); }
		public TerminalNode H2() { return getToken(AngularParser.H2, 0); }
		public TerminalNode H3() { return getToken(AngularParser.H3, 0); }
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public TerminalNode IMG_() { return getToken(AngularParser.IMG_, 0); }
		public TerminalNode P() { return getToken(AngularParser.P, 0); }
		public TerminalNode QuestionDot() { return getToken(AngularParser.QuestionDot, 0); }
		public TerminalNode RBRACE_RBRACE() { return getToken(AngularParser.RBRACE_RBRACE, 0); }
		public TerminalNode LBRACE_LBRACE() { return getToken(AngularParser.LBRACE_LBRACE, 0); }
		public TerminalNode Div_() { return getToken(AngularParser.Div_, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Button() { return getToken(AngularParser.Button, 0); }
		public TerminalNode Label() { return getToken(AngularParser.Label, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode Textarea() { return getToken(AngularParser.Textarea, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_la = _input.LA(1);
			if ( !(_la==Input || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 6029057L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlKeywordContext extends ParserRuleContext {
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public TerminalNode NGIF() { return getToken(AngularParser.NGIF, 0); }
		public TerminalNode ALT() { return getToken(AngularParser.ALT, 0); }
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public HtmlKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlKeywordContext htmlKeyword() throws RecognitionException {
		HtmlKeywordContext _localctx = new HtmlKeywordContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_htmlKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public TerminalNode True_() { return getToken(AngularParser.True_, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 107752139522049L) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Int() { return getToken(AngularParser.Int, 0); }
		public TerminalNode Float() { return getToken(AngularParser.Float, 0); }
		public TerminalNode Double() { return getToken(AngularParser.Double, 0); }
		public TerminalNode Bool() { return getToken(AngularParser.Bool, 0); }
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Array() { return getToken(AngularParser.Array, 0); }
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 1125900443713775L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedWordContext extends ParserRuleContext {
		public TerminalNode AngularCore() { return getToken(AngularParser.AngularCore, 0); }
		public TerminalNode Angular() { return getToken(AngularParser.Angular, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode RouterOutlet() { return getToken(AngularParser.RouterOutlet, 0); }
		public TerminalNode CommonModule() { return getToken(AngularParser.CommonModule, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode OnInit() { return getToken(AngularParser.OnInit, 0); }
		public TerminalNode Click() { return getToken(AngularParser.Click, 0); }
		public TerminalNode RouterLink() { return getToken(AngularParser.RouterLink, 0); }
		public TerminalNode FormsModule() { return getToken(AngularParser.FormsModule, 0); }
		public TerminalNode Router_() { return getToken(AngularParser.Router_, 0); }
		public TerminalNode Router() { return getToken(AngularParser.Router, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099788189696L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 105L) != 0) || _la==Click) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(AngularParser.Break, 0); }
		public TerminalNode Do() { return getToken(AngularParser.Do, 0); }
		public TerminalNode Case() { return getToken(AngularParser.Case, 0); }
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public TerminalNode Continue() { return getToken(AngularParser.Continue, 0); }
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode Switch() { return getToken(AngularParser.Switch, 0); }
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode Function_() { return getToken(AngularParser.Function_, 0); }
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Default() { return getToken(AngularParser.Default, 0); }
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode In() { return getToken(AngularParser.In, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public TerminalNode Extends() { return getToken(AngularParser.Extends, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2276639980916981856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 37326853L) != 0) || _la==NullLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(AngularParser.Semi, 0); }
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Semi) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00e5\u03c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000"+
		"\u0003\u0000\u00a0\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"\u00a5\b\u0001\u000b\u0001\f\u0001\u00a6\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00af\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004\u00b5\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c1\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00c8"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cc\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00d0\b\u0007\n\u0007\f\u0007\u00d3\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00dd"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00e3\b\n\n\n\f\n\u00e6\t"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00f6\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u0100\b\r\n\r\f\r\u0103\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0110"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u011f\b\u0011\n\u0011\f\u0011\u0122\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012d\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u013c\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0140\b"+
		"\u0016\n\u0016\f\u0016\u0143\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0004\u0017\u0148\b\u0017\u000b\u0017\f\u0017\u0149\u0001\u0017\u0003"+
		"\u0017\u014d\b\u0017\u0001\u0017\u0003\u0017\u0150\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u015e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0168\b\u0018\n\u0018"+
		"\f\u0018\u016b\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0173\b\u0018\n\u0018\f\u0018\u0176"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u017a\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u017e\b\u0019\n\u0019\f\u0019\u0181\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0185\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u018a\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u019a"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u01a1\b\u001d\n\u001d\f\u001d\u01a4\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u01af\b \n \f \u01b2\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u01c4\b\"\n\"\f\"\u01c7\t\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0003#\u01cd\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u01d5"+
		"\b$\n$\f$\u01d8\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u01f0\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u022f\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0241\b(\n(\f(\u0244"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0003)\u024a\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0254\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u0270\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u027d\b-\n-\f-\u0280\t-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0297\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00050\u02a8\b0\n0"+
		"\f0\u02ab\t0\u00010\u00010\u00011\u00011\u00012\u00012\u00012\u00032\u02b4"+
		"\b2\u00013\u00013\u00014\u00014\u00015\u00045\u02bb\b5\u000b5\f5\u02bc"+
		"\u00015\u00055\u02c0\b5\n5\f5\u02c3\t5\u00015\u00055\u02c6\b5\n5\f5\u02c9"+
		"\t5\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u02d1\b6\u00016\u0003"+
		"6\u02d4\b6\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u02f3\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u02fb"+
		"\b8\u00018\u00018\u00058\u02ff\b8\n8\f8\u0302\t8\u00018\u00018\u00038"+
		"\u0306\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u0312\b8\u00018\u00018\u00038\u0316\b8\u00019\u00059\u0319"+
		"\b9\n9\f9\u031c\t9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0334\b9\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0005;\u0345\b;\n;\f;\u0348\t;\u0001;\u0001;\u0001;\u0003;\u034d"+
		"\b;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0003=\u0355\b=\u0005=\u0357"+
		"\b=\n=\f=\u035a\t=\u0001>\u0005>\u035d\b>\n>\f>\u0360\t>\u0001>\u0003"+
		">\u0363\b>\u0001>\u0003>\u0366\b>\u0001>\u0003>\u0369\b>\u0001>\u0005"+
		">\u036c\b>\n>\f>\u036f\t>\u0001>\u0001>\u0005>\u0373\b>\n>\f>\u0376\t"+
		">\u0001>\u0001>\u0001?\u0001?\u0003?\u037c\b?\u0001?\u0005?\u037f\b?\n"+
		"?\f?\u0382\t?\u0001?\u0003?\u0385\b?\u0001@\u0003@\u0388\b@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0005A\u038f\bA\nA\fA\u0392\tA\u0001A\u0001A\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u03a2\bC\u0001D\u0001D\u0005D\u03a6\bD\nD\fD\u03a9\tD"+
		"\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03b2\bD\u0001"+
		"E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001"+
		"J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0000\u0000O\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u0000\t\u0002\u0000$%))\u0002\u0000\u00b0\u00bb"+
		"\u00bf\u00c3\u0005\u0000\u001c\u001c\u0099\u0099\u00a1\u00aa\u00ac\u00ad"+
		"\u00af\u00af\u0001\u0000\u001e!\u0004\u0000QQzz~\u007f\u00cf\u00cf\u0004"+
		"\u0000*-/1GG\\\\\u0007\u0000\u0012\u0016\u001c\u001c((ffiikl\u00ab\u00ab"+
		"\u000e\u0000\u0005\u0006\u000e\u000e\u0011\u0011\u001d\u001d..347<@@B"+
		"BLLOPSUYY\u009f\u009f\u0001\u0001\u0098\u0098\u03e6\u0000\u009f\u0001"+
		"\u0000\u0000\u0000\u0002\u00a4\u0001\u0000\u0000\u0000\u0004\u00ae\u0001"+
		"\u0000\u0000\u0000\u0006\u00b0\u0001\u0000\u0000\u0000\b\u00c0\u0001\u0000"+
		"\u0000\u0000\n\u00c2\u0001\u0000\u0000\u0000\f\u00c7\u0001\u0000\u0000"+
		"\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00d4\u0001\u0000\u0000"+
		"\u0000\u0012\u00d7\u0001\u0000\u0000\u0000\u0014\u00e0\u0001\u0000\u0000"+
		"\u0000\u0016\u00f5\u0001\u0000\u0000\u0000\u0018\u00f7\u0001\u0000\u0000"+
		"\u0000\u001a\u00fd\u0001\u0000\u0000\u0000\u001c\u010f\u0001\u0000\u0000"+
		"\u0000\u001e\u0111\u0001\u0000\u0000\u0000 \u0116\u0001\u0000\u0000\u0000"+
		"\"\u011b\u0001\u0000\u0000\u0000$\u0125\u0001\u0000\u0000\u0000&\u0128"+
		"\u0001\u0000\u0000\u0000(\u012e\u0001\u0000\u0000\u0000*\u0130\u0001\u0000"+
		"\u0000\u0000,\u0136\u0001\u0000\u0000\u0000.\u015d\u0001\u0000\u0000\u0000"+
		"0\u0179\u0001\u0000\u0000\u00002\u017b\u0001\u0000\u0000\u00004\u0186"+
		"\u0001\u0000\u0000\u00006\u018d\u0001\u0000\u0000\u00008\u0196\u0001\u0000"+
		"\u0000\u0000:\u019e\u0001\u0000\u0000\u0000<\u01a5\u0001\u0000\u0000\u0000"+
		">\u01a8\u0001\u0000\u0000\u0000@\u01ac\u0001\u0000\u0000\u0000B\u01b5"+
		"\u0001\u0000\u0000\u0000D\u01bc\u0001\u0000\u0000\u0000F\u01ca\u0001\u0000"+
		"\u0000\u0000H\u01ce\u0001\u0000\u0000\u0000J\u01ef\u0001\u0000\u0000\u0000"+
		"L\u022e\u0001\u0000\u0000\u0000N\u0230\u0001\u0000\u0000\u0000P\u0239"+
		"\u0001\u0000\u0000\u0000R\u0253\u0001\u0000\u0000\u0000T\u0255\u0001\u0000"+
		"\u0000\u0000V\u025e\u0001\u0000\u0000\u0000X\u0263\u0001\u0000\u0000\u0000"+
		"Z\u0274\u0001\u0000\u0000\u0000\\\u0296\u0001\u0000\u0000\u0000^\u0298"+
		"\u0001\u0000\u0000\u0000`\u02a2\u0001\u0000\u0000\u0000b\u02ae\u0001\u0000"+
		"\u0000\u0000d\u02b3\u0001\u0000\u0000\u0000f\u02b5\u0001\u0000\u0000\u0000"+
		"h\u02b7\u0001\u0000\u0000\u0000j\u02ba\u0001\u0000\u0000\u0000l\u02ca"+
		"\u0001\u0000\u0000\u0000n\u02d5\u0001\u0000\u0000\u0000p\u0315\u0001\u0000"+
		"\u0000\u0000r\u0333\u0001\u0000\u0000\u0000t\u0335\u0001\u0000\u0000\u0000"+
		"v\u034c\u0001\u0000\u0000\u0000x\u034e\u0001\u0000\u0000\u0000z\u0358"+
		"\u0001\u0000\u0000\u0000|\u035e\u0001\u0000\u0000\u0000~\u0384\u0001\u0000"+
		"\u0000\u0000\u0080\u0387\u0001\u0000\u0000\u0000\u0082\u038b\u0001\u0000"+
		"\u0000\u0000\u0084\u0395\u0001\u0000\u0000\u0000\u0086\u03a1\u0001\u0000"+
		"\u0000\u0000\u0088\u03b1\u0001\u0000\u0000\u0000\u008a\u03b3\u0001\u0000"+
		"\u0000\u0000\u008c\u03b5\u0001\u0000\u0000\u0000\u008e\u03b7\u0001\u0000"+
		"\u0000\u0000\u0090\u03b9\u0001\u0000\u0000\u0000\u0092\u03bb\u0001\u0000"+
		"\u0000\u0000\u0094\u03bd\u0001\u0000\u0000\u0000\u0096\u03bf\u0001\u0000"+
		"\u0000\u0000\u0098\u03c1\u0001\u0000\u0000\u0000\u009a\u03c3\u0001\u0000"+
		"\u0000\u0000\u009c\u03c5\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0002"+
		"\u0001\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0000"+
		"\u0000\u0001\u00a2\u0001\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u0004"+
		"\u0002\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u0003\u0001\u0000\u0000\u0000\u00a8\u00af\u0003\u0006"+
		"\u0003\u0000\u00a9\u00af\u0003\u0012\t\u0000\u00aa\u00af\u0003\u0018\f"+
		"\u0000\u00ab\u00af\u0003,\u0016\u0000\u00ac\u00af\u0003h4\u0000\u00ad"+
		"\u00af\u0003|>\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u0005\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0005\u0000\u0000\u00b1\u00b2\u0003\b\u0004\u0000\u00b2\u0007\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0003\n\u0005\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0003\f\u0006\u0000\u00b7\u00b8\u0003\u009cN\u0000"+
		"\u00b8\u00c1\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005j\u0000\u0000\u00ba"+
		"\u00c1\u0003\f\u0006\u0000\u00bb\u00bc\u0005u\u0000\u0000\u00bc\u00bd"+
		"\u0005[\u0000\u0000\u00bd\u00be\u0003\u0096K\u0000\u00be\u00bf\u0003\f"+
		"\u0006\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00b4\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c1\t\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005q\u0000"+
		"\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c5\u0005r\u0000\u0000"+
		"\u00c5\u000b\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005\u0007\u0000\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u0098L\u0000\u00ca"+
		"\u00cc\u0003\u009cN\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\r\u0001\u0000\u0000\u0000\u00cd\u00d1\u0003"+
		"\u0096K\u0000\u00ce\u00d0\u0003\u0010\b\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u000f\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0094"+
		"\u0000\u0000\u00d5\u00d6\u0003\u0096K\u0000\u00d6\u0011\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u001d\u0000\u0000\u00d8\u00dc\u0003f3\u0000\u00d9"+
		"\u00da\u0003\u009aM\u0000\u00da\u00db\u0003f3\u0000\u00db\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0003"+
		"\u0014\n\u0000\u00df\u0013\u0001\u0000\u0000\u0000\u00e0\u00e4\u0005q"+
		"\u0000\u0000\u00e1\u00e3\u0003\u0016\u000b\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005r\u0000"+
		"\u0000\u00e8\u0015\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003f3\u0000\u00ea"+
		"\u00eb\u0005\u0096\u0000\u0000\u00eb\u00ec\u0003\u0094J\u0000\u00ec\u00ed"+
		"\u0003\u009cN\u0000\u00ed\u00f6\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003"+
		"f3\u0000\u00ef\u00f0\u0005m\u0000\u0000\u00f0\u00f1\u0005n\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0096\u0000\u0000\u00f2\u00f3\u0003\u0094J\u0000\u00f3"+
		"\u00f4\u0003\u009cN\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000\u00f6\u0017"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u00ce\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0012\u0000\u0000\u00f9\u00fa\u0005m\u0000\u0000\u00fa\u00fb\u0003"+
		"\u001a\r\u0000\u00fb\u00fc\u0005n\u0000\u0000\u00fc\u0019\u0001\u0000"+
		"\u0000\u0000\u00fd\u0101\u0005q\u0000\u0000\u00fe\u0100\u0003\u001c\u000e"+
		"\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005r\u0000\u0000\u0105\u001b\u0001\u0000\u0000\u0000"+
		"\u0106\u0110\u0003\u001e\u000f\u0000\u0107\u0110\u0003 \u0010\u0000\u0108"+
		"\u0110\u0003&\u0013\u0000\u0109\u0110\u0003*\u0015\u0000\u010a\u010b\u0005"+
		"\'\u0000\u0000\u010b\u010c\u0005\u0096\u0000\u0000\u010c\u010d\u0003\u0092"+
		"I\u0000\u010d\u010e\u0005\u0094\u0000\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u0106\u0001\u0000\u0000\u0000\u010f\u0107\u0001\u0000\u0000"+
		"\u0000\u010f\u0108\u0001\u0000\u0000\u0000\u010f\u0109\u0001\u0000\u0000"+
		"\u0000\u010f\u010a\u0001\u0000\u0000\u0000\u0110\u001d\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\"\u0000\u0000\u0112\u0113\u0005\u0096\u0000\u0000"+
		"\u0113\u0114\u0003\u0098L\u0000\u0114\u0115\u0005\u0094\u0000\u0000\u0115"+
		"\u001f\u0001\u0000\u0000\u0000\u0116\u0117\u0005#\u0000\u0000\u0117\u0118"+
		"\u0005\u0096\u0000\u0000\u0118\u0119\u0003\"\u0011\u0000\u0119\u011a\u0005"+
		"\u0094\u0000\u0000\u011a!\u0001\u0000\u0000\u0000\u011b\u011c\u0005o\u0000"+
		"\u0000\u011c\u0120\u0003\u0096K\u0000\u011d\u011f\u0003$\u0012\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005p\u0000\u0000\u0124#\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"\u0094\u0000\u0000\u0126\u0127\u0003\u0096K\u0000\u0127%\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0003(\u0014\u0000\u0129\u012a\u0005\u0096\u0000\u0000"+
		"\u012a\u012c\u0003\u0098L\u0000\u012b\u012d\u0005\u0094\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\'\u0001\u0000\u0000\u0000\u012e\u012f\u0007\u0000\u0000\u0000\u012f)"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0005&\u0000\u0000\u0131\u0132\u0005"+
		"\u0096\u0000\u0000\u0132\u0133\u0005o\u0000\u0000\u0133\u0134\u0003\u0098"+
		"L\u0000\u0134\u0135\u0005p\u0000\u0000\u0135+\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005\u0006\u0000\u0000\u0137\u0138\u0003\u009aM\u0000\u0138"+
		"\u013b\u0003f3\u0000\u0139\u013a\u0005\u0010\u0000\u0000\u013a\u013c\u0005"+
		"\u0016\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0141\u0005"+
		"q\u0000\u0000\u013e\u0140\u0003.\u0017\u0000\u013f\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000"+
		"\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0005r\u0000\u0000"+
		"\u0145-\u0001\u0000\u0000\u0000\u0146\u0148\u00030\u0018\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c"+
		"\u0001\u0000\u0000\u0000\u014b\u014d\u00036\u001b\u0000\u014c\u014b\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u0150\u00038\u001c\u0000\u014f\u014e\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u015e\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0003f3\u0000\u0152\u0153\u0005\u0096\u0000\u0000"+
		"\u0153\u0154\u0003\u0094J\u0000\u0154\u0155\u0005}\u0000\u0000\u0155\u0156"+
		"\u0003\u0098L\u0000\u0156\u0157\u0003\u009cN\u0000\u0157\u015e\u0001\u0000"+
		"\u0000\u0000\u0158\u015e\u00038\u001c\u0000\u0159\u015e\u0003D\"\u0000"+
		"\u015a\u015e\u0003Z-\u0000\u015b\u015e\u0003^/\u0000\u015c\u015e\u0003"+
		"`0\u0000\u015d\u0147\u0001\u0000\u0000\u0000\u015d\u0151\u0001\u0000\u0000"+
		"\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000"+
		"\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e/\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0003f3\u0000\u0160\u0161\u0005\u0096\u0000\u0000\u0161\u0162"+
		"\u0005\u00c8\u0000\u0000\u0162\u0163\u0005o\u0000\u0000\u0163\u0164\u0005"+
		"p\u0000\u0000\u0164\u0165\u0005}\u0000\u0000\u0165\u0169\u0005o\u0000"+
		"\u0000\u0166\u0168\u00032\u0019\u0000\u0167\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000"+
		"\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0005p\u0000\u0000\u016d"+
		"\u016e\u0003\u009cN\u0000\u016e\u017a\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0003f3\u0000\u0170\u0174\u0005}\u0000\u0000\u0171\u0173\u00032\u0019"+
		"\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003\u009cN\u0000\u0178\u017a\u0001\u0000\u0000\u0000"+
		"\u0179\u015f\u0001\u0000\u0000\u0000\u0179\u016f\u0001\u0000\u0000\u0000"+
		"\u017a1\u0001\u0000\u0000\u0000\u017b\u017f\u0005q\u0000\u0000\u017c\u017e"+
		"\u00034\u001a\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0182\u0184\u0005r\u0000\u0000\u0183\u0185\u0005\u0094"+
		"\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u01853\u0001\u0000\u0000\u0000\u0186\u0187\u0003f3\u0000"+
		"\u0187\u0189\u0005\u0096\u0000\u0000\u0188\u018a\u0003\u0098L\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0094\u0000\u0000\u018c"+
		"5\u0001\u0000\u0000\u0000\u018d\u018e\u0003f3\u0000\u018e\u018f\u0005"+
		"\u0096\u0000\u0000\u018f\u0190\u0003f3\u0000\u0190\u0191\u0003\u0092I"+
		"\u0000\u0191\u0192\u0003\u009aM\u0000\u0192\u0193\u0005}\u0000\u0000\u0193"+
		"\u0194\u0003\u009aM\u0000\u0194\u0195\u0003\u009cN\u0000\u01957\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0003f3\u0000\u0197\u0199\u0005m\u0000"+
		"\u0000\u0198\u019a\u0003:\u001d\u0000\u0199\u0198\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005n\u0000\u0000\u019c\u019d\u0003@ \u0000\u019d9\u0001"+
		"\u0000\u0000\u0000\u019e\u01a2\u0003>\u001f\u0000\u019f\u01a1\u0003<\u001e"+
		"\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3;\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0005\u0094\u0000\u0000\u01a6\u01a7\u0003>\u001f\u0000\u01a7"+
		"=\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003f3\u0000\u01a9\u01aa\u0005"+
		"\u0096\u0000\u0000\u01aa\u01ab\u0003d2\u0000\u01ab?\u0001\u0000\u0000"+
		"\u0000\u01ac\u01b0\u0005q\u0000\u0000\u01ad\u01af\u0003B!\u0000\u01ae"+
		"\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005r\u0000\u0000\u01b4A\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003"+
		"\u009aM\u0000\u01b6\u01b7\u0005\u0099\u0000\u0000\u01b7\u01b8\u0003f3"+
		"\u0000\u01b8\u01b9\u0005}\u0000\u0000\u01b9\u01ba\u0003d2\u0000\u01ba"+
		"\u01bb\u0003\u009cN\u0000\u01bbC\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"\u0017\u0000\u0000\u01bd\u01be\u0005m\u0000\u0000\u01be\u01bf\u0005n\u0000"+
		"\u0000\u01bf\u01c0\u0005\u0096\u0000\u0000\u01c0\u01c1\u0003\u009aM\u0000"+
		"\u01c1\u01c5\u0005q\u0000\u0000\u01c2\u01c4\u0003F#\u0000\u01c3\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0005r\u0000\u0000\u01c9E\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003H"+
		"$\u0000\u01cb\u01cd\u0003V+\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cdG\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005B\u0000\u0000\u01cf\u01d0\u0005m\u0000\u0000\u01d0\u01d1\u0003"+
		"J%\u0000\u01d1\u01d2\u0005n\u0000\u0000\u01d2\u01d6\u0005q\u0000\u0000"+
		"\u01d3\u01d5\u0003L&\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0005r\u0000\u0000\u01daI\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0005\u0018\u0000\u0000\u01dc\u01dd\u0005\u0019"+
		"\u0000\u0000\u01dd\u01de\u0005\u008d\u0000\u0000\u01de\u01df\u0003\u0098"+
		"L\u0000\u01df\u01e0\u0005\u0090\u0000\u0000\u01e0\u01e1\u0005\u0018\u0000"+
		"\u0000\u01e1\u01e2\u0005\u001a\u0000\u0000\u01e2\u01e3\u0005\u008d\u0000"+
		"\u0000\u01e3\u01e4\u0003\u0098L\u0000\u01e4\u01f0\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0003\u009aM\u0000\u01e6\u01e7\u0005\u0099\u0000\u0000\u01e7"+
		"\u01e8\u0003f3\u0000\u01e8\u01e9\u0005\u00a4\u0000\u0000\u01e9\u01ea\u0003"+
		"f3\u0000\u01ea\u01eb\u0005\u008b\u0000\u0000\u01eb\u01ec\u0003f3\u0000"+
		"\u01ec\u01ed\u0005\u0099\u0000\u0000\u01ed\u01ee\u0003f3\u0000\u01ee\u01f0"+
		"\u0001\u0000\u0000\u0000\u01ef\u01db\u0001\u0000\u0000\u0000\u01ef\u01e5"+
		"\u0001\u0000\u0000\u0000\u01f0K\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003"+
		"\u009aM\u0000\u01f2\u01f3\u0005\u00c8\u0000\u0000\u01f3\u01f4\u0005}\u0000"+
		"\u0000\u01f4\u01f5\u0005\u001b\u0000\u0000\u01f5\u01f6\u0005m\u0000\u0000"+
		"\u01f6\u01f7\u0003N\'\u0000\u01f7\u01f8\u0005n\u0000\u0000\u01f8\u01f9"+
		"\u0003\u009cN\u0000\u01f9\u022f\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003"+
		"\u009aM\u0000\u01fb\u01fc\u0005\u00c8\u0000\u0000\u01fc\u01fd\u0005}\u0000"+
		"\u0000\u01fd\u01fe\u0003f3\u0000\u01fe\u01ff\u0005\u0099\u0000\u0000\u01ff"+
		"\u0200\u0003f3\u0000\u0200\u0201\u0005m\u0000\u0000\u0201\u0202\u0003"+
		"P(\u0000\u0202\u0203\u0005n\u0000\u0000\u0203\u0204\u0003\u009cN\u0000"+
		"\u0204\u022f\u0001\u0000\u0000\u0000\u0205\u022f\u0003X,\u0000\u0206\u0207"+
		"\u0005\u001a\u0000\u0000\u0207\u0208\u0005\u0099\u0000\u0000\u0208\u0209"+
		"\u0003f3\u0000\u0209\u020a\u0005m\u0000\u0000\u020a\u020b\u0003T*\u0000"+
		"\u020b\u020c\u0005n\u0000\u0000\u020c\u020d\u0003\u009cN\u0000\u020d\u022f"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0003\u009aM\u0000\u020f\u0210\u0005"+
		"\u0099\u0000\u0000\u0210\u0211\u0003f3\u0000\u0211\u0212\u0005}\u0000"+
		"\u0000\u0212\u0213\u0005\u009f\u0000\u0000\u0213\u0214\u0003\u009cN\u0000"+
		"\u0214\u022f\u0001\u0000\u0000\u0000\u0215\u0216\u0003f3\u0000\u0216\u0217"+
		"\u0005\u0099\u0000\u0000\u0217\u0218\u0003f3\u0000\u0218\u0219\u0005m"+
		"\u0000\u0000\u0219\u021a\u0005q\u0000\u0000\u021a\u021b\u0005\u009a\u0000"+
		"\u0000\u021b\u021c\u0003\u009aM\u0000\u021c\u021d\u0005\u0099\u0000\u0000"+
		"\u021d\u021e\u0003f3\u0000\u021e\u021f\u0005r\u0000\u0000\u021f\u0220"+
		"\u0005n\u0000\u0000\u0220\u0221\u0003\u009cN\u0000\u0221\u022f\u0001\u0000"+
		"\u0000\u0000\u0222\u0223\u0003\u009aM\u0000\u0223\u0224\u0005\u0099\u0000"+
		"\u0000\u0224\u0225\u0003\u0096K\u0000\u0225\u0226\u0005\u0099\u0000\u0000"+
		"\u0226\u0227\u0003f3\u0000\u0227\u0228\u0005m\u0000\u0000\u0228\u0229"+
		"\u0005o\u0000\u0000\u0229\u022a\u0003\u0098L\u0000\u022a\u022b\u0005p"+
		"\u0000\u0000\u022b\u022c\u0005n\u0000\u0000\u022c\u022d\u0003\u009cN\u0000"+
		"\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u01f1\u0001\u0000\u0000\u0000"+
		"\u022e\u01fa\u0001\u0000\u0000\u0000\u022e\u0205\u0001\u0000\u0000\u0000"+
		"\u022e\u0206\u0001\u0000\u0000\u0000\u022e\u020e\u0001\u0000\u0000\u0000"+
		"\u022e\u0215\u0001\u0000\u0000\u0000\u022e\u0222\u0001\u0000\u0000\u0000"+
		"\u022fM\u0001\u0000\u0000\u0000\u0230\u0231\u0005\u001a\u0000\u0000\u0231"+
		"\u0232\u0005\u0099\u0000\u0000\u0232\u0233\u0003f3\u0000\u0233\u0234\u0005"+
		"m\u0000\u0000\u0234\u0235\u0003\u0098L\u0000\u0235\u0236\u0005n\u0000"+
		"\u0000\u0236\u0237\u0005\u0091\u0000\u0000\u0237\u0238\u0003\u0098L\u0000"+
		"\u0238O\u0001\u0000\u0000\u0000\u0239\u023a\u0005m\u0000\u0000\u023a\u023b"+
		"\u0005\u00c8\u0000\u0000\u023b\u023c\u0005\u0096\u0000\u0000\u023c\u023d"+
		"\u0005X\u0000\u0000\u023d\u023e\u0005n\u0000\u0000\u023e\u0242\u0005\u009e"+
		"\u0000\u0000\u023f\u0241\u0003R)\u0000\u0240\u023f\u0001\u0000\u0000\u0000"+
		"\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243Q\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0245\u0246\u0003f3\u0000\u0246\u0247\u0005"+
		"\u00a4\u0000\u0000\u0247\u0249\u0003f3\u0000\u0248\u024a\u0005\u0090\u0000"+
		"\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000"+
		"\u0000\u024a\u0254\u0001\u0000\u0000\u0000\u024b\u024c\u0003f3\u0000\u024c"+
		"\u024d\u0005\u0099\u0000\u0000\u024d\u024e\u0003f3\u0000\u024e\u024f\u0005"+
		"\u008d\u0000\u0000\u024f\u0250\u0003f3\u0000\u0250\u0251\u0005\u0099\u0000"+
		"\u0000\u0251\u0252\u0003f3\u0000\u0252\u0254\u0001\u0000\u0000\u0000\u0253"+
		"\u0245\u0001\u0000\u0000\u0000\u0253\u024b\u0001\u0000\u0000\u0000\u0254"+
		"S\u0001\u0000\u0000\u0000\u0255\u0256\u0003\u0098L\u0000\u0256\u0257\u0005"+
		"\u0094\u0000\u0000\u0257\u0258\u0003f3\u0000\u0258\u0259\u0005\u0099\u0000"+
		"\u0000\u0259\u025a\u0003f3\u0000\u025a\u025b\u0005m\u0000\u0000\u025b"+
		"\u025c\u0003f3\u0000\u025c\u025d\u0005n\u0000\u0000\u025dU\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0003\u009aM\u0000\u025f\u0260\u0005q\u0000\u0000"+
		"\u0260\u0261\u0003X,\u0000\u0261\u0262\u0005r\u0000\u0000\u0262W\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0003\u009aM\u0000\u0264\u0265\u0005\u0099"+
		"\u0000\u0000\u0265\u0266\u0003f3\u0000\u0266\u0267\u0005}\u0000\u0000"+
		"\u0267\u0268\u0005o\u0000\u0000\u0268\u0269\u0005\u009a\u0000\u0000\u0269"+
		"\u026a\u0003\u009aM\u0000\u026a\u026b\u0005\u0099\u0000\u0000\u026b\u026f"+
		"\u0003f3\u0000\u026c\u026d\u0005\u0094\u0000\u0000\u026d\u026e\u0005\u009a"+
		"\u0000\u0000\u026e\u0270\u0003f3\u0000\u026f\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0005p\u0000\u0000\u0272\u0273\u0003\u009cN\u0000\u0273Y"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u0003f3\u0000\u0275\u0276\u0005m"+
		"\u0000\u0000\u0276\u0277\u0005\u00c8\u0000\u0000\u0277\u0278\u0005\u0096"+
		"\u0000\u0000\u0278\u0279\u0005\\\u0000\u0000\u0279\u027a\u0005n\u0000"+
		"\u0000\u027a\u027e\u0005q\u0000\u0000\u027b\u027d\u0003\\.\u0000\u027c"+
		"\u027b\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e"+
		"\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u0281\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0005r\u0000\u0000\u0282[\u0001\u0000\u0000\u0000\u0283\u0284\u0003"+
		"\u009aM\u0000\u0284\u0285\u0003f3\u0000\u0285\u0286\u0005}\u0000\u0000"+
		"\u0286\u0287\u0003\u009aM\u0000\u0287\u0288\u0005\u0099\u0000\u0000\u0288"+
		"\u0289\u0003f3\u0000\u0289\u028a\u0005\u0099\u0000\u0000\u028a\u028b\u0003"+
		"f3\u0000\u028b\u028c\u0005m\u0000\u0000\u028c\u028d\u0003f3\u0000\u028d"+
		"\u028e\u0005\u0094\u0000\u0000\u028e\u028f\u0005\u00c8\u0000\u0000\u028f"+
		"\u0290\u0005n\u0000\u0000\u0290\u0291\u0005o\u0000\u0000\u0291\u0292\u0005"+
		"\u00c8\u0000\u0000\u0292\u0293\u0005p\u0000\u0000\u0293\u0294\u0003\u009c"+
		"N\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0297\u0003H$\u0000"+
		"\u0296\u0283\u0001\u0000\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000"+
		"\u0297]\u0001\u0000\u0000\u0000\u0298\u0299\u0005a\u0000\u0000\u0299\u029a"+
		"\u0005m\u0000\u0000\u029a\u029b\u0003\u0094J\u0000\u029b\u029c\u0003\u0096"+
		"K\u0000\u029c\u029d\u0005\u0096\u0000\u0000\u029d\u029e\u0003\u0096K\u0000"+
		"\u029e\u029f\u0005n\u0000\u0000\u029f\u02a0\u0005q\u0000\u0000\u02a0\u02a1"+
		"\u0005r\u0000\u0000\u02a1_\u0001\u0000\u0000\u0000\u02a2\u02a3\u0003f"+
		"3\u0000\u02a3\u02a4\u0005m\u0000\u0000\u02a4\u02a5\u0005n\u0000\u0000"+
		"\u02a5\u02a9\u0005q\u0000\u0000\u02a6\u02a8\u0003b1\u0000\u02a7\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0005r\u0000\u0000\u02ada\u0001\u0000\u0000\u0000\u02ae\u02af\u0003L"+
		"&\u0000\u02afc\u0001\u0000\u0000\u0000\u02b0\u02b4\u0003\u0094J\u0000"+
		"\u02b1\u02b4\u0003f3\u0000\u02b2\u02b4\u0003\u0098L\u0000\u02b3\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b4e\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005"+
		"\u00c8\u0000\u0000\u02b6g\u0001\u0000\u0000\u0000\u02b7\u02b8\u0003j5"+
		"\u0000\u02b8i\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003l6\u0000\u02ba"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"\u02c1\u0001\u0000\u0000\u0000\u02be\u02c0\u0003p8\u0000\u02bf\u02be\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c6\u0003"+
		"n7\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8k\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cb\u0005~\u0000\u0000\u02cb\u02d0\u0003\u008eG\u0000\u02cc\u02cd"+
		"\u0003\u009aM\u0000\u02cd\u02ce\u0005}\u0000\u0000\u02ce\u02cf\u0003\u0098"+
		"L\u0000\u02cf\u02d1\u0001\u0000\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d4\u0005\u007f\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4m\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d6\u0005~\u0000\u0000\u02d6\u02d7\u0005v\u0000\u0000\u02d7\u02d8"+
		"\u0003\u008eG\u0000\u02d8\u02d9\u0005\u007f\u0000\u0000\u02d9o\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0005~\u0000\u0000\u02db\u02dc\u0003\u008eG\u0000"+
		"\u02dc\u02dd\u0003v;\u0000\u02dd\u02de\u0003\u008eG\u0000\u02de\u02df"+
		"\u0005\u007f\u0000\u0000\u02df\u0316\u0001\u0000\u0000\u0000\u02e0\u02e1"+
		"\u0005~\u0000\u0000\u02e1\u02e2\u0003\u008eG\u0000\u02e2\u02e3\u0003r"+
		"9\u0000\u02e3\u02e4\u0003r9\u0000\u02e4\u02e5\u0003r9\u0000\u02e5\u02e6"+
		"\u0003r9\u0000\u02e6\u02e7\u0005v\u0000\u0000\u02e7\u02e8\u0005\u007f"+
		"\u0000\u0000\u02e8\u0316\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005~\u0000"+
		"\u0000\u02ea\u02eb\u0003\u008eG\u0000\u02eb\u02ec\u0003r9\u0000\u02ec"+
		"\u02ed\u0003x<\u0000\u02ed\u02ee\u0005\u007f\u0000\u0000\u02ee\u0316\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f3\u0005\u00c8\u0000\u0000\u02f0\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f3\u0003\u0096K\u0000\u02f2\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005}\u0000"+
		"\u0000\u02f5\u02fa\u0003\u0098L\u0000\u02f6\u02f7\u0003\u009aM\u0000\u02f7"+
		"\u02f8\u0005}\u0000\u0000\u02f8\u02f9\u0003\u0098L\u0000\u02f9\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f6\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u0300\u0005"+
		"\u007f\u0000\u0000\u02fd\u02ff\u0003f3\u0000\u02fe\u02fd\u0001\u0000\u0000"+
		"\u0000\u02ff\u0302\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0316\u0001\u0000\u0000"+
		"\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0305\u0003f3\u0000\u0304"+
		"\u0306\u0005\\\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0001\u0000\u0000\u0000\u0306\u0316\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0005o\u0000\u0000\u0308\u0309\u0005\u00ae\u0000\u0000\u0309\u030a\u0005"+
		"p\u0000\u0000\u030a\u030b\u0005}\u0000\u0000\u030b\u0311\u0003\u0098L"+
		"\u0000\u030c\u030d\u0003f3\u0000\u030d\u030e\u0005}\u0000\u0000\u030e"+
		"\u030f\u0003\u0098L\u0000\u030f\u0310\u0005v\u0000\u0000\u0310\u0312\u0001"+
		"\u0000\u0000\u0000\u0311\u030c\u0001\u0000\u0000\u0000\u0311\u0312\u0001"+
		"\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u0005"+
		"\u007f\u0000\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315\u02da\u0001"+
		"\u0000\u0000\u0000\u0315\u02e0\u0001\u0000\u0000\u0000\u0315\u02e9\u0001"+
		"\u0000\u0000\u0000\u0315\u02f2\u0001\u0000\u0000\u0000\u0315\u0303\u0001"+
		"\u0000\u0000\u0000\u0315\u0307\u0001\u0000\u0000\u0000\u0316q\u0001\u0000"+
		"\u0000\u0000\u0317\u0319\u0003t:\u0000\u0318\u0317\u0001\u0000\u0000\u0000"+
		"\u0319\u031c\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000"+
		"\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u0334\u0001\u0000\u0000\u0000"+
		"\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u031e\u0005o\u0000\u0000\u031e"+
		"\u031f\u0003\u0090H\u0000\u031f\u0320\u0005p\u0000\u0000\u0320\u0321\u0005"+
		"}\u0000\u0000\u0321\u0322\u0003\u0098L\u0000\u0322\u0334\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u0003\u0090H\u0000\u0324\u0325\u0005}\u0000\u0000\u0325"+
		"\u0326\u0003\u0098L\u0000\u0326\u0334\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u0003\u009aM\u0000\u0328\u0329\u0005}\u0000\u0000\u0329\u032a\u0003\u0098"+
		"L\u0000\u032a\u0334\u0001\u0000\u0000\u0000\u032b\u032c\u0003\u009aM\u0000"+
		"\u032c\u032d\u0005}\u0000\u0000\u032d\u032e\u0003\u0098L\u0000\u032e\u032f"+
		"\u0005u\u0000\u0000\u032f\u0330\u0003\u0090H\u0000\u0330\u0331\u0005}"+
		"\u0000\u0000\u0331\u0332\u0003\u0098L\u0000\u0332\u0334\u0001\u0000\u0000"+
		"\u0000\u0333\u031a\u0001\u0000\u0000\u0000\u0333\u031d\u0001\u0000\u0000"+
		"\u0000\u0333\u0323\u0001\u0000\u0000\u0000\u0333\u0327\u0001\u0000\u0000"+
		"\u0000\u0333\u032b\u0001\u0000\u0000\u0000\u0334s\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0005u\u0000\u0000\u0336\u0337\u0003\u0090H\u0000\u0337\u0338"+
		"\u0005}\u0000\u0000\u0338\u0339\u0003\u0098L\u0000\u0339u\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0005\u007f\u0000\u0000\u033b\u033c\u0003z=\u0000"+
		"\u033c\u033d\u0005~\u0000\u0000\u033d\u033e\u0005v\u0000\u0000\u033e\u034d"+
		"\u0001\u0000\u0000\u0000\u033f\u0340\u0003\u0096K\u0000\u0340\u0341\u0005"+
		"}\u0000\u0000\u0341\u0342\u0003\u0098L\u0000\u0342\u0346\u0003\u0092I"+
		"\u0000\u0343\u0345\u0005\u00c8\u0000\u0000\u0344\u0343\u0001\u0000\u0000"+
		"\u0000\u0345\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000"+
		"\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0001\u0000\u0000"+
		"\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034a\u0003\u0092I\u0000"+
		"\u034a\u034b\u0005v\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000\u034c"+
		"\u033a\u0001\u0000\u0000\u0000\u034c\u033f\u0001\u0000\u0000\u0000\u034d"+
		"w\u0001\u0000\u0000\u0000\u034e\u034f\u0003\u0096K\u0000\u034f\u0350\u0005"+
		"}\u0000\u0000\u0350\u0351\u0003\u0098L\u0000\u0351y\u0001\u0000\u0000"+
		"\u0000\u0352\u0354\u0003\u008eG\u0000\u0353\u0355\u0005\u00c8\u0000\u0000"+
		"\u0354\u0353\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000"+
		"\u0355\u0357\u0001\u0000\u0000\u0000\u0356\u0352\u0001\u0000\u0000\u0000"+
		"\u0357\u035a\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000"+
		"\u0358\u0359\u0001\u0000\u0000\u0000\u0359{\u0001\u0000\u0000\u0000\u035a"+
		"\u0358\u0001\u0000\u0000\u0000\u035b\u035d\u0005\u0099\u0000\u0000\u035c"+
		"\u035b\u0001\u0000\u0000\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e"+
		"\u035c\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f"+
		"\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361"+
		"\u0363\u0003\u008eG\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0001\u0000\u0000\u0000\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u0366"+
		"\u0005\u0094\u0000\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366"+
		"\u0001\u0000\u0000\u0000\u0366\u0368\u0001\u0000\u0000\u0000\u0367\u0369"+
		"\u0005\u00a8\u0000\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369"+
		"\u0001\u0000\u0000\u0000\u0369\u036d\u0001\u0000\u0000\u0000\u036a\u036c"+
		"\u0003~?\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u036f\u0001\u0000"+
		"\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000"+
		"\u0000\u0000\u036e\u0370\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000"+
		"\u0000\u0000\u0370\u0374\u0005q\u0000\u0000\u0371\u0373\u0003\u0082A\u0000"+
		"\u0372\u0371\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000"+
		"\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000"+
		"\u0375\u0377\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000"+
		"\u0377\u0378\u0005r\u0000\u0000\u0378}\u0001\u0000\u0000\u0000\u0379\u037b"+
		"\u0005\u00c8\u0000\u0000\u037a\u037c\u0005\u00a9\u0000\u0000\u037b\u037a"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u0380"+
		"\u0001\u0000\u0000\u0000\u037d\u037f\u0003\u0080@\u0000\u037e\u037d\u0001"+
		"\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0385\u0001"+
		"\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0385\u0005"+
		"\u00af\u0000\u0000\u0384\u0379\u0001\u0000\u0000\u0000\u0384\u0383\u0001"+
		"\u0000\u0000\u0000\u0385\u007f\u0001\u0000\u0000\u0000\u0386\u0388\u0005"+
		"\u0096\u0000\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0387\u0388\u0001"+
		"\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038a\u0005"+
		"\u00c8\u0000\u0000\u038a\u0081\u0001\u0000\u0000\u0000\u038b\u038c\u0003"+
		"\u0084B\u0000\u038c\u0390\u0005\u0096\u0000\u0000\u038d\u038f\u0003\u0086"+
		"C\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038f\u0392\u0001\u0000\u0000"+
		"\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000"+
		"\u0000\u0391\u0393\u0001\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000"+
		"\u0000\u0393\u0394\u0003\u009cN\u0000\u0394\u0083\u0001\u0000\u0000\u0000"+
		"\u0395\u0396\u0007\u0001\u0000\u0000\u0396\u0085\u0001\u0000\u0000\u0000"+
		"\u0397\u03a2\u0003\u0088D\u0000\u0398\u03a2\u0005\u00c4\u0000\u0000\u0399"+
		"\u03a2\u0005\u00b5\u0000\u0000\u039a\u03a2\u0005\u00c6\u0000\u0000\u039b"+
		"\u03a2\u0005\u00bd\u0000\u0000\u039c\u03a2\u0005\u00c5\u0000\u0000\u039d"+
		"\u03a2\u00052\u0000\u0000\u039e\u03a2\u0005\u00bc\u0000\u0000\u039f\u03a2"+
		"\u0005\u00ca\u0000\u0000\u03a0\u03a2\u0005\u00c8\u0000\u0000\u03a1\u0397"+
		"\u0001\u0000\u0000\u0000\u03a1\u0398\u0001\u0000\u0000\u0000\u03a1\u0399"+
		"\u0001\u0000\u0000\u0000\u03a1\u039a\u0001\u0000\u0000\u0000\u03a1\u039b"+
		"\u0001\u0000\u0000\u0000\u03a1\u039c\u0001\u0000\u0000\u0000\u03a1\u039d"+
		"\u0001\u0000\u0000\u0000\u03a1\u039e\u0001\u0000\u0000\u0000\u03a1\u039f"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a2\u0087"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a7\u0003\u008aE\u0000\u03a4\u03a6\u0003"+
		"\u008cF\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a9\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000"+
		"\u0000\u0000\u03a8\u03b2\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ab\u0003\u008aE\u0000\u03ab\u03ac\u0005\u00be\u0000"+
		"\u0000\u03ac\u03ad\u0005\u00ca\u0000\u0000\u03ad\u03b2\u0001\u0000\u0000"+
		"\u0000\u03ae\u03af\u0003\u0084B\u0000\u03af\u03b0\u0003\u008aE\u0000\u03b0"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b1\u03a3\u0001\u0000\u0000\u0000\u03b1"+
		"\u03aa\u0001\u0000\u0000\u0000\u03b1\u03ae\u0001\u0000\u0000\u0000\u03b2"+
		"\u0089\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005\u00c7\u0000\u0000\u03b4"+
		"\u008b\u0001\u0000\u0000\u0000\u03b5\u03b6\u0005\u00cc\u0000\u0000\u03b6"+
		"\u008d\u0001\u0000\u0000\u0000\u03b7\u03b8\u0007\u0002\u0000\u0000\u03b8"+
		"\u008f\u0001\u0000\u0000\u0000\u03b9\u03ba\u0007\u0003\u0000\u0000\u03ba"+
		"\u0091\u0001\u0000\u0000\u0000\u03bb\u03bc\u0007\u0004\u0000\u0000\u03bc"+
		"\u0093\u0001\u0000\u0000\u0000\u03bd\u03be\u0007\u0005\u0000\u0000\u03be"+
		"\u0095\u0001\u0000\u0000\u0000\u03bf\u03c0\u0007\u0006\u0000\u0000\u03c0"+
		"\u0097\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005\u00d1\u0000\u0000\u03c2"+
		"\u0099\u0001\u0000\u0000\u0000\u03c3\u03c4\u0007\u0007\u0000\u0000\u03c4"+
		"\u009b\u0001\u0000\u0000\u0000\u03c5\u03c6\u0007\b\u0000\u0000\u03c6\u009d"+
		"\u0001\u0000\u0000\u0000J\u009f\u00a6\u00ae\u00b4\u00c0\u00c7\u00cb\u00d1"+
		"\u00dc\u00e4\u00f5\u0101\u010f\u0120\u012c\u013b\u0141\u0149\u014c\u014f"+
		"\u015d\u0169\u0174\u0179\u017f\u0184\u0189\u0199\u01a2\u01b0\u01c5\u01cc"+
		"\u01d6\u01ef\u022e\u0242\u0249\u0253\u026f\u027e\u0296\u02a9\u02b3\u02bc"+
		"\u02c1\u02c7\u02d0\u02d3\u02f2\u02fa\u0300\u0305\u0311\u0315\u031a\u0333"+
		"\u0346\u034c\u0354\u0358\u035e\u0362\u0365\u0368\u036d\u0374\u037b\u0380"+
		"\u0384\u0387\u0390\u03a1\u03a7\u03b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}