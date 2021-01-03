grammar CTLFormula;      // 定义一个语法，名字与文件名一致
//parser
parse:  formula EOF
;
formula:       TRUE
        |   FALSE

        |   formula IMP formula
        |   '(' formula IMP formula ')'

        |   formula OR formula
        |   '(' formula OR formula ')'

        |   formula AND formula
        |   '(' formula AND formula')'

        |   NOT formula
        |   '(' NOT formula ')'

        |   formula U formula
        |   '[' formula U formula ']'

        |   A X formula
        |   '(' A X')'

        |   E X formula
        |   '(' E X ')'

        |   A F formula
        |   '(' A F ')'

        |   E F formula
        |   '(' E F ')'

        |   A G formula
        |   '(' A G formula ')'

        |   E G formula
        |   '(' E G formula ')'

        |   A '[' formula U formula ']'
        |   '(' A '[' formula U formula ']' ')'

        |   E '[' formula U formula ']'
        |   '(' E '[' formula U formula ']' ')'

        |   ATOM
;

//lexer
AND: '&' | 'and' | 'AND' ;
OR: '|' | 'or' | 'OR';
NOT:'~' |'NOT' | 'not';
TRUE: 't' | 'T' | '1';
FALSE: 'f' | 'F' | '0';
IMP: '->';

X: 'X_';
// eventually
F: 'F_';
// exist
E: 'E_';
// always
A: 'A_';
// global
G: 'G_';
// until
U: 'U_';

ATOM:('a'..'z'|'A'..'Z'|'0'..'9')+;
// 省略空白符号
SpaceOrTab: [ \t\n]+ -> skip;
Comment: '--' ~[\r\n]* -> skip;