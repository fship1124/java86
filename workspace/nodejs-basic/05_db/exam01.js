/**
 * 조회
 */

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

console.log("con 객체 정보 확인");
for (var key in con) {
	console.log("key : " + key + ", value: "+ con[key]);
}

console.log("연결 종료");
con.end();           //커넥션 종료