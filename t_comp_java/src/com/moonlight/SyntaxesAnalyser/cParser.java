// $ANTLR 3.5.2 c.g 2015-12-06 23:01:09
package com.moonlight.SyntaxesAnalyser;

import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class cParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ASSIGN", "BLOCK", "BOOL_TYPE", 
		"CALL_PARAMS", "DEC_INITED", "DEC_NOT_INITED", "DEC_PARAM", "DEC_PARAMS", 
		"DIV", "ELSE", "EQUALS", "FOR", "FOR_BODY", "FOR_COND", "FOR_INIT", "FOR_STEP", 
		"FUNC_BODY", "FUNC_CALL", "FUNC_DEC", "FUNC_ID", "FUNC_TYPE", "GE", "GT", 
		"ID", "IF", "IF_BODY", "IF_COND", "IF_ELSE_BODY", "INT_TYPE", "LADD", 
		"LE", "LMUL", "LOGIC", "LT", "ML_COMMENT", "MUL", "NEQUALS", "NUMBER", 
		"PROGRAM", "READ", "RETURN", "SL_COMMENT", "STRING", "STRING_TYPE", "SUB", 
		"VAR_DEC", "VAR_TYPE", "VOID_TYPE", "WRITE", "WS", "'('", "')'", "','", 
		"';'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public cParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public cParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return cParser.tokenNames; }
	@Override public String getGrammarFileName() { return "c.g"; }


	public static class primitive_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitive_value"
	// c.g:111:1: primitive_value : ( NUMBER | STRING | LOGIC | ID | func_call );
	public final cParser.primitive_value_return primitive_value() throws RecognitionException {
		cParser.primitive_value_return retval = new cParser.primitive_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER1=null;
		Token STRING2=null;
		Token LOGIC3=null;
		Token ID4=null;
		ParserRuleReturnScope func_call5 =null;

		Object NUMBER1_tree=null;
		Object STRING2_tree=null;
		Object LOGIC3_tree=null;
		Object ID4_tree=null;

		try {
			// c.g:112:2: ( NUMBER | STRING | LOGIC | ID | func_call )
			int alt1=5;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt1=1;
				}
				break;
			case STRING:
				{
				alt1=2;
				}
				break;
			case LOGIC:
				{
				alt1=3;
				}
				break;
			case ID:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==55) ) {
					alt1=5;
				}
				else if ( (LA1_4==ADD||LA1_4==DIV||LA1_4==EQUALS||(LA1_4 >= GE && LA1_4 <= GT)||(LA1_4 >= LADD && LA1_4 <= LMUL)||LA1_4==LT||(LA1_4 >= MUL && LA1_4 <= NEQUALS)||LA1_4==SUB||(LA1_4 >= 56 && LA1_4 <= 58)) ) {
					alt1=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// c.g:112:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primitive_value588); 
					NUMBER1_tree = (Object)adaptor.create(NUMBER1);
					adaptor.addChild(root_0, NUMBER1_tree);

					}
					break;
				case 2 :
					// c.g:113:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_primitive_value593); 
					STRING2_tree = (Object)adaptor.create(STRING2);
					adaptor.addChild(root_0, STRING2_tree);

					}
					break;
				case 3 :
					// c.g:114:4: LOGIC
					{
					root_0 = (Object)adaptor.nil();


					LOGIC3=(Token)match(input,LOGIC,FOLLOW_LOGIC_in_primitive_value598); 
					LOGIC3_tree = (Object)adaptor.create(LOGIC3);
					adaptor.addChild(root_0, LOGIC3_tree);

					}
					break;
				case 4 :
					// c.g:115:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID4=(Token)match(input,ID,FOLLOW_ID_in_primitive_value603); 
					ID4_tree = (Object)adaptor.create(ID4);
					adaptor.addChild(root_0, ID4_tree);

					}
					break;
				case 5 :
					// c.g:116:4: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_primitive_value608);
					func_call5=func_call();
					state._fsp--;

					adaptor.addChild(root_0, func_call5.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitive_value"


	public static class value_group_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_group"
	// c.g:119:1: value_group : ( '(' ! value_add ')' !| primitive_value );
	public final cParser.value_group_return value_group() throws RecognitionException {
		cParser.value_group_return retval = new cParser.value_group_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal6=null;
		Token char_literal8=null;
		ParserRuleReturnScope value_add7 =null;
		ParserRuleReturnScope primitive_value9 =null;

		Object char_literal6_tree=null;
		Object char_literal8_tree=null;

		try {
			// c.g:120:2: ( '(' ! value_add ')' !| primitive_value )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==55) ) {
				alt2=1;
			}
			else if ( (LA2_0==ID||LA2_0==LOGIC||LA2_0==NUMBER||LA2_0==STRING) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// c.g:120:4: '(' ! value_add ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal6=(Token)match(input,55,FOLLOW_55_in_value_group619); 
					pushFollow(FOLLOW_value_add_in_value_group622);
					value_add7=value_add();
					state._fsp--;

					adaptor.addChild(root_0, value_add7.getTree());

					char_literal8=(Token)match(input,56,FOLLOW_56_in_value_group624); 
					}
					break;
				case 2 :
					// c.g:120:26: primitive_value
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitive_value_in_value_group629);
					primitive_value9=primitive_value();
					state._fsp--;

					adaptor.addChild(root_0, primitive_value9.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_group"


	public static class value_mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_mult"
	// c.g:123:1: value_mult : value_group ( ( MUL | DIV ) ^ value_group )* ;
	public final cParser.value_mult_return value_mult() throws RecognitionException {
		cParser.value_mult_return retval = new cParser.value_mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set11=null;
		ParserRuleReturnScope value_group10 =null;
		ParserRuleReturnScope value_group12 =null;

		Object set11_tree=null;

		try {
			// c.g:124:2: ( value_group ( ( MUL | DIV ) ^ value_group )* )
			// c.g:124:4: value_group ( ( MUL | DIV ) ^ value_group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_value_group_in_value_mult641);
			value_group10=value_group();
			state._fsp--;

			adaptor.addChild(root_0, value_group10.getTree());

			// c.g:124:16: ( ( MUL | DIV ) ^ value_group )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DIV||LA3_0==MUL) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// c.g:124:18: ( MUL | DIV ) ^ value_group
					{
					set11=input.LT(1);
					set11=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MUL ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set11), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_value_group_in_value_mult656);
					value_group12=value_group();
					state._fsp--;

					adaptor.addChild(root_0, value_group12.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_mult"


	public static class value_add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_add"
	// c.g:127:1: value_add : value_mult ( ( ADD | SUB ) ^ value_mult )* ;
	public final cParser.value_add_return value_add() throws RecognitionException {
		cParser.value_add_return retval = new cParser.value_add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;
		ParserRuleReturnScope value_mult13 =null;
		ParserRuleReturnScope value_mult15 =null;

		Object set14_tree=null;

		try {
			// c.g:128:2: ( value_mult ( ( ADD | SUB ) ^ value_mult )* )
			// c.g:128:4: value_mult ( ( ADD | SUB ) ^ value_mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_value_mult_in_value_add671);
			value_mult13=value_mult();
			state._fsp--;

			adaptor.addChild(root_0, value_mult13.getTree());

			// c.g:128:15: ( ( ADD | SUB ) ^ value_mult )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADD||LA4_0==SUB) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// c.g:128:17: ( ADD | SUB ) ^ value_mult
					{
					set14=input.LT(1);
					set14=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set14), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_value_mult_in_value_add686);
					value_mult15=value_mult();
					state._fsp--;

					adaptor.addChild(root_0, value_mult15.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_add"


	public static class logic_group_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_group"
	// c.g:132:1: logic_group : value_add ( ( GE | LE | NEQUALS | EQUALS | GT | LT ) ^ value_add )? ;
	public final cParser.logic_group_return logic_group() throws RecognitionException {
		cParser.logic_group_return retval = new cParser.logic_group_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set17=null;
		ParserRuleReturnScope value_add16 =null;
		ParserRuleReturnScope value_add18 =null;

		Object set17_tree=null;

		try {
			// c.g:133:2: ( value_add ( ( GE | LE | NEQUALS | EQUALS | GT | LT ) ^ value_add )? )
			// c.g:133:4: value_add ( ( GE | LE | NEQUALS | EQUALS | GT | LT ) ^ value_add )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_value_add_in_logic_group702);
			value_add16=value_add();
			state._fsp--;

			adaptor.addChild(root_0, value_add16.getTree());

			// c.g:133:14: ( ( GE | LE | NEQUALS | EQUALS | GT | LT ) ^ value_add )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EQUALS||(LA5_0 >= GE && LA5_0 <= GT)||LA5_0==LE||LA5_0==LT||LA5_0==NEQUALS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// c.g:133:16: ( GE | LE | NEQUALS | EQUALS | GT | LT ) ^ value_add
					{
					set17=input.LT(1);
					set17=input.LT(1);
					if ( input.LA(1)==EQUALS||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NEQUALS ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set17), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_value_add_in_logic_group733);
					value_add18=value_add();
					state._fsp--;

					adaptor.addChild(root_0, value_add18.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_group"


	public static class logic_mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_mult"
	// c.g:136:1: logic_mult : logic_group ( LMUL ^ logic_group )* ;
	public final cParser.logic_mult_return logic_mult() throws RecognitionException {
		cParser.logic_mult_return retval = new cParser.logic_mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LMUL20=null;
		ParserRuleReturnScope logic_group19 =null;
		ParserRuleReturnScope logic_group21 =null;

		Object LMUL20_tree=null;

		try {
			// c.g:137:2: ( logic_group ( LMUL ^ logic_group )* )
			// c.g:137:4: logic_group ( LMUL ^ logic_group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logic_group_in_logic_mult748);
			logic_group19=logic_group();
			state._fsp--;

			adaptor.addChild(root_0, logic_group19.getTree());

			// c.g:137:16: ( LMUL ^ logic_group )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==LMUL) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// c.g:137:18: LMUL ^ logic_group
					{
					LMUL20=(Token)match(input,LMUL,FOLLOW_LMUL_in_logic_mult752); 
					LMUL20_tree = (Object)adaptor.create(LMUL20);
					root_0 = (Object)adaptor.becomeRoot(LMUL20_tree, root_0);

					pushFollow(FOLLOW_logic_group_in_logic_mult755);
					logic_group21=logic_group();
					state._fsp--;

					adaptor.addChild(root_0, logic_group21.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_mult"


	public static class logic_add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_add"
	// c.g:140:1: logic_add : logic_mult ( LADD ^ logic_mult )* ;
	public final cParser.logic_add_return logic_add() throws RecognitionException {
		cParser.logic_add_return retval = new cParser.logic_add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LADD23=null;
		ParserRuleReturnScope logic_mult22 =null;
		ParserRuleReturnScope logic_mult24 =null;

		Object LADD23_tree=null;

		try {
			// c.g:141:2: ( logic_mult ( LADD ^ logic_mult )* )
			// c.g:141:4: logic_mult ( LADD ^ logic_mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logic_mult_in_logic_add769);
			logic_mult22=logic_mult();
			state._fsp--;

			adaptor.addChild(root_0, logic_mult22.getTree());

			// c.g:141:15: ( LADD ^ logic_mult )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LADD) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// c.g:141:17: LADD ^ logic_mult
					{
					LADD23=(Token)match(input,LADD,FOLLOW_LADD_in_logic_add773); 
					LADD23_tree = (Object)adaptor.create(LADD23);
					root_0 = (Object)adaptor.becomeRoot(LADD23_tree, root_0);

					pushFollow(FOLLOW_logic_mult_in_logic_add776);
					logic_mult24=logic_mult();
					state._fsp--;

					adaptor.addChild(root_0, logic_mult24.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_add"


	public static class value_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_expr"
	// c.g:144:1: value_expr : logic_add ;
	public final cParser.value_expr_return value_expr() throws RecognitionException {
		cParser.value_expr_return retval = new cParser.value_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope logic_add25 =null;


		try {
			// c.g:145:2: ( logic_add )
			// c.g:145:4: logic_add
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logic_add_in_value_expr789);
			logic_add25=logic_add();
			state._fsp--;

			adaptor.addChild(root_0, logic_add25.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_expr"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// c.g:150:1: type : ( INT_TYPE | BOOL_TYPE | STRING_TYPE | VOID_TYPE );
	public final cParser.type_return type() throws RecognitionException {
		cParser.type_return retval = new cParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set26=null;

		Object set26_tree=null;

		try {
			// c.g:151:2: ( INT_TYPE | BOOL_TYPE | STRING_TYPE | VOID_TYPE )
			// c.g:
			{
			root_0 = (Object)adaptor.nil();


			set26=input.LT(1);
			if ( input.LA(1)==BOOL_TYPE||input.LA(1)==INT_TYPE||input.LA(1)==STRING_TYPE||input.LA(1)==VOID_TYPE ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set26));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class func_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_call"
	// c.g:154:1: func_call : ID '(' ( value_expr ( ',' value_expr )* )? ')' -> ^( FUNC_CALL ^( FUNC_ID ID ) ^( CALL_PARAMS ( value_expr )* ) ) ;
	public final cParser.func_call_return func_call() throws RecognitionException {
		cParser.func_call_return retval = new cParser.func_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID27=null;
		Token char_literal28=null;
		Token char_literal30=null;
		Token char_literal32=null;
		ParserRuleReturnScope value_expr29 =null;
		ParserRuleReturnScope value_expr31 =null;

		Object ID27_tree=null;
		Object char_literal28_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_value_expr=new RewriteRuleSubtreeStream(adaptor,"rule value_expr");

		try {
			// c.g:155:2: ( ID '(' ( value_expr ( ',' value_expr )* )? ')' -> ^( FUNC_CALL ^( FUNC_ID ID ) ^( CALL_PARAMS ( value_expr )* ) ) )
			// c.g:155:4: ID '(' ( value_expr ( ',' value_expr )* )? ')'
			{
			ID27=(Token)match(input,ID,FOLLOW_ID_in_func_call827);  
			stream_ID.add(ID27);

			char_literal28=(Token)match(input,55,FOLLOW_55_in_func_call829);  
			stream_55.add(char_literal28);

			// c.g:155:11: ( value_expr ( ',' value_expr )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID||LA9_0==LOGIC||LA9_0==NUMBER||LA9_0==STRING||LA9_0==55) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// c.g:155:13: value_expr ( ',' value_expr )*
					{
					pushFollow(FOLLOW_value_expr_in_func_call833);
					value_expr29=value_expr();
					state._fsp--;

					stream_value_expr.add(value_expr29.getTree());
					// c.g:155:24: ( ',' value_expr )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==57) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// c.g:155:26: ',' value_expr
							{
							char_literal30=(Token)match(input,57,FOLLOW_57_in_func_call837);  
							stream_57.add(char_literal30);

							pushFollow(FOLLOW_value_expr_in_func_call839);
							value_expr31=value_expr();
							state._fsp--;

							stream_value_expr.add(value_expr31.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			char_literal32=(Token)match(input,56,FOLLOW_56_in_func_call846);  
			stream_56.add(char_literal32);

			// AST REWRITE
			// elements: ID, value_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 155:50: -> ^( FUNC_CALL ^( FUNC_ID ID ) ^( CALL_PARAMS ( value_expr )* ) )
			{
				// c.g:155:53: ^( FUNC_CALL ^( FUNC_ID ID ) ^( CALL_PARAMS ( value_expr )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				// c.g:155:65: ^( FUNC_ID ID )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_ID, "FUNC_ID"), root_2);
				adaptor.addChild(root_2, stream_ID.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:155:81: ^( CALL_PARAMS ( value_expr )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL_PARAMS, "CALL_PARAMS"), root_2);
				// c.g:155:95: ( value_expr )*
				while ( stream_value_expr.hasNext() ) {
					adaptor.addChild(root_2, stream_value_expr.nextTree());
				}
				stream_value_expr.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_call"


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// c.g:158:1: assign : ID ASSIGN ^ value_expr ;
	public final cParser.assign_return assign() throws RecognitionException {
		cParser.assign_return retval = new cParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID33=null;
		Token ASSIGN34=null;
		ParserRuleReturnScope value_expr35 =null;

		Object ID33_tree=null;
		Object ASSIGN34_tree=null;

		try {
			// c.g:159:2: ( ID ASSIGN ^ value_expr )
			// c.g:159:4: ID ASSIGN ^ value_expr
			{
			root_0 = (Object)adaptor.nil();


			ID33=(Token)match(input,ID,FOLLOW_ID_in_assign879); 
			ID33_tree = (Object)adaptor.create(ID33);
			adaptor.addChild(root_0, ID33_tree);

			ASSIGN34=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign881); 
			ASSIGN34_tree = (Object)adaptor.create(ASSIGN34);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN34_tree, root_0);

			pushFollow(FOLLOW_value_expr_in_assign884);
			value_expr35=value_expr();
			state._fsp--;

			adaptor.addChild(root_0, value_expr35.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class var_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration"
	// c.g:162:1: var_declaration : type ( ID | assign ) ( ',' ( ID | assign ) )* -> ^( VAR_DEC ^( VAR_TYPE type ) ^( DEC_NOT_INITED ( ID )* ) ^( DEC_INITED ( assign )* ) ) ;
	public final cParser.var_declaration_return var_declaration() throws RecognitionException {
		cParser.var_declaration_return retval = new cParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID37=null;
		Token char_literal39=null;
		Token ID40=null;
		ParserRuleReturnScope type36 =null;
		ParserRuleReturnScope assign38 =null;
		ParserRuleReturnScope assign41 =null;

		Object ID37_tree=null;
		Object char_literal39_tree=null;
		Object ID40_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");

		try {
			// c.g:163:2: ( type ( ID | assign ) ( ',' ( ID | assign ) )* -> ^( VAR_DEC ^( VAR_TYPE type ) ^( DEC_NOT_INITED ( ID )* ) ^( DEC_INITED ( assign )* ) ) )
			// c.g:163:4: type ( ID | assign ) ( ',' ( ID | assign ) )*
			{
			pushFollow(FOLLOW_type_in_var_declaration896);
			type36=type();
			state._fsp--;

			stream_type.add(type36.getTree());
			// c.g:163:9: ( ID | assign )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==ASSIGN) ) {
					alt10=2;
				}
				else if ( ((LA10_1 >= 56 && LA10_1 <= 58)) ) {
					alt10=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// c.g:163:11: ID
					{
					ID37=(Token)match(input,ID,FOLLOW_ID_in_var_declaration900);  
					stream_ID.add(ID37);

					}
					break;
				case 2 :
					// c.g:163:16: assign
					{
					pushFollow(FOLLOW_assign_in_var_declaration904);
					assign38=assign();
					state._fsp--;

					stream_assign.add(assign38.getTree());
					}
					break;

			}

			// c.g:163:25: ( ',' ( ID | assign ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==57) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// c.g:163:27: ',' ( ID | assign )
					{
					char_literal39=(Token)match(input,57,FOLLOW_57_in_var_declaration910);  
					stream_57.add(char_literal39);

					// c.g:163:31: ( ID | assign )
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ID) ) {
						int LA11_1 = input.LA(2);
						if ( (LA11_1==ASSIGN) ) {
							alt11=2;
						}
						else if ( ((LA11_1 >= 56 && LA11_1 <= 58)) ) {
							alt11=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 11, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// c.g:163:33: ID
							{
							ID40=(Token)match(input,ID,FOLLOW_ID_in_var_declaration914);  
							stream_ID.add(ID40);

							}
							break;
						case 2 :
							// c.g:163:38: assign
							{
							pushFollow(FOLLOW_assign_in_var_declaration918);
							assign41=assign();
							state._fsp--;

							stream_assign.add(assign41.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: ID, assign, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:50: -> ^( VAR_DEC ^( VAR_TYPE type ) ^( DEC_NOT_INITED ( ID )* ) ^( DEC_INITED ( assign )* ) )
			{
				// c.g:163:53: ^( VAR_DEC ^( VAR_TYPE type ) ^( DEC_NOT_INITED ( ID )* ) ^( DEC_INITED ( assign )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DEC, "VAR_DEC"), root_1);
				// c.g:163:63: ^( VAR_TYPE type )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_TYPE, "VAR_TYPE"), root_2);
				adaptor.addChild(root_2, stream_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:163:82: ^( DEC_NOT_INITED ( ID )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_NOT_INITED, "DEC_NOT_INITED"), root_2);
				// c.g:163:100: ( ID )*
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_2, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_1, root_2);
				}

				// c.g:163:106: ^( DEC_INITED ( assign )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_INITED, "DEC_INITED"), root_2);
				// c.g:163:120: ( assign )*
				while ( stream_assign.hasNext() ) {
					adaptor.addChild(root_2, stream_assign.nextTree());
				}
				stream_assign.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration"


	public static class simple_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_expr"
	// c.g:166:1: simple_expr : ( assign | var_declaration | func_call | READ ^ '(' ! ID ( ',' ! ID )* ')' !| WRITE ^ '(' ! value_expr ( ',' ! value_expr )* ')' !);
	public final cParser.simple_expr_return simple_expr() throws RecognitionException {
		cParser.simple_expr_return retval = new cParser.simple_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ45=null;
		Token char_literal46=null;
		Token ID47=null;
		Token char_literal48=null;
		Token ID49=null;
		Token char_literal50=null;
		Token WRITE51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal56=null;
		ParserRuleReturnScope assign42 =null;
		ParserRuleReturnScope var_declaration43 =null;
		ParserRuleReturnScope func_call44 =null;
		ParserRuleReturnScope value_expr53 =null;
		ParserRuleReturnScope value_expr55 =null;

		Object READ45_tree=null;
		Object char_literal46_tree=null;
		Object ID47_tree=null;
		Object char_literal48_tree=null;
		Object ID49_tree=null;
		Object char_literal50_tree=null;
		Object WRITE51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object char_literal56_tree=null;

		try {
			// c.g:167:2: ( assign | var_declaration | func_call | READ ^ '(' ! ID ( ',' ! ID )* ')' !| WRITE ^ '(' ! value_expr ( ',' ! value_expr )* ')' !)
			int alt15=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA15_1 = input.LA(2);
				if ( (LA15_1==ASSIGN) ) {
					alt15=1;
				}
				else if ( (LA15_1==55) ) {
					alt15=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOL_TYPE:
			case INT_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
				{
				alt15=2;
				}
				break;
			case READ:
				{
				alt15=4;
				}
				break;
			case WRITE:
				{
				alt15=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// c.g:167:4: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_simple_expr967);
					assign42=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign42.getTree());

					}
					break;
				case 2 :
					// c.g:168:4: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_simple_expr975);
					var_declaration43=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration43.getTree());

					}
					break;
				case 3 :
					// c.g:169:4: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_simple_expr982);
					func_call44=func_call();
					state._fsp--;

					adaptor.addChild(root_0, func_call44.getTree());

					}
					break;
				case 4 :
					// c.g:171:4: READ ^ '(' ! ID ( ',' ! ID )* ')' !
					{
					root_0 = (Object)adaptor.nil();


					READ45=(Token)match(input,READ,FOLLOW_READ_in_simple_expr990); 
					READ45_tree = (Object)adaptor.create(READ45);
					root_0 = (Object)adaptor.becomeRoot(READ45_tree, root_0);

					char_literal46=(Token)match(input,55,FOLLOW_55_in_simple_expr993); 
					ID47=(Token)match(input,ID,FOLLOW_ID_in_simple_expr996); 
					ID47_tree = (Object)adaptor.create(ID47);
					adaptor.addChild(root_0, ID47_tree);

					// c.g:171:18: ( ',' ! ID )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==57) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// c.g:171:20: ',' ! ID
							{
							char_literal48=(Token)match(input,57,FOLLOW_57_in_simple_expr1000); 
							ID49=(Token)match(input,ID,FOLLOW_ID_in_simple_expr1003); 
							ID49_tree = (Object)adaptor.create(ID49);
							adaptor.addChild(root_0, ID49_tree);

							}
							break;

						default :
							break loop13;
						}
					}

					char_literal50=(Token)match(input,56,FOLLOW_56_in_simple_expr1007); 
					}
					break;
				case 5 :
					// c.g:172:4: WRITE ^ '(' ! value_expr ( ',' ! value_expr )* ')' !
					{
					root_0 = (Object)adaptor.nil();


					WRITE51=(Token)match(input,WRITE,FOLLOW_WRITE_in_simple_expr1017); 
					WRITE51_tree = (Object)adaptor.create(WRITE51);
					root_0 = (Object)adaptor.becomeRoot(WRITE51_tree, root_0);

					char_literal52=(Token)match(input,55,FOLLOW_55_in_simple_expr1020); 
					pushFollow(FOLLOW_value_expr_in_simple_expr1023);
					value_expr53=value_expr();
					state._fsp--;

					adaptor.addChild(root_0, value_expr53.getTree());

					// c.g:172:27: ( ',' ! value_expr )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==57) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// c.g:172:29: ',' ! value_expr
							{
							char_literal54=(Token)match(input,57,FOLLOW_57_in_simple_expr1027); 
							pushFollow(FOLLOW_value_expr_in_simple_expr1030);
							value_expr55=value_expr();
							state._fsp--;

							adaptor.addChild(root_0, value_expr55.getTree());

							}
							break;

						default :
							break loop14;
						}
					}

					char_literal56=(Token)match(input,56,FOLLOW_56_in_simple_expr1034); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_expr"


	public static class for_construction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_construction"
	// c.g:176:1: for_construction : FOR '(' simple_expr ';' value_expr ';' simple_expr ')' complex_expr -> ^( FOR ^( FOR_INIT simple_expr ) ^( FOR_COND value_expr ) ^( FOR_STEP simple_expr ) ^( FOR_BODY complex_expr ) ) ;
	public final cParser.for_construction_return for_construction() throws RecognitionException {
		cParser.for_construction_return retval = new cParser.for_construction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOR57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope simple_expr59 =null;
		ParserRuleReturnScope value_expr61 =null;
		ParserRuleReturnScope simple_expr63 =null;
		ParserRuleReturnScope complex_expr65 =null;

		Object FOR57_tree=null;
		Object char_literal58_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object char_literal64_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleSubtreeStream stream_complex_expr=new RewriteRuleSubtreeStream(adaptor,"rule complex_expr");
		RewriteRuleSubtreeStream stream_simple_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_expr");
		RewriteRuleSubtreeStream stream_value_expr=new RewriteRuleSubtreeStream(adaptor,"rule value_expr");

		try {
			// c.g:177:2: ( FOR '(' simple_expr ';' value_expr ';' simple_expr ')' complex_expr -> ^( FOR ^( FOR_INIT simple_expr ) ^( FOR_COND value_expr ) ^( FOR_STEP simple_expr ) ^( FOR_BODY complex_expr ) ) )
			// c.g:177:4: FOR '(' simple_expr ';' value_expr ';' simple_expr ')' complex_expr
			{
			FOR57=(Token)match(input,FOR,FOLLOW_FOR_in_for_construction1050);  
			stream_FOR.add(FOR57);

			char_literal58=(Token)match(input,55,FOLLOW_55_in_for_construction1052);  
			stream_55.add(char_literal58);

			pushFollow(FOLLOW_simple_expr_in_for_construction1054);
			simple_expr59=simple_expr();
			state._fsp--;

			stream_simple_expr.add(simple_expr59.getTree());
			char_literal60=(Token)match(input,58,FOLLOW_58_in_for_construction1056);  
			stream_58.add(char_literal60);

			pushFollow(FOLLOW_value_expr_in_for_construction1058);
			value_expr61=value_expr();
			state._fsp--;

			stream_value_expr.add(value_expr61.getTree());
			char_literal62=(Token)match(input,58,FOLLOW_58_in_for_construction1060);  
			stream_58.add(char_literal62);

			pushFollow(FOLLOW_simple_expr_in_for_construction1062);
			simple_expr63=simple_expr();
			state._fsp--;

			stream_simple_expr.add(simple_expr63.getTree());
			char_literal64=(Token)match(input,56,FOLLOW_56_in_for_construction1064);  
			stream_56.add(char_literal64);

			pushFollow(FOLLOW_complex_expr_in_for_construction1066);
			complex_expr65=complex_expr();
			state._fsp--;

			stream_complex_expr.add(complex_expr65.getTree());
			// AST REWRITE
			// elements: complex_expr, simple_expr, FOR, value_expr, simple_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 177:72: -> ^( FOR ^( FOR_INIT simple_expr ) ^( FOR_COND value_expr ) ^( FOR_STEP simple_expr ) ^( FOR_BODY complex_expr ) )
			{
				// c.g:178:3: ^( FOR ^( FOR_INIT simple_expr ) ^( FOR_COND value_expr ) ^( FOR_STEP simple_expr ) ^( FOR_BODY complex_expr ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);
				// c.g:178:9: ^( FOR_INIT simple_expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_INIT, "FOR_INIT"), root_2);
				adaptor.addChild(root_2, stream_simple_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:178:35: ^( FOR_COND value_expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_COND, "FOR_COND"), root_2);
				adaptor.addChild(root_2, stream_value_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:178:60: ^( FOR_STEP simple_expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_STEP, "FOR_STEP"), root_2);
				adaptor.addChild(root_2, stream_simple_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:178:86: ^( FOR_BODY complex_expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_BODY, "FOR_BODY"), root_2);
				adaptor.addChild(root_2, stream_complex_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_construction"


	public static class if_construction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_construction"
	// c.g:181:1: if_construction : IF '(' value_expr ')' complex_expr ( ELSE complex_expr )? -> ^( IF ^( IF_COND value_expr ) ^( IF_BODY complex_expr ) ^( IF_ELSE_BODY ( complex_expr )? ) ) ;
	public final cParser.if_construction_return if_construction() throws RecognitionException {
		cParser.if_construction_return retval = new cParser.if_construction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF66=null;
		Token char_literal67=null;
		Token char_literal69=null;
		Token ELSE71=null;
		ParserRuleReturnScope value_expr68 =null;
		ParserRuleReturnScope complex_expr70 =null;
		ParserRuleReturnScope complex_expr72 =null;

		Object IF66_tree=null;
		Object char_literal67_tree=null;
		Object char_literal69_tree=null;
		Object ELSE71_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_complex_expr=new RewriteRuleSubtreeStream(adaptor,"rule complex_expr");
		RewriteRuleSubtreeStream stream_value_expr=new RewriteRuleSubtreeStream(adaptor,"rule value_expr");

		try {
			// c.g:182:2: ( IF '(' value_expr ')' complex_expr ( ELSE complex_expr )? -> ^( IF ^( IF_COND value_expr ) ^( IF_BODY complex_expr ) ^( IF_ELSE_BODY ( complex_expr )? ) ) )
			// c.g:182:4: IF '(' value_expr ')' complex_expr ( ELSE complex_expr )?
			{
			IF66=(Token)match(input,IF,FOLLOW_IF_in_if_construction1118);  
			stream_IF.add(IF66);

			char_literal67=(Token)match(input,55,FOLLOW_55_in_if_construction1120);  
			stream_55.add(char_literal67);

			pushFollow(FOLLOW_value_expr_in_if_construction1122);
			value_expr68=value_expr();
			state._fsp--;

			stream_value_expr.add(value_expr68.getTree());
			char_literal69=(Token)match(input,56,FOLLOW_56_in_if_construction1124);  
			stream_56.add(char_literal69);

			pushFollow(FOLLOW_complex_expr_in_if_construction1126);
			complex_expr70=complex_expr();
			state._fsp--;

			stream_complex_expr.add(complex_expr70.getTree());
			// c.g:182:39: ( ELSE complex_expr )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ELSE) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// c.g:182:41: ELSE complex_expr
					{
					ELSE71=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_construction1130);  
					stream_ELSE.add(ELSE71);

					pushFollow(FOLLOW_complex_expr_in_if_construction1132);
					complex_expr72=complex_expr();
					state._fsp--;

					stream_complex_expr.add(complex_expr72.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: complex_expr, IF, complex_expr, value_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 182:62: -> ^( IF ^( IF_COND value_expr ) ^( IF_BODY complex_expr ) ^( IF_ELSE_BODY ( complex_expr )? ) )
			{
				// c.g:183:3: ^( IF ^( IF_COND value_expr ) ^( IF_BODY complex_expr ) ^( IF_ELSE_BODY ( complex_expr )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				// c.g:183:9: ^( IF_COND value_expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_COND, "IF_COND"), root_2);
				adaptor.addChild(root_2, stream_value_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:183:33: ^( IF_BODY complex_expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_BODY, "IF_BODY"), root_2);
				adaptor.addChild(root_2, stream_complex_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:183:59: ^( IF_ELSE_BODY ( complex_expr )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_ELSE_BODY, "IF_ELSE_BODY"), root_2);
				// c.g:183:75: ( complex_expr )?
				if ( stream_complex_expr.hasNext() ) {
					adaptor.addChild(root_2, stream_complex_expr.nextTree());
				}
				stream_complex_expr.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_construction"


	public static class block_construction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_construction"
	// c.g:186:1: block_construction : '{' ( complex_expr )* '}' -> ^( BLOCK ( complex_expr )* ) ;
	public final cParser.block_construction_return block_construction() throws RecognitionException {
		cParser.block_construction_return retval = new cParser.block_construction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope complex_expr74 =null;

		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_complex_expr=new RewriteRuleSubtreeStream(adaptor,"rule complex_expr");

		try {
			// c.g:187:2: ( '{' ( complex_expr )* '}' -> ^( BLOCK ( complex_expr )* ) )
			// c.g:187:4: '{' ( complex_expr )* '}'
			{
			char_literal73=(Token)match(input,59,FOLLOW_59_in_block_construction1181);  
			stream_59.add(char_literal73);

			// c.g:187:8: ( complex_expr )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==BOOL_TYPE||LA17_0==FOR||(LA17_0 >= ID && LA17_0 <= IF)||LA17_0==INT_TYPE||(LA17_0 >= READ && LA17_0 <= RETURN)||LA17_0==STRING_TYPE||(LA17_0 >= VOID_TYPE && LA17_0 <= WRITE)||LA17_0==59) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// c.g:187:8: complex_expr
					{
					pushFollow(FOLLOW_complex_expr_in_block_construction1183);
					complex_expr74=complex_expr();
					state._fsp--;

					stream_complex_expr.add(complex_expr74.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			char_literal75=(Token)match(input,60,FOLLOW_60_in_block_construction1186);  
			stream_60.add(char_literal75);

			// AST REWRITE
			// elements: complex_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 187:26: -> ^( BLOCK ( complex_expr )* )
			{
				// c.g:187:29: ^( BLOCK ( complex_expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// c.g:187:37: ( complex_expr )*
				while ( stream_complex_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_complex_expr.nextTree());
				}
				stream_complex_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block_construction"


	public static class func_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_declaration"
	// c.g:192:1: func_declaration : type ID '(' ( type ID ( ',' type ID )* )? ')' '{' ( complex_expr )* '}' -> ^( FUNC_DEC ^( FUNC_TYPE type ) ^( FUNC_ID ID ) ^( DEC_PARAMS ( ^( DEC_PARAM type ID ) )* ) ^( FUNC_BODY ( complex_expr )* ) ) ;
	public final cParser.func_declaration_return func_declaration() throws RecognitionException {
		cParser.func_declaration_return retval = new cParser.func_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID77=null;
		Token char_literal78=null;
		Token ID80=null;
		Token char_literal81=null;
		Token ID83=null;
		Token char_literal84=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope type76 =null;
		ParserRuleReturnScope type79 =null;
		ParserRuleReturnScope type82 =null;
		ParserRuleReturnScope complex_expr86 =null;

		Object ID77_tree=null;
		Object char_literal78_tree=null;
		Object ID80_tree=null;
		Object char_literal81_tree=null;
		Object ID83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_complex_expr=new RewriteRuleSubtreeStream(adaptor,"rule complex_expr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// c.g:193:2: ( type ID '(' ( type ID ( ',' type ID )* )? ')' '{' ( complex_expr )* '}' -> ^( FUNC_DEC ^( FUNC_TYPE type ) ^( FUNC_ID ID ) ^( DEC_PARAMS ( ^( DEC_PARAM type ID ) )* ) ^( FUNC_BODY ( complex_expr )* ) ) )
			// c.g:193:4: type ID '(' ( type ID ( ',' type ID )* )? ')' '{' ( complex_expr )* '}'
			{
			pushFollow(FOLLOW_type_in_func_declaration1209);
			type76=type();
			state._fsp--;

			stream_type.add(type76.getTree());
			ID77=(Token)match(input,ID,FOLLOW_ID_in_func_declaration1211);  
			stream_ID.add(ID77);

			char_literal78=(Token)match(input,55,FOLLOW_55_in_func_declaration1213);  
			stream_55.add(char_literal78);

			// c.g:193:16: ( type ID ( ',' type ID )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==BOOL_TYPE||LA19_0==INT_TYPE||LA19_0==STRING_TYPE||LA19_0==VOID_TYPE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// c.g:193:18: type ID ( ',' type ID )*
					{
					pushFollow(FOLLOW_type_in_func_declaration1217);
					type79=type();
					state._fsp--;

					stream_type.add(type79.getTree());
					ID80=(Token)match(input,ID,FOLLOW_ID_in_func_declaration1219);  
					stream_ID.add(ID80);

					// c.g:193:26: ( ',' type ID )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==57) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// c.g:193:28: ',' type ID
							{
							char_literal81=(Token)match(input,57,FOLLOW_57_in_func_declaration1223);  
							stream_57.add(char_literal81);

							pushFollow(FOLLOW_type_in_func_declaration1225);
							type82=type();
							state._fsp--;

							stream_type.add(type82.getTree());
							ID83=(Token)match(input,ID,FOLLOW_ID_in_func_declaration1227);  
							stream_ID.add(ID83);

							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			char_literal84=(Token)match(input,56,FOLLOW_56_in_func_declaration1236);  
			stream_56.add(char_literal84);

			char_literal85=(Token)match(input,59,FOLLOW_59_in_func_declaration1238);  
			stream_59.add(char_literal85);

			// c.g:193:55: ( complex_expr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BOOL_TYPE||LA20_0==FOR||(LA20_0 >= ID && LA20_0 <= IF)||LA20_0==INT_TYPE||(LA20_0 >= READ && LA20_0 <= RETURN)||LA20_0==STRING_TYPE||(LA20_0 >= VOID_TYPE && LA20_0 <= WRITE)||LA20_0==59) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// c.g:193:55: complex_expr
					{
					pushFollow(FOLLOW_complex_expr_in_func_declaration1240);
					complex_expr86=complex_expr();
					state._fsp--;

					stream_complex_expr.add(complex_expr86.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			char_literal87=(Token)match(input,60,FOLLOW_60_in_func_declaration1243);  
			stream_60.add(char_literal87);

			// AST REWRITE
			// elements: ID, complex_expr, type, ID, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:73: -> ^( FUNC_DEC ^( FUNC_TYPE type ) ^( FUNC_ID ID ) ^( DEC_PARAMS ( ^( DEC_PARAM type ID ) )* ) ^( FUNC_BODY ( complex_expr )* ) )
			{
				// c.g:194:3: ^( FUNC_DEC ^( FUNC_TYPE type ) ^( FUNC_ID ID ) ^( DEC_PARAMS ( ^( DEC_PARAM type ID ) )* ) ^( FUNC_BODY ( complex_expr )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DEC, "FUNC_DEC"), root_1);
				// c.g:194:14: ^( FUNC_TYPE type )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_TYPE, "FUNC_TYPE"), root_2);
				adaptor.addChild(root_2, stream_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:194:34: ^( FUNC_ID ID )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_ID, "FUNC_ID"), root_2);
				adaptor.addChild(root_2, stream_ID.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// c.g:194:50: ^( DEC_PARAMS ( ^( DEC_PARAM type ID ) )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_PARAMS, "DEC_PARAMS"), root_2);
				// c.g:194:63: ( ^( DEC_PARAM type ID ) )*
				while ( stream_ID.hasNext()||stream_type.hasNext() ) {
					// c.g:194:63: ^( DEC_PARAM type ID )
					{
					Object root_3 = (Object)adaptor.nil();
					root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_PARAM, "DEC_PARAM"), root_3);
					adaptor.addChild(root_3, stream_type.nextTree());
					adaptor.addChild(root_3, stream_ID.nextNode());
					adaptor.addChild(root_2, root_3);
					}

				}
				stream_ID.reset();
				stream_type.reset();

				adaptor.addChild(root_1, root_2);
				}

				// c.g:194:89: ^( FUNC_BODY ( complex_expr )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_BODY, "FUNC_BODY"), root_2);
				// c.g:194:102: ( complex_expr )*
				while ( stream_complex_expr.hasNext() ) {
					adaptor.addChild(root_2, stream_complex_expr.nextTree());
				}
				stream_complex_expr.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_declaration"


	public static class return__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "return_"
	// c.g:197:1: return_ : RETURN ^ ( value_expr )? ';' !;
	public final cParser.return__return return_() throws RecognitionException {
		cParser.return__return retval = new cParser.return__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN88=null;
		Token char_literal90=null;
		ParserRuleReturnScope value_expr89 =null;

		Object RETURN88_tree=null;
		Object char_literal90_tree=null;

		try {
			// c.g:198:2: ( RETURN ^ ( value_expr )? ';' !)
			// c.g:198:4: RETURN ^ ( value_expr )? ';' !
			{
			root_0 = (Object)adaptor.nil();


			RETURN88=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_1304); 
			RETURN88_tree = (Object)adaptor.create(RETURN88);
			root_0 = (Object)adaptor.becomeRoot(RETURN88_tree, root_0);

			// c.g:198:12: ( value_expr )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID||LA21_0==LOGIC||LA21_0==NUMBER||LA21_0==STRING||LA21_0==55) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// c.g:198:12: value_expr
					{
					pushFollow(FOLLOW_value_expr_in_return_1307);
					value_expr89=value_expr();
					state._fsp--;

					adaptor.addChild(root_0, value_expr89.getTree());

					}
					break;

			}

			char_literal90=(Token)match(input,58,FOLLOW_58_in_return_1310); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "return_"


	public static class complex_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "complex_expr"
	// c.g:201:1: complex_expr : ( simple_expr ';' !| func_declaration | return_ | block_construction | if_construction | for_construction );
	public final cParser.complex_expr_return complex_expr() throws RecognitionException {
		cParser.complex_expr_return retval = new cParser.complex_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal92=null;
		ParserRuleReturnScope simple_expr91 =null;
		ParserRuleReturnScope func_declaration93 =null;
		ParserRuleReturnScope return_94 =null;
		ParserRuleReturnScope block_construction95 =null;
		ParserRuleReturnScope if_construction96 =null;
		ParserRuleReturnScope for_construction97 =null;

		Object char_literal92_tree=null;

		try {
			// c.g:202:2: ( simple_expr ';' !| func_declaration | return_ | block_construction | if_construction | for_construction )
			int alt22=6;
			switch ( input.LA(1) ) {
			case ID:
			case READ:
			case WRITE:
				{
				alt22=1;
				}
				break;
			case BOOL_TYPE:
			case INT_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2==ID) ) {
					int LA22_7 = input.LA(3);
					if ( (LA22_7==ASSIGN||(LA22_7 >= 57 && LA22_7 <= 58)) ) {
						alt22=1;
					}
					else if ( (LA22_7==55) ) {
						alt22=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RETURN:
				{
				alt22=3;
				}
				break;
			case 59:
				{
				alt22=4;
				}
				break;
			case IF:
				{
				alt22=5;
				}
				break;
			case FOR:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// c.g:202:4: simple_expr ';' !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_expr_in_complex_expr1322);
					simple_expr91=simple_expr();
					state._fsp--;

					adaptor.addChild(root_0, simple_expr91.getTree());

					char_literal92=(Token)match(input,58,FOLLOW_58_in_complex_expr1324); 
					}
					break;
				case 2 :
					// c.g:204:4: func_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_declaration_in_complex_expr1332);
					func_declaration93=func_declaration();
					state._fsp--;

					adaptor.addChild(root_0, func_declaration93.getTree());

					}
					break;
				case 3 :
					// c.g:206:4: return_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_return__in_complex_expr1338);
					return_94=return_();
					state._fsp--;

					adaptor.addChild(root_0, return_94.getTree());

					}
					break;
				case 4 :
					// c.g:208:4: block_construction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_construction_in_complex_expr1345);
					block_construction95=block_construction();
					state._fsp--;

					adaptor.addChild(root_0, block_construction95.getTree());

					}
					break;
				case 5 :
					// c.g:210:4: if_construction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_construction_in_complex_expr1351);
					if_construction96=if_construction();
					state._fsp--;

					adaptor.addChild(root_0, if_construction96.getTree());

					}
					break;
				case 6 :
					// c.g:211:4: for_construction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for_construction_in_complex_expr1356);
					for_construction97=for_construction();
					state._fsp--;

					adaptor.addChild(root_0, for_construction97.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "complex_expr"


	public static class result_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "result"
	// c.g:215:1: result : ( complex_expr )* EOF -> ^( PROGRAM ( complex_expr )* ) ;
	public final cParser.result_return result() throws RecognitionException {
		cParser.result_return retval = new cParser.result_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF99=null;
		ParserRuleReturnScope complex_expr98 =null;

		Object EOF99_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_complex_expr=new RewriteRuleSubtreeStream(adaptor,"rule complex_expr");

		try {
			// c.g:216:2: ( ( complex_expr )* EOF -> ^( PROGRAM ( complex_expr )* ) )
			// c.g:216:4: ( complex_expr )* EOF
			{
			// c.g:216:4: ( complex_expr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==BOOL_TYPE||LA23_0==FOR||(LA23_0 >= ID && LA23_0 <= IF)||LA23_0==INT_TYPE||(LA23_0 >= READ && LA23_0 <= RETURN)||LA23_0==STRING_TYPE||(LA23_0 >= VOID_TYPE && LA23_0 <= WRITE)||LA23_0==59) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// c.g:216:4: complex_expr
					{
					pushFollow(FOLLOW_complex_expr_in_result1369);
					complex_expr98=complex_expr();
					state._fsp--;

					stream_complex_expr.add(complex_expr98.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			EOF99=(Token)match(input,EOF,FOLLOW_EOF_in_result1372);  
			stream_EOF.add(EOF99);

			// AST REWRITE
			// elements: complex_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 216:22: -> ^( PROGRAM ( complex_expr )* )
			{
				// c.g:216:25: ^( PROGRAM ( complex_expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// c.g:216:36: ( complex_expr )*
				while ( stream_complex_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_complex_expr.nextTree());
				}
				stream_complex_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "result"


	public static class execute_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "execute"
	// c.g:219:8: public execute : result ;
	public final cParser.execute_return execute() throws RecognitionException {
		cParser.execute_return retval = new cParser.execute_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope result100 =null;


		try {
			// c.g:220:2: ( result )
			// c.g:220:4: result
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_result_in_execute1396);
			result100=result();
			state._fsp--;

			adaptor.addChild(root_0, result100.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "execute"

	// Delegated rules



	public static final BitSet FOLLOW_NUMBER_in_primitive_value588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_primitive_value593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOGIC_in_primitive_value598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_primitive_value603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_primitive_value608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_value_group619 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_add_in_value_group622 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_value_group624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitive_value_in_value_group629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_group_in_value_mult641 = new BitSet(new long[]{0x0000010000002002L});
	public static final BitSet FOLLOW_set_in_value_mult645 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_group_in_value_mult656 = new BitSet(new long[]{0x0000010000002002L});
	public static final BitSet FOLLOW_value_mult_in_value_add671 = new BitSet(new long[]{0x0002000000000012L});
	public static final BitSet FOLLOW_set_in_value_add675 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_mult_in_value_add686 = new BitSet(new long[]{0x0002000000000012L});
	public static final BitSet FOLLOW_value_add_in_logic_group702 = new BitSet(new long[]{0x000002480C008002L});
	public static final BitSet FOLLOW_set_in_logic_group706 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_add_in_logic_group733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_group_in_logic_mult748 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_LMUL_in_logic_mult752 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_logic_group_in_logic_mult755 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_logic_mult_in_logic_add769 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_LADD_in_logic_add773 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_logic_mult_in_logic_add776 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_logic_add_in_value_expr789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_func_call827 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_func_call829 = new BitSet(new long[]{0x0180842010000000L});
	public static final BitSet FOLLOW_value_expr_in_func_call833 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_57_in_func_call837 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_expr_in_func_call839 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_56_in_func_call846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign879 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign881 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_expr_in_assign884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_var_declaration896 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_var_declaration900 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_assign_in_var_declaration904 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_var_declaration910 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_var_declaration914 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_assign_in_var_declaration918 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_assign_in_simple_expr967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_simple_expr975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_simple_expr982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_simple_expr990 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_simple_expr993 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_simple_expr996 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_57_in_simple_expr1000 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_simple_expr1003 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_56_in_simple_expr1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITE_in_simple_expr1017 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_simple_expr1020 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_expr_in_simple_expr1023 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_57_in_simple_expr1027 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_expr_in_simple_expr1030 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_56_in_simple_expr1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_construction1050 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_for_construction1052 = new BitSet(new long[]{0x0031100210000080L});
	public static final BitSet FOLLOW_simple_expr_in_for_construction1054 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_for_construction1056 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_expr_in_for_construction1058 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_for_construction1060 = new BitSet(new long[]{0x0031100210000080L});
	public static final BitSet FOLLOW_simple_expr_in_for_construction1062 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_for_construction1064 = new BitSet(new long[]{0x0831300230010080L});
	public static final BitSet FOLLOW_complex_expr_in_for_construction1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_construction1118 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_if_construction1120 = new BitSet(new long[]{0x0080842010000000L});
	public static final BitSet FOLLOW_value_expr_in_if_construction1122 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_if_construction1124 = new BitSet(new long[]{0x0831300230010080L});
	public static final BitSet FOLLOW_complex_expr_in_if_construction1126 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ELSE_in_if_construction1130 = new BitSet(new long[]{0x0831300230010080L});
	public static final BitSet FOLLOW_complex_expr_in_if_construction1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_block_construction1181 = new BitSet(new long[]{0x1831300230010080L});
	public static final BitSet FOLLOW_complex_expr_in_block_construction1183 = new BitSet(new long[]{0x1831300230010080L});
	public static final BitSet FOLLOW_60_in_block_construction1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_func_declaration1209 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_func_declaration1211 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_func_declaration1213 = new BitSet(new long[]{0x0111000200000080L});
	public static final BitSet FOLLOW_type_in_func_declaration1217 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_func_declaration1219 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_57_in_func_declaration1223 = new BitSet(new long[]{0x0011000200000080L});
	public static final BitSet FOLLOW_type_in_func_declaration1225 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_func_declaration1227 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_56_in_func_declaration1236 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_func_declaration1238 = new BitSet(new long[]{0x1831300230010080L});
	public static final BitSet FOLLOW_complex_expr_in_func_declaration1240 = new BitSet(new long[]{0x1831300230010080L});
	public static final BitSet FOLLOW_60_in_func_declaration1243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_1304 = new BitSet(new long[]{0x0480842010000000L});
	public static final BitSet FOLLOW_value_expr_in_return_1307 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_return_1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_complex_expr1322 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_complex_expr1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_declaration_in_complex_expr1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return__in_complex_expr1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_construction_in_complex_expr1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_construction_in_complex_expr1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_construction_in_complex_expr1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complex_expr_in_result1369 = new BitSet(new long[]{0x0831300230010080L});
	public static final BitSet FOLLOW_EOF_in_result1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_in_execute1396 = new BitSet(new long[]{0x0000000000000002L});
}
