var http = require("http");
var fs   = require("fs");
var io   = require("socket.io");

var server = http.createServer(function(request, response) {
  fs.readFile("server04.html", function(err, data) {
    response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
    response.end(data);
  });
})
.listen(10001, function () {
  console.log("서버 구동 시작...");
});

// 소켓 IO 객체 생성 및 구동
var socketIo = io.listen(server);

var idArr = [];

socketIo.on("connection", function (socket) {
  
  // 마지막 접속한 사용자의 소켓 구분 아이디를 저장
  socket.on("login", function (loginId) {
    console.log("접속한 회원 정보 : " + loginId, socket.id);
    // 입력한 아이디와 socket.id를 연결
    idArr[loginId] = socket.id;
  });
  
  socket.on("msg", function (data) {
    // io.to("전송할 소켓 아이디").emit
	// data.recvId:받을사람, data.sendId,data.msg ...정보가 필요함 
    socketIo.to(idArr[data.recvId]).emit( //누구에게 보내겠다
              "msg", 
              data.sendId + "님이 당신에게 귓말을 보냈습니다.\n" + data.msg);
  });
});