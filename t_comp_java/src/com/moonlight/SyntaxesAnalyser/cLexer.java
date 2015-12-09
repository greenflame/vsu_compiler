// $ANTLR 3.5.2 c.g 2015-12-06 23:01:11
package com.moonlight.SyntaxesAnalyser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class cLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int ADD=4;
	public static final int ASSIGN=5;
	public static final int BLOCK=6;
	public static final int BOOL_TYPE=7;
	public static final int CALL_PARAMS=8;
	public static final int DEC_INITED=9;
	public static final int DEC_NOT_INITED=10;
	public static final int DEC_PARAM=11;
	public static final int DEC_PARAMS=12;
	public static final int DIV=13;
	public static final int ELSE=14;
	public static final int EQUALS=15;
	public static final int FOR=16;
	public static final int FOR_BODY=17;
	public static final int FOR_COND=18;
	public static final int FOR_INIT=19;
	public static final int FOR_STEP=20;
	public static final int FUNC_BODY=21;
	public static final int FUNC_CALL=22;
	public static final int FUNC_DEC=23;
	public static final int FUNC_ID=24;
	public static final int FUNC_TYPE=25;
	public static final int GE=26;
	public static final int GT=27;
	public static final int ID=28;
	public static final int IF=29;
	public static final int IF_BODY=30;
	public static final int IF_COND=31;
	public static final int IF_ELSE_BODY=32;
	public static final int INT_TYPE=33;
	public static final int LADD=34;
	public static final int LE=35;
	public static final int LMUL=36;
	public static final int LOGIC=37;
	public static final int LT=38;
	public static final int ML_COMMENT=39;
	public static final int MUL=40;
	public static final int NEQUALS=41;
	public static final int NUMBER=42;
	public static final int PROGRAM=43;
	public static final int READ=44;
	public static final int RETURN=45;
	public static final int SL_COMMENT=46;
	public static final int STRING=47;
	public static final int STRING_TYPE=48;
	public static final int SUB=49;
	public static final int VAR_DEC=50;
	public static final int VAR_TYPE=51;
	public static final int VOID_TYPE=52;
	public static final int WRITE=53;
	public static final int WS=54;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public cLexer() {} 
	public cLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public cLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "c.g"; }

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:4:7: ( '(' )
			// c.g:4:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:5:7: ( ')' )
			// c.g:5:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:6:7: ( ',' )
			// c.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:7:7: ( ';' )
			// c.g:7:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:8:7: ( '{' )
			// c.g:8:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:9:7: ( '}' )
			// c.g:9:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:46:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// c.g:46:4: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// c.g:46:4: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 _channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:50:2: ( '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n' )
			// c.g:50:4: '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// c.g:50:9: ( options {greedy=false; } : . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\r') ) {
					alt2=2;
				}
				else if ( (LA2_0=='\n') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// c.g:50:37: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			// c.g:50:41: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// c.g:50:41: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			 _channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	// $ANTLR start "ML_COMMENT"
	public final void mML_COMMENT() throws RecognitionException {
		try {
			int _type = ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:54:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// c.g:54:4: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// c.g:54:9: ( options {greedy=false; } : . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='*') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='/') ) {
						alt4=2;
					}
					else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// c.g:54:37: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match("*/"); 

			 _channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_COMMENT"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:59:5: ( '+' )
			// c.g:59:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:60:5: ( '-' )
			// c.g:60:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:61:5: ( '*' )
			// c.g:61:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:62:5: ( '/' )
			// c.g:62:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LADD"
	public final void mLADD() throws RecognitionException {
		try {
			int _type = LADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:64:6: ( '||' )
			// c.g:64:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LADD"

	// $ANTLR start "LMUL"
	public final void mLMUL() throws RecognitionException {
		try {
			int _type = LMUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:65:6: ( '&&' )
			// c.g:65:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LMUL"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:67:4: ( '>=' )
			// c.g:67:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:68:4: ( '<=' )
			// c.g:68:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "NEQUALS"
	public final void mNEQUALS() throws RecognitionException {
		try {
			int _type = NEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:69:9: ( '!=' )
			// c.g:69:11: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQUALS"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:70:8: ( '==' )
			// c.g:70:10: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:71:4: ( '>' )
			// c.g:71:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:72:4: ( '<' )
			// c.g:72:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:74:8: ( '=' )
			// c.g:74:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:76:4: ( 'if' )
			// c.g:76:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:77:6: ( 'else' )
			// c.g:77:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:79:5: ( 'for' )
			// c.g:79:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:81:6: ( 'read' )
			// c.g:81:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:82:7: ( 'write' )
			// c.g:82:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:84:10: ( 'int' )
			// c.g:84:12: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "BOOL_TYPE"
	public final void mBOOL_TYPE() throws RecognitionException {
		try {
			int _type = BOOL_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:85:11: ( 'bool' )
			// c.g:85:13: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL_TYPE"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:86:13: ( 'string' )
			// c.g:86:15: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:87:11: ( 'void' )
			// c.g:87:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:89:9: ( 'return' )
			// c.g:89:11: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:92:2: ( ( '0' .. '9' )+ )
			// c.g:92:4: ( '0' .. '9' )+
			{
			// c.g:92:4: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "LOGIC"
	public final void mLOGIC() throws RecognitionException {
		try {
			int _type = LOGIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:96:2: ( 'true' | 'false' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='t') ) {
				alt6=1;
			}
			else if ( (LA6_0=='f') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// c.g:96:4: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// c.g:96:13: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGIC"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:100:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// c.g:100:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// c.g:101:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:105:2: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// c.g:105:4: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// c.g:105:8: ( options {greedy=false; } : . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\"') ) {
					alt8=2;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// c.g:105:36: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// c.g:1:8: ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | WS | SL_COMMENT | ML_COMMENT | ADD | SUB | MUL | DIV | LADD | LMUL | GE | LE | NEQUALS | EQUALS | GT | LT | ASSIGN | IF | ELSE | FOR | READ | WRITE | INT_TYPE | BOOL_TYPE | STRING_TYPE | VOID_TYPE | RETURN | NUMBER | LOGIC | ID | STRING )
		int alt9=36;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// c.g:1:10: T__55
				{
				mT__55(); 

				}
				break;
			case 2 :
				// c.g:1:16: T__56
				{
				mT__56(); 

				}
				break;
			case 3 :
				// c.g:1:22: T__57
				{
				mT__57(); 

				}
				break;
			case 4 :
				// c.g:1:28: T__58
				{
				mT__58(); 

				}
				break;
			case 5 :
				// c.g:1:34: T__59
				{
				mT__59(); 

				}
				break;
			case 6 :
				// c.g:1:40: T__60
				{
				mT__60(); 

				}
				break;
			case 7 :
				// c.g:1:46: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// c.g:1:49: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;
			case 9 :
				// c.g:1:60: ML_COMMENT
				{
				mML_COMMENT(); 

				}
				break;
			case 10 :
				// c.g:1:71: ADD
				{
				mADD(); 

				}
				break;
			case 11 :
				// c.g:1:75: SUB
				{
				mSUB(); 

				}
				break;
			case 12 :
				// c.g:1:79: MUL
				{
				mMUL(); 

				}
				break;
			case 13 :
				// c.g:1:83: DIV
				{
				mDIV(); 

				}
				break;
			case 14 :
				// c.g:1:87: LADD
				{
				mLADD(); 

				}
				break;
			case 15 :
				// c.g:1:92: LMUL
				{
				mLMUL(); 

				}
				break;
			case 16 :
				// c.g:1:97: GE
				{
				mGE(); 

				}
				break;
			case 17 :
				// c.g:1:100: LE
				{
				mLE(); 

				}
				break;
			case 18 :
				// c.g:1:103: NEQUALS
				{
				mNEQUALS(); 

				}
				break;
			case 19 :
				// c.g:1:111: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 20 :
				// c.g:1:118: GT
				{
				mGT(); 

				}
				break;
			case 21 :
				// c.g:1:121: LT
				{
				mLT(); 

				}
				break;
			case 22 :
				// c.g:1:124: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 23 :
				// c.g:1:131: IF
				{
				mIF(); 

				}
				break;
			case 24 :
				// c.g:1:134: ELSE
				{
				mELSE(); 

				}
				break;
			case 25 :
				// c.g:1:139: FOR
				{
				mFOR(); 

				}
				break;
			case 26 :
				// c.g:1:143: READ
				{
				mREAD(); 

				}
				break;
			case 27 :
				// c.g:1:148: WRITE
				{
				mWRITE(); 

				}
				break;
			case 28 :
				// c.g:1:154: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 29 :
				// c.g:1:163: BOOL_TYPE
				{
				mBOOL_TYPE(); 

				}
				break;
			case 30 :
				// c.g:1:173: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 31 :
				// c.g:1:185: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 32 :
				// c.g:1:195: RETURN
				{
				mRETURN(); 

				}
				break;
			case 33 :
				// c.g:1:202: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 34 :
				// c.g:1:209: LOGIC
				{
				mLOGIC(); 

				}
				break;
			case 35 :
				// c.g:1:215: ID
				{
				mID(); 

				}
				break;
			case 36 :
				// c.g:1:218: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\10\uffff\1\40\5\uffff\1\42\1\44\1\uffff\1\46\10\34\1\uffff\1\34\13\uffff"+
		"\1\62\12\34\1\uffff\1\76\1\34\1\100\10\34\1\uffff\1\111\1\uffff\1\34\1"+
		"\113\2\34\1\116\1\34\1\120\1\121\1\uffff\1\121\1\uffff\1\34\1\123\1\uffff"+
		"\1\34\2\uffff\1\125\1\uffff\1\126\2\uffff";
	static final String DFA9_eofS =
		"\127\uffff";
	static final String DFA9_minS =
		"\1\11\7\uffff\1\52\5\uffff\2\75\1\uffff\1\75\1\146\1\154\1\141\1\145\1"+
		"\162\1\157\1\164\1\157\1\uffff\1\162\13\uffff\1\60\1\164\1\163\1\162\1"+
		"\154\1\141\1\151\1\157\1\162\1\151\1\165\1\uffff\1\60\1\145\1\60\1\163"+
		"\1\144\1\165\1\164\1\154\1\151\1\144\1\145\1\uffff\1\60\1\uffff\1\145"+
		"\1\60\1\162\1\145\1\60\1\156\2\60\1\uffff\1\60\1\uffff\1\156\1\60\1\uffff"+
		"\1\147\2\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA9_maxS =
		"\1\175\7\uffff\1\57\5\uffff\2\75\1\uffff\1\75\1\156\1\154\1\157\1\145"+
		"\1\162\1\157\1\164\1\157\1\uffff\1\162\13\uffff\1\172\1\164\1\163\1\162"+
		"\1\154\1\164\1\151\1\157\1\162\1\151\1\165\1\uffff\1\172\1\145\1\172\1"+
		"\163\1\144\1\165\1\164\1\154\1\151\1\144\1\145\1\uffff\1\172\1\uffff\1"+
		"\145\1\172\1\162\1\145\1\172\1\156\2\172\1\uffff\1\172\1\uffff\1\156\1"+
		"\172\1\uffff\1\147\2\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\16\1\17"+
		"\2\uffff\1\22\11\uffff\1\41\1\uffff\1\43\1\44\1\10\1\11\1\15\1\20\1\24"+
		"\1\21\1\25\1\23\1\26\13\uffff\1\27\13\uffff\1\34\1\uffff\1\31\10\uffff"+
		"\1\30\1\uffff\1\32\2\uffff\1\35\1\uffff\1\37\1\42\1\uffff\1\33\1\uffff"+
		"\1\40\1\36";
	static final String DFA9_specialS =
		"\127\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\7\1\uffff\2\7\22\uffff\1\7\1\20\1\35\3\uffff\1\15\1\uffff\1\1\1\2"+
			"\1\13\1\11\1\3\1\12\1\uffff\1\10\12\32\1\uffff\1\4\1\17\1\21\1\16\2\uffff"+
			"\32\34\4\uffff\1\34\1\uffff\1\34\1\27\2\34\1\23\1\24\2\34\1\22\10\34"+
			"\1\25\1\30\1\33\1\34\1\31\1\26\3\34\1\5\1\14\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37\4\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"\1\41",
			"\1\43",
			"",
			"\1\45",
			"\1\47\7\uffff\1\50",
			"\1\51",
			"\1\53\15\uffff\1\52",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"",
			"\1\61",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67\22\uffff\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\77",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\112",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\114",
			"\1\115",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\117",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\122",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\124",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | WS | SL_COMMENT | ML_COMMENT | ADD | SUB | MUL | DIV | LADD | LMUL | GE | LE | NEQUALS | EQUALS | GT | LT | ASSIGN | IF | ELSE | FOR | READ | WRITE | INT_TYPE | BOOL_TYPE | STRING_TYPE | VOID_TYPE | RETURN | NUMBER | LOGIC | ID | STRING );";
		}
	}

}
