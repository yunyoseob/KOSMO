
//http 모듈을 가져온다.
var http = require('http');

//웹 서버 객체를 만든다.
var server = http.createServer();

//웹 서버를 시작하면 3000번 포트에서 대기하도록 설정한다.
var port = 3000;
server.listen(port, function(){
	console.log('웹 서버가 시작되었습니다. : %d', port);
});

//함수의 순서가 아니라 이벤트의 순서를 잘 보되, 자바스크립트는 인터프리트 방식으로'도' 돌기 때문에 
//또 순서대로 써야해요.


//클라이언트 연결 이벤트 처리
server.on('connection',function(socket){
	//var addr = socket.address();
	//console.log('클라이언트가 접속했습니다. : %s, %d',addr,address,addr.port );
	console.log('클라이언트가 접속했습니다. : %s, %d');
});

//클라이언트 요청 이벤트 처리
server.on('request',function(){
	console.log('클라이언트 요청이 들어왔습니다.');
});

//서버 종료 이벤트 처리
server.on('close', function(){
	
	console.log('서비스가 종료 되었습니다.');
});

setTimeout(function(){
	server.close();
},1000);