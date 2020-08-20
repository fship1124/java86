/**
 * http 모듈을 이용한 서버 통신 방식
 */
var http = require("http");

// 서버 생성
var server = http.createServer();

// 구동된 서버에 이벤트 연결 : on
server.on("request", function() {   // emit으로 request 호출하면 콜백함수 실행
	console.log("사용자 요청옴...");
});

// http://localhost:10001/ 
server.listen(10001, function() {   // 10001 포트로 서버구동, 서버가 정상적으로 구동되면 콜백함수 실행
	console.log("10001번 포트로 구동중...")
});