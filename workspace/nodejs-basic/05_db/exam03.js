// mysql 모듈 접근
var mysql = require("mysql");

// mysql 연결정보 얻기
var con = mysql.createConnection({
	host: "localhost",
	port: 3306,
	user: "root",
	password: "1234",
	database: "java86"
}); 

var sql = "insert into t86_board(writer, title, content) " +
          "values(?, ?, ?)								 ";

// con.query(sql, [등록할 데이타값], 완성시 콜백함수)
con.query(sql, ['test1234', 'node insert', 'success'], function(err, result){
	if (err) {
		console.log("등록중 오류 발생");
		console.log(err);
		return;
	}
	console.log("등록이 성공했습니다.");
});