/**
 * http://usejsdoc.org/
 */
var http = require("http");
var fs = require("fs");
// POST 방식으로 들어온 파라미터를 파싱하기 위해 필요한 모듈
var qs = require("querystring");        

http.createServer(function(request, response) {
	//request.method : get 방식 , post 방식
	if (request.method === "GET"){    // GET: 파싱해야함     
		fs.readFile("data/form.html", function(err, data) {
			response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
			response.end(data);
		});
	} else if(request.method === "POST") {    // POST: 사용자가 입력된 내용을 서버에 저장하는 기능
		console.log("POST 방식으로 요청왔음");
		// POST 방식일 경우 파라미터 처리
		// 이벤트 : data(파라미터 읽는 동안 발생되는 이벤트), 
		//       end(body의 파라미터 내용을 다 읽은 다음 호출) 이용해서 처리한다.
		
		/*
		request.emit("data", "aaa");
		request.emit("data", "bbb");
		*/
		var pData = "";
		// on으로 등록하면 누군가 emit(request가 다 읽고난뒤 자동으로 호출된다)을 했을때 호출된다.
		request.on("data", function(data) {   //data: 파라미터의 데이타
			pData += data;
		}); 
		
		request.on("end", function() {
			var param = qs.parse(pData);
			response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
			response.write("<h1>" + param.jumin1 + "</h1>");
			response.write("<h1>" + param.jumin2 + "</h1>");
			response.end();
		});
	}
})
.listen(10001, function() {
	console.log("10001번 구동중입니다.");
});