/**
 * querystring 모듈: 쿼리에 대한 파싱 처리
 * 
 */
var qs = require("querystring");

var data = "id=test&pass=1234";

// 키 밸류 쌍의 형태로 값을 넘겨줌
var param = qs.parse(data);

console.log(param.id);
console.log(param.pass);