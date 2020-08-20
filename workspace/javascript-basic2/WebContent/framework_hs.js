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
	case "<":  // $("<div>")
		elements = document.createElement(val.substring(1, val.length-1));
		break;
	case "#":
		elements = document.querySelector(val);
		break;
	default:
		elements = document.querySelectorAll(val);
		break;
	}
	
	// 1. html 함수 추가하기 : innerHTML 대체
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
	// 2. text 함수 추가하기 : innerText 대체
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
	// 3. val 함수 추가하기 : value 대체
	elements.val = function (val) {
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
	// 4. attr 함수 추가하기 : attribute 
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
	
	// 5. css 함수 추가하기 : style 속성 
	elements.css = function (key, value) {
		// elements 가 배열인 경우
		if (this.length) {
			// 여러개의 속성값을 한번에 넘겨받았을 경우 처리
			if (typeof (key) == "object") {
				/*
					$("#msg").css({
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
	
	// 6. append 함수 추가하기 : appendChild 속성 
	elements.append = function (childElement) {
		// elements 가 배열인 경우
		if (this.length) {   // $("h1")
			// 모든 요수 변경하기
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
	
	
//	7. $("#btn").on(("click", function () {}); 
	elements.on = function (eventType, callback) {
		// elements 가 배열인 경우
		if (this.length) {   // $("h1")
			// 모든 요수 변경하기
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
	
	
//	8. $("#btn").click(function () { alert("클릭"); }); 
	elements.click = function (callback) {
		this.on("click", callback);
	};
	
	
	return elements;
}
var $ = mlec;




// ajax 추가...





