grammar Sample3;

options {
  language = Java;
}

@header {
	package br.usp.each.antlr.tutorial;
	import br.usp.each.antlr.evaluators.*;
}

@lexer::header {
	package br.usp.each.antlr.tutorial;
}

evaluator returns [Evaluator e]
	:	expression EOF { $e = $expression.e;  }
	;
	
term returns [Evaluator e]
	: Identificador { $e = new IntEvaluator(0); }
	| '(' expression ')' { $e = $expression.e; }
	| NumeroInteiro { $e = new IntEvaluator(Integer.parseInt($NumeroInteiro.text)); }
	;
	
unary returns [Evaluator e]
	: { boolean positive = true; }
		('+' | '-' { positive = !positive; })* term
		{ 
			$e = $term.e;
			if (!positive)
			 $e = new NegationEvaluator($e);
		}
	;
	
mult returns [Evaluator e]
	: op1 = unary { $e = $op1.e; } 
		( '*' 	op2 = unary 	{ $e = new TimesEvaluator($e, $op2.e); }
		| '/' 	op2 = unary 	{ $e = new DivideEvaluator($e, $op2.e); }
		| 'mod'	op2 = unary 	{ $e = new ModEvaluator($e, $op2.e); }
		)*
	;

expression returns [Evaluator e]
	: op1 = mult { $e = $op1.e; }
		( '+' op2 = mult { $e = new PlusEvaluator($e, $op2.e); } 
		| '-' op2 = mult { $e = new MinusEvaluator($e, $op2.e); }
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






























 