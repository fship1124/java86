/**
 * inser 문
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

// sql 쿼리 문 작성
var sql = "select no, title, writer" +
		  "  from t86_board        " +
		  " order by no desc       " +
		  " limit ?, ?			   ";  		// limit(현재 페이지 번호, 목록에 보여줄 숫자): 0번째 위치부터 2개 가져와라. 
                                            // 동적으로 받고 싶을땐 ?로 설정하고 [] 로 값 설정해주면 됨. =con.query(sql, [0,2], function(err, rows, fields)

// sql 실행: 결과값을 주기위해 콜백함수 설정(error, data결과값, )
con.query(sql, [0,2], function(err, rows, fields) {     //rows = ResultSet
	// 에러가 존재할 경우
	if (err) {
		console.log("쿼리 실행시 오류 발생");
		console.log(err);
		return;
	}
	
	console.log("실행된 결과");
	rows.forEach(function (row, i){    // i: index
		console.log(i + " : " + row.no + ", " + row.title + ", " + row.writer );
	});
});