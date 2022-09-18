

// Express 기본 모듈 불러오기
// express 모듈은 웹 서버를 위해 만들어진 것으로 http 모듈 위에서 동작한다.
// express 모듈을 사용할 때는 항상 http 모듈도 함께 불러들인다.

var express = require('express'), 
	   http = require('http');

// 익스프레스 객체 생성
var app = express();

// use() 메소드로 미들웨어 등록
app.use(function(req, res, next) {
    console.log('첫 번째 미들웨어에서 요청을 처리함.')
    
    res.writeHead('200', {'Content-Type': 'text/html;charset=utf8'});
    res.end('<h1>Express 서버에서 응답한 결과입니다.</h1>')
});

// 기본 포트를 app 객체에 속성으로 설정
app.set('port', process.env.PORT || 3000);

// Express 서버 시작
http.createServer(app).listen(app.get('port'), function(){
	console.log('익스프레스 서버를 시작했습니다 : ' + app.get('port'));	
});    

// http.createServer(app).listen(app.get('port'), function(){
	
// });