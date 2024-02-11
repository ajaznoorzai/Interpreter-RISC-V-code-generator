grammar Infix;


//program : pROG EOF;
//pROG  :	dEC+(aRGS|bODY) EOF;

prog  :	dec+ EOF;
dec   :	type IDFR '(' vardec ')' body;
vardec : 	(type IDFR (',' type IDFR)*)?;
body :	'{' (type localvar+=IDFR ':=' localvarexpr+=expr ';')* ene '}';
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

type: INTYPE| BOOLTYPE| UNITTYPE;
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


INTYPE : 'int';
BOOLTYPE: 'bool';
UNITTYPE: 'unit';

Assign : ':=' ;

While : 'while' ;
Do : 'do' ;
Local : 'local' ;




//TYPE :	'int' | 'bool' | 'unit' ;
IDFR : [a-z][a-zA-Z0-9_]*;
INTLIT : '0' | '-'?[1-9][0-9]* ;
BOOLLIT :	'true' | 'false' ;
WS     : [ \n\r\t]+ -> skip ;
Comment : '--' ~[\r\n]* -> skip;
