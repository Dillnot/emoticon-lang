//the gramer of the emoticon lang
grammar emoticon-lang;

program
        : var_decl* seq_com EOF # prog
        ;

//Declarations
var_decl
    	:	type ID ASSN expr         # var
    	;

type
    	:	BOOL                      # bool
    	|	INT                       # int
    	;


//comands
com
        :	ID ASSN expr              # assn
    	|	IF expr LPAR c1=seq_com
            ( RPAR
                | ELSE LPAR c2=seq_com RPAR
        	)                       # if
        |	WHILE expr LPAR
		      seq_com RPAR             # while
        ;

seq_com
        :	com*                      # seq
      	;

//exprson

expr
        : e1=sec_expr
            ( op=(EQ | LT | GT) e2=sec_expr )* EOE
        ;

sec_expr
        :	e1=prim_expr
            ( op=(PLUS | MINUS | TIMES | DIV) e2=sec_expr )? EOE
        ;

prim_expr
        :	FALSE                  # false
        |	TRUE                   # true
        |	NUM                    # num
        |	ID                     # id
        |	NOT prim_expr          # not
        |	LPAR expr RPAR         # parens
        ;




//lexicon

EOF     : '><>';
ASSN    : 'XD';
BOOL    : ':P';
INT     : ':|';
LPAR    : '<3';
RPAR    : '</3';
IF      : 'O_o';
ELSE    : 'o_O';
WHILE   : ':)';
EOE     : 'o/\o';
EQ      : ':@'
LT      : ':<';
GT      : ':>';
PLUS    : ':3'
MINUS   : '<:|';
TIMES   : ':D'
DIV     : 'D:'
FLASE   : '}:)';
TRUE    : 'O:)';
NOT     : ':&';
NUM	:	DIGIT+ ;
fragment DIGIT  : '0'..'9' ;
ID	:	LETTER (LETTER | DIGIT)* ;
fragment LETTER : 'a'..'z' | 'A'..'Z' ;
