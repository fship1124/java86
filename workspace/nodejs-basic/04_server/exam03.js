/**
 * http://localhost:10001/test.do?id=aaa&name=bbb  파라미터값 얻어오기
 */
var http = require("http");
var url = require("url");

var server = http.createServer(function(request, response) {
//	console.log(request.url);
	
	var urlObj = url.parse(request.url, true);
//	console.log(urlObj);
	
	//파라미터값 얻어오기
	console.log("id : " + urlObj.query.id);
	console.log("name : " + urlObj.query.name);
	
	
	//예시. 호출한 사용자 브라우져로 아래와 같은 형식으로 데이터 출력
	/*
	 * uri : /test.do
	 * param
	 * id : aaa
	 * name : bbb
	 */
	response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
	// 여러줄의 데이트를 보낼때는 write 사용
	response.write("<h1>uri : " + urlObj.pathname + "</h1>");
	response.write("<h1>param</h1>");
	response.write("<h1>id : " + urlObj.query.id + "</h1>");
	response.write("<h1>name : " + urlObj.query.name + "</h1>");
	response.end();
	
});

server.listen(10001, function(){
	console.log("10001번 으로 포트 구동중...");
});