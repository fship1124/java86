var http = require("http");
var fs   = require("fs");
var io   = require("socket.io");

var server = http.createServer(function(request, response) {
  fs.readFile("server02.html", function(err, data) {
    response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
    response.end(data);
  });
})
.listen(10001, function () {
  console.log("서버 구동 시작...");
});

// 소켓 IO 객체 생성 및 구동
var socketIo = io.listen(server);

socketIo.on("connection", function (socket) {
	// 누군가가 echo를 요청하면 콜백함수 실행 .... socket.emit("echo", aaaa)
  socket.on("echo", function (data) {
    console.log("클라이언트 전송 데이터 : " + data);
    socket.emit("serverEcho", data);   // socket.emit 했다면 socket.on 되어있다고 보면 됨
  });
});