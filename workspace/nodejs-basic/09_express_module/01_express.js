// Terminal창에 npm install express 추가하여 모듈 추가
// 모듈을 추출합니다. express 자체는 가볍지만 서버와 붙여서 쓸수 있는게 많음
var express = require('express');

// 서버를 생성합니다.
var app = express();

// request 이벤트 리스너를 설정합니다. - 화면에 대한 처리를 미들웨어로 구성하여 처리한다.. 
// app.use: 미들웨어를 호출할 함수 /function 앞에 어떠한 주소를 지정하지 않으면 모든 url에 대한 미들웨어라 할 수 있음. 
// 미들웨어 매개변수에 request, response, next(현재 나 다음 미들웨어함수를 호출할때 사용)를 줄수 있음
app.use(function (request, response) {
    response.writeHead(200, { 'Content-Type': 'text/html' });
    response.end('<h1>Hello express</h1>');
});

// 서버를 실행합니다.
app.listen(3000, function () {
  console.log('서버 구동됨');
});