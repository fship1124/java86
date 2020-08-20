// socket.io 모듈 추가 

var http = require("http");
var fs   = require("fs");
var io   = require("socket.io");

var server = http.createServer(function(request, response) {
	fs.readFile("server01.html", function(err, data) {
		response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
		response.end(data);
	});
})
.listen(10001, function () {
  console.log("서버 구동 시작...");
});

// 소켓 IO 객체 생성 및 구동
// 웹서버와 다르게 클라이언트와 연결하기 위해 지속적으로 연결되어 있음
var socketIo = io.listen(server);

// 객체 함수 호출(이벤트)- 연결 요청을 하면 그때 호출됨    
// socket: 클라이언트 정보를 가지고 있음/요청을 한 해당 브라우져
socketIo.sockets.on("connection", function (socket) {
  console.log("사용자 소켓 IO 접속됨...");
});