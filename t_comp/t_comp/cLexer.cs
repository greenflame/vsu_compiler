//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 3.5.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// $ANTLR 3.5.2 c.g 2015-10-19 16:31:32

// The variable 'variable' is assigned but its value is never used.
#pragma warning disable 219
// Unreachable code detected.
#pragma warning disable 162
// Missing XML comment for publicly visible type or member 'Type_or_Member'
#pragma warning disable 1591
// CLS compliance checking will not be performed on 'type' because it is not visible from outside this assembly.
#pragma warning disable 3019


using System.Collections.Generic;
using Antlr.Runtime;
using Antlr.Runtime.Misc;

namespace  t_comp 
{
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "3.5.2")]
[System.CLSCompliant(false)]
public partial class cLexer : Antlr.Runtime.Lexer
{
	public const int EOF=-1;
	public const int T__33=33;
	public const int T__34=34;
	public const int T__35=35;
	public const int T__36=36;
	public const int T__37=37;
	public const int T__38=38;
	public const int ADD=4;
	public const int ASSIGN=5;
	public const int BLOCK=6;
	public const int DIV=7;
	public const int ELSE=8;
	public const int EQUALS=9;
	public const int FOR=10;
	public const int FUNCCALL=11;
	public const int GE=12;
	public const int GT=13;
	public const int ID=14;
	public const int IF=15;
	public const int LADD=16;
	public const int LE=17;
	public const int LMUL=18;
	public const int LOGIC=19;
	public const int LT=20;
	public const int ML_COMMENT=21;
	public const int MUL=22;
	public const int NEQUALS=23;
	public const int NUMBER=24;
	public const int PARAMS=25;
	public const int PROGRAM=26;
	public const int READ=27;
	public const int SL_COMMENT=28;
	public const int STRING=29;
	public const int SUB=30;
	public const int WRITE=31;
	public const int WS=32;

	// delegates
	// delegators

	public cLexer()
	{
		OnCreated();
	}

	public cLexer(ICharStream input )
		: this(input, new RecognizerSharedState())
	{
	}

	public cLexer(ICharStream input, RecognizerSharedState state)
		: base(input, state)
	{

		OnCreated();
	}
	public override string GrammarFileName { get { return "c.g"; } }


	partial void OnCreated();
	partial void EnterRule(string ruleName, int ruleIndex);
	partial void LeaveRule(string ruleName, int ruleIndex);

	partial void EnterRule_T__33();
	partial void LeaveRule_T__33();

	// $ANTLR start "T__33"
	[GrammarRule("T__33")]
	private void mT__33()
	{
		EnterRule_T__33();
		EnterRule("T__33", 1);
		TraceIn("T__33", 1);
		try
		{
			int _type = T__33;
			int _channel = DefaultTokenChannel;
			// c.g:9:7: ( '(' )
			DebugEnterAlt(1);
			// c.g:9:9: '('
			{
			DebugLocation(9, 9);
			Match('('); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__33", 1);
			LeaveRule("T__33", 1);
			LeaveRule_T__33();
		}
	}
	// $ANTLR end "T__33"

	partial void EnterRule_T__34();
	partial void LeaveRule_T__34();

	// $ANTLR start "T__34"
	[GrammarRule("T__34")]
	private void mT__34()
	{
		EnterRule_T__34();
		EnterRule("T__34", 2);
		TraceIn("T__34", 2);
		try
		{
			int _type = T__34;
			int _channel = DefaultTokenChannel;
			// c.g:10:7: ( ')' )
			DebugEnterAlt(1);
			// c.g:10:9: ')'
			{
			DebugLocation(10, 9);
			Match(')'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__34", 2);
			LeaveRule("T__34", 2);
			LeaveRule_T__34();
		}
	}
	// $ANTLR end "T__34"

	partial void EnterRule_T__35();
	partial void LeaveRule_T__35();

	// $ANTLR start "T__35"
	[GrammarRule("T__35")]
	private void mT__35()
	{
		EnterRule_T__35();
		EnterRule("T__35", 3);
		TraceIn("T__35", 3);
		try
		{
			int _type = T__35;
			int _channel = DefaultTokenChannel;
			// c.g:11:7: ( ',' )
			DebugEnterAlt(1);
			// c.g:11:9: ','
			{
			DebugLocation(11, 9);
			Match(','); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__35", 3);
			LeaveRule("T__35", 3);
			LeaveRule_T__35();
		}
	}
	// $ANTLR end "T__35"

	partial void EnterRule_T__36();
	partial void LeaveRule_T__36();

	// $ANTLR start "T__36"
	[GrammarRule("T__36")]
	private void mT__36()
	{
		EnterRule_T__36();
		EnterRule("T__36", 4);
		TraceIn("T__36", 4);
		try
		{
			int _type = T__36;
			int _channel = DefaultTokenChannel;
			// c.g:12:7: ( ';' )
			DebugEnterAlt(1);
			// c.g:12:9: ';'
			{
			DebugLocation(12, 9);
			Match(';'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__36", 4);
			LeaveRule("T__36", 4);
			LeaveRule_T__36();
		}
	}
	// $ANTLR end "T__36"

	partial void EnterRule_T__37();
	partial void LeaveRule_T__37();

	// $ANTLR start "T__37"
	[GrammarRule("T__37")]
	private void mT__37()
	{
		EnterRule_T__37();
		EnterRule("T__37", 5);
		TraceIn("T__37", 5);
		try
		{
			int _type = T__37;
			int _channel = DefaultTokenChannel;
			// c.g:13:7: ( '{' )
			DebugEnterAlt(1);
			// c.g:13:9: '{'
			{
			DebugLocation(13, 9);
			Match('{'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__37", 5);
			LeaveRule("T__37", 5);
			LeaveRule_T__37();
		}
	}
	// $ANTLR end "T__37"

	partial void EnterRule_T__38();
	partial void LeaveRule_T__38();

	// $ANTLR start "T__38"
	[GrammarRule("T__38")]
	private void mT__38()
	{
		EnterRule_T__38();
		EnterRule("T__38", 6);
		TraceIn("T__38", 6);
		try
		{
			int _type = T__38;
			int _channel = DefaultTokenChannel;
			// c.g:14:7: ( '}' )
			DebugEnterAlt(1);
			// c.g:14:9: '}'
			{
			DebugLocation(14, 9);
			Match('}'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__38", 6);
			LeaveRule("T__38", 6);
			LeaveRule_T__38();
		}
	}
	// $ANTLR end "T__38"

	partial void EnterRule_WS();
	partial void LeaveRule_WS();

	// $ANTLR start "WS"
	[GrammarRule("WS")]
	private void mWS()
	{
		EnterRule_WS();
		EnterRule("WS", 7);
		TraceIn("WS", 7);
		try
		{
			int _type = WS;
			int _channel = DefaultTokenChannel;
			// c.g:25:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			DebugEnterAlt(1);
			// c.g:25:4: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			DebugLocation(25, 4);
			// c.g:25:4: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt1=0;
			try { DebugEnterSubRule(1);
			while (true)
			{
				int alt1=2;
				try { DebugEnterDecision(1, false);
				int LA1_1 = input.LA(1);

				if (((LA1_1>='\t' && LA1_1<='\n')||(LA1_1>='\f' && LA1_1<='\r')||LA1_1==' '))
				{
					alt1 = 1;
				}


				} finally { DebugExitDecision(1); }
				switch (alt1)
				{
				case 1:
					DebugEnterAlt(1);
					// c.g:
					{
					DebugLocation(25, 4);
					input.Consume();


					}
					break;

				default:
					if (cnt1 >= 1)
						goto loop1;

					EarlyExitException eee1 = new EarlyExitException( 1, input );
					DebugRecognitionException(eee1);
					throw eee1;
				}
				cnt1++;
			}
			loop1:
				;

			} finally { DebugExitSubRule(1); }

			DebugLocation(25, 42);
			 _channel=Hidden; 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("WS", 7);
			LeaveRule("WS", 7);
			LeaveRule_WS();
		}
	}
	// $ANTLR end "WS"

	partial void EnterRule_SL_COMMENT();
	partial void LeaveRule_SL_COMMENT();

	// $ANTLR start "SL_COMMENT"
	[GrammarRule("SL_COMMENT")]
	private void mSL_COMMENT()
	{
		EnterRule_SL_COMMENT();
		EnterRule("SL_COMMENT", 8);
		TraceIn("SL_COMMENT", 8);
		try
		{
			int _type = SL_COMMENT;
			int _channel = DefaultTokenChannel;
			// c.g:29:2: ( '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n' )
			DebugEnterAlt(1);
			// c.g:29:4: '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n'
			{
			DebugLocation(29, 4);
			Match("//"); 

			DebugLocation(29, 9);
			// c.g:29:9: ( options {greedy=false; } : . )*
			try { DebugEnterSubRule(2);
			while (true)
			{
				int alt2=2;
				try { DebugEnterDecision(2, false);
				int LA2_1 = input.LA(1);

				if ((LA2_1=='\r'))
				{
					alt2 = 2;
				}
				else if ((LA2_1=='\n'))
				{
					alt2 = 2;
				}
				else if (((LA2_1>='\u0000' && LA2_1<='\t')||(LA2_1>='\u000B' && LA2_1<='\f')||(LA2_1>='\u000E' && LA2_1<='\uFFFF')))
				{
					alt2 = 1;
				}


				} finally { DebugExitDecision(2); }
				switch ( alt2 )
				{
				case 1:
					DebugEnterAlt(1);
					// c.g:29:37: .
					{
					DebugLocation(29, 37);
					MatchAny(); 

					}
					break;

				default:
					goto loop2;
				}
			}

			loop2:
				;

			} finally { DebugExitSubRule(2); }

			DebugLocation(29, 41);
			// c.g:29:41: ( '\\r' )?
			int alt3=2;
			try { DebugEnterSubRule(3);
			try { DebugEnterDecision(3, false);
			int LA3_1 = input.LA(1);

			if ((LA3_1=='\r'))
			{
				alt3 = 1;
			}
			} finally { DebugExitDecision(3); }
			switch (alt3)
			{
			case 1:
				DebugEnterAlt(1);
				// c.g:29:41: '\\r'
				{
				DebugLocation(29, 41);
				Match('\r'); 

				}
				break;

			}
			} finally { DebugExitSubRule(3); }

			DebugLocation(29, 47);
			Match('\n'); 
			DebugLocation(29, 52);
			 _channel=Hidden; 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("SL_COMMENT", 8);
			LeaveRule("SL_COMMENT", 8);
			LeaveRule_SL_COMMENT();
		}
	}
	// $ANTLR end "SL_COMMENT"

	partial void EnterRule_ML_COMMENT();
	partial void LeaveRule_ML_COMMENT();

	// $ANTLR start "ML_COMMENT"
	[GrammarRule("ML_COMMENT")]
	private void mML_COMMENT()
	{
		EnterRule_ML_COMMENT();
		EnterRule("ML_COMMENT", 9);
		TraceIn("ML_COMMENT", 9);
		try
		{
			int _type = ML_COMMENT;
			int _channel = DefaultTokenChannel;
			// c.g:33:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
			DebugEnterAlt(1);
			// c.g:33:4: '/*' ( options {greedy=false; } : . )* '*/'
			{
			DebugLocation(33, 4);
			Match("/*"); 

			DebugLocation(33, 9);
			// c.g:33:9: ( options {greedy=false; } : . )*
			try { DebugEnterSubRule(4);
			while (true)
			{
				int alt4=2;
				try { DebugEnterDecision(4, false);
				int LA4_1 = input.LA(1);

				if ((LA4_1=='*'))
				{
					int LA4_2 = input.LA(2);

					if ((LA4_2=='/'))
					{
						alt4 = 2;
					}
					else if (((LA4_2>='\u0000' && LA4_2<='.')||(LA4_2>='0' && LA4_2<='\uFFFF')))
					{
						alt4 = 1;
					}


				}
				else if (((LA4_1>='\u0000' && LA4_1<=')')||(LA4_1>='+' && LA4_1<='\uFFFF')))
				{
					alt4 = 1;
				}


				} finally { DebugExitDecision(4); }
				switch ( alt4 )
				{
				case 1:
					DebugEnterAlt(1);
					// c.g:33:37: .
					{
					DebugLocation(33, 37);
					MatchAny(); 

					}
					break;

				default:
					goto loop4;
				}
			}

			loop4:
				;

			} finally { DebugExitSubRule(4); }

			DebugLocation(33, 41);
			Match("*/"); 

			DebugLocation(33, 46);
			 _channel=Hidden; 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("ML_COMMENT", 9);
			LeaveRule("ML_COMMENT", 9);
			LeaveRule_ML_COMMENT();
		}
	}
	// $ANTLR end "ML_COMMENT"

	partial void EnterRule_ADD();
	partial void LeaveRule_ADD();

	// $ANTLR start "ADD"
	[GrammarRule("ADD")]
	private void mADD()
	{
		EnterRule_ADD();
		EnterRule("ADD", 10);
		TraceIn("ADD", 10);
		try
		{
			int _type = ADD;
			int _channel = DefaultTokenChannel;
			// c.g:38:5: ( '+' )
			DebugEnterAlt(1);
			// c.g:38:7: '+'
			{
			DebugLocation(38, 7);
			Match('+'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("ADD", 10);
			LeaveRule("ADD", 10);
			LeaveRule_ADD();
		}
	}
	// $ANTLR end "ADD"

	partial void EnterRule_SUB();
	partial void LeaveRule_SUB();

	// $ANTLR start "SUB"
	[GrammarRule("SUB")]
	private void mSUB()
	{
		EnterRule_SUB();
		EnterRule("SUB", 11);
		TraceIn("SUB", 11);
		try
		{
			int _type = SUB;
			int _channel = DefaultTokenChannel;
			// c.g:39:5: ( '-' )
			DebugEnterAlt(1);
			// c.g:39:7: '-'
			{
			DebugLocation(39, 7);
			Match('-'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("SUB", 11);
			LeaveRule("SUB", 11);
			LeaveRule_SUB();
		}
	}
	// $ANTLR end "SUB"

	partial void EnterRule_MUL();
	partial void LeaveRule_MUL();

	// $ANTLR start "MUL"
	[GrammarRule("MUL")]
	private void mMUL()
	{
		EnterRule_MUL();
		EnterRule("MUL", 12);
		TraceIn("MUL", 12);
		try
		{
			int _type = MUL;
			int _channel = DefaultTokenChannel;
			// c.g:40:5: ( '*' )
			DebugEnterAlt(1);
			// c.g:40:7: '*'
			{
			DebugLocation(40, 7);
			Match('*'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("MUL", 12);
			LeaveRule("MUL", 12);
			LeaveRule_MUL();
		}
	}
	// $ANTLR end "MUL"

	partial void EnterRule_DIV();
	partial void LeaveRule_DIV();

	// $ANTLR start "DIV"
	[GrammarRule("DIV")]
	private void mDIV()
	{
		EnterRule_DIV();
		EnterRule("DIV", 13);
		TraceIn("DIV", 13);
		try
		{
			int _type = DIV;
			int _channel = DefaultTokenChannel;
			// c.g:41:5: ( '/' )
			DebugEnterAlt(1);
			// c.g:41:7: '/'
			{
			DebugLocation(41, 7);
			Match('/'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("DIV", 13);
			LeaveRule("DIV", 13);
			LeaveRule_DIV();
		}
	}
	// $ANTLR end "DIV"

	partial void EnterRule_LADD();
	partial void LeaveRule_LADD();

	// $ANTLR start "LADD"
	[GrammarRule("LADD")]
	private void mLADD()
	{
		EnterRule_LADD();
		EnterRule("LADD", 14);
		TraceIn("LADD", 14);
		try
		{
			int _type = LADD;
			int _channel = DefaultTokenChannel;
			// c.g:43:6: ( '||' )
			DebugEnterAlt(1);
			// c.g:43:8: '||'
			{
			DebugLocation(43, 8);
			Match("||"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("LADD", 14);
			LeaveRule("LADD", 14);
			LeaveRule_LADD();
		}
	}
	// $ANTLR end "LADD"

	partial void EnterRule_LMUL();
	partial void LeaveRule_LMUL();

	// $ANTLR start "LMUL"
	[GrammarRule("LMUL")]
	private void mLMUL()
	{
		EnterRule_LMUL();
		EnterRule("LMUL", 15);
		TraceIn("LMUL", 15);
		try
		{
			int _type = LMUL;
			int _channel = DefaultTokenChannel;
			// c.g:44:6: ( '&&' )
			DebugEnterAlt(1);
			// c.g:44:8: '&&'
			{
			DebugLocation(44, 8);
			Match("&&"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("LMUL", 15);
			LeaveRule("LMUL", 15);
			LeaveRule_LMUL();
		}
	}
	// $ANTLR end "LMUL"

	partial void EnterRule_GE();
	partial void LeaveRule_GE();

	// $ANTLR start "GE"
	[GrammarRule("GE")]
	private void mGE()
	{
		EnterRule_GE();
		EnterRule("GE", 16);
		TraceIn("GE", 16);
		try
		{
			int _type = GE;
			int _channel = DefaultTokenChannel;
			// c.g:46:4: ( '>=' )
			DebugEnterAlt(1);
			// c.g:46:6: '>='
			{
			DebugLocation(46, 6);
			Match(">="); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("GE", 16);
			LeaveRule("GE", 16);
			LeaveRule_GE();
		}
	}
	// $ANTLR end "GE"

	partial void EnterRule_LE();
	partial void LeaveRule_LE();

	// $ANTLR start "LE"
	[GrammarRule("LE")]
	private void mLE()
	{
		EnterRule_LE();
		EnterRule("LE", 17);
		TraceIn("LE", 17);
		try
		{
			int _type = LE;
			int _channel = DefaultTokenChannel;
			// c.g:47:4: ( '<=' )
			DebugEnterAlt(1);
			// c.g:47:6: '<='
			{
			DebugLocation(47, 6);
			Match("<="); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("LE", 17);
			LeaveRule("LE", 17);
			LeaveRule_LE();
		}
	}
	// $ANTLR end "LE"

	partial void EnterRule_NEQUALS();
	partial void LeaveRule_NEQUALS();

	// $ANTLR start "NEQUALS"
	[GrammarRule("NEQUALS")]
	private void mNEQUALS()
	{
		EnterRule_NEQUALS();
		EnterRule("NEQUALS", 18);
		TraceIn("NEQUALS", 18);
		try
		{
			int _type = NEQUALS;
			int _channel = DefaultTokenChannel;
			// c.g:48:9: ( '!=' )
			DebugEnterAlt(1);
			// c.g:48:11: '!='
			{
			DebugLocation(48, 11);
			Match("!="); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("NEQUALS", 18);
			LeaveRule("NEQUALS", 18);
			LeaveRule_NEQUALS();
		}
	}
	// $ANTLR end "NEQUALS"

	partial void EnterRule_EQUALS();
	partial void LeaveRule_EQUALS();

	// $ANTLR start "EQUALS"
	[GrammarRule("EQUALS")]
	private void mEQUALS()
	{
		EnterRule_EQUALS();
		EnterRule("EQUALS", 19);
		TraceIn("EQUALS", 19);
		try
		{
			int _type = EQUALS;
			int _channel = DefaultTokenChannel;
			// c.g:49:8: ( '==' )
			DebugEnterAlt(1);
			// c.g:49:10: '=='
			{
			DebugLocation(49, 10);
			Match("=="); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("EQUALS", 19);
			LeaveRule("EQUALS", 19);
			LeaveRule_EQUALS();
		}
	}
	// $ANTLR end "EQUALS"

	partial void EnterRule_GT();
	partial void LeaveRule_GT();

	// $ANTLR start "GT"
	[GrammarRule("GT")]
	private void mGT()
	{
		EnterRule_GT();
		EnterRule("GT", 20);
		TraceIn("GT", 20);
		try
		{
			int _type = GT;
			int _channel = DefaultTokenChannel;
			// c.g:50:4: ( '>' )
			DebugEnterAlt(1);
			// c.g:50:6: '>'
			{
			DebugLocation(50, 6);
			Match('>'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("GT", 20);
			LeaveRule("GT", 20);
			LeaveRule_GT();
		}
	}
	// $ANTLR end "GT"

	partial void EnterRule_LT();
	partial void LeaveRule_LT();

	// $ANTLR start "LT"
	[GrammarRule("LT")]
	private void mLT()
	{
		EnterRule_LT();
		EnterRule("LT", 21);
		TraceIn("LT", 21);
		try
		{
			int _type = LT;
			int _channel = DefaultTokenChannel;
			// c.g:51:4: ( '<' )
			DebugEnterAlt(1);
			// c.g:51:6: '<'
			{
			DebugLocation(51, 6);
			Match('<'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("LT", 21);
			LeaveRule("LT", 21);
			LeaveRule_LT();
		}
	}
	// $ANTLR end "LT"

	partial void EnterRule_ASSIGN();
	partial void LeaveRule_ASSIGN();

	// $ANTLR start "ASSIGN"
	[GrammarRule("ASSIGN")]
	private void mASSIGN()
	{
		EnterRule_ASSIGN();
		EnterRule("ASSIGN", 22);
		TraceIn("ASSIGN", 22);
		try
		{
			int _type = ASSIGN;
			int _channel = DefaultTokenChannel;
			// c.g:53:8: ( '=' )
			DebugEnterAlt(1);
			// c.g:53:10: '='
			{
			DebugLocation(53, 10);
			Match('='); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("ASSIGN", 22);
			LeaveRule("ASSIGN", 22);
			LeaveRule_ASSIGN();
		}
	}
	// $ANTLR end "ASSIGN"

	partial void EnterRule_IF();
	partial void LeaveRule_IF();

	// $ANTLR start "IF"
	[GrammarRule("IF")]
	private void mIF()
	{
		EnterRule_IF();
		EnterRule("IF", 23);
		TraceIn("IF", 23);
		try
		{
			int _type = IF;
			int _channel = DefaultTokenChannel;
			// c.g:55:4: ( 'if' )
			DebugEnterAlt(1);
			// c.g:55:6: 'if'
			{
			DebugLocation(55, 6);
			Match("if"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("IF", 23);
			LeaveRule("IF", 23);
			LeaveRule_IF();
		}
	}
	// $ANTLR end "IF"

	partial void EnterRule_ELSE();
	partial void LeaveRule_ELSE();

	// $ANTLR start "ELSE"
	[GrammarRule("ELSE")]
	private void mELSE()
	{
		EnterRule_ELSE();
		EnterRule("ELSE", 24);
		TraceIn("ELSE", 24);
		try
		{
			int _type = ELSE;
			int _channel = DefaultTokenChannel;
			// c.g:56:6: ( 'else' )
			DebugEnterAlt(1);
			// c.g:56:8: 'else'
			{
			DebugLocation(56, 8);
			Match("else"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("ELSE", 24);
			LeaveRule("ELSE", 24);
			LeaveRule_ELSE();
		}
	}
	// $ANTLR end "ELSE"

	partial void EnterRule_FOR();
	partial void LeaveRule_FOR();

	// $ANTLR start "FOR"
	[GrammarRule("FOR")]
	private void mFOR()
	{
		EnterRule_FOR();
		EnterRule("FOR", 25);
		TraceIn("FOR", 25);
		try
		{
			int _type = FOR;
			int _channel = DefaultTokenChannel;
			// c.g:58:5: ( 'for' )
			DebugEnterAlt(1);
			// c.g:58:7: 'for'
			{
			DebugLocation(58, 7);
			Match("for"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("FOR", 25);
			LeaveRule("FOR", 25);
			LeaveRule_FOR();
		}
	}
	// $ANTLR end "FOR"

	partial void EnterRule_READ();
	partial void LeaveRule_READ();

	// $ANTLR start "READ"
	[GrammarRule("READ")]
	private void mREAD()
	{
		EnterRule_READ();
		EnterRule("READ", 26);
		TraceIn("READ", 26);
		try
		{
			int _type = READ;
			int _channel = DefaultTokenChannel;
			// c.g:60:6: ( 'read' )
			DebugEnterAlt(1);
			// c.g:60:8: 'read'
			{
			DebugLocation(60, 8);
			Match("read"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("READ", 26);
			LeaveRule("READ", 26);
			LeaveRule_READ();
		}
	}
	// $ANTLR end "READ"

	partial void EnterRule_WRITE();
	partial void LeaveRule_WRITE();

	// $ANTLR start "WRITE"
	[GrammarRule("WRITE")]
	private void mWRITE()
	{
		EnterRule_WRITE();
		EnterRule("WRITE", 27);
		TraceIn("WRITE", 27);
		try
		{
			int _type = WRITE;
			int _channel = DefaultTokenChannel;
			// c.g:61:7: ( 'write' )
			DebugEnterAlt(1);
			// c.g:61:9: 'write'
			{
			DebugLocation(61, 9);
			Match("write"); 


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("WRITE", 27);
			LeaveRule("WRITE", 27);
			LeaveRule_WRITE();
		}
	}
	// $ANTLR end "WRITE"

	partial void EnterRule_NUMBER();
	partial void LeaveRule_NUMBER();

	// $ANTLR start "NUMBER"
	[GrammarRule("NUMBER")]
	private void mNUMBER()
	{
		EnterRule_NUMBER();
		EnterRule("NUMBER", 28);
		TraceIn("NUMBER", 28);
		try
		{
			int _type = NUMBER;
			int _channel = DefaultTokenChannel;
			// c.g:64:2: ( ( '0' .. '9' )+ )
			DebugEnterAlt(1);
			// c.g:64:4: ( '0' .. '9' )+
			{
			DebugLocation(64, 4);
			// c.g:64:4: ( '0' .. '9' )+
			int cnt5=0;
			try { DebugEnterSubRule(5);
			while (true)
			{
				int alt5=2;
				try { DebugEnterDecision(5, false);
				int LA5_1 = input.LA(1);

				if (((LA5_1>='0' && LA5_1<='9')))
				{
					alt5 = 1;
				}


				} finally { DebugExitDecision(5); }
				switch (alt5)
				{
				case 1:
					DebugEnterAlt(1);
					// c.g:
					{
					DebugLocation(64, 4);
					input.Consume();


					}
					break;

				default:
					if (cnt5 >= 1)
						goto loop5;

					EarlyExitException eee5 = new EarlyExitException( 5, input );
					DebugRecognitionException(eee5);
					throw eee5;
				}
				cnt5++;
			}
			loop5:
				;

			} finally { DebugExitSubRule(5); }


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("NUMBER", 28);
			LeaveRule("NUMBER", 28);
			LeaveRule_NUMBER();
		}
	}
	// $ANTLR end "NUMBER"

	partial void EnterRule_LOGIC();
	partial void LeaveRule_LOGIC();

	// $ANTLR start "LOGIC"
	[GrammarRule("LOGIC")]
	private void mLOGIC()
	{
		EnterRule_LOGIC();
		EnterRule("LOGIC", 29);
		TraceIn("LOGIC", 29);
		try
		{
			int _type = LOGIC;
			int _channel = DefaultTokenChannel;
			// c.g:68:2: ( 'true' | 'false' )
			int alt6=2;
			try { DebugEnterDecision(6, false);
			int LA6_1 = input.LA(1);

			if ((LA6_1=='t'))
			{
				alt6 = 1;
			}
			else if ((LA6_1=='f'))
			{
				alt6 = 2;
			}
			else
			{
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input, 1);
				DebugRecognitionException(nvae);
				throw nvae;
			}
			} finally { DebugExitDecision(6); }
			switch (alt6)
			{
			case 1:
				DebugEnterAlt(1);
				// c.g:68:4: 'true'
				{
				DebugLocation(68, 4);
				Match("true"); 


				}
				break;
			case 2:
				DebugEnterAlt(2);
				// c.g:68:13: 'false'
				{
				DebugLocation(68, 13);
				Match("false"); 


				}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("LOGIC", 29);
			LeaveRule("LOGIC", 29);
			LeaveRule_LOGIC();
		}
	}
	// $ANTLR end "LOGIC"

	partial void EnterRule_ID();
	partial void LeaveRule_ID();

	// $ANTLR start "ID"
	[GrammarRule("ID")]
	private void mID()
	{
		EnterRule_ID();
		EnterRule("ID", 30);
		TraceIn("ID", 30);
		try
		{
			int _type = ID;
			int _channel = DefaultTokenChannel;
			// c.g:72:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			DebugEnterAlt(1);
			// c.g:72:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			DebugLocation(72, 4);
			if ((input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z'))
			{
				input.Consume();
			}
			else
			{
				MismatchedSetException mse = new MismatchedSetException(null,input);
				DebugRecognitionException(mse);
				Recover(mse);
				throw mse;
			}

			DebugLocation(73, 3);
			// c.g:73:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			try { DebugEnterSubRule(7);
			while (true)
			{
				int alt7=2;
				try { DebugEnterDecision(7, false);
				int LA7_1 = input.LA(1);

				if (((LA7_1>='0' && LA7_1<='9')||(LA7_1>='A' && LA7_1<='Z')||LA7_1=='_'||(LA7_1>='a' && LA7_1<='z')))
				{
					alt7 = 1;
				}


				} finally { DebugExitDecision(7); }
				switch ( alt7 )
				{
				case 1:
					DebugEnterAlt(1);
					// c.g:
					{
					DebugLocation(73, 3);
					input.Consume();


					}
					break;

				default:
					goto loop7;
				}
			}

			loop7:
				;

			} finally { DebugExitSubRule(7); }


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("ID", 30);
			LeaveRule("ID", 30);
			LeaveRule_ID();
		}
	}
	// $ANTLR end "ID"

	partial void EnterRule_STRING();
	partial void LeaveRule_STRING();

	// $ANTLR start "STRING"
	[GrammarRule("STRING")]
	private void mSTRING()
	{
		EnterRule_STRING();
		EnterRule("STRING", 31);
		TraceIn("STRING", 31);
		try
		{
			int _type = STRING;
			int _channel = DefaultTokenChannel;
			// c.g:77:2: ( '\"' ( options {greedy=false; } : . )* '\"' )
			DebugEnterAlt(1);
			// c.g:77:4: '\"' ( options {greedy=false; } : . )* '\"'
			{
			DebugLocation(77, 4);
			Match('\"'); 
			DebugLocation(77, 8);
			// c.g:77:8: ( options {greedy=false; } : . )*
			try { DebugEnterSubRule(8);
			while (true)
			{
				int alt8=2;
				try { DebugEnterDecision(8, false);
				int LA8_1 = input.LA(1);

				if ((LA8_1=='\"'))
				{
					alt8 = 2;
				}
				else if (((LA8_1>='\u0000' && LA8_1<='!')||(LA8_1>='#' && LA8_1<='\uFFFF')))
				{
					alt8 = 1;
				}


				} finally { DebugExitDecision(8); }
				switch ( alt8 )
				{
				case 1:
					DebugEnterAlt(1);
					// c.g:77:36: .
					{
					DebugLocation(77, 36);
					MatchAny(); 

					}
					break;

				default:
					goto loop8;
				}
			}

			loop8:
				;

			} finally { DebugExitSubRule(8); }

			DebugLocation(77, 40);
			Match('\"'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("STRING", 31);
			LeaveRule("STRING", 31);
			LeaveRule_STRING();
		}
	}
	// $ANTLR end "STRING"

	public override void mTokens()
	{
		// c.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | WS | SL_COMMENT | ML_COMMENT | ADD | SUB | MUL | DIV | LADD | LMUL | GE | LE | NEQUALS | EQUALS | GT | LT | ASSIGN | IF | ELSE | FOR | READ | WRITE | NUMBER | LOGIC | ID | STRING )
		int alt9=31;
		try { DebugEnterDecision(9, false);
		try
		{
			alt9 = dfa9.Predict(input);
		}
		catch (NoViableAltException nvae)
		{
			DebugRecognitionException(nvae);
			throw;
		}
		} finally { DebugExitDecision(9); }
		switch (alt9)
		{
		case 1:
			DebugEnterAlt(1);
			// c.g:1:10: T__33
			{
			DebugLocation(1, 10);
			mT__33(); 

			}
			break;
		case 2:
			DebugEnterAlt(2);
			// c.g:1:16: T__34
			{
			DebugLocation(1, 16);
			mT__34(); 

			}
			break;
		case 3:
			DebugEnterAlt(3);
			// c.g:1:22: T__35
			{
			DebugLocation(1, 22);
			mT__35(); 

			}
			break;
		case 4:
			DebugEnterAlt(4);
			// c.g:1:28: T__36
			{
			DebugLocation(1, 28);
			mT__36(); 

			}
			break;
		case 5:
			DebugEnterAlt(5);
			// c.g:1:34: T__37
			{
			DebugLocation(1, 34);
			mT__37(); 

			}
			break;
		case 6:
			DebugEnterAlt(6);
			// c.g:1:40: T__38
			{
			DebugLocation(1, 40);
			mT__38(); 

			}
			break;
		case 7:
			DebugEnterAlt(7);
			// c.g:1:46: WS
			{
			DebugLocation(1, 46);
			mWS(); 

			}
			break;
		case 8:
			DebugEnterAlt(8);
			// c.g:1:49: SL_COMMENT
			{
			DebugLocation(1, 49);
			mSL_COMMENT(); 

			}
			break;
		case 9:
			DebugEnterAlt(9);
			// c.g:1:60: ML_COMMENT
			{
			DebugLocation(1, 60);
			mML_COMMENT(); 

			}
			break;
		case 10:
			DebugEnterAlt(10);
			// c.g:1:71: ADD
			{
			DebugLocation(1, 71);
			mADD(); 

			}
			break;
		case 11:
			DebugEnterAlt(11);
			// c.g:1:75: SUB
			{
			DebugLocation(1, 75);
			mSUB(); 

			}
			break;
		case 12:
			DebugEnterAlt(12);
			// c.g:1:79: MUL
			{
			DebugLocation(1, 79);
			mMUL(); 

			}
			break;
		case 13:
			DebugEnterAlt(13);
			// c.g:1:83: DIV
			{
			DebugLocation(1, 83);
			mDIV(); 

			}
			break;
		case 14:
			DebugEnterAlt(14);
			// c.g:1:87: LADD
			{
			DebugLocation(1, 87);
			mLADD(); 

			}
			break;
		case 15:
			DebugEnterAlt(15);
			// c.g:1:92: LMUL
			{
			DebugLocation(1, 92);
			mLMUL(); 

			}
			break;
		case 16:
			DebugEnterAlt(16);
			// c.g:1:97: GE
			{
			DebugLocation(1, 97);
			mGE(); 

			}
			break;
		case 17:
			DebugEnterAlt(17);
			// c.g:1:100: LE
			{
			DebugLocation(1, 100);
			mLE(); 

			}
			break;
		case 18:
			DebugEnterAlt(18);
			// c.g:1:103: NEQUALS
			{
			DebugLocation(1, 103);
			mNEQUALS(); 

			}
			break;
		case 19:
			DebugEnterAlt(19);
			// c.g:1:111: EQUALS
			{
			DebugLocation(1, 111);
			mEQUALS(); 

			}
			break;
		case 20:
			DebugEnterAlt(20);
			// c.g:1:118: GT
			{
			DebugLocation(1, 118);
			mGT(); 

			}
			break;
		case 21:
			DebugEnterAlt(21);
			// c.g:1:121: LT
			{
			DebugLocation(1, 121);
			mLT(); 

			}
			break;
		case 22:
			DebugEnterAlt(22);
			// c.g:1:124: ASSIGN
			{
			DebugLocation(1, 124);
			mASSIGN(); 

			}
			break;
		case 23:
			DebugEnterAlt(23);
			// c.g:1:131: IF
			{
			DebugLocation(1, 131);
			mIF(); 

			}
			break;
		case 24:
			DebugEnterAlt(24);
			// c.g:1:134: ELSE
			{
			DebugLocation(1, 134);
			mELSE(); 

			}
			break;
		case 25:
			DebugEnterAlt(25);
			// c.g:1:139: FOR
			{
			DebugLocation(1, 139);
			mFOR(); 

			}
			break;
		case 26:
			DebugEnterAlt(26);
			// c.g:1:143: READ
			{
			DebugLocation(1, 143);
			mREAD(); 

			}
			break;
		case 27:
			DebugEnterAlt(27);
			// c.g:1:148: WRITE
			{
			DebugLocation(1, 148);
			mWRITE(); 

			}
			break;
		case 28:
			DebugEnterAlt(28);
			// c.g:1:154: NUMBER
			{
			DebugLocation(1, 154);
			mNUMBER(); 

			}
			break;
		case 29:
			DebugEnterAlt(29);
			// c.g:1:161: LOGIC
			{
			DebugLocation(1, 161);
			mLOGIC(); 

			}
			break;
		case 30:
			DebugEnterAlt(30);
			// c.g:1:167: ID
			{
			DebugLocation(1, 167);
			mID(); 

			}
			break;
		case 31:
			DebugEnterAlt(31);
			// c.g:1:170: STRING
			{
			DebugLocation(1, 170);
			mSTRING(); 

			}
			break;

		}

	}


	#region DFA
	DFA9 dfa9;

	protected override void InitDFAs()
	{
		base.InitDFAs();
		dfa9 = new DFA9(this);
	}

	private class DFA9 : DFA
	{
		private const string DFA9_eotS =
			"\x8\xFFFF\x1\x1D\x5\xFFFF\x1\x1F\x1\x21\x1\xFFFF\x1\x23\x5\x19\x1\xFFFF"+
			"\x1\x19\xB\xFFFF\x1\x2B\x6\x19\x1\xFFFF\x1\x19\x1\x33\x4\x19\x1\x38\x1"+
			"\xFFFF\x1\x19\x1\x3A\x1\x19\x1\x3C\x1\xFFFF\x1\x3C\x1\xFFFF\x1\x3D\x2"+
			"\xFFFF";
		private const string DFA9_eofS =
			"\x3E\xFFFF";
		private const string DFA9_minS =
			"\x1\x9\x7\xFFFF\x1\x2A\x5\xFFFF\x2\x3D\x1\xFFFF\x1\x3D\x1\x66\x1\x6C"+
			"\x1\x61\x1\x65\x1\x72\x1\xFFFF\x1\x72\xB\xFFFF\x1\x30\x1\x73\x1\x72\x1"+
			"\x6C\x1\x61\x1\x69\x1\x75\x1\xFFFF\x1\x65\x1\x30\x1\x73\x1\x64\x1\x74"+
			"\x1\x65\x1\x30\x1\xFFFF\x1\x65\x1\x30\x1\x65\x1\x30\x1\xFFFF\x1\x30\x1"+
			"\xFFFF\x1\x30\x2\xFFFF";
		private const string DFA9_maxS =
			"\x1\x7D\x7\xFFFF\x1\x2F\x5\xFFFF\x2\x3D\x1\xFFFF\x1\x3D\x1\x66\x1\x6C"+
			"\x1\x6F\x1\x65\x1\x72\x1\xFFFF\x1\x72\xB\xFFFF\x1\x7A\x1\x73\x1\x72\x1"+
			"\x6C\x1\x61\x1\x69\x1\x75\x1\xFFFF\x1\x65\x1\x7A\x1\x73\x1\x64\x1\x74"+
			"\x1\x65\x1\x7A\x1\xFFFF\x1\x65\x1\x7A\x1\x65\x1\x7A\x1\xFFFF\x1\x7A\x1"+
			"\xFFFF\x1\x7A\x2\xFFFF";
		private const string DFA9_acceptS =
			"\x1\xFFFF\x1\x1\x1\x2\x1\x3\x1\x4\x1\x5\x1\x6\x1\x7\x1\xFFFF\x1\xA\x1"+
			"\xB\x1\xC\x1\xE\x1\xF\x2\xFFFF\x1\x12\x6\xFFFF\x1\x1C\x1\xFFFF\x1\x1E"+
			"\x1\x1F\x1\x8\x1\x9\x1\xD\x1\x10\x1\x14\x1\x11\x1\x15\x1\x13\x1\x16\x7"+
			"\xFFFF\x1\x17\x7\xFFFF\x1\x19\x4\xFFFF\x1\x18\x1\xFFFF\x1\x1A\x1\xFFFF"+
			"\x1\x1D\x1\x1B";
		private const string DFA9_specialS =
			"\x3E\xFFFF}>";
		private static readonly string[] DFA9_transitionS =
			{
				"\x2\x7\x1\xFFFF\x2\x7\x12\xFFFF\x1\x7\x1\x10\x1\x1A\x3\xFFFF\x1\xD\x1"+
				"\xFFFF\x1\x1\x1\x2\x1\xB\x1\x9\x1\x3\x1\xA\x1\xFFFF\x1\x8\xA\x17\x1"+
				"\xFFFF\x1\x4\x1\xF\x1\x11\x1\xE\x2\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1"+
				"\xFFFF\x4\x19\x1\x13\x1\x14\x2\x19\x1\x12\x8\x19\x1\x15\x1\x19\x1\x18"+
				"\x2\x19\x1\x16\x3\x19\x1\x5\x1\xC\x1\x6",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"\x1\x1C\x4\xFFFF\x1\x1B",
				"",
				"",
				"",
				"",
				"",
				"\x1\x1E",
				"\x1\x20",
				"",
				"\x1\x22",
				"\x1\x24",
				"\x1\x25",
				"\x1\x27\xD\xFFFF\x1\x26",
				"\x1\x28",
				"\x1\x29",
				"",
				"\x1\x2A",
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
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"\x1\x2C",
				"\x1\x2D",
				"\x1\x2E",
				"\x1\x2F",
				"\x1\x30",
				"\x1\x31",
				"",
				"\x1\x32",
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"\x1\x34",
				"\x1\x35",
				"\x1\x36",
				"\x1\x37",
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"",
				"\x1\x39",
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"\x1\x3B",
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"",
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"",
				"\xA\x19\x7\xFFFF\x1A\x19\x4\xFFFF\x1\x19\x1\xFFFF\x1A\x19",
				"",
				""
			};

		private static readonly short[] DFA9_eot = DFA.UnpackEncodedString(DFA9_eotS);
		private static readonly short[] DFA9_eof = DFA.UnpackEncodedString(DFA9_eofS);
		private static readonly char[] DFA9_min = DFA.UnpackEncodedStringToUnsignedChars(DFA9_minS);
		private static readonly char[] DFA9_max = DFA.UnpackEncodedStringToUnsignedChars(DFA9_maxS);
		private static readonly short[] DFA9_accept = DFA.UnpackEncodedString(DFA9_acceptS);
		private static readonly short[] DFA9_special = DFA.UnpackEncodedString(DFA9_specialS);
		private static readonly short[][] DFA9_transition;

		static DFA9()
		{
			int numStates = DFA9_transitionS.Length;
			DFA9_transition = new short[numStates][];
			for ( int i=0; i < numStates; i++ )
			{
				DFA9_transition[i] = DFA.UnpackEncodedString(DFA9_transitionS[i]);
			}
		}

		public DFA9( BaseRecognizer recognizer )
		{
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

		public override string Description { get { return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | WS | SL_COMMENT | ML_COMMENT | ADD | SUB | MUL | DIV | LADD | LMUL | GE | LE | NEQUALS | EQUALS | GT | LT | ASSIGN | IF | ELSE | FOR | READ | WRITE | NUMBER | LOGIC | ID | STRING );"; } }

		public override void Error(NoViableAltException nvae)
		{
			DebugRecognitionException(nvae);
		}
	}


	#endregion

}

} // namespace  t_comp 
