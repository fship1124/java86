/**
 * crypto : 해시 생성 및 암호화 관련
 * 
 */

var crypto = require("crypto");

// 해쉬 알고리즘 : sha1, md5, sha256, sha512
var sha1 = crypto.createHash("sha1");

var msg = "sbc123456";   //사용자가 입력한 pass

sha1.update(msg);

/*
// 암호화 처리
var output = sha1.digest("hex");
console.log("원본 %s", msg);
console.log("해쉬 %s", output);
*/

//보여주는 방식. 저장시에는 output을 저장하면 됨
var output = sha1.digest("base64"); // hex, binary, base64
console.log("원본 %s", msg);
console.log("해쉬 %s", output);
