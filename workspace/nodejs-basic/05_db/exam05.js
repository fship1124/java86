/**
 * delet 문
 */

// mysql 모듈 접근
var mysql = require("mysql");

//mysql 연결정보 얻기
var con = mysql.createConnection({
	host: "localhost",
	port: 3306,
	user: "root",
	password: "1234",
	database: "java86"
});

var sql = "delete from t86_board 	" +
          "where no = ?	";

con.query(sql, ['4'], function(err, result){
		if (err) {
			console.log("등록중 오류 발생");
			console.log(err);
			return;
		}
		console.log("등록이 성공했습니다.");
	});