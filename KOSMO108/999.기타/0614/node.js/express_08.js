

// Express 기본 모듈 불러오기
var   express = require('express')
    , http = require('http')
    , path = require('path');

// Express의 미들웨어 불러오기
var bodyParser = require('body-parser')
    , static = require('serve-static');

// 익스프레스 객체 생성
var app = express();

// 기본 속성 설정
app.set('port', process.env.PORT || 3000);

// body-parser 미들웨어를 사용해 application/x-www-form-urlencoded 파싱
app.use(bodyParser.urlencoded({extended: false}));

// body-parser 미들웨어를 사용해 application/json 파싱
app.use(bodyParser.json());

// static 미들웨어 serve-static 를 사용해 패스 매핑
// app.use('/public', static(path.join(__dirname, 'public')));
app.use('/public', static(path.join(__dirname, 'public')));


// 라우터 객체 참조
var router = express.Router();

// 미들웨어 파라미터 확인
// 라우팅 함수 등록
//             /process/login/mike
router.route('/process/login/:name').post(function(req, res) {
    console.log('/process/login/:name 처리함');
    
    var paramName = req.params.name;
    /*
        POST 방식 : req.body.id
        GET 방식 : req.query.id
        POST/GET 방식 : req.body.id || req.query.id
    */
    var paramId = req.body.id || req.query.id;
    var paramPassword = req.body.password || req.query.password;
    
    res.writeHead('200', {'Content-Type': 'text/html;charset=utf8'});
    res.write('<h1>Express 서버에서 응답한 결과입니다.</h1>');
     res.write('<div><p>paramName name : ' + paramName + '</p></div>');
    res.write('<div><p>Param id : ' + paramId + '</p></div>');
    res.write('<div><p>Param password : ' + paramPassword + '</p></div>');
    res.write("<br><br><a href='/public/login3.html'>로그인 페이지로 돌아기기</a>");    
    res.end();
});


// 라우터 객체를 app 객체에 등록
app.use('/', router);

http.createServer(app).listen(3000, function() {
    console.log('Express 서버가 3000번 포트에서 시작됨.')
});