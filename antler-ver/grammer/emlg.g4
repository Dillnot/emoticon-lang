//the gramer of the emoticon lang
grammar emlg;

program
        : seq_com EOF # prog
        ;
//Declarations

//var_decl
//    	:	type ID ASSN expr         # var
//    	;

//type
//    	:	BOOL                      # bool
//    	|	INT                       # int
//    	;


//comands
com
        :	ID ASSN expr EOE              # assn
    	|	IF expr LPAR c1=seq_com
            ( RPAR
                | ELSE LPAR c2=seq_com RPAR
        	)                                  # if
        |	WHILE expr LPAR
		      seq_com RPAR                    # while
        | PRINT ID EOE                          #print
        | PRINT CHAR ID+ EOE    #printchar
        | READ ID EOE #read
        ;

seq_com
        :	com*                      # seq
      	;

//exprson

expr
        : e1=sec_expr
            ( op=(EQ | LT | GT) e2=sec_expr )*
        ;

sec_expr
        :	e1=prim_expr
            ( op=(PLUS | MINUS | TIMES | DIV) e2=sec_expr )?
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
PRINT   : ':O';
CHAR    : ':#';
READ    : '|‑O';
ASSN    : 'XD';
//BOOL    : ':P';
//INT     : ':|';
LPAR    : '<3';
RPAR    : '</3';
IF      : 'O_o';
ELSE    : 'o_O';
WHILE   : '><>';
EOE     : ':$';
EQ      : ':@';
LT      : ':<';
GT      : ':>';
PLUS    : ':3';
MINUS   : '<:|';
TIMES   : ':D';
DIV     : 'D:';
FALSE   : '}:)';
TRUE    : 'O:)';
NOT     : ':&';
NUM	:	DIGIT+ ;
fragment DIGIT  : '0'..'9' ;
ID	:	':' PARTOFID+ ;
fragment PARTOFID : ')' ;

//ignore

SPACE	:	(' ' | '\t')+   -> skip ;
EOL	:	'\r'? '\n'          -> skip ;
COMMENT : ('a'..'z' | 'A'..'Z') -> skip;
