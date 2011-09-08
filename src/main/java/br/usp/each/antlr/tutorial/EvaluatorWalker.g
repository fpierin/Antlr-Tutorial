tree grammar EvaluatorWalker;

options {
  language = Java;
  tokenVocab = Sample4;
  ASTLabelType = CommonTree;
}

@header {
	package br.usp.each.antlr.tutorial;
}

evaluator returns [int result]
	: expression EOF { result = e; }
	;
	
expression returns [int result]
	: ^('+' op1 = expression op2 = expression) { result = op1 + op2; }
	| ^('-' op1 = expression op2 = expression) { result = op1 - op2; }
	| ^('*' op1 = expression op2 = expression) { result = op1 * op2; }
	| ^('/' op1 = expression op2 = expression) { result = op1 / op2; }
	| ^('%' op1 = expression op2 = expression) { result = op1 \% op2; }		
	| ^(NEGATION e=expression)  { result = -e; }
	| Identificador  { result = 0; }			
	| NumeroInteiro	 { result = Integer.parseInt($NumeroInteiro.text); }
	;
