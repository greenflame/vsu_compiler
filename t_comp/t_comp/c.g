grammar c;

options {
	language=CSharp3;
	output=AST;
//	backtrack = true;
}

tokens {
	PROGRAM	;
	
	BLOCK	;
	
	FUNCCALL	;
	CALL_PARAMS	;
	
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

INT_TYPE	:	'int';
BOOL_YTPE	:	'bool';
STRING_TYPE	:	'string';

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

func_call
	:	ID '(' ( value_expr ( ',' value_expr)* )? ')' -> ^(FUNCCALL ID ( ^(CALL_PARAMS value_expr*) )? )
	;

simple_expr
	:	ID ASSIGN^ value_expr	// Assign
	|	func_call		// Funccall

	|	READ^ '('! ID ( ','! ID)* ')'!
	|	WRITE^ '('! value_expr ( ','! value_expr)* ')'!

	;
	

construction
	:	simple_expr ';'!
	
	|	'{' construction* '}' -> ^(BLOCK construction*)		// Block
	|	IF^ '('! value_expr ')'! construction ( ELSE! construction )?
	|	FOR '(' simple_expr ';' value_expr ';' simple_expr ')' construction -> ^(FOR simple_expr value_expr simple_expr construction)
	;
	
result
	:	construction* EOF -> ^( PROGRAM construction* )
	;

public execute
	:	result
	;