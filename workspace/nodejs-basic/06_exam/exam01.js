/*
    // 사용할 모듈 정리
    1. http (웹서버 기능)
    2. fs (파일 내용 읽기)
    3. mysql (데이터베이스 접근)
    4. querystring (파라미터 처리)
    
   	게시판 기능중에서 등록폼, 등록, 목록
   	
   	/writeForm.do 일 경우 writeForm.html 파일의 내용을 읽어서 사용자에게 전송
   	/write.do 일 경우 넘어온 파라미터 값을 얻어온 다음 데이터베이스에 입력
   	  
   	등록된 다음 자동으로 /list.do 경로를 호출
   	
   	/list.do 일 경우 데이터베이스의 게시물 내용을 조회한 다음 사용자 화면으로 결과를 넘겨준다.
 */

var http 		= require("http");
var fs 			= require("fs");
var mysql 		= require("mysql");
var qs = require("querystring");

http.createServer(function(request, response) {
	console.log(request.url);
	switch (request.url) {
	case "/writeForm.do" :
		writeForm(response);
		break;
	case "/write.do" :
		write(request, response);
		break;
	case "/list.do" :
		list(response);
		break;
	}
})
.listen(10001, function() {
	console.log("10001 서버 구동중");
});


// 메서드 분할
function writeForm(response){
	fs.readFile("writeForm.html", "utf-8", function(err, data) {
		// 오류에 대한 처리 코드 추가 가능 ...(생략)
		response.writeHead(200, {"Content-Type": "text/html; charset=UTF-8"});
		response.end(data);
	});
}

// db연결정보
var con = mysql.createConnection({
	host: "localhost",
	port: 3306,
	user: "root",
	password: "1234",
	database: "java86"
});

function write(request, response){
		console.log("post방식으로 요청왔음");
		var pData = "";
		// 내부적으로 emit 함. 이벤트 2가지 추가 data, end
		request.on("data", function(data) {   //data: 파라미터의 데이타
			pData += data;
		}); 
		
		request.on("end", function() {
			// pData -> title=aaaa&writer=bbb&content=ccc
			var param = qs.parse(pData);
			// db 작업
			var sql = "insert into t86_board(writer, title, content) " +
	          		  "values(?, ?, ?)								 ";
			// con.query(sql, [등록할 데이타값], 완성시 콜백함수)
			con.query(sql, [param.writer, param.title, param.content], function(err, result){
				if (err) {
					console.log("등록중 오류 발생");
					console.log(err);
					return;
				}
				response.writeHead(302, {"Location": "list.do"});
				console.log("등록이 성공했습니다.");
				response.end();
			});
			con.end();
		});
};

function list(response){
	response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
	response.write("<h1>노드 게시판</h1>");
	var sql = "select no, title, writer" +
			  "  from t86_board        " +
			  " order by no desc       ";
	
	con.query(sql, function(err, rows, fields) {     //rows = ResultSet
	// 에러가 존재할 경우
	if (err) {
		console.log("쿼리 실행시 오류 발생");
		console.log(err);
		return;
	}
	
	console.log("실행된 결과");
		response.write("<table>");
			response.write("<tr>");
			response.write("	<td>번호</td>");
			response.write("	<td>제목</td>");
			response.write("	<td>작성자</td>");
			response.write("</tr>");
				rows.forEach(function (row, i) {
					response.write("<tr>");
					response.write("	<td>" + row.no + "</td>");
					response.write("	<td>" + row.title + "</td>");
					response.write("	<td>" + row.writer + "</td>");
					response.write("</tr>");
				});
			response.write("</table>");
			response.end();
	});
}