
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