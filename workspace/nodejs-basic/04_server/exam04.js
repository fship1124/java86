/**
 * data폴더 파일 이용. 
 * 포트번호 10001 호출시 : html
 * 포트번호 10002 호출시 : img
 * 포트번호 10003 호출시 : mp3
 */

var http = require("http");
var fs = require("fs");

//서버생성 1 , 서버구동 1  --비동기방식으로 콜백함수안에서 response 로 보내줌
http.createServer(function(request, response) {
	//파일의 내용을 읽는다.
	fs.readFile("data/test.html", function(err, data) {
		response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
		response.end(data);   //data를 보내준다
	});
}).listen(10001, function() {console.log("10001 구동");});

//서버생성 2 , 서버구동 2
http.createServer(function(request, response) {
	fs.readFile("data/test.jpg", function(err, data) {
		response.writeHead(200, {"Content-Type": "image/jpg"});
		response.end(data);
	});
}).listen(10002, function() {console.log("10002 구동");});

//서버생성 3 , 서버구동 3
http.createServer(function(request, response) {
	fs.readFile("data/test.mp3", function(err, data) {
		response.writeHead(200, {"Content-Type": "audio/mp3"});
		response.end(data);
	});
}).listen(10003, function() {console.log("10003 구동");});


