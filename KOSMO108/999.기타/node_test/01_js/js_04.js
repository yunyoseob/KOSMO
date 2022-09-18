

var f= false;
console.log(f);
var t =true;
console.log(t);
var max = Number.MAX_VALUE;
console.log(max);
var min = Number.MIN_VALUE;
console.log(min);
var s1 = 'abc';
console.log(s1);
var s2 = "abc";
console.log(s2);


var age=20;
console.log('나이 : %d', age);
var name='소녀시대'
console.log('이름 : %s', name);

//자바스크립트에서 {} 중괄호를 이용해서 객체 만들고
//{} 중괄호로 묶은 객체 안에는 속성을 추가할 수 있다.
var Person = {};

Person['age'] = 20;
Person['name'] = '소녀시대';
Person.mobile = '010-1234-1234';

//객체 안에 들어 있는 속성의 이름은 하나의 변수로 생각할 수 있다.("age")
//변수의 이름과 변수 값 또는 속성의 이름과 속성의 값이라는 형태로 조합된다.("age"="20")
//객체에 넣을 수 있는 속성은 점(.) 연산자와 속성의 이름으로 접근할 수 있고(ex:Person.age)
//[] 대괄호와 속성의 이름으로 접근할 수 있다.(Person['age'])
console.dir(Person);
console.log('나이 : %d', Person.age);
console.log('이름 : %s', Person.name);
console.log('전화 : %s', Person.mobile);
console.log('나이 : %d', Person['age']);
console.log('이름 : %s', Person['name']);
console.log('전화 : %s', Person['mobile']);