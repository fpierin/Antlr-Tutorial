// $ANTLR 3.3 Nov 30, 2010 12:50:56 /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g 2011-09-07 13:57:01

	package br.usp.each.antlr.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Sample4Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "Identificador", "NumeroInteiro", "Digito", "Espacamento", "LetraCaixaAlta", "LetraCaixaBaixa", "Letras", "QuebraDeLinha", "Tabulacao", "StringLiteral", "CharLiteral", "CaracteresIgnorados", "ComentarioDeLinhaUnica", "ComentarioDeMultiplasLinhas", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'mod'"
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

    // delegates
    // delegators


        public Sample4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Sample4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Sample4Parser.tokenNames; }
    public String getGrammarFileName() { return "/host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g"; }


    public static class evaluator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "evaluator"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:21:1: evaluator : expression EOF ;
    public final Sample4Parser.evaluator_return evaluator() throws RecognitionException {
        Sample4Parser.evaluator_return retval = new Sample4Parser.evaluator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        Sample4Parser.expression_return expression1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:22:2: ( expression EOF )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:22:4: expression EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_evaluator63);
            expression1=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_evaluator65); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "evaluator"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:25:1: term : ( Identificador | '(' expression ')' | NumeroInteiro );
    public final Sample4Parser.term_return term() throws RecognitionException {
        Sample4Parser.term_return retval = new Sample4Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identificador3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token NumeroInteiro7=null;
        Sample4Parser.expression_return expression5 = null;


        CommonTree Identificador3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree NumeroInteiro7_tree=null;

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:26:2: ( Identificador | '(' expression ')' | NumeroInteiro )
            int alt1=3;
            switch ( input.LA(1) ) {
            case Identificador:
                {
                alt1=1;
                }
                break;
            case 19:
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
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:26:4: Identificador
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identificador3=(Token)match(input,Identificador,FOLLOW_Identificador_in_term77); 
                    Identificador3_tree = (CommonTree)adaptor.create(Identificador3);
                    adaptor.addChild(root_0, Identificador3_tree);


                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:27:4: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal4=(Token)match(input,19,FOLLOW_19_in_term82); 
                    pushFollow(FOLLOW_expression_in_term85);
                    expression5=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression5.getTree());
                    char_literal6=(Token)match(input,20,FOLLOW_20_in_term87); 

                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:28:4: NumeroInteiro
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NumeroInteiro7=(Token)match(input,NumeroInteiro,FOLLOW_NumeroInteiro_in_term93); 
                    NumeroInteiro7_tree = (CommonTree)adaptor.create(NumeroInteiro7);
                    adaptor.addChild(root_0, NumeroInteiro7_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:31:1: unary : ( '+' | negation )* term ;
    public final Sample4Parser.unary_return unary() throws RecognitionException {
        Sample4Parser.unary_return retval = new Sample4Parser.unary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal8=null;
        Sample4Parser.negation_return negation9 = null;

        Sample4Parser.term_return term10 = null;


        CommonTree char_literal8_tree=null;

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:32:2: ( ( '+' | negation )* term )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:32:4: ( '+' | negation )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:32:4: ( '+' | negation )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }
                else if ( (LA2_0==22) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:32:5: '+'
            	    {
            	    char_literal8=(Token)match(input,21,FOLLOW_21_in_unary105); 

            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:32:12: negation
            	    {
            	    pushFollow(FOLLOW_negation_in_unary110);
            	    negation9=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation9.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unary115);
            term10=term();

            state._fsp--;

            adaptor.addChild(root_0, term10.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary"

    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negation"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:35:1: negation : '-' -> NEGATION ;
    public final Sample4Parser.negation_return negation() throws RecognitionException {
        Sample4Parser.negation_return retval = new Sample4Parser.negation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal11=null;

        CommonTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:36:2: ( '-' -> NEGATION )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:36:4: '-'
            {
            char_literal11=(Token)match(input,22,FOLLOW_22_in_negation127);  
            stream_22.add(char_literal11);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:8: -> NEGATION
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negation"

    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:39:1: mult : unary ( ( '*' | '/' | 'mod' ) unary )* ;
    public final Sample4Parser.mult_return mult() throws RecognitionException {
        Sample4Parser.mult_return retval = new Sample4Parser.mult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Sample4Parser.unary_return unary12 = null;

        Sample4Parser.unary_return unary16 = null;


        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:2: ( unary ( ( '*' | '/' | 'mod' ) unary )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:4: unary ( ( '*' | '/' | 'mod' ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_in_mult143);
            unary12=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary12.getTree());
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:10: ( ( '*' | '/' | 'mod' ) unary )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=23 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:11: ( '*' | '/' | 'mod' ) unary
            	    {
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:11: ( '*' | '/' | 'mod' )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:12: '*'
            	            {
            	            char_literal13=(Token)match(input,23,FOLLOW_23_in_mult147); 
            	            char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:19: '/'
            	            {
            	            char_literal14=(Token)match(input,24,FOLLOW_24_in_mult152); 
            	            char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal14_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:40:26: 'mod'
            	            {
            	            string_literal15=(Token)match(input,25,FOLLOW_25_in_mult157); 
            	            string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_in_mult161);
            	    unary16=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:43:1: expression : mult ( ( '+' | '-' ) mult )* ;
    public final Sample4Parser.expression_return expression() throws RecognitionException {
        Sample4Parser.expression_return retval = new Sample4Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        Token char_literal19=null;
        Sample4Parser.mult_return mult17 = null;

        Sample4Parser.mult_return mult20 = null;


        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:2: ( mult ( ( '+' | '-' ) mult )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:4: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_expression174);
            mult17=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult17.getTree());
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:9: ( ( '+' | '-' ) mult )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:10: ( '+' | '-' ) mult
            	    {
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:10: ( '+' | '-' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==21) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==22) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:11: '+'
            	            {
            	            char_literal18=(Token)match(input,21,FOLLOW_21_in_expression178); 
            	            char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal18_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample4.g:44:18: '-'
            	            {
            	            char_literal19=(Token)match(input,22,FOLLOW_22_in_expression183); 
            	            char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal19_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_expression187);
            	    mult20=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult20.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_evaluator63 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_evaluator65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_term77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_term82 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_expression_in_term85 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_term87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumeroInteiro_in_term93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary105 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_negation_in_unary110 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_term_in_unary115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_negation127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult143 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_23_in_mult147 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_24_in_mult152 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_25_in_mult157 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_unary_in_mult161 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_mult_in_expression174 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_expression178 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_22_in_expression183 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_mult_in_expression187 = new BitSet(new long[]{0x0000000000600002L});

}