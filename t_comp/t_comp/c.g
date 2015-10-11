grammar c;

options {
	language=CSharp3;
	output=AST;
//	backtrack = true;
}

tokens {
	PROGRAM	;
	BLOCK	;
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

//	Parser

value_group
	:	'('! value_add ')'! | NUMBER | STRING | ID | LOGIC
	;
	
value_mult
	:	value_group ( ( MUL | DIV )^ value_group )*
	;
	
value_add
	:	value_mult ( ( ADD | SUB )^ value_mult )*
	;
	

logic_group
//	:	'('! logic_add ')'! | value_add ( ( GE | LE | NEQUALS | EQUALS | GT | LT )^ value_add )?
	:	value_add ( ( GE | LE | NEQUALS | EQUALS | GT | LT )^ value_add )?
	;
	
logic_mult
	:	logic_group ( LMUL^ logic_group)*
	;
	
logic_add
	:	logic_mult ( LADD^ logic_mult)*
	;


assign
	:	ID ASSIGN^ logic_add
	;
	
assign_list
	:	( assign ( ',' assign )* )? -> ^(BLOCK assign*)
	;

expr
	:	'{'! expr_list '}'!
	
	|	assign ';'!
	
	|	READ^ '('! ID ( ','! ID)* ');'!
	|	WRITE^ '('! logic_add ( ','! logic_add)* ');'!
	
	|	IF^ '('! logic_add ')'! expr ( ELSE! expr )?
	|	FOR '(' assign_list ';' logic_add ';' assign_list ')' expr -> ^(FOR assign_list logic_add assign_list expr)
	;
	
expr_list
	:	expr* -> ^(BLOCK expr*)
	;
	
result
	:	expr_list EOF -> ^( PROGRAM expr_list )
	;

public execute
	:	result
	;