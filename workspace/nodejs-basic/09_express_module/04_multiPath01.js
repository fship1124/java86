// 모듈을 추출합니다.
// npm install body-parser
var http = require('http');
var express = require('express');
var fs = require("fs");
// post 요청된 데이터를 파싱처리 해준다.
var bodyParser = require("body-parser");
var ejs = require("ejs");
var mysql = require("mysql");

// 서버를 생성합니다.
var app = express();

var con = mysql.createConnection({
  host : 'localhost',
  port : 3306,
  user : 'root',
  password : '1234',
  database : 'java86'
});

app.use(bodyParser.json());                       // JSON 데이터 처리 
app.use(bodyParser.urlencoded({extended:true}));  // POST 데이터 처리  --> request on 이벤트 등록안해도 되도록 자동으로 해줌

// 경로설정
app.get('/', function (request, response) {
  console.log("최초 메인호출 페이지 작성");
});

app.get('/board/list.do', function (request, response) {     //  /board/list.do url로 들어오는 요청에 의해서만 처리
  console.log("list 관련 페이지 작성");
});

app.get('/board/writeForm.do', function (request, response) {
  console.log("writeForm 관련 페이지 작성");
});

app.post('/board/write.do', function (request, response) {
  console.log("write 관련 페이지 작성");
});

// 서버를 실행합니다.
http.createServer(app).listen(10001, function () {
    console.log('Server running at http://127.0.0.1:10001');
});
