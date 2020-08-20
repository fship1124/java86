package day08;

public class StringTest01 {
	public static void main(String[] args) {
		// char charAt(int index)
		String s = "Java Is Easy";    //스트링 객체의 메모리 생성
		
		// 다른 타입의 데이터를 문자열로 변경
//		String str = "" + 1;
		// 만약, 메서드에 static 키워드가 붙어 있다면
		// 이 메서드는 클래스이름.메서드명으로 호출한다.
		String str = String.valueOf(1);            // valueOf 숫자값뿐만 아니라 모든타입이 들어올수있다.
		System.out.println(str);
		
		
		/*
		s = "   a a a   ";
		System.out.println(s.length());
		
		//문자열의 양쪽 공백을 제거한다.
		s = s.trim();
		System.out.println("문자열 제거 후 길이 : " + s.length());
		*/
		
		
		/*
		s = s.toLowerCase();         //소문자로 바꿔라
		System.out.println(s);		
		*/
		
		/*
		s = s.toUpperCase();            //대문자로 바꿔라
		System.out.println(s);
		*/
		
		/*
		// 이름:이메일:거주지
		s = "홍길동:a@a.com:서울";
		String[] sArr = s.split(":");     // s가 가지고 있는 콜론을 분리시키겠다.
		System.out.println(sArr[1]);
		*/
		
		/*
		// a@a.com
		int sIndex = s.indexOf(":");
		String result = s.substring(sIndex + 1);
		System.out.println(result);
		result = s.substring(sIndex + 1, s.lastIndexOf(":"));
		System.out.println(result);
		*/
		
		
		
		/*
		int sIndex = s.indexOf(":");
		String result = s.substring(sIndex + 1);         // 문자열에서 자르는 기능
		System.out.println(result);
		*/
		
		/*
		int sIndex = s.lastIndexOf(":");
		String result = s.substring(sIndex + 1);
		System.out.println(result);
		*/
		
		
		
		/*
		String result = "";
		int sIndex = s.lastIndexOf(":");
		System.out.println("sIndex : " + sIndex);
		for (int i = sIndex; i < s.length(); i++) {
			result += s.charAt(i);
		}
		System.out.println(result);
		*/
		
		/*
		s = "abc123bbb123ccc";
		s = s.replace("123", "");        //문자열은 상수클래스이다. 변경되지 않는다. 그래서 변경하려면 replace를 사용하고 다시 대입해준다
//		s.replace("1", "*");
		System.out.println(s);
		
		s = "0a1b2c3b4b5b6c7c8c9";
		for (int i = 0; i <= 9; i++) {
			s = s.replace("" +i, "");        //문자열은 상수클래스이다. 변경되지 않는다. 그래서 변경하려면 replace를 사용하고 다시 대입해준다
		}
        System.out.println(s);		

        
        // ** 정규 표현식 **
		s = "0a1b2c3b4b5b6c7c8c9";
		s.replaceAll("[0-9]", "");     // regex : 정규표현식 s의 문자에서 0~9사이의 숫자가 들어오면 없는걸로 바꿔주겠다.
        System.out.println("s = " + s);
        
        s = "0a1b2c3b4b5b6c7c8c9";
        s.replaceAll("[A-Za-z]", "");     // s의 문자에서 A~Z, a~z 사이의 문자가 들어오면 없는걸로 바꿔주겠다.
        System.out.println("s = " + s);
        
        
        
        /*
		// boolea startsWith(String s)    //매개변수로 시작하나?
		// boolea endsWith(String s)      //매개변수로 끝내나?
		s = "my1.jpg";
		boolean bool = s.endsWith(".jpg");
		System.out.println(bool);
		
		s = "홍길동";
		bool = s.startsWith("홍");          //홍으로 시작. 
		System.out.println(bool);
		
		/*
		int index = s.lastIndexOf("a", 8);
		System.out.println("index = " + index);
		
		/*
		int index = s.lastIndexOf("a");             // 한줄에 몇개가 있는지 찾으려면 사용
		System.out.println("index = " + index);
		
		
		/*
		int index = s.indexOf("a");
		System.out.println("index = " + index);
		
		index = s.indexOf("a", 2);
		System.out.println("index = " + index);
		
		
		/*
		/*
		 * 특정 문자열이 포함되어 있다면 해당 위치를 반환함
		int indexOf(String s);                      //indexOf:~의 위치
		int index = s.indexOf("j");
		System.out.println("index = " + index);
		index = s.indexOf("java");
		System.out.println("index = " + index);
		index = s.indexOf("t");
		System.out.println("index = " + index);
		
         */
		
		/*
		// 문자열이 포함되어 있는지 여부 반환
		// boolean contains(CharSequence s)    //포함되어있는지 확인. 일부를 확인하고 싶을때. 하지만 위치는 모른다
		boolean bool = s.contains("Is");
		System.out.println("bool : " + bool);
		
		
		/*
		// boolean equals(Object obj)     비교
		// boolean equalsIgnoreCase(Object obj)   대소문자 무시하고 내용비교
		s = "java";
	    boolean bool = s.equalsIgnoreCase("java");    //s에 들어있는 "java" 와 equals에 들어있는 매개변수 "java" 같은지 비교하라
		System.out.println("bool : " + bool);
		
		
		/*
		char ch = s.charAt(0);                        // ()의 인수번의 문자를 읽어냅니다. (charAt(0) : 0의 인덱스 자리값을 가져오겠다.)
		System.out.println("ch = " + ch);
		System.out.println("ch = " + s.charAt(1));
		System.out.println("ch = " + s.charAt(2));
		System.out.println("ch = " + s.charAt(3));
		
		int len = s.length();
		System.out.println("길이 : "+ len);
		*/
		
		
		
	}

}
