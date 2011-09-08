grammar Sample4;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

tokens {
	NEGATION;
}

@header {
	package br.usp.each.antlr.tutorial;
}

@lexer::header {
	package br.usp.each.antlr.tutorial;
}

evaluator
	: expression EOF!
	;

term
	: Identificador
	| '('! expression ')'!
	| NumeroInteiro
	;

unary
	: ('+'! | negation^)* term
	;
	
negation
	: '-' -> NEGATION
	;
	
mult
	: unary (('*'^ | '/'^ | 'mod'^) unary)*
	;

expression
	: mult (('+'^ | '-'^) mult)*
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






























 