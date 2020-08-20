/**
 * jquery.js 라이브러리 기능을 일부 구현해본다.
 */


// elements 의 객체를 생성하고 동적으로 속성(html이라는 함수)을 추가했다.
function mlec(val) {
//	alert(typeof (val));   //맞는지 찢어보기
	if (typeof (val) == "function"){
		window.onload = val;
		return;
	}
	
	// val 값을 파싱하여 적절한 작업을 처리
	var ch = val.charAt(0);
	switch(ch) {
	case "#":
		elements = document.querySelector(val);
		break;
	default:
		elements = document.querySelectorAll(val);
		break;
		
	}
	
	// html 함수 추가하기 : innerHTML 대체
	elements.html = function(html) {
		// elements 가 length 프로퍼티가 존재하는 경우 : 배열
		if (this.length) {
			if (html) {
				// 0번째 요소의 innerHTML 만 변경
//				this[0].innerHTML = html;
				
				// 모든 요소 변경하기
				for (var i = 0; i < this.length; i++) {
					this[i].innerHTML = html;
				}
				return this;  //this 엘리먼트 객체
			}
			return this[0].innerHTML; // 0번째로오는 엘리먼트의 innerHTML
		}
		// elements 가 하나인 경우(# 접근)
		else {
			if (html) {
				this.innerHTML = html;
				// 자기자신을 호출한 객체 elements -> document.querySelector(val)
				return this;
			} 
			return this.innerHTML;
		}
	};
	
	// text 함수 추가하기 : innerText 대체
	elements.text = function(text) {
		// elements 가 length 프로퍼티가 존재하는 경우 : 배열
		if (this.length) {
			if (text) {
				// 0번째 요소의 innerText 만 변경
//				this[0].innerText = text;
				
				// 모든 요소 변경하기
				for (var i = 0; i < this.length; i++) {
					this[i].innerText = text;
				}
				return this;  //this 엘리먼트 객체
			}
			return this[0].innerText; // 0번째로오는 엘리먼트의 innerHTML
		}
		// elements 가 하나인 경우(# 접근)
		else {
			if (text) {
				this.innerText = text;
				// 자기자신을 호출한 객체 elements -> document.querySelector(val)
				return this;
			} 
			return this.innerText;
		}
	};
	
	// val 함수 추가하기 : value 대체
	elements.val = function(val) {
		// elements 가 length 프로퍼티가 존재하는 경우 : 배열
		if (this.length) {
			if (val) {
				// 0번째 요소의 innerText 만 변경
				this[0].value = val;
				return this;  
			}
			return this[0].innerText; // 0번째로오는 엘리먼트의 innerHTML
		}
		// elements 가 하나인 경우(# 접근)
		else {
			if (val) {
				this.value = val;
				// 자기자신을 호출한 객체 elements -> document.querySelector(val)
				return this;
			} 
			return this.value;
		}
	};
	
	// 속성값 설정은 위의 함수들과 다르게 여러개를 설정할 수 있다.
	// attr 함수 추가하기 : Attribute 대체 (키값은 항상 들어오므로 밸류속성값으로 구분한다)
	elements.attr = function( key, value ) {
		// elements 가 length 프로퍼티가 존재하는 경우 : 배열
		if (this.length) {
//			속성값이 여러개가 한번에 넘겨받았을 경우 처리 
			if (typeof (key) == "object") {
				for (var k in key) {
					this[0].setAttribute(k, key[k]);
				}
				return this;  
			}
			if (value) {
				// 값이 2개
				this[0].setAttribute(key, value);
				return this;  
			}
			return this[0].getAttribute(key); 
		}
		// elements 가 하나인 경우(# 접근)
		else {
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
	
	return elements;
}

var $ = mlec;

