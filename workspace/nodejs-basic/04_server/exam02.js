// 모듈을 가져온다
var http = require("http");

// 서버 생성 (누군가 요청이 있을때 서버 생성 됨)
// createServer(function - 서버 요청시에 자동 호출되는 함수)
var server = http.createServer(function(request, response) {
	//response.writeHead(statusCode: 응답코드, headers)
	response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
	
	// 여러줄의 데이트를 보낼때는 write 사용
	response.write("<h1>화면에 데이터 보내기</h1>");
	response.write("<h1>노드를 이용한 출력</h1>");
	
	// 요청에 의한 응답을 보내줌 
	response.end("<h1>Hello!! 노드~~");
});

server.listen(10001, function() {
	console.log("10001번 포트로 서버 구동중...");
});

