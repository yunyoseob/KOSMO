
/*

npm install express --save
npm install http --save
npm install path --save
npm install body-parser --save
npm install serve-static --save
npm install fs --save

// 파일 업로드 모듈 
npm install multer --save
// 다른 사이트에도 업로드 할 수 있다. 
npm install cors --save
// 마임 모듈 
npm install mime --save 

node express_11.js

http://localhost:3000/public/photo.html

// 파일 업로드 폴더 
03_express/uploads

*/

// Express 기본 모듈 불러오기
var express = require('express')
  , http = require('http')
  , path = require('path');

// Express의 미들웨어 불러오기
var bodyParser = require('body-parser')
  , static = require('serve-static');

// 파일 처리
var fs = require('fs');  

// 파일 업로드용 미들웨어 
var multer = require('multer');

//클라이언트에서 ajax로 요청 시 CORS(다중 서버 접속) 지원
var cors = require('cors');

// mime 모듈
var mime = require('mime');

// 익스프레스 객체 생성
var app = express();

// 기본 속성 설정
app.set('port', process.env.PORT || 3000);

// body-parser 설정
app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

app.use('/public', static(path.join(__dirname, 'public')));
app.use('/uploads', static(path.join(__dirname, 'uploads')));

//클라이언트에서 ajax로 요청 시 CORS(다중 서버 접속) 지원
app.use(cors());

// multer 미들웨어 사용 : 미들웨어 사용 순서 중요 body-parser -> multer -> router
// 파일 제한 : 10개, 1G
var storage = multer.diskStorage({
    destination: function(req, file, callback){
        callback(null, 'uploads');
    },
    filename: function(req, file, callback){        
        callback(null, file.originalname + Date.now());
    }
});

console.log('storage >>> : ' + storage);

var upload = multer({
    storage: storage,
    limits: {
        files: 10,
        fileSize: 1024 * 1024 * 1024
    }
});

console.log('upload >>> : ' + upload);

// 라우터 사용하여 라우팅 함수 등록
var router = express.Router();

router.route('/process/photo').post(upload.array('photo', 1), function(req, res) {
	console.log('/process/photo  호출됨' + req);

    try {
        var files = req.files;
        console.log("files >>> : " + files);
        console.dir('#=============== 업로드된 첫번째 파일 정보#');
        console.dir(req.files[0]);
        console.dir('#===============#');
        
        // 현재의 파일 정보를 저장할 변수 선언
        var originalname = '';
            
        
        if (Array.isArray(files)){ // 배열에 들어가 있는 경우 (설정에서 1개의 파일도 배열에 넣게 했음)
            console.log("배열에 들어있는 파일 갯수: %d", files.length);
            
            for (var index=0; index < files.length; index++) {
                originalname = files[index].originalname;
                console.log("originalname >>> : ", originalname);                
            }
        }else{ 
            console.log('업로드된 파일이 배열에 들어가 있지 않습니다.');
        }
        
        console.log('현재 파일 정보 : ' + originalname );
        
        // 클라이언트에 응답 전송
        res.writeHead('200', {'Content-Type': 'text/html;charset=utf8'});
        res.write('<h1>파일 업로드 성공</h1>');
        res.write('<hr/>');
        res.write('<p>원본 파일명 : ' + originalname + ' </p>');
        res.end();
        
    }catch(err){
        console.dir(err.stack);
    }
});


app.use('/', router);

// Express 서버 시작
http.createServer(app).listen(app.get('port'), function(){
  console.log('Express server listening on port ' + app.get('port'));
});
