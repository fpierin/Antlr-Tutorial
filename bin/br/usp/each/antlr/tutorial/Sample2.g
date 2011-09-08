grammar Sample2;

options {
  language = Java;
}

@header {
  package br.usp.each.antlr.tutorial;
}

@lexer::header {
	package br.usp.each.antlr.tutorial;
}

evaluator returns [int result]
	:	expression EOF { $result = $expression.result;  }
	;
	
term returns [int result]
	: Identificador {$result = 0;}
	| '(' expression ')' {$result = $expression.result;}
	| NumeroInteiro {$result = Integer.parseInt($NumeroInteiro.text);}
	;
	
unary returns [int result]
	: { boolean positive = true; }
		('+' | '-' { positive = !positive; })* term
		{ 
			$result = $term.result;
			if (!positive)
			 $result = -$result;
		}
	;
	
mult returns [int result]
	: op1 = unary { $result = $op1.result; } 
		( '*' 	op2 = unary 	{ $result = $result * $op2.result; }
		| '/' 	op2 = unary		{ $result = $result / $op2.result; }
		| 'mod' op2 = unary		{ $result = $result \% $op2.result; }
		)*
	;

expression returns [int result]
	: op1 = mult { $result = $op1.result; }
		( '+' op2 = mult { $result = $result + $op2.result; } 
		| '-' op2 = mult { $result = $result - $op2.result; }
		)*
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






























 