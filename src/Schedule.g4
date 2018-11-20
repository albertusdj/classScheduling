grammar Schedule;
schedule: 'Schedule' '{' classrooms lecturers courses preferences constraints '}';

classrooms: 'Classroom' '{' classroom+ '}';
classroom: classroom_name '[' capacity ']' '{' facility+ '}';
classroom_name: ALPHANUMERIC|NUM|ALPHABET;
capacity: NUM;
facility: facility_name '(' quantity ')';
facility_name: ALPHANUMERIC|ALPHABET;
quantity: NUM;

lecturers: 'Lecturer' '{' lecturer+ '}';
lecturer: lecturer_name '{' datetime+ '}';
lecturer_name: ALPHABET;
datetime: day '(' (time',')*time ')';
day:ALPHABET;
time: start '-' end;
start: NUM'.' NUM;
end: NUM'.'NUM;

courses: 'Course' '{' course+ '}';
course: course_name '{' 'capacity' '(' capacity ')' 'facility' '{' facility* '}' 'lecturerName' '(' lecturer_name ')' 'credits' '(' credits ')' '}';
course_name: ALPHANUMERIC'-'ALPHANUMERIC|NUM;
credits: NUM;

preferences: 'Preferences' '{' preference* '}';
preference: course_name '{' 'facility' '{' facility* '}' 'time' '{' datetime* '}' '}';

constraints: 'Constraints' '{' constraint* '}';
constraint: course_name '{' 'time' '{' datetime+ '}' '}';
NUM: [0-9]+;
ALPHABET: [a-zA-Z]+;
ALPHANUMERIC: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;