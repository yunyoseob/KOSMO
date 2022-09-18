

// 서버에서 다른 웹 사이트의 데이터를 가져와 응답하기
// GET 방식 : get() 메소드 사용해보기 

var http = require('http');
var options = {
    host: 'www.google.com',
    port: 80,
    path: '/'
};

var req = http.get(options, function(res) {
    // 응답 처리
    var resData = '';
    res.on('data', function(chunk) {
        resData += chunk;
    });
    
    res.on('end', function() {
        console.log(resData);
    });
});

req.on('error', function(err) {
    console.log("오류 발생: " + err.message);
});