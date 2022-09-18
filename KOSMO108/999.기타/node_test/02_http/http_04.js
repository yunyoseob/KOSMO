
var http = require('http');
//fileSystem
var fs = require('fs');

var app = http.createServer(function(req, res){
	var _url = req.url;

	if(_url == '/'){
		_url = '/index.html';
	}

	if(_url=='/favicon.ico'){
		res.writeHead(404);
		res.end();
		return;
	}

	res.writeHead(200);
	res.end(fs.readFileSync(__dirname+_url));
});

app.listen(3000,function(){
	console.log('http_04.js 웹서버 시작 >>> : ');
});