grammar c;

options {
	language=CSharp3;
	output=AST;
//	backtrack = true;
}

tokens {
	PROGRAM		;
	
	BLOCK		;

	FUNC_ID		;
	
	FUNC_CALL	;
	CALL_PARAMS	;	

	FUNC_DEC	;
	FUNC_TYPE	;
	DEC_PARAMS	;
	DEC_PARAM	;
	FUNC_BODY	;
	
	VAR_DEC		;
	VAR_TYPE	;
	DEC_INITED	;
	DEC_NOT_INITED	;
	
	FOR_INIT	;
	FOR_COND	;
	FOR_STEP	;
	FOR_BODY	;
	
	IF_COND		;
	IF_BODY		;
	IF_ELSE_BODY	;
}

@lexer::namespace { t_comp }
@parser::namespace { t_comp }

//	Hidden stream tokens

WS
	:	( ' ' | '\t' |  '\f' | '\r' | '\n' )+ { $channel=Hidden; }
	;
	
SL_COMMENT
	:	'//' (options { greedy=false; }: .)* '\r'? '\n' { $channel=Hidden; }
	;
	
ML_COMMENT
	:	'/*' (options { greedy=false; }: .)* '*/' { $channel=Hidden; }
	;

//	Tokens

ADD	:	'+'	;
SUB	:	'-'	;
MUL	:	'*'	;
DIV	:	'/'	;

LADD	:	'||'	;
LMUL	:	'&&'	;

GE	:	'>='	;
LE	:	'<='	;
NEQUALS	:	'!='	;
EQUALS	:	'=='	;
GT	:	'>'	;
LT	:	'<'	;

ASSIGN	:	'='	;

IF	:	'if'	;
ELSE	:	'else'	;

FOR	:	'for'	;

READ	:	'read'	;
WRITE	:	'write'	;

INT_TYPE	:	'int'		;
BOOL_TYPE	:	'bool'		;
STRING_TYPE	:	'string'	;
VOID_TYPE	:	'void'		;

RETURN		:	'return'	;

NUMBER
	:	('0'..'9')+
	;
	
LOGIC
	:	'true' | 'false'
	;
	
ID
	:	('a'..'z' | 'A'..'Z' | '_')
		('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
	;

STRING
	:	'"' (options { greedy=false; }: .)* '"'
	;	
	

/*	Value expr begin	*/

primitive_value
	:	NUMBER
	|	STRING
	|	LOGIC
	|	ID
	|	func_call
	;

value_group
	:	'('! value_add ')'! | primitive_value
	;
	
value_mult
	:	value_group ( ( MUL | DIV )^ value_group )*
	;
	
value_add
	:	value_mult ( ( ADD | SUB )^ value_mult )*
	;
	

logic_group
	:	value_add ( ( GE | LE | NEQUALS | EQUALS | GT | LT )^ value_add )?
	;
	
logic_mult
	:	logic_group ( LMUL^ logic_group)*
	;
	
logic_add
	:	logic_mult ( LADD^ logic_mult)*
	;

value_expr
	:	logic_add
	;
	
/*	Value expr end		*/

type
	:	INT_TYPE | BOOL_TYPE | STRING_TYPE | VOID_TYPE
	;

func_call
	:	ID '(' ( value_expr ( ',' value_expr)* )? ')' -> ^(FUNC_CALL ^( FUNC_ID ID ) ^(CALL_PARAMS value_expr*) )
	;

assign
	:	ID ASSIGN^ value_expr
	;
	
var_declaration
	:	type ( ID | assign ) ( ',' ( ID | assign ) )* -> ^(VAR_DEC ^( VAR_TYPE type ) ^( DEC_NOT_INITED ID* ) ^( DEC_INITED assign* ) )
	;

simple_expr
	:	assign			// Assign
	|	var_declaration		// Var declaration
	|	func_call		// Funccall

	|	READ^ '('! ID ( ','! ID)* ')'!				// Temporary
	|	WRITE^ '('! value_expr ( ','! value_expr)* ')'!		// Temporary

	;
	
for_construction
	:	FOR '(' simple_expr ';' value_expr ';' simple_expr ')' complex_expr ->
		^(FOR ^( FOR_INIT simple_expr ) ^( FOR_COND value_expr ) ^( FOR_STEP simple_expr ) ^( FOR_BODY complex_expr ) )
	;

if_construction
	:	IF '(' value_expr ')' complex_expr ( ELSE complex_expr )? ->
		^( IF ^( IF_COND value_expr ) ^( IF_BODY complex_expr ) ^( IF_ELSE_BODY complex_expr? ) )
	;

block_construction
	:	'{' complex_expr* '}' -> ^(BLOCK complex_expr*)
	;

/* Declaration */

func_declaration
	:	type ID '(' ( type ID ( ',' type ID )* )?  ')' '{' complex_expr* '}' ->
		^(FUNC_DEC ^( FUNC_TYPE type ) ^( FUNC_ID ID ) ^(DEC_PARAMS ^( DEC_PARAM type ID )* ) ^( FUNC_BODY complex_expr* ) )
	;

return
	:	RETURN^ value_expr? ';'!
	;

complex_expr
	:	simple_expr ';'!
	
	|	func_declaration

	|	return
	
	|	block_construction

	|	if_construction
	|	for_construction
	;
	

result
	:	complex_expr* EOF -> ^( PROGRAM complex_expr* )
	;

public execute
	:	result
	;