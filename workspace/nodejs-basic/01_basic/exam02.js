/*
 * 사용자 정의 모듈 만들기 : exports
 * 1. 만들고자 하는 모듈을 파일로 생성한다.
 * 2. exports 객체의 속성이나 메서드로 정의
 * 3. 생성된 모듈을 전역 함수 require()를 이용해서 추출    //require()이미 등록되어있는 모듈을 접근한다
 */
function add(i, j) {
	return i + j;
}
function sub(i, j) {
	return i - j;
}

//module.exports.add(이름) = add(설정값);
module.exports.add = add;
module.exports.sub = sub;