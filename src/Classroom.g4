grammar Classroom;
classroom: 'Classroom {' facility+ '}';
facility: NAME '(' NUM ')';
NUM: [0-9]+;
NAME: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;