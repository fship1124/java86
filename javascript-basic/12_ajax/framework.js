/**
 *  jquery.js 라이브러리 기능을 일부 구현해본다.
 */
function mlec(val) {
	
	if (typeof (val) == "function") {
		window.onload = val;
		return;
	}
	
	// val 값을 파싱하여 적절한 작업을 처리
	var ch = val.charAt(0);
	var elements;
	switch (ch) {
	case "<":   //  $("<div>")
		elements = document.createElement(val.substring(1, val.length-1));
		break;
	case "#":   
		elements = document.querySelector(val);
		break;
	default:
		elements = document.querySelectorAll(val);
		break;
	}
	
	// html 함수 추가하기 : innerHTML 대체
	elements.html = function (html) {
		// elements 가 배열인 경우
		if (this.length) {
			if (html) {
				// 0번째 요소의 innerHTML 만 변경
				// this[0].innerHTML = html;
				
				// 모든 요소 변경하기
				for (var i = 0; i < this.length; i++) {
					this[i].innerHTML = html;
				}
				return this;
			}
			return this[0].innerHTML;
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			if (html) {
				this.innerHTML = html;
				return this;
			} 
			return this.innerHTML;
		}
	};
	// text 함수 추가하기 : innerText 대체
	elements.text = function (text) {
		// elements 가 배열인 경우
		if (this.length) {
			if (text) {
				// 0번째 요소의 innerText 만 변경
				// this[0].innerText = text;
				
				// 모든 요소 변경하기
				for (var i = 0; i < this.length; i++) {
					this[i].innerText = text;
				}
				return this;
			}
			return this[0].innerText;
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			if (text) {
				this.innerText = text;
				return this;
			} 
			return this.innerText;
		}
	};
	// val 함수 추가하기 : value 대체
	elements.val = function (val) { // val(" ")
		// elements 가 배열인 경우
		if (this.length) {
			if (val) {
				// 0번째 요소의 innerText 만 변경
				this[0].value = val;
				return this;
			}
			return this[0].value;
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			if (val) {
				this.value = val;
				return this;
			} 
			return this.value;
		}
	};
	// attr 함수 추가하기 : attribute 
	elements.attr = function (key, value) {
		// elements 가 배열인 경우
		if (this.length) {
			// 여러개의 속성값을 한번에 넘겨받았을 경우 처리
			if (typeof (key) == "object") {
				for (var k in key) {
					this[0].setAttribute(k, key[k]);
				}
				return this;
			}
				
			if (value) {
				this[0].setAttribute(key, value);
				return this;
			}
			return this[0].getAttribute(key);
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			// 여러개의 속성값을 한번에 넘겨받았을 경우 처리
			if (typeof (key) == "object") {
				for (var k in key) {
					this.setAttribute(k, key[k]);
				}
				return this;
			}
			if (value) {
				this.setAttribute(key, value);
				return this;
			} 
			return this.getAttribute(key);
		}
	};
	// css 함수 추가하기 : style 속성 
	elements.css = function (key, value) {
		// elements 가 배열인 경우
		if (this.length) {
			// 여러개의 속성값을 한번에 넘겨받았을 경우 처리
			if (typeof (key) == "object") {
				/*
				$("h1").css({
					"border": "1px solid tomato",
					"color": "skyblue",
					"background": "yellow"
				});
				 */
				for (var k in key) {
					for (var i = 0; i < this.length; i++) {
						this[i].style[k] = key[k];
					}
				}
				return this;
			}
			
			if (value) {
				for (var i = 0; i < this.length; i++) {
					this[i].style[key] = value;
				}
				return this;
			}
			return this[0].style[key];
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			// 여러개의 속성값을 한번에 넘겨받았을 경우 처리
			if (typeof (key) == "object") {
				for (var k in key) {
					this.style[k] = key[k];
				}
				return this;
			}
			if (value) {
				this.style[key] = value;
				return this;
			} 
			return this.style[key];
		}
	};
	
	// appendChild 
	elements.append = function (childElement) {
		// elements 가 배열인 경우
		if (this.length) {   // $("h1")
			// 모든 요소 변경하기
			for (var i = 0; i < this.length; i++) {
				this[i].appendChild(childElement);
			}
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			this.appendChild(childElement);
		}
		return this;
	};
	
//	$("#btn").on("click", function () {});
	elements.on = function (eventType, callback) {
		// elements 가 배열인 경우
		if (this.length) { 
			// 모든 요소 변경하기
			for (var i = 0; i < this.length; i++) {
				this[i].addEventListener(eventType, callback);
			}
		} 
		// elements 가 하나인 경우(# 접근)
		else {
			this.addEventListener(eventType, callback);
		}
		return this;
	};
	elements.click = function (callback) {
		this.on("click", callback);
	};
	return elements;
}
var $ = mlec;
// ajax 추가...
//var xhr;  // 전역변수 빼기, 콜백함수에서 사용하기 위해서.
$.ajax = function (options) {
	/*
	 * options : ajax 에서 필요로 하는 값들
	 * 
	 * options.type : GET, POST 방식 지정
	 * options.dataType : json, xml 등 응답 데이터의 처리 지정
	 * options.url : 호출할 서버 페이지
	 * options.data : 서버 페이지에서 사용할 파라미터 객체({})
	 * options.success : 응답 결과를 처리할 콜백 함수
	 */
	
	// Ajax 통신을 위한 객체 생성
	var xhr = new XMLHttpRequest();
	// 결과처리를 위한 콜백 함수 등록
	xhr.onreadystatechange = function () {
		// 결과 처리하기
		if (xhr.readyState == 4) {  // 모든 응답이 서버에서 왔을때
			if (xhr.status == 200) { // 정상 수행되었을 때
				
				var result = xhr.responseText;
				switch (options.dataType) {
				case "json":
					result = JSON.parse(xhr.responseText);
					break;
				case "xml":
					result = xhr.responseXML;
					break;
				}
				options.success(result);
			}
		}
	};
	
	// 사용자 요청 메서드 설정
	// type: "GAT"
	var method = options.type ? options.type : "GET";
	if (method != "GET" && method != "POST") {
		method = "GET";
	}
	
	// 사용자 호출 url 처리
	// GET 방식일 경우 options.data를 url에 추가
	// POST 방식일 경우 options.data를 send함수 추가
	// 객체가 가지고 있는 데이터를 파라미터 형태의 문자열로 변경
	var params = "";
	// 사용자가 데이터를 옵션에 추가했는지 확인
	if (options.data) {
		for (var key in options.data) {   // {id: "aaa", pass: 1234}
			// id=aaapass=1234
			if (params == "") {
				params += key + "=" + options.data[key];
			} else {
				params += "&" + key + "=" + options.data[key];
			}
		}
	}
	
	var url = options.url;
	if (method == "GET" && params != "") {
		url += "?" + params;
	}
	
	xhr.open(method, url, true);
	
	// POST
	// header 의 Content-Type 을 설정해야 한다. 
	// application/x-www-form-urlencoded
	if (method == "POST") {
		xhr.setRequestHeader(
				"Content-Type", "application/x-www-form-urlencoded");
	}
	
	xhr.send(method == "POST" ? params : null);
};
















