// $ANTLR 3.3 Nov 30, 2010 12:50:56 /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g 2011-09-07 13:22:21

	package br.usp.each.antlr.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Sample3Lexer extends Lexer {
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

    public Sample3Lexer() {;} 
    public Sample3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Sample3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:11:7: ( '(' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:12:7: ( ')' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:13:7: ( '+' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:14:7: ( '-' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:15:7: ( '*' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:16:7: ( '/' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:17:7: ( 'mod' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:17:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "Digito"
    public final void mDigito() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:51:21: ( '0' .. '9' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:51:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digito"

    // $ANTLR start "Espacamento"
    public final void mEspacamento() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:52:23: ( ' ' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:52:25: ' '
            {
            match(' '); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Espacamento"

    // $ANTLR start "LetraCaixaAlta"
    public final void mLetraCaixaAlta() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:53:25: ( 'A' .. 'Z' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:53:27: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LetraCaixaAlta"

    // $ANTLR start "LetraCaixaBaixa"
    public final void mLetraCaixaBaixa() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:54:25: ( 'a' .. 'z' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:54:27: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LetraCaixaBaixa"

    // $ANTLR start "Letras"
    public final void mLetras() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:55:21: ( LetraCaixaAlta | LetraCaixaBaixa )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letras"

    // $ANTLR start "QuebraDeLinha"
    public final void mQuebraDeLinha() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:56:24: ( '\\n' | '\\r' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "QuebraDeLinha"

    // $ANTLR start "Tabulacao"
    public final void mTabulacao() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:57:22: ( '\\t' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:57:24: '\\t'
            {
            match('\t'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Tabulacao"

    // $ANTLR start "NumeroInteiro"
    public final void mNumeroInteiro() throws RecognitionException {
        try {
            int _type = NumeroInteiro;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:59:15: ( ( Digito )+ )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:59:17: ( Digito )+
            {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:59:17: ( Digito )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:59:17: Digito
            	    {
            	    mDigito(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumeroInteiro"

    // $ANTLR start "Identificador"
    public final void mIdentificador() throws RecognitionException {
        try {
            int _type = Identificador;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:60:15: ( Letras ( Letras | Digito )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:60:17: Letras ( Letras | Digito )*
            {
            mLetras(); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:60:24: ( Letras | Digito )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identificador"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:63:2: ( '\"' ( '\"' '\"' | c=~ ( '\"' | '\\r' | '\\n' ) )* '\"' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:63:4: '\"' ( '\"' '\"' | c=~ ( '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
             StringBuilder b = new StringBuilder(); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:65:3: ( '\"' '\"' | c=~ ( '\"' | '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='\"') ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:65:5: '\"' '\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 
            	     b.appendCodePoint('"'); 

            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:66:5: c=~ ( '\"' | '\\r' | '\\n' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 
             setText(b.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "CharLiteral"
    public final void mCharLiteral() throws RecognitionException {
        try {
            int _type = CharLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:73:2: ( '\\'' . '\\'' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:73:4: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 
             setText(getText().substring(1,2)); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CharLiteral"

    // $ANTLR start "CaracteresIgnorados"
    public final void mCaracteresIgnorados() throws RecognitionException {
        try {
            int _type = CaracteresIgnorados;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:78:20: ( ( Espacamento | Tabulacao | QuebraDeLinha | '\\f' )+ )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:78:22: ( Espacamento | Tabulacao | QuebraDeLinha | '\\f' )+
            {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:78:22: ( Espacamento | Tabulacao | QuebraDeLinha | '\\f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||(LA4_0>='\f' && LA4_0<='\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CaracteresIgnorados"

    // $ANTLR start "ComentarioDeLinhaUnica"
    public final void mComentarioDeLinhaUnica() throws RecognitionException {
        try {
            int _type = ComentarioDeLinhaUnica;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:79:23: ( '//' ( . )* ( QuebraDeLinha ) )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:79:25: '//' ( . )* ( QuebraDeLinha )
            {
            match("//"); 

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:79:30: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:79:30: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:79:33: ( QuebraDeLinha )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:79:34: QuebraDeLinha
            {
            mQuebraDeLinha(); 

            }

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComentarioDeLinhaUnica"

    // $ANTLR start "ComentarioDeMultiplasLinhas"
    public final void mComentarioDeMultiplasLinhas() throws RecognitionException {
        try {
            int _type = ComentarioDeMultiplasLinhas;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:80:28: ( '/*' ( . )* '*/' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:80:30: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:80:35: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:80:35: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComentarioDeMultiplasLinhas"

    public void mTokens() throws RecognitionException {
        // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | NumeroInteiro | Identificador | StringLiteral | CharLiteral | CaracteresIgnorados | ComentarioDeLinhaUnica | ComentarioDeMultiplasLinhas )
        int alt7=14;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:52: NumeroInteiro
                {
                mNumeroInteiro(); 

                }
                break;
            case 9 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:66: Identificador
                {
                mIdentificador(); 

                }
                break;
            case 10 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:80: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 11 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:94: CharLiteral
                {
                mCharLiteral(); 

                }
                break;
            case 12 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:106: CaracteresIgnorados
                {
                mCaracteresIgnorados(); 

                }
                break;
            case 13 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:126: ComentarioDeLinhaUnica
                {
                mComentarioDeLinhaUnica(); 

                }
                break;
            case 14 :
                // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample3.g:1:149: ComentarioDeMultiplasLinhas
                {
                mComentarioDeMultiplasLinhas(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\6\uffff\1\17\1\11\10\uffff\1\11\1\22\1\uffff";
    static final String DFA7_eofS =
        "\23\uffff";
    static final String DFA7_minS =
        "\1\11\5\uffff\1\52\1\157\10\uffff\1\144\1\60\1\uffff";
    static final String DFA7_maxS =
        "\1\172\5\uffff\1\57\1\157\10\uffff\1\144\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\6\2\uffff\1\7";
    static final String DFA7_specialS =
        "\23\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\14\1\uffff\2\14\22\uffff\1\14\1\uffff\1\12\4\uffff\1\13\1"+
            "\1\1\2\1\5\1\3\1\uffff\1\4\1\uffff\1\6\12\10\7\uffff\32\11\6"+
            "\uffff\14\11\1\7\15\11",
            "",
            "",
            "",
            "",
            "",
            "\1\16\4\uffff\1\15",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "\12\11\7\uffff\32\11\6\uffff\32\11",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | NumeroInteiro | Identificador | StringLiteral | CharLiteral | CaracteresIgnorados | ComentarioDeLinhaUnica | ComentarioDeMultiplasLinhas );";
        }
    }
 

}