/**
 * 10001번 포트만 생성
 * 
 * 사용자 요청 패스를 이용해서 응답처리한다.
 * /html 일 경우 data/test.html
 * /image 일 경우 data/test.jpg
 * /audio 일 경우 data/test.mp3
 */

// 모듈생성
var http = require("http");
var fs = require("fs");
var url = require("url");

// 서버구동
var server = http.createServer(function(request, response) {
	var fName = "";
	var contentType = "";
	var pathName = url.parse(request.url).pathname;
	
	switch (pathName){
	case "/html": 
		fName = "test.html";
		contentType = "text/html; charset=UTF-8";
		break;
	case "/image":	
		fName = "test.jpg";
		contentType = "image/jpg";
		break;
	case "/audio":	
		fName = "test.mp3";
		contentType = "audio/mp3";
		break;
	}
	
	// 파일읽어서 읽은 data를 요청한 곳에 보내기
	fs.readFile("data/" + fName, function(err, data) {
		response.writeHead(200, {"Content-Type": contentType});
		response.end(data);
		});
	
	// 10001 포트로 서버구동
	}).listen(10001, function() {
		console.log("10001 구동");
	});

