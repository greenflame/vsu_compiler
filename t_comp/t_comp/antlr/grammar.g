grammar c;

options {
  language=CSharp3;
  output=AST;
//  backtrack = true;
}

programm
	:	'hello'
	;
	
public execute
	:	programm
	;