grammar Chirp;

// Lexer Rules
WS      : [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;

// Keywords
PUB     : 'pub';
PRIV    : 'priv';
CLASS   : 'class';
WHILE   : 'while';
ASYNC   : 'async';
FN      : 'fn';
VAR     : 'var';
INCLUDE : 'include';
IF      : 'if';
ELSE    : 'else';
ELSEIF  : 'elif';
SELF    : 'self';
OK    : 'Ok';
ERR   : 'Err';

// Symbols
PLUS    : '+';
MINUS   : '-';
EQUAL   : '=';
DIVIDE  : '/';
MULTIPLY: '*';
SQUOTE  : '\'';
DQUOTE  : '"';
COLONCOLON: '::';
COLON   : ':';
SEMI    : ';';
AT      : '@';
LT      : '<';
GT      : '>';
LCURLY  : '{';
RCURLY  : '}';
LSQUARE : '[';
RSQUARE : ']';
BACKSLASH: '\\';
COMMA   : ',';
HASH    : '#';
DOT     : '.';
LPAREN  : '(';
RPAREN  : ')';
QUESTION_MARK: '?';

// Identifier
IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

// String Literal
STRING_LITERAL : DQUOTE ~["\r\n]* DQUOTE;

// Integer Literal
INT_LITERAL : [0-9]+;

// Comment
COMMENT : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;

// Grammar Rules
program : import_statement*? class_declaration;

ok : OK '(' '-' '>' block ')';

err : ERR '(' '-' '>' block ')';

import_statement : HASH INCLUDE STRING_LITERAL SEMI;

class_declaration : access_modifier? CLASS IDENTIFIER LCURLY block_statement RCURLY;

assignment_expression : VAR IDENTIFIER EQUAL (IDENTIFIER | INT_LITERAL | STRING_LITERAL) | conditional_expression SEMI*?;

access_modifier : PUB | PRIV;

expression : (OK | ERR) | IDENTIFIER | method_call ;

block : ;

method_call : IDENTIFIER '(' parameters ')';

parameters : IDENTIFIER (COMMA IDENTIFIER)*? ;

block_statement : ;

conditional_expression : ;

if_statement : IF LPAREN expression RPAREN block (ELSEIF LPAREN expression RPAREN block)* (ELSE block)?;

while_statement : WHILE LPAREN expression RPAREN block;