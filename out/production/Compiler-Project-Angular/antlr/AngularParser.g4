parser grammar AngularParser;

options {
    tokenVocab = AngularLexer;
}

// ===== PROGRAM ROOT =====
program
    : sourceElements? EOF
      ;

sourceElements
    : statement+
    ;

// ===== STATEMENT TYPES =====
statement
    : importStatement                              #ImportStatementLabel
    | interfaceStatement                           #InterfaceStatementLabel
    | componentStatement                           #ComponentStatementLabel
    | exportStatement                              #ExportStatementLabel
    | htmlElements                                 #HtmlStatementLabel
    | cssElement                                   #CssStatementLabel
    ;

// ===== IMPORTS =====
importStatement
    : Import importFromBlock
    ;

importFromBlock
    : importDefault? importFrom eos                           #DefaultImport
    | SomeClass importFrom                                    #ClassImport
    | Star As reservedWord importFrom                         #NamespaceImport
    ;

importDefault
    : LeftBrace importNamespace RightBrace
    ;

importFrom
    : From? stringLiteral eos?
    ;

importNamespace
        : reservedWord commaReservedWord*
           ;
commaReservedWord:
                   Comma reservedWord
                    ;
// ===== INTERFACES =====
interfaceStatement
    : Interface declarationName (keyword declarationName)? interfaceAttributes
    ;

interfaceAttributes
    : LeftBrace propertyDeclaration* RightBrace
    ;

propertyDeclaration
    : declarationName Colon type eos                                     #AttributesProperty
    | declarationName LeftParen RightParen Colon type eos                #MethodProperty
    ;

// ===== COMPONENTS =====
componentStatement
    : At Component LeftParen componentOptions RightParen
    ;

componentOptions
    : LeftBrace componentOption* RightBrace
    ;

componentOption
    : optionselector                                             #OptionSelectorLabel
    | optionimports                                              #OptionImportsLabel
    | optiontemplateUrl                                          #OptionTemplateLabel
    | optionstyleUrls                                            #OptionStylesLabel
    | Standalone Colon identifier Comma                          #OptionStandaloneLabel
    ;

optionselector
    : Selector Colon stringLiteral Comma
        ;

optionimports
    : Imports Colon importsProperties  Comma
            ;
importsProperties:
      LeftBracket reservedWord reservedWordAndComma* RightBracket
             ;
reservedWordAndComma:
                  Comma reservedWord
                  ;
optiontemplateUrl:
          urlStatement Colon stringLiteral Comma?
            ;
urlStatement:
            TemplateUrl
            |StyleUrl
            |Template//////////added//////
            ;
optionstyleUrls
    : StyleUrls Colon LeftBracket stringLiteral RightBracket
    ;

// ===== EXPORTS =====
exportStatement
    : Export keyword declarationName (Implements OnInit)? LeftBrace classBody* RightBrace
    ;
//Acces to propertyDeclarationCom
classBody
    : propertyList+ propertyDeclarationCom? methodDeclaration?                          #FullClassBody
    | declarationName Colon type Assign stringLiteral eos                               #PropertyString
    | methodDeclaration                                                                 #MethodOnly
    | functionNgOnInit                                                                  #FunctionNgOnInitTable//////////added//////
    | functionDelete                                                                    #FunctionDeleteProduct///////////added//////
    | constructor                                                                       #ConstructorLable//////////added//////
    | functionAdd                                                                       #FunctionAddProduct//////////added//////
    ;

propertyList
    : declarationName  Colon STRING LeftBracket RightBracket
      Assign LeftBracket bodyList* RightBracket eos
      |declarationName Assign  bodyList* eos//////////added//////
    ;

bodyList
    : LeftBrace bodyListinner* RightBrace Comma?
    ;

bodyListinner
    : declarationName Colon stringLiteral? Comma
    ;

propertyDeclarationCom
    : declarationName Colon declarationName identifier keyword Assign keyword eos
    ;

methodDeclaration
    : declarationName LeftParen parameterList? RightParen methodBody
    ;

parameterList
      : parameter parameterComma*
         ;
parameterComma:
              Comma parameter
              ;
parameter
    : declarationName Colon declarationString
    ;

methodBody
    : LeftBrace statementMethod* RightBrace
    ;

statementMethod
    : keyword Dot declarationName Assign declarationString eos
    ;
///////////////////added//////////////////////////////////////////
functionNgOnInit:
        NgOnInit LeftParen RightParen Colon keyword LeftBrace bodyNgOnInit* RightBrace
         ;

bodyNgOnInit:
          ifStatement elseStatement?
            ;

ifStatement:
    If LeftParen expressionIf RightParen LeftBrace blockIf* RightBrace
         ;

expressionIf:
     Typeof Window NotEqual2 stringLiteral AndAnd Typeof LocalStorage NotEqual2 stringLiteral
     |keyword Dot declarationName QuestionDot declarationName DoubleEqual declarationName Dot declarationName
       ;

blockIf:
     keyword STRING Assign JSONParse LeftParen  contentJSON RightParen eos                                         #BlockIfJSON
     |keyword STRING Assign declarationName Dot declarationName LeftParen  contentFilter  RightParen eos           #BlockIfFilter
     |contentElse                                                                                                  #BlockIfElse
     |LocalStorage Dot declarationName LeftParen contentLocalStorage RightParen eos                                #BlockIfLocalStorage
     |keyword Dot declarationName Assign NullLiteral eos                                                           #BlockIfNullLiteral
     |declarationName Dot declarationName LeftParen LeftBrace Ellipsis keyword Dot declarationName RightBrace RightParen eos  #BlockIfEllipsis
     |keyword Dot reservedWord Dot declarationName LeftParen LeftBracket stringLiteral RightBracket RightParen eos   #BlockIfTable
      ;

contentJSON:
     LocalStorage Dot declarationName LeftParen stringLiteral RightParen OrOr stringLiteral
       ;

contentFilter:
     LeftParen STRING Colon Any RightParen Arrow filterArrow*
        ;

filterArrow:
     declarationName QuestionDot declarationName AndAnd?
     |declarationName Dot declarationName NotEqual2 declarationName Dot declarationName
       ;

contentLocalStorage:
     stringLiteral Comma declarationName Dot declarationName LeftParen declarationName RightParen
         ;

elseStatement:
       keyword LeftBrace contentElse RightBrace
        ;

contentElse:
    keyword Dot declarationName Assign LeftBracket Ellipsis keyword Dot declarationName
    (Comma Ellipsis declarationName)? RightBracket eos
            ;

functionDelete:
    declarationName LeftParen STRING Colon Number RightParen LeftBrace functionDeleteContent* RightBrace
      ;

functionDeleteContent:
      keyword declarationName Assign keyword Dot declarationName Dot
      declarationName LeftParen declarationName Comma STRING RightParen LeftBracket STRING  RightBracket eos
      |ifStatement
        ;
constructor:
     Constructor LeftParen type reservedWord Colon reservedWord RightParen LeftBrace RightBrace
        ;
functionAdd:
        declarationName LeftParen RightParen LeftBrace functionAddContent* RightBrace
         ;

functionAddContent:
               blockIf
               ;
 /////////////////////////////////////////////////////////////////

declarationString:
             type                                                           #ParameterTyped
             |declarationName                                               #Declaration
             |stringLiteral                                                 #StringLiteralLabel
               ;

// ===== IDENTIFIERS AND TYPES =====
declarationName
    : STRING
    ;

// ===== HTML =====
htmlElements
    : htmlElement
    ;

htmlElement
    : htmlTagNameStart+ htmlElementContent* htmlTagNameEnd*
    ;

htmlTagNameStart
    : Less tagName (keyword Assign stringLiteral)? Greater?
         ;

htmlTagNameEnd
    : Less Div tagName Greater
    ;

htmlElementContent
    : Less tagName elements tagName Greater                                                                        #NestedHtml
    | Less tagName contentHtml contentHtml contentHtml contentHtml Div Greater                                     #HtmlContentMany
    | Less tagName contentHtml htmlBrace Greater                                                                   #HtmlContentBrace
    | (STRING || reservedWord) Assign stringLiteral (keyword Assign stringLiteral)? Greater  declarationName*      #HtmlButton//////////added//////
    | declarationName  Number?                                                                                     #DeclarationNumber///////////added//////
    |LeftBracket  NgModel RightBracket Assign stringLiteral (declarationName Assign stringLiteral Div)?  Greater   #DeclarationNgModel//////////added//////
    ;

contentHtml
    : htmlImgAttribute*                                                      #HtmlImgAttribute1
    | LeftBracket htmlKeyword RightBracket Assign stringLiteral              #HtmlImgAttribute2
    | htmlKeyword Assign stringLiteral                                       #HtmlImgAttribute3
    | keyword Assign stringLiteral                                           #HtmlImgAttribute4
    | keyword Assign stringLiteral Star htmlKeyword Assign stringLiteral     #ComplexHtmlAttr
    ;
htmlImgAttribute:
             Star htmlKeyword Assign stringLiteral
                ;
elements
    : Greater htmlAttributes Less Div                                               #HtmlAttrSet
    | reservedWord Assign stringLiteral identifier STRING* identifier Div           #ReservedBlock
    ;

htmlBrace
    : reservedWord Assign stringLiteral
    ;

htmlAttributes
    : (tagName (STRING)?)*
    ;

// ===== CSS =====
cssElement
    : Dot* tagName? Comma? H4? selector* LeftBrace cssProperty* RightBrace
    ;

selector
    : STRING IMG_? selectorInternal*
    |Textarea
    ;

selectorInternal
    : Colon? STRING
    ;

cssProperty
    : css Colon cssValue* eos
    ;

css
    : Display
    | Flex_Direction
    | Gap
    | Padding
    | Box_Size
    | Flex
    | Border
    | Text_Align
    | Max_With
    | Height
    | Cursor
    | Transition
    | Background_Color
    | Margin
    | FontSize
    | Color
    | Width
    ;

cssValue
    : decimalLiteral_UNIT
    | Row
    | Flex
    | Border_Box
    | Center
    | Column
    | Auto
    | Pointer
    | HEXCHAR
    | STRING
    ;

decimalLiteral_UNIT
    : decimalLiteralUnit decimalLiteral*                 #UnitNumberList
    | decimalLiteralUnit Solid HEXCHAR                   #UnitSolidColor
    | css decimalLiteralUnit                             #BackgroundColorUnit
    ;

decimalLiteralUnit
    : DecimalLiteral_UNIT
    ;

decimalLiteral
    : DecimalLiteral
    ;

// ===== TAGS =====
tagName
    : H1
    | H2
    | H3
    | H4
    | IMG_
    | P
    | QuestionDot
    | RBRACE_RBRACE
    | LBRACE_LBRACE
    | Div_
    | Dot
    | Button
    | Label
    | Input
    |Textarea
    ;

// ===== HTML Keywords =====
htmlKeyword
    : NGFOR
    | NGIF
    | ALT
    | SRC
    ;

// ===== MISC =====
identifier
    : Identifier
    | Or
    | Less
    | Greater
    | True_//////////////added///////////////////
    ;

type
    : String
    | Int
    | Float
    | Double
    | Bool
    | Var
    | Array
    | Number
    |Private
    ;


reservedWord
    : AngularCore
    | Angular
    | Component
    | RouterOutlet
    | CommonModule
    | Input
    | OnInit
    | Click
    | RouterLink//////////////added///////////////////
    | FormsModule
    | Router_
    | Router
    ;


stringLiteral
    : StringLiteral
    ;

keyword
    : Break
    | Do
    | Case
    | Else
    | New
    | Return
    | Void
    | Continue
    | For
    | Switch
    | While
    | Function_
    | This
    | Default
    | If
    | In
    | Const
    | Export
    | Import
    | Let
    | Interface
    | Extends
    | Class
    | NullLiteral
    ;

eos
    : Semi
    | EOF
    ;

