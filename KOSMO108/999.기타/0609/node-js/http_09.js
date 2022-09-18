// 서버에서 다른 웹 사이트의 데이터를 가져와 응답하기
// POST 방식 : request() 메소드 사용 
// request() 메소드는 get() 메소드와 사용방법이 다르다.
// 요청을 보내려면 헤더와 본문을 모두 직접 설정해야 한다.

// 구글 사이트에서 POST 요청을 받지 못하므로 오류 발생

var http = require('http');
var opts = {
    host: 'www.google.com',
    method: 'POST',
    port: 80,
    path: '/',
    headers: {}
};


var resData = '';
var req = http.request(opts, function(res) {
    // 응답 처리
    var resData = '';
    res.on('data', function(chunk) {
        resData += chunk;
    });
    
    res.on('end', function() {m,.mnm,,
        console.log(resData);
    });
});

opts.headers['Content-Type'] = 'application/x-www-form-urlencoded';
req.data = "q=actor";
opts.headers['Content-Length'] = req.data.length;

req.on('error', function(err) {
    console.log("오류 발생: " + err.message);
});

req.write(req.data);
req.end();