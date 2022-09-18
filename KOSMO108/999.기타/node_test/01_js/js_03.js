/*
require() 함수 : 모듈을 불러올 때 사용하는 함수
c_module_01.js 모듈 파일을 불러와서 사용
require() 함수의 파라미터로 모듈파일의 이름을 전달하는 데
확장자를 뺀 파일이름 c_module_01 만을 사용
파일이름 앞에 ./ 는 상대경로를 지정
*/
var calc = require('./c_module_01');
/*
::c_module_01::
exports.add = function(){
	return a+b;
}
*/
/*
c_module_01.js 모듈 파일에서 exports.add로 추가한 add속성을(익명함수)
js_03.js 메인 파일에서 calc객체로 접근해서
calc.add()코드로 함수를 호출할 수 있다.
*/
var calc_add = calc.add(10,20);
var calc_multiply = calc.multiply(10,20);
console.log("모듈 테스트 :: calc_add  %d >>> : " + calc_add);
console.log("모듈 테스트 :: calc_multiply  %d >>> : " + calc_multiply);


/*
::c_module_02::
당연하지만 이 파일과 c_module_02의 var=calc로 이름을 동일하게 했어도

var calc = {};

calc.add = function(a,b){
	return a+b;
}

calc.multiply = function(a,b){
	return a*b;
}

module.exports = calc;
*/
var calc2 = require('./c_module_02');
var calc2_add = calc2.add(10,30);
var calc2_multiply = calc2.multiply(10,20);
console.log('모듈테스트 :: calc2.add >>> : ' + calc2_add);
console.log('모듈테스트 :: calc2.multiply >>> : ' + calc2_multiply);

/*


var calc={};//순서없음

calc.add = function(a,b){
	return a+b;
}

calc.multiply = function(a,b){
	return a*b;
}

calc.devide = function(a,b){
	return a/b;
}

calc.substract = function(a,b){
	return a-b;
}

module.exports = calc;
*/

var calc2_1 = require('./c_module_02_1');
var calc2_1_add = calc2_1.add(10,30);
var calc2_1_multiply = calc2_1.multiply(10,20);
var calc2_1_substract = calc2_1.substract(30,10);
var calc2_1_devide = calc2_1.devide(30,10);
console.log('모듈테스트 :: calc2_1.add >>> : ' + calc2_1_add);
console.log('모듈테스트 :: calc2_1.multiply >>> : ' + calc2_1_multiply);
console.log('모듈테스트 :: calc2_1.substract >>> : ' + calc2_1_substract);
console.log('모듈테스트 :: calc2_1.devide >>> : ' + calc2_1_devide);


var getipaddress = require('./ip_module');
var ip = getipaddress.getIp();
console.log('모듈 :: ip 함수 호출 결과 : %s', ip);
