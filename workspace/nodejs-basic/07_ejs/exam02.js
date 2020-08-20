// ejs : 화면 처리 템플릿
// 외부모듈 : npm install ejs   (터미널에 코딩해서 모듈을 추가한다)
var http = require("http");
var fs = require("fs");
var ejs = require("ejs");       //파일안에 있는 % 있는 자바스크립 문자를 컨버팅해준다

http.createServer(function(request, response) {
	fs.readFile("exam02.ejs", "utf-8", function(err, data) {
		var result = ejs.render(
				data, 
				{
					"title": "노드 게시판",
					"data": [2, 4, 6, 8],
				}
		);    // 받아온 data를 ejs 문법에 맞춰서 해석해주세요.
		response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
		response.write(result);
		response.end();
	})
})
.listen(10001, function() {
	console.log("서버 구동중...");
})
