

var http=require('http');

var server = http.createServer();

var host = '192.168.219.115';
var port = '3000';
//빙빙돌기만 해요
server.listen(port, function(){
	console.log('웹 서버가 시작 되었습니다. : %s %d', host,port);
});