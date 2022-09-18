

var http = require('http');
var fs = require('fs');

// 웹 서버 객체를 만든다.
// 클라이언트의 요청을 처리하는 콜백 함수를 파라미터로 전달한다.
var server = http.createServer(function(req, res) {
    console.log('클라이언트 요청이 들어왔습니다.');
    
    var filename = 'house.png';
    fs.readFile(filename, function(err, data) {
        res.writeHead(200, {"Content-Type": "image/png"});
        res.write(data);
        res.end();
    });
    
});

// 웹 서버를 시작하면 3000번 포트에서 대기하도록 설정한다.
var port = 3000;
server.listen(port, function() {
    console.log('웹 서버가 시작되었습니다. : %d', port);
});

// connection 이벤트로 클라이언트 연결 이벤트 처리
server.on('connection', function(socket) {
    var addr = socket.address();
    console.log('클라이언트가 접속했습니다. : %s, %d', addr.address, addr.port);
});


// close 이벤트로 서버 종료 이벤트 처리 
server.on('close', function() {
    console.log('서버가 종료됩니다.');
});