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

import_statement : HASH INCLUDE DQUOTE IDENTIFIER (COLONCOLON IDENTIFIER)*? DQUOTE SEMI;

class_declaration : access_modifier? CLASS IDENTIFIER LCURLY block_statement RCURLY;

block_statement   : field_declaration*? method_declaration*? assignment_expression*?;

field_declaration : access_modifier? VAR IDENTIFIER SEMI;

method_declaration : access_modifier? (ASYNC | FN) IDENTIFIER parameter_list? block;

parameter_list : LPAREN parameter (COMMA parameter)* RPAREN;

parameter : IDENTIFIER COLON type;

type : IDENTIFIER;

access_modifier : PUB | PRIV;

block : LCURLY statement* RCURLY;

statement : expression SEMI | if_statement | while_statement | return_statement | COMMENT;

expression : assignment_expression;

assignment_expression : VAR IDENTIFIER EQUAL (IDENTIFIER | INT_LITERAL | STRING_LITERAL) | conditional_expression SEMI*?;

left_hand_side : IDENTIFIER | SELF COLONCOLON IDENTIFIER;

conditional_expression : logical_or_expression (QUESTION_MARK expression COLON expression)?;

logical_or_expression : logical_and_expression (LOGICAL_OR logical_and_expression)*;

logical_and_expression : equality_expression (LOGICAL_AND equality_expression)*;

equality_expression : relational_expression ((EQUAL | NOT_EQUAL) relational_expression)*;

relational_expression : additive_expression ((LT | GT) additive_expression)*;

additive_expression : multiplicative_expression ((PLUS | MINUS) multiplicative_expression)*;

multiplicative_expression : unary_expression ((MULTIPLY | DIVIDE) unary_expression)*;

unary_expression : (PLUS | MINUS) unary_expression | primary_expression;

primary_expression : IDENTIFIER | INT_LITERAL | STRING_LITERAL | LPAREN expression RPAREN;

if_statement : IF LPAREN expression RPAREN block (ELSEIF LPAREN expression RPAREN block)* (ELSE block)?;

while_statement : WHILE LPAREN expression RPAREN block;

return_statement : RETURN expression? SEMI;