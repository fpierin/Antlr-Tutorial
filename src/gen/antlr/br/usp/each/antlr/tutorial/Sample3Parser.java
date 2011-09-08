// $ANTLR 3.3 Nov 30, 2010 12:50:56 /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g 2011-09-07 13:22:20

	package br.usp.each.antlr.tutorial;
	import br.usp.each.antlr.evaluators.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Sample3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Identificador", "NumeroInteiro", "Digito", "Espacamento", "LetraCaixaAlta", "LetraCaixaBaixa", "Letras", "QuebraDeLinha", "Tabulacao", "StringLiteral", "CharLiteral", "CaracteresIgnorados", "ComentarioDeLinhaUnica", "ComentarioDeMultiplasLinhas", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'mod'"
    };
    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int Identificador=4;
    public static final int NumeroInteiro=5;
    public static final int Digito=6;
    public static final int Espacamento=7;
    public static final int LetraCaixaAlta=8;
    public static final int LetraCaixaBaixa=9;
    public static final int Letras=10;
    public static final int QuebraDeLinha=11;
    public static final int Tabulacao=12;
    public static final int StringLiteral=13;
    public static final int CharLiteral=14;
    public static final int CaracteresIgnorados=15;
    public static final int ComentarioDeLinhaUnica=16;
    public static final int ComentarioDeMultiplasLinhas=17;

    // delegates
    // delegators


        public Sample3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Sample3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Sample3Parser.tokenNames; }
    public String getGrammarFileName() { return "/host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g"; }



    // $ANTLR start "evaluator"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:16:1: evaluator returns [Evaluator e] : expression EOF ;
    public final Evaluator evaluator() throws RecognitionException {
        Evaluator e = null;

        Evaluator expression1 = null;


        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:17:2: ( expression EOF )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:17:4: expression EOF
            {
            pushFollow(FOLLOW_expression_in_evaluator44);
            expression1=expression();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_evaluator46); 
             e = expression1;  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "evaluator"


    // $ANTLR start "term"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:20:1: term returns [Evaluator e] : ( Identificador | '(' expression ')' | NumeroInteiro );
    public final Evaluator term() throws RecognitionException {
        Evaluator e = null;

        Token NumeroInteiro3=null;
        Evaluator expression2 = null;


        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:21:2: ( Identificador | '(' expression ')' | NumeroInteiro )
            int alt1=3;
            switch ( input.LA(1) ) {
            case Identificador:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case NumeroInteiro:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:21:4: Identificador
                    {
                    match(input,Identificador,FOLLOW_Identificador_in_term64); 
                     e = new IntEvaluator(0); 

                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:22:4: '(' expression ')'
                    {
                    match(input,18,FOLLOW_18_in_term71); 
                    pushFollow(FOLLOW_expression_in_term73);
                    expression2=expression();

                    state._fsp--;

                    match(input,19,FOLLOW_19_in_term75); 
                     e = expression2; 

                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:23:4: NumeroInteiro
                    {
                    NumeroInteiro3=(Token)match(input,NumeroInteiro,FOLLOW_NumeroInteiro_in_term82); 
                     e = new IntEvaluator(Integer.parseInt((NumeroInteiro3!=null?NumeroInteiro3.getText():null))); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "term"


    // $ANTLR start "unary"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:26:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws RecognitionException {
        Evaluator e = null;

        Evaluator term4 = null;


        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:27:2: ( ( '+' | '-' )* term )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:27:4: ( '+' | '-' )* term
            {
             boolean positive = true; 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:28:3: ( '+' | '-' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }
                else if ( (LA2_0==21) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:28:4: '+'
            	    {
            	    match(input,20,FOLLOW_20_in_unary105); 

            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:28:10: '-'
            	    {
            	    match(input,21,FOLLOW_21_in_unary109); 
            	     positive = !positive; 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unary115);
            term4=term();

            state._fsp--;

             
            			e = term4;
            			if (!positive)
            			 e = new NegationEvaluator(e);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "unary"


    // $ANTLR start "mult"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:36:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )* ;
    public final Evaluator mult() throws RecognitionException {
        Evaluator e = null;

        Evaluator op1 = null;

        Evaluator op2 = null;


        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:37:2: (op1= unary ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:37:4: op1= unary ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult139);
            op1=unary();

            state._fsp--;

             e = op1; 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:38:3: ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case 24:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:38:5: '*' op2= unary
            	    {
            	    match(input,22,FOLLOW_22_in_mult148); 
            	    pushFollow(FOLLOW_unary_in_mult155);
            	    op2=unary();

            	    state._fsp--;

            	     e = new TimesEvaluator(e, op2); 

            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:39:5: '/' op2= unary
            	    {
            	    match(input,23,FOLLOW_23_in_mult164); 
            	    pushFollow(FOLLOW_unary_in_mult171);
            	    op2=unary();

            	    state._fsp--;

            	     e = new DivideEvaluator(e, op2); 

            	    }
            	    break;
            	case 3 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:40:5: 'mod' op2= unary
            	    {
            	    match(input,24,FOLLOW_24_in_mult180); 
            	    pushFollow(FOLLOW_unary_in_mult186);
            	    op2=unary();

            	    state._fsp--;

            	     e = new ModEvaluator(e, op2); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "mult"


    // $ANTLR start "expression"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:44:1: expression returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator expression() throws RecognitionException {
        Evaluator e = null;

        Evaluator op1 = null;

        Evaluator op2 = null;


        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:45:2: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:45:4: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_expression213);
            op1=mult();

            state._fsp--;

             e = op1; 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:46:3: ( '+' op2= mult | '-' op2= mult )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }
                else if ( (LA4_0==21) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:46:5: '+' op2= mult
            	    {
            	    match(input,20,FOLLOW_20_in_expression221); 
            	    pushFollow(FOLLOW_mult_in_expression227);
            	    op2=mult();

            	    state._fsp--;

            	     e = new PlusEvaluator(e, op2); 

            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:47:5: '-' op2= mult
            	    {
            	    match(input,21,FOLLOW_21_in_expression236); 
            	    pushFollow(FOLLOW_mult_in_expression242);
            	    op2=mult();

            	    state._fsp--;

            	     e = new MinusEvaluator(e, op2); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_evaluator44 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_evaluator46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_term64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_term71 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_expression_in_term73 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_term75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumeroInteiro_in_term82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_unary105 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_21_in_unary109 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_term_in_unary115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult139 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_22_in_mult148 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_unary_in_mult155 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_23_in_mult164 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_unary_in_mult171 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_24_in_mult180 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_unary_in_mult186 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_mult_in_expression213 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_expression221 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_mult_in_expression227 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_expression236 = new BitSet(new long[]{0x0000000000340030L});
    public static final BitSet FOLLOW_mult_in_expression242 = new BitSet(new long[]{0x0000000000300002L});

}