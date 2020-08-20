/**
 * path : 경로에 대한 다양한 값을 추출
 */
var path = require("path");
var uploaDir = "c:/test/";
var fileName = "/aa/bb/index.js";

// var filePath = uploaDir + fileName;
// join을 사용함으로써 앞뒤, / 중복으로 있을 경우 자동 제거해줌
var filePath = path.join(uploaDir, fileName);
console.log(filePath);

// 디렉토리(path.dirname) : /aa/bb
// 확장자(extname) : .js
// 파일명+확장자(basename) : index.js
console.log("디렉토리 : " + path.dirname(fileName));
console.log("확장자 : " + path.extname(fileName));
console.log("파일명 : " + path.basename(fileName));

// path.basename("aaa.js", ".js") : 확장자를 제외한 나머지 이름만 가져올수 있음
console.log("파일명 : " + path.basename("aaa.js", ".js"));

// 파일이름 가져오기 예제
var testPath = "c:/a/b/c.js";
var testName = path.basename(testPath, path.extname(testPath));
console.log(testName);