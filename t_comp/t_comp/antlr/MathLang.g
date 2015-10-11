grammar MathLang;

options {
  language=CSharp3;
  output=AST;
  backtrack = true;
}


tokens {
  UNKNOWN             ;
  PRINT   = 'print'   ;
  INPUT   = 'input'   ;
  FUNCTION			  ;
  BLOCK               ;
  PROGRAM             ;
  WHILE = 'while'	  ;
  UNTIL = 'until'	  ;
  DO = 'do'			  ;
  FOR = 'for'		  ;
  TO = 'to'			  ;
  IF = 'if'			  ;
  THEN = 'then'		  ;
  ELSE = 'else'       ;
  BEGIN = 'begin'	  ;
  END = 'end'		  ;
  AND = 'and'         ;
  OR = 'or'			  ;
}


@lexer::namespace { MathLang }
@parser::namespace { MathLang }


WS:
  ( ' ' | '\t' |  '\f' | '\r' | '\n' )+ {
    $channel=Hidden;
  }
;

SL_COMMENT:
  '//' (options { greedy=false; }: .)* '\r'? '\n' {
    $channel=Hidden;
  }
;
ML_COMMENT:
  '/*' (options { greedy=false; }: .)* '*/' {
    $channel=Hidden;
  }
;




NUMBER: ('0'..'9')+ ('.' ('0'..'9')+)?
;
IDENT:  ( 'a'..'z' | 'A'..'Z' | '_' )
        ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*
;
ADD:    '+'     ;
SUB:    '-'     ;
MUL:    '*'     ;
DIV:    '/'     ;
ASSIGN: ':='     ;
EQ: '=' ;
GE: '>=' ;
LE: '<=' ;
NE: '<>' ;
GT: '>' ;
LT: '<' ;


compare: term (GE | LE | EQ | NE | LT | GT)^ term;
and_logic: compare(AND^ compare)*;
or_logic: and_logic(OR^ and_logic)*;

func_call : IDENT^ '('! ((or_logic | group) (','(or_logic | group))*)? ')'!
;

group:
  '('! term ')'!
| NUMBER
| IDENT
;


mult: group ( ( MUL | DIV )^ group )*  ;
add:  mult  ( ( ADD | SUB )^ mult  )*  ;
term: add  ;

exprList: ((expr* (';')+)* expr? (';')*)? -> ^(BLOCK expr*)
;

expr:
  PRINT^ term
| INPUT^ IDENT
| func_call
| IF^ or_logic THEN! expr (ELSE! expr)?
| WHILE^ or_logic DO! expr
| DO^ expr WHILE! or_logic
| IDENT ASSIGN^ term
| BEGIN! exprList END!
;

program: exprList  ;

result: program EOF -> ^(PROGRAM program);

public execute:
  result
;
