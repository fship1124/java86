var http = require("http");
var fs   = require("fs");
var io   = require("socket.io");

var server = http.createServer(function(request, response) {
  fs.readFile("server03.html", function(err, data) {
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
  socket.on("msg", function (data) {
    console.log("전체 전송 : " + data);
    // 개별통신 : 데이터를 보낸 사용자에게만 보내기
//    socket.emit("msg", data);
    
    // 접속한 사용자 모두에게 데이터 전송 : 전체 통신일 경우 io.sockets.emit를 사용함
//    socketIo.sockets.emit("msg", data);
    
    // 나를 제외한 접속자 모두에게 : 전체 통신일 경우 socket.broadcast.emit를 사용함
    socket.broadcast.emit("msg", data);
    
  });
});