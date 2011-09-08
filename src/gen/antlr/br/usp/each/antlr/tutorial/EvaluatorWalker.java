// $ANTLR 3.3 Nov 30, 2010 12:50:56 /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g 2011-09-07 13:57:03

	package br.usp.each.antlr.tutorial;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EvaluatorWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "Identificador", "NumeroInteiro", "Digito", "Espacamento", "LetraCaixaAlta", "LetraCaixaBaixa", "Letras", "QuebraDeLinha", "Tabulacao", "StringLiteral", "CharLiteral", "CaracteresIgnorados", "ComentarioDeLinhaUnica", "ComentarioDeMultiplasLinhas", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'%'"
    };
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int NEGATION=4;
    public static final int Identificador=5;
    public static final int NumeroInteiro=6;
    public static final int Digito=7;
    public static final int Espacamento=8;
    public static final int LetraCaixaAlta=9;
    public static final int LetraCaixaBaixa=10;
    public static final int Letras=11;
    public static final int QuebraDeLinha=12;
    public static final int Tabulacao=13;
    public static final int StringLiteral=14;
    public static final int CharLiteral=15;
    public static final int CaracteresIgnorados=16;
    public static final int ComentarioDeLinhaUnica=17;
    public static final int ComentarioDeMultiplasLinhas=18;
    public static final int T__26=26;

    // delegates
    // delegators


        public EvaluatorWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public EvaluatorWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return EvaluatorWalker.tokenNames; }
    public String getGrammarFileName() { return "/host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g"; }



    // $ANTLR start "evaluator"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:13:1: evaluator returns [int result] : expression EOF ;
    public final int evaluator() throws RecognitionException {
        int result = 0;

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:14:2: ( expression EOF )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:14:4: expression EOF
            {
            pushFollow(FOLLOW_expression_in_evaluator55);
            expression();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_evaluator57); 
             result = e; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "evaluator"


    // $ANTLR start "expression"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:17:1: expression returns [int result] : ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( NEGATION e= expression ) | Identificador | NumeroInteiro );
    public final int expression() throws RecognitionException {
        int result = 0;

        CommonTree NumeroInteiro1=null;
        int op1 = 0;

        int op2 = 0;

        int e = 0;


        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:18:2: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( NEGATION e= expression ) | Identificador | NumeroInteiro )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case NEGATION:
                {
                alt1=6;
                }
                break;
            case Identificador:
                {
                alt1=7;
                }
                break;
            case NumeroInteiro:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:18:4: ^( '+' op1= expression op2= expression )
                    {
                    match(input,21,FOLLOW_21_in_expression76); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression82);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression88);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 + op2; 

                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:19:4: ^( '-' op1= expression op2= expression )
                    {
                    match(input,22,FOLLOW_22_in_expression97); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression103);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression109);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 - op2; 

                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:20:4: ^( '*' op1= expression op2= expression )
                    {
                    match(input,23,FOLLOW_23_in_expression118); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression124);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression130);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 * op2; 

                    }
                    break;
                case 4 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:21:4: ^( '/' op1= expression op2= expression )
                    {
                    match(input,24,FOLLOW_24_in_expression139); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression145);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression151);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 / op2; 

                    }
                    break;
                case 5 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:22:4: ^( '%' op1= expression op2= expression )
                    {
                    match(input,26,FOLLOW_26_in_expression160); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression166);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression172);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 % op2; 

                    }
                    break;
                case 6 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:23:4: ^( NEGATION e= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression183); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression187);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = -e; 

                    }
                    break;
                case 7 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:24:4: Identificador
                    {
                    match(input,Identificador,FOLLOW_Identificador_in_expression196); 
                     result = 0; 

                    }
                    break;
                case 8 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/EvaluatorWalker.g:25:4: NumeroInteiro
                    {
                    NumeroInteiro1=(CommonTree)match(input,NumeroInteiro,FOLLOW_NumeroInteiro_in_expression207); 
                     result = Integer.parseInt((NumeroInteiro1!=null?NumeroInteiro1.getText():null)); 

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
        return result;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_evaluator55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_evaluator57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expression76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression82 = new BitSet(new long[]{0x0000000005E00070L});
    public static final BitSet FOLLOW_expression_in_expression88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expression97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression103 = new BitSet(new long[]{0x0000000005E00070L});
    public static final BitSet FOLLOW_expression_in_expression109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expression118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression124 = new BitSet(new long[]{0x0000000005E00070L});
    public static final BitSet FOLLOW_expression_in_expression130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expression139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression145 = new BitSet(new long[]{0x0000000005E00070L});
    public static final BitSet FOLLOW_expression_in_expression151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expression160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression166 = new BitSet(new long[]{0x0000000005E00070L});
    public static final BitSet FOLLOW_expression_in_expression172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Identificador_in_expression196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumeroInteiro_in_expression207 = new BitSet(new long[]{0x0000000000000002L});

}