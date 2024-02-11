grammar Infix;


//program : pROG EOF;
//pROG  :	dEC+(aRGS|bODY) EOF;

prog  :	dec+ EOF;
dec   :	TYPE IDFR '(' vardec ')' body;
vardec : 	(TYPE IDFR (',' TYPE IDFR)*)?;
body :	'{' (TYPE localvar+=IDFR ':=' localvarexpr+=expr ';')* ene '}';
block : '{' ene '}';

ene :	expr (';' expr)*;

expr :
        INTLIT                                      #Integers
    |	BOOLLIT                                     #BOOLEAN
    |	IDFR ':=' expr                              #AssignExpr
    |	'('expr binop expr')'                       #BinOpExpr
    |	IDFR '('args')'                             #IDFRargs   // funccall
    |	block                                       #EXPRBlock
    |	'if' expr 'then' block 'else' block         #IFThenElse
    |	'while' expr 'do' block                     #WhileDo
    |	'repeat' block 'until' expr                 #RepeatUntil
    |	'print' expr                                #Print
    |	'space'                                     #Space
    |	'newline'                                   #Newline
    |	'skip'                                      #Skip
    |    IDFR                                        #Identifiers
;
args :	(expr (',' expr|IDFR)*)?;
binop :	'==' | '<' | '>' | '<=' | '>=' | '+' | '-' | '*' |  '/' | '&' | '|' | '^' ;


Quality :'==';
LParen : '(' ;
Comma : ',' ;
RParen : ')' ;
LBrace : '{' ;
Semicolon : ';' ;
RBrace : '}' ;


Divide :'/';
LessEq : '<=' ;
MoreEq:'>=';
Times : '*';
Plus : '+' ;
Minus : '-' ;
And : '&' ;
Xor : '^' ;
LogicalOr : '|';     //added after
Less : '<' ;        //added after
More : '>';         //added after


Assign : ':=' ;

While : 'while' ;
Do : 'do' ;
Local : 'local' ;




TYPE :	'int' | 'bool' | 'unit' ;
IDFR : [a-z][a-zA-Z0-9_]*;
INTLIT : '0' | '-'?[1-9][0-9]* ;
BOOLLIT :	'true' | 'false' ;
WS     : [ \n\r\t]+ -> skip ;
Comment : '--' ~[\r\n]* -> skip;
