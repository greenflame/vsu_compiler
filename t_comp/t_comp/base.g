grammar c;

options {
  language=CSharp3;
  output=AST;
//  backtrack = true;
}

tokens {
	PROGRAMM	;
}

@lexer::namespace { t_comp }
@parser::namespace { t_comp }

WS
	:	( ' ' | '\t' |  '\f' | '\r' | '\n' )+ { $channel=Hidden; }
	;

NUMBER
	:	('0'..'9')+ ('.' ('0'..'9')+)?
	;


group
	:	'('! add ')'! | NUMBER
	;
	
mult
	:	group ( ( '*' | '/' )^ group )*
	;
	
add
	:	mult ( ( '+' | '-' )^ mult )*
	;

result
	:	add EOF -> ^(PROGRAMM add)
	;

public execute
	:	result
	;