/**
 * fs : 파일을 읽거나 쓰거나 할때 사용함
 * Sync가 붙은 함수는 동기적(동시불가능) 읽기, 붙지 않은 함수는 비동기적(동시가능) 읽기
 * 동기적이 안정적이나 비동기적에 비해 일에 대한 처리가 빠르지 않음.
 * 동기적은 해당 파일을 다 읽을 때까지 기다렸다가 다음함수 처리를 진행. 비동기적은 실행시키고 다음 함수 호출
 */
var fs = require("fs");

// data : 읽은 내용
fs.readFile("test.txt", "utf-8", function(err, data) {
	console.log("비동기 읽은 데이터");
	console.log(data);
})
console.log("비동기 파일 읽기 호출 후...");


var result = fs.readFileSync("test.txt", "utf-8");
console.log("동기 파일 읽기 호출 후...");
console.log(result);