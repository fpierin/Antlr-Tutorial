// $ANTLR 3.3 Nov 30, 2010 12:50:56 /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g 2011-09-07 13:36:11

	package br.usp.each.antlr.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SampleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Identificador", "NumeroInteiro", "StringLiteral", "CharLiteral", "Digito", "Espacamento", "LetraCaixaAlta", "LetraCaixaBaixa", "Letras", "QuebraDeLinha", "Tabulacao", "CaracteresIgnorados", "ComentarioDeLinhaUnica", "ComentarioDeMultiplasLinhas", "'program'", "'='", "'begin'", "'end'", "'.'", "'constant'", "':'", "':='", "';'", "'var'", "','", "'Integer'", "'Boolean'", "'String'", "'Char'", "'type'", "'array'", "'['", "'..'", "']'", "'of'", "'record'", "'<'", "'>'", "'('", "')'", "'if'", "'then'", "'elsif'", "'else'", "'exit'", "'when'", "'loop'", "'while'", "'return'", "'procedure'", "'function'", "'not'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'!='", "'<='", "'>='", "'and'", "'or'"
    };
    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int Identificador=4;
    public static final int NumeroInteiro=5;
    public static final int StringLiteral=6;
    public static final int CharLiteral=7;
    public static final int Digito=8;
    public static final int Espacamento=9;
    public static final int LetraCaixaAlta=10;
    public static final int LetraCaixaBaixa=11;
    public static final int Letras=12;
    public static final int QuebraDeLinha=13;
    public static final int Tabulacao=14;
    public static final int CaracteresIgnorados=15;
    public static final int ComentarioDeLinhaUnica=16;
    public static final int ComentarioDeMultiplasLinhas=17;

    // delegates
    // delegators


        public SampleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SampleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SampleParser.tokenNames; }
    public String getGrammarFileName() { return "/host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g"; }



    // $ANTLR start "program"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:16:1: program : 'program' Identificador '=' ( constant | variable | function | procedure | typeDecl )* 'begin' ( statement )* 'end' Identificador '.' ;
    public final void program() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:17:2: ( 'program' Identificador '=' ( constant | variable | function | procedure | typeDecl )* 'begin' ( statement )* 'end' Identificador '.' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:17:4: 'program' Identificador '=' ( constant | variable | function | procedure | typeDecl )* 'begin' ( statement )* 'end' Identificador '.'
            {
            match(input,18,FOLLOW_18_in_program41); 
            match(input,Identificador,FOLLOW_Identificador_in_program43); 
            match(input,19,FOLLOW_19_in_program45); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:18:3: ( constant | variable | function | procedure | typeDecl )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt1=1;
                    }
                    break;
                case 27:
                    {
                    alt1=2;
                    }
                    break;
                case 54:
                    {
                    alt1=3;
                    }
                    break;
                case 53:
                    {
                    alt1=4;
                    }
                    break;
                case 33:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:18:4: constant
            	    {
            	    pushFollow(FOLLOW_constant_in_program50);
            	    constant();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:18:15: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_program54);
            	    variable();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:18:26: function
            	    {
            	    pushFollow(FOLLOW_function_in_program58);
            	    function();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:18:37: procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_program62);
            	    procedure();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:18:49: typeDecl
            	    {
            	    pushFollow(FOLLOW_typeDecl_in_program66);
            	    typeDecl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_program72); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:20:3: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identificador||LA2_0==44||(LA2_0>=50 && LA2_0<=51)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:20:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program76);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_program81); 
            match(input,Identificador,FOLLOW_Identificador_in_program83); 
            match(input,22,FOLLOW_22_in_program85); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "constant"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:23:1: constant : 'constant' Identificador ':' type ':=' expression ';' ;
    public final void constant() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:24:2: ( 'constant' Identificador ':' type ':=' expression ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:24:4: 'constant' Identificador ':' type ':=' expression ';'
            {
            match(input,23,FOLLOW_23_in_constant96); 
            match(input,Identificador,FOLLOW_Identificador_in_constant98); 
            match(input,24,FOLLOW_24_in_constant100); 
            pushFollow(FOLLOW_type_in_constant102);
            type();

            state._fsp--;

            match(input,25,FOLLOW_25_in_constant104); 
            pushFollow(FOLLOW_expression_in_constant106);
            expression();

            state._fsp--;

            match(input,26,FOLLOW_26_in_constant108); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant"


    // $ANTLR start "variable"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:27:1: variable : 'var' Identificador ( ',' Identificador )* ':' type ( ':=' expression )? ';' ;
    public final void variable() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:28:2: ( 'var' Identificador ( ',' Identificador )* ':' type ( ':=' expression )? ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:28:4: 'var' Identificador ( ',' Identificador )* ':' type ( ':=' expression )? ';'
            {
            match(input,27,FOLLOW_27_in_variable121); 
            match(input,Identificador,FOLLOW_Identificador_in_variable123); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:28:24: ( ',' Identificador )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:28:25: ',' Identificador
            	    {
            	    match(input,28,FOLLOW_28_in_variable126); 
            	    match(input,Identificador,FOLLOW_Identificador_in_variable128); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_variable132); 
            pushFollow(FOLLOW_type_in_variable134);
            type();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:28:54: ( ':=' expression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:28:55: ':=' expression
                    {
                    match(input,25,FOLLOW_25_in_variable137); 
                    pushFollow(FOLLOW_expression_in_variable139);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_variable143); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable"


    // $ANTLR start "type"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:31:1: type : ( 'Integer' | 'Boolean' | 'String' | 'Char' | typeSpec | Identificador );
    public final void type() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:32:2: ( 'Integer' | 'Boolean' | 'String' | 'Char' | typeSpec | Identificador )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 34:
            case 39:
            case 40:
                {
                alt5=5;
                }
                break;
            case Identificador:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:32:4: 'Integer'
                    {
                    match(input,29,FOLLOW_29_in_type155); 

                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:33:4: 'Boolean'
                    {
                    match(input,30,FOLLOW_30_in_type160); 

                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:34:4: 'String'
                    {
                    match(input,31,FOLLOW_31_in_type165); 

                    }
                    break;
                case 4 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:35:4: 'Char'
                    {
                    match(input,32,FOLLOW_32_in_type170); 

                    }
                    break;
                case 5 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:36:4: typeSpec
                    {
                    pushFollow(FOLLOW_typeSpec_in_type175);
                    typeSpec();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:37:4: Identificador
                    {
                    match(input,Identificador,FOLLOW_Identificador_in_type180); 

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
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeSpec"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:40:1: typeSpec : ( arrayType | recordType | enumType );
    public final void typeSpec() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:41:2: ( arrayType | recordType | enumType )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:41:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_typeSpec192);
                    arrayType();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:42:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_typeSpec197);
                    recordType();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:43:4: enumType
                    {
                    pushFollow(FOLLOW_enumType_in_typeSpec202);
                    enumType();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "typeSpec"


    // $ANTLR start "typeDecl"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:46:1: typeDecl : 'type' Identificador '=' typeSpec ';' ;
    public final void typeDecl() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:47:2: ( 'type' Identificador '=' typeSpec ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:47:4: 'type' Identificador '=' typeSpec ';'
            {
            match(input,33,FOLLOW_33_in_typeDecl214); 
            match(input,Identificador,FOLLOW_Identificador_in_typeDecl216); 
            match(input,19,FOLLOW_19_in_typeDecl218); 
            pushFollow(FOLLOW_typeSpec_in_typeDecl220);
            typeSpec();

            state._fsp--;

            match(input,26,FOLLOW_26_in_typeDecl222); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeDecl"


    // $ANTLR start "arrayType"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:51:1: arrayType : 'array' '[' NumeroInteiro '..' NumeroInteiro ']' 'of' type ;
    public final void arrayType() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:52:2: ( 'array' '[' NumeroInteiro '..' NumeroInteiro ']' 'of' type )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:52:4: 'array' '[' NumeroInteiro '..' NumeroInteiro ']' 'of' type
            {
            match(input,34,FOLLOW_34_in_arrayType235); 
            match(input,35,FOLLOW_35_in_arrayType237); 
            match(input,NumeroInteiro,FOLLOW_NumeroInteiro_in_arrayType239); 
            match(input,36,FOLLOW_36_in_arrayType241); 
            match(input,NumeroInteiro,FOLLOW_NumeroInteiro_in_arrayType243); 
            match(input,37,FOLLOW_37_in_arrayType245); 
            match(input,38,FOLLOW_38_in_arrayType247); 
            pushFollow(FOLLOW_type_in_arrayType249);
            type();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayType"


    // $ANTLR start "recordType"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:55:1: recordType : 'record' ( field )* 'end' 'record' ;
    public final void recordType() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:56:2: ( 'record' ( field )* 'end' 'record' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:56:4: 'record' ( field )* 'end' 'record'
            {
            match(input,39,FOLLOW_39_in_recordType261); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:56:13: ( field )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Identificador) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:56:13: field
            	    {
            	    pushFollow(FOLLOW_field_in_recordType263);
            	    field();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_recordType266); 
            match(input,39,FOLLOW_39_in_recordType268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "recordType"


    // $ANTLR start "enumType"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:59:1: enumType : '<' Identificador ( ',' Identificador )* '>' ;
    public final void enumType() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:60:2: ( '<' Identificador ( ',' Identificador )* '>' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:60:5: '<' Identificador ( ',' Identificador )* '>'
            {
            match(input,40,FOLLOW_40_in_enumType281); 
            match(input,Identificador,FOLLOW_Identificador_in_enumType283); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:60:23: ( ',' Identificador )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:60:24: ',' Identificador
            	    {
            	    match(input,28,FOLLOW_28_in_enumType286); 
            	    match(input,Identificador,FOLLOW_Identificador_in_enumType288); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,41,FOLLOW_41_in_enumType292); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enumType"


    // $ANTLR start "field"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:63:1: field : Identificador ':' type ';' ;
    public final void field() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:64:2: ( Identificador ':' type ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:64:4: Identificador ':' type ';'
            {
            match(input,Identificador,FOLLOW_Identificador_in_field305); 
            match(input,24,FOLLOW_24_in_field307); 
            pushFollow(FOLLOW_type_in_field309);
            type();

            state._fsp--;

            match(input,26,FOLLOW_26_in_field311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field"


    // $ANTLR start "statement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:67:1: statement : ( assignmentStatement | ifStatement | loopStatement | whileStatement | procedureCallStatement );
    public final void statement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:68:2: ( assignmentStatement | ifStatement | loopStatement | whileStatement | procedureCallStatement )
            int alt9=5;
            switch ( input.LA(1) ) {
            case Identificador:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==25) ) {
                    alt9=1;
                }
                else if ( (LA9_1==42) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case 50:
                {
                alt9=3;
                }
                break;
            case 51:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:68:4: assignmentStatement
                    {
                    pushFollow(FOLLOW_assignmentStatement_in_statement323);
                    assignmentStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:69:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement328);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:70:4: loopStatement
                    {
                    pushFollow(FOLLOW_loopStatement_in_statement333);
                    loopStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:71:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement338);
                    whileStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:72:4: procedureCallStatement
                    {
                    pushFollow(FOLLOW_procedureCallStatement_in_statement343);
                    procedureCallStatement();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "procedureCallStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:75:1: procedureCallStatement : Identificador '(' ( actualParameters )? ')' ';' ;
    public final void procedureCallStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:76:2: ( Identificador '(' ( actualParameters )? ')' ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:76:4: Identificador '(' ( actualParameters )? ')' ';'
            {
            match(input,Identificador,FOLLOW_Identificador_in_procedureCallStatement355); 
            match(input,42,FOLLOW_42_in_procedureCallStatement357); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:76:22: ( actualParameters )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=Identificador && LA10_0<=CharLiteral)||LA10_0==42||(LA10_0>=55 && LA10_0<=57)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:76:22: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCallStatement359);
                    actualParameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_procedureCallStatement362); 
            match(input,26,FOLLOW_26_in_procedureCallStatement364); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedureCallStatement"


    // $ANTLR start "actualParameters"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:79:1: actualParameters : expression ( ',' expression )* ;
    public final void actualParameters() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:80:2: ( expression ( ',' expression )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:80:4: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_actualParameters376);
            expression();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:80:15: ( ',' expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:80:16: ',' expression
            	    {
            	    match(input,28,FOLLOW_28_in_actualParameters379); 
            	    pushFollow(FOLLOW_expression_in_actualParameters381);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
        return ;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "ifStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:83:1: ifStatement : 'if' expression 'then' ( statement )+ ( 'elsif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';' ;
    public final void ifStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:84:2: ( 'if' expression 'then' ( statement )+ ( 'elsif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:84:4: 'if' expression 'then' ( statement )+ ( 'elsif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';'
            {
            match(input,44,FOLLOW_44_in_ifStatement395); 
            pushFollow(FOLLOW_expression_in_ifStatement397);
            expression();

            state._fsp--;

            match(input,45,FOLLOW_45_in_ifStatement399); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:84:27: ( statement )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Identificador||LA12_0==44||(LA12_0>=50 && LA12_0<=51)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:84:27: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement401);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:3: ( 'elsif' expression 'then' ( statement )+ )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:4: 'elsif' expression 'then' ( statement )+
            	    {
            	    match(input,46,FOLLOW_46_in_ifStatement407); 
            	    pushFollow(FOLLOW_expression_in_ifStatement409);
            	    expression();

            	    state._fsp--;

            	    match(input,45,FOLLOW_45_in_ifStatement411); 
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:30: ( statement )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==Identificador||LA13_0==44||(LA13_0>=50 && LA13_0<=51)) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:30: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_ifStatement413);
            	    	    statement();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:44: ( 'else' ( statement )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:45: 'else' ( statement )+
                    {
                    match(input,47,FOLLOW_47_in_ifStatement420); 
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:52: ( statement )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Identificador||LA15_0==44||(LA15_0>=50 && LA15_0<=51)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:85:52: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement422);
                    	    statement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ifStatement429); 
            match(input,44,FOLLOW_44_in_ifStatement431); 
            match(input,26,FOLLOW_26_in_ifStatement433); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "assignmentStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:89:1: assignmentStatement : Identificador ':=' expression ';' ;
    public final void assignmentStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:90:2: ( Identificador ':=' expression ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:90:4: Identificador ':=' expression ';'
            {
            match(input,Identificador,FOLLOW_Identificador_in_assignmentStatement446); 
            match(input,25,FOLLOW_25_in_assignmentStatement448); 
            pushFollow(FOLLOW_expression_in_assignmentStatement450);
            expression();

            state._fsp--;

            match(input,26,FOLLOW_26_in_assignmentStatement452); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignmentStatement"


    // $ANTLR start "exitStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:93:1: exitStatement : 'exit' 'when' expression ';' ;
    public final void exitStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:94:2: ( 'exit' 'when' expression ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:94:4: 'exit' 'when' expression ';'
            {
            match(input,48,FOLLOW_48_in_exitStatement464); 
            match(input,49,FOLLOW_49_in_exitStatement466); 
            pushFollow(FOLLOW_expression_in_exitStatement468);
            expression();

            state._fsp--;

            match(input,26,FOLLOW_26_in_exitStatement470); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exitStatement"


    // $ANTLR start "loopStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:97:1: loopStatement : 'loop' ( statement | exitStatement )* 'end' 'loop' ';' ;
    public final void loopStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:98:2: ( 'loop' ( statement | exitStatement )* 'end' 'loop' ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:98:4: 'loop' ( statement | exitStatement )* 'end' 'loop' ';'
            {
            match(input,50,FOLLOW_50_in_loopStatement482); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:98:11: ( statement | exitStatement )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Identificador||LA17_0==44||(LA17_0>=50 && LA17_0<=51)) ) {
                    alt17=1;
                }
                else if ( (LA17_0==48) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:98:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_loopStatement485);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:98:22: exitStatement
            	    {
            	    pushFollow(FOLLOW_exitStatement_in_loopStatement487);
            	    exitStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_loopStatement494); 
            match(input,50,FOLLOW_50_in_loopStatement496); 
            match(input,26,FOLLOW_26_in_loopStatement498); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "loopStatement"


    // $ANTLR start "whileStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:102:1: whileStatement : 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' ';' ;
    public final void whileStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:103:2: ( 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:103:4: 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' ';'
            {
            match(input,51,FOLLOW_51_in_whileStatement510); 
            pushFollow(FOLLOW_expression_in_whileStatement512);
            expression();

            state._fsp--;

            match(input,50,FOLLOW_50_in_whileStatement514); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:104:3: ( statement | exitStatement )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Identificador||LA18_0==44||(LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }
                else if ( (LA18_0==48) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:104:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement519);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:104:14: exitStatement
            	    {
            	    pushFollow(FOLLOW_exitStatement_in_whileStatement521);
            	    exitStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_whileStatement527); 
            match(input,50,FOLLOW_50_in_whileStatement529); 
            match(input,26,FOLLOW_26_in_whileStatement531); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "returnStatement"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:108:1: returnStatement : 'return' expression ';' ;
    public final void returnStatement() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:109:2: ( 'return' expression ';' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:109:4: 'return' expression ';'
            {
            match(input,52,FOLLOW_52_in_returnStatement543); 
            pushFollow(FOLLOW_expression_in_returnStatement545);
            expression();

            state._fsp--;

            match(input,26,FOLLOW_26_in_returnStatement547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "returnStatement"


    // $ANTLR start "procedure"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:112:1: procedure : 'procedure' Identificador '(' ( parameters )? ')' '=' ( constant | variable )* 'begin' ( statement )* 'end' Identificador '.' ;
    public final void procedure() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:113:2: ( 'procedure' Identificador '(' ( parameters )? ')' '=' ( constant | variable )* 'begin' ( statement )* 'end' Identificador '.' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:113:4: 'procedure' Identificador '(' ( parameters )? ')' '=' ( constant | variable )* 'begin' ( statement )* 'end' Identificador '.'
            {
            match(input,53,FOLLOW_53_in_procedure559); 
            match(input,Identificador,FOLLOW_Identificador_in_procedure561); 
            match(input,42,FOLLOW_42_in_procedure563); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:113:34: ( parameters )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Identificador||LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:113:34: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_procedure565);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_procedure568); 
            match(input,19,FOLLOW_19_in_procedure570); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:114:3: ( constant | variable )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }
                else if ( (LA20_0==27) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:114:4: constant
            	    {
            	    pushFollow(FOLLOW_constant_in_procedure575);
            	    constant();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:114:15: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_procedure579);
            	    variable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_procedure586); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:116:4: ( statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Identificador||LA21_0==44||(LA21_0>=50 && LA21_0<=51)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:116:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_procedure591);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_procedure596); 
            match(input,Identificador,FOLLOW_Identificador_in_procedure598); 
            match(input,22,FOLLOW_22_in_procedure600); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedure"


    // $ANTLR start "function"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:120:1: function : 'function' Identificador '(' ( parameters )? ')' ':' type '=' ( constant | variable )* 'begin' ( statement | returnStatement )* 'end' Identificador '.' ;
    public final void function() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:121:2: ( 'function' Identificador '(' ( parameters )? ')' ':' type '=' ( constant | variable )* 'begin' ( statement | returnStatement )* 'end' Identificador '.' )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:121:4: 'function' Identificador '(' ( parameters )? ')' ':' type '=' ( constant | variable )* 'begin' ( statement | returnStatement )* 'end' Identificador '.'
            {
            match(input,54,FOLLOW_54_in_function612); 
            match(input,Identificador,FOLLOW_Identificador_in_function614); 
            match(input,42,FOLLOW_42_in_function616); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:121:33: ( parameters )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identificador||LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:121:33: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_function618);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_function621); 
            match(input,24,FOLLOW_24_in_function623); 
            pushFollow(FOLLOW_type_in_function625);
            type();

            state._fsp--;

            match(input,19,FOLLOW_19_in_function627); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:122:3: ( constant | variable )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }
                else if ( (LA23_0==27) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:122:4: constant
            	    {
            	    pushFollow(FOLLOW_constant_in_function632);
            	    constant();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:122:15: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_function636);
            	    variable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_function643); 
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:124:4: ( statement | returnStatement )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Identificador||LA24_0==44||(LA24_0>=50 && LA24_0<=51)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==52) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:124:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function649);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:124:15: returnStatement
            	    {
            	    pushFollow(FOLLOW_returnStatement_in_function651);
            	    returnStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_function657); 
            match(input,Identificador,FOLLOW_Identificador_in_function659); 
            match(input,22,FOLLOW_22_in_function661); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function"


    // $ANTLR start "parameters"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:128:1: parameters : parameter ( ',' parameter )* ;
    public final void parameters() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:129:2: ( parameter ( ',' parameter )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:129:4: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameters674);
            parameter();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:129:14: ( ',' parameter )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:129:15: ',' parameter
            	    {
            	    match(input,28,FOLLOW_28_in_parameters677); 
            	    pushFollow(FOLLOW_parameter_in_parameters679);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
        return ;
    }
    // $ANTLR end "parameters"


    // $ANTLR start "parameter"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:132:1: parameter : ( 'var' )? Identificador ':' type ;
    public final void parameter() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:133:2: ( ( 'var' )? Identificador ':' type )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:133:4: ( 'var' )? Identificador ':' type
            {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:133:4: ( 'var' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:133:4: 'var'
                    {
                    match(input,27,FOLLOW_27_in_parameter693); 

                    }
                    break;

            }

            match(input,Identificador,FOLLOW_Identificador_in_parameter696); 
            match(input,24,FOLLOW_24_in_parameter698); 
            pushFollow(FOLLOW_type_in_parameter700);
            type();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "term"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:136:1: term : ( Identificador | '(' expression ')' | NumeroInteiro | StringLiteral | CharLiteral | Identificador '(' actualParameters ')' );
    public final void term() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:137:2: ( Identificador | '(' expression ')' | NumeroInteiro | StringLiteral | CharLiteral | Identificador '(' actualParameters ')' )
            int alt27=6;
            switch ( input.LA(1) ) {
            case Identificador:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==42) ) {
                    alt27=6;
                }
                else if ( (LA27_1==19||LA27_1==26||LA27_1==28||(LA27_1>=40 && LA27_1<=41)||LA27_1==43||LA27_1==45||LA27_1==50||(LA27_1>=56 && LA27_1<=65)) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt27=2;
                }
                break;
            case NumeroInteiro:
                {
                alt27=3;
                }
                break;
            case StringLiteral:
                {
                alt27=4;
                }
                break;
            case CharLiteral:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:137:4: Identificador
                    {
                    match(input,Identificador,FOLLOW_Identificador_in_term712); 

                    }
                    break;
                case 2 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:138:4: '(' expression ')'
                    {
                    match(input,42,FOLLOW_42_in_term717); 
                    pushFollow(FOLLOW_expression_in_term719);
                    expression();

                    state._fsp--;

                    match(input,43,FOLLOW_43_in_term721); 

                    }
                    break;
                case 3 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:139:4: NumeroInteiro
                    {
                    match(input,NumeroInteiro,FOLLOW_NumeroInteiro_in_term726); 

                    }
                    break;
                case 4 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:140:4: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_term731); 

                    }
                    break;
                case 5 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:141:4: CharLiteral
                    {
                    match(input,CharLiteral,FOLLOW_CharLiteral_in_term736); 

                    }
                    break;
                case 6 :
                    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:142:4: Identificador '(' actualParameters ')'
                    {
                    match(input,Identificador,FOLLOW_Identificador_in_term741); 
                    match(input,42,FOLLOW_42_in_term743); 
                    pushFollow(FOLLOW_actualParameters_in_term745);
                    actualParameters();

                    state._fsp--;

                    match(input,43,FOLLOW_43_in_term747); 

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
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "negation"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:145:1: negation : ( 'not' )* term ;
    public final void negation() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:146:2: ( ( 'not' )* term )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:146:4: ( 'not' )* term
            {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:146:4: ( 'not' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:146:4: 'not'
            	    {
            	    match(input,55,FOLLOW_55_in_negation759); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_negation762);
            term();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "negation"


    // $ANTLR start "unary"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:149:1: unary : ( '+' | '-' )* negation ;
    public final void unary() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:150:2: ( ( '+' | '-' )* negation )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:150:4: ( '+' | '-' )* negation
            {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:150:4: ( '+' | '-' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=56 && LA29_0<=57)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:
            	    {
            	    if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            pushFollow(FOLLOW_negation_in_unary783);
            negation();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unary"


    // $ANTLR start "mult"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:153:1: mult : unary ( ( '*' | '/' | 'mod' ) unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:154:2: ( unary ( ( '*' | '/' | 'mod' ) unary )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:154:4: unary ( ( '*' | '/' | 'mod' ) unary )*
            {
            pushFollow(FOLLOW_unary_in_mult795);
            unary();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:154:10: ( ( '*' | '/' | 'mod' ) unary )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=58 && LA30_0<=60)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:154:11: ( '*' | '/' | 'mod' ) unary
            	    {
            	    if ( (input.LA(1)>=58 && input.LA(1)<=60) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_in_mult810);
            	    unary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
        return ;
    }
    // $ANTLR end "mult"


    // $ANTLR start "add"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:157:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final void add() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:158:2: ( mult ( ( '+' | '-' ) mult )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:158:4: mult ( ( '+' | '-' ) mult )*
            {
            pushFollow(FOLLOW_mult_in_add823);
            mult();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:158:9: ( ( '+' | '-' ) mult )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=56 && LA31_0<=57)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:158:10: ( '+' | '-' ) mult
            	    {
            	    if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mult_in_add834);
            	    mult();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
        return ;
    }
    // $ANTLR end "add"


    // $ANTLR start "relation"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:161:1: relation : add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* ;
    public final void relation() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:162:2: ( add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:162:4: add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            {
            pushFollow(FOLLOW_add_in_relation848);
            add();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:162:8: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19||(LA32_0>=40 && LA32_0<=41)||(LA32_0>=61 && LA32_0<=63)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:162:9: ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add
            	    {
            	    if ( input.LA(1)==19||(input.LA(1)>=40 && input.LA(1)<=41)||(input.LA(1)>=61 && input.LA(1)<=63) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_in_relation876);
            	    add();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "expression"
    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:165:1: expression : relation ( ( 'and' | 'or' ) relation )* ;
    public final void expression() throws RecognitionException {
        try {
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:166:2: ( relation ( ( 'and' | 'or' ) relation )* )
            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:166:4: relation ( ( 'and' | 'or' ) relation )*
            {
            pushFollow(FOLLOW_relation_in_expression890);
            relation();

            state._fsp--;

            // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:166:13: ( ( 'and' | 'or' ) relation )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=64 && LA33_0<=65)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /host/works/Desenvolvimento/Java/workspace/Antlr-Tutorial/src/main/java/br/usp/each/antlr/tutorial/Sample.g:166:14: ( 'and' | 'or' ) relation
            	    {
            	    if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relation_in_expression901);
            	    relation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
        return ;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_18_in_program41 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_program43 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_program45 = new BitSet(new long[]{0x0060000208900000L});
    public static final BitSet FOLLOW_constant_in_program50 = new BitSet(new long[]{0x0060000208900000L});
    public static final BitSet FOLLOW_variable_in_program54 = new BitSet(new long[]{0x0060000208900000L});
    public static final BitSet FOLLOW_function_in_program58 = new BitSet(new long[]{0x0060000208900000L});
    public static final BitSet FOLLOW_procedure_in_program62 = new BitSet(new long[]{0x0060000208900000L});
    public static final BitSet FOLLOW_typeDecl_in_program66 = new BitSet(new long[]{0x0060000208900000L});
    public static final BitSet FOLLOW_20_in_program72 = new BitSet(new long[]{0x000C100000200010L});
    public static final BitSet FOLLOW_statement_in_program76 = new BitSet(new long[]{0x000C100000200010L});
    public static final BitSet FOLLOW_21_in_program81 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_program83 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_program85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_constant96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_constant98 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_constant100 = new BitSet(new long[]{0x00000185E0000010L});
    public static final BitSet FOLLOW_type_in_constant102 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_constant104 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_constant106 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_constant108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_variable121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_variable123 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_variable126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_variable128 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_variable132 = new BitSet(new long[]{0x00000185E0000010L});
    public static final BitSet FOLLOW_type_in_variable134 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_variable137 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_variable139 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_variable143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_type155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_type160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_type165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_type170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpec_in_type175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_type180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_typeSpec192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_typeSpec197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumType_in_typeSpec202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_typeDecl214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_typeDecl216 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_typeDecl218 = new BitSet(new long[]{0x0000018400000000L});
    public static final BitSet FOLLOW_typeSpec_in_typeDecl220 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_typeDecl222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_arrayType235 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_arrayType237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NumeroInteiro_in_arrayType239 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_arrayType241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NumeroInteiro_in_arrayType243 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_arrayType245 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_arrayType247 = new BitSet(new long[]{0x00000185E0000010L});
    public static final BitSet FOLLOW_type_in_arrayType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_recordType261 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_field_in_recordType263 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_recordType266 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_recordType268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_enumType281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_enumType283 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_28_in_enumType286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_enumType288 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_41_in_enumType292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_field305 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_field307 = new BitSet(new long[]{0x00000185E0000010L});
    public static final BitSet FOLLOW_type_in_field309 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_field311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCallStatement_in_statement343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_procedureCallStatement355 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_procedureCallStatement357 = new BitSet(new long[]{0x03800C00000000F0L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCallStatement359 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_procedureCallStatement362 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_procedureCallStatement364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_actualParameters376 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_actualParameters379 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters381 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_44_in_ifStatement395 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement397 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ifStatement399 = new BitSet(new long[]{0x000C100000000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement401 = new BitSet(new long[]{0x000CD00000200010L});
    public static final BitSet FOLLOW_46_in_ifStatement407 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement409 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ifStatement411 = new BitSet(new long[]{0x000C100000000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement413 = new BitSet(new long[]{0x000CD00000200010L});
    public static final BitSet FOLLOW_47_in_ifStatement420 = new BitSet(new long[]{0x000C100000000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement422 = new BitSet(new long[]{0x000C100000200010L});
    public static final BitSet FOLLOW_21_in_ifStatement429 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ifStatement431 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ifStatement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_assignmentStatement446 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assignmentStatement448 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement450 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assignmentStatement452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exitStatement464 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exitStatement466 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_exitStatement468 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_exitStatement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_loopStatement482 = new BitSet(new long[]{0x000D100000200010L});
    public static final BitSet FOLLOW_statement_in_loopStatement485 = new BitSet(new long[]{0x000D100000200010L});
    public static final BitSet FOLLOW_exitStatement_in_loopStatement487 = new BitSet(new long[]{0x000D100000200010L});
    public static final BitSet FOLLOW_21_in_loopStatement494 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_loopStatement496 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_loopStatement498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_whileStatement510 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_whileStatement512 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_whileStatement514 = new BitSet(new long[]{0x000D100000200010L});
    public static final BitSet FOLLOW_statement_in_whileStatement519 = new BitSet(new long[]{0x000D100000200010L});
    public static final BitSet FOLLOW_exitStatement_in_whileStatement521 = new BitSet(new long[]{0x000D100000200010L});
    public static final BitSet FOLLOW_21_in_whileStatement527 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_whileStatement529 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_whileStatement531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_returnStatement543 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_returnStatement545 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_returnStatement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_procedure559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_procedure561 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_procedure563 = new BitSet(new long[]{0x0000080008000010L});
    public static final BitSet FOLLOW_parameters_in_procedure565 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_procedure568 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_procedure570 = new BitSet(new long[]{0x0000000008900000L});
    public static final BitSet FOLLOW_constant_in_procedure575 = new BitSet(new long[]{0x0000000008900000L});
    public static final BitSet FOLLOW_variable_in_procedure579 = new BitSet(new long[]{0x0000000008900000L});
    public static final BitSet FOLLOW_20_in_procedure586 = new BitSet(new long[]{0x000C100000200010L});
    public static final BitSet FOLLOW_statement_in_procedure591 = new BitSet(new long[]{0x000C100000200010L});
    public static final BitSet FOLLOW_21_in_procedure596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_procedure598 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_procedure600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_function612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_function614 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_function616 = new BitSet(new long[]{0x0000080008000010L});
    public static final BitSet FOLLOW_parameters_in_function618 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_function621 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_function623 = new BitSet(new long[]{0x00000185E0000010L});
    public static final BitSet FOLLOW_type_in_function625 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_function627 = new BitSet(new long[]{0x0000000008900000L});
    public static final BitSet FOLLOW_constant_in_function632 = new BitSet(new long[]{0x0000000008900000L});
    public static final BitSet FOLLOW_variable_in_function636 = new BitSet(new long[]{0x0000000008900000L});
    public static final BitSet FOLLOW_20_in_function643 = new BitSet(new long[]{0x001C100000200010L});
    public static final BitSet FOLLOW_statement_in_function649 = new BitSet(new long[]{0x001C100000200010L});
    public static final BitSet FOLLOW_returnStatement_in_function651 = new BitSet(new long[]{0x001C100000200010L});
    public static final BitSet FOLLOW_21_in_function657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_function659 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_function661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters674 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_parameters677 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_parameter_in_parameters679 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_27_in_parameter693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identificador_in_parameter696 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parameter698 = new BitSet(new long[]{0x00000185E0000010L});
    public static final BitSet FOLLOW_type_in_parameter700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_term712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_term717 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_expression_in_term719 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_term721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumeroInteiro_in_term726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_term731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharLiteral_in_term736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identificador_in_term741 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_term743 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_actualParameters_in_term745 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_term747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_negation759 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_term_in_negation762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary774 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_negation_in_unary783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult795 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_set_in_mult798 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_unary_in_mult810 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_mult_in_add823 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_set_in_add826 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_mult_in_add834 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_add_in_relation848 = new BitSet(new long[]{0xE000030000080002L});
    public static final BitSet FOLLOW_set_in_relation851 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_add_in_relation876 = new BitSet(new long[]{0xE000030000080002L});
    public static final BitSet FOLLOW_relation_in_expression890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_expression893 = new BitSet(new long[]{0x03800400000000F0L});
    public static final BitSet FOLLOW_relation_in_expression901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});

}