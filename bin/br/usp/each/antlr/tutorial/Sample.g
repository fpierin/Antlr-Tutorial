grammar Sample;

options {
  language = Java;
}

@header {
	package br.usp.each.antlr.tutorial;
}

@lexer::header {
	package br.usp.each.antlr.tutorial;
}


program
	: 'program' Identificador '='
		(constant | variable | function | procedure | typeDecl)*
		'begin'
		statement*
		'end' Identificador '.';
		
constant
	: 'constant' Identificador ':' type ':=' expression ';'	
	;
	
variable
	: 'var' Identificador (',' Identificador)* ':' type (':=' expression)? ';'
	;
	
type
	: 'Integer'
	| 'Boolean'
	| 'String'
	| 'Char'
	| typeSpec
	| Identificador
	;
	
typeSpec
	:	arrayType
	| recordType
	| enumType
	;
	
typeDecl
	: 'type' Identificador '=' typeSpec ';'
	;

	
arrayType
	:	'array' '[' NumeroInteiro '..' NumeroInteiro ']' 'of' type
	;	

recordType
	:	'record' field* 'end' 'record'
	;
	
enumType
	:  '<' Identificador (',' Identificador)* '>'
	;
		
field
	: Identificador ':' type ';'
	;	

statement
	: assignmentStatement
	| ifStatement
	| loopStatement
	| whileStatement
	| procedureCallStatement
	;
	
procedureCallStatement
	: Identificador '(' actualParameters? ')' ';'
	;
	
actualParameters
	: expression (',' expression)*
	;
	
ifStatement
	: 'if' expression 'then' statement+
		('elsif' expression 'then' statement+)*		('else' statement+)?
		'end' 'if' ';' 
	;
	
assignmentStatement
	: Identificador ':=' expression ';'
	;
	
exitStatement
	: 'exit' 'when' expression ';'
	;
	
loopStatement
	: 'loop' (statement|exitStatement)* 
		'end' 'loop' ';'
	;
	
whileStatement
	: 'while' expression 'loop'
		(statement|exitStatement)*
		'end' 'loop' ';'
	;
	
returnStatement
	:	'return' expression ';'
	;
	
procedure
	:	'procedure' Identificador '(' parameters? ')' '='
		(constant | variable) *
		'begin'
			statement*
		'end' Identificador '.'
	;
	
function
	:	'function' Identificador '(' parameters? ')' ':' type '='
		(constant | variable) *
		'begin'
			(statement|returnStatement)*
		'end' Identificador '.'
	;	
	
parameters
	: parameter (',' parameter)*
	;
	
parameter
	: 'var'? Identificador ':' type
	;
	
term
	: Identificador
	| '(' expression ')'
	| NumeroInteiro
	| StringLiteral
	| CharLiteral
	| Identificador '(' actualParameters ')'
	;
	
negation
	: 'not'* term
	;
	
unary
	: ('+' | '-')* negation
	;
	
mult
	: unary (('*' | '/' | 'mod') unary)*
	;

add
	: mult (('+' | '-') mult)*
	;
	
relation
	: add (('=' | '!=' | '<' | '<=' | '>=' | '>' ) add)*
	;
	
expression
	: relation (('and' | 'or') relation)*
	;

fragment Digito					: '0'..'9';
fragment Espacamento		: ' '; 
fragment LetraCaixaAlta	: 'A'..'Z';
fragment LetraCaixaBaixa: 'a'..'z';
fragment Letras					: LetraCaixaAlta | LetraCaixaBaixa;
fragment QuebraDeLinha	: '\n' | '\r';
fragment Tabulacao			: '\t';

NumeroInteiro : Digito+;
Identificador	: Letras (Letras | Digito)*;

StringLiteral 
	: '"'
		{ StringBuilder b = new StringBuilder(); }
		( '"' '"' 									{ b.appendCodePoint('"'); }
		| c = ~('"' | '\r' | '\n')  { b.appendCodePoint(c); }
		)*
		'"'
		{ setText(b.toString()); }		
	;
	
CharLiteral
	: '\'' . '\'' 
	{ setText(getText().substring(1,2)); }
	;
	
	
CaracteresIgnorados: (Espacamento | Tabulacao | QuebraDeLinha | '\f')+ {$channel = HIDDEN;};
ComentarioDeLinhaUnica: '//' .* (QuebraDeLinha) {$channel = HIDDEN;};
ComentarioDeMultiplasLinhas: '/*' .* '*/' {$channel = HIDDEN;};






























 