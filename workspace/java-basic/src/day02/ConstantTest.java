package day02;

public class ConstantTest {
	public static void main(String [] args){
		final int PORT = 8080;
		
//		PORT = 9999;  // 상수로 선언된 변수는 값을 바꿀수 없다.
		
//		String path = "c:\java81";  // /뒤에는 유효한 형태만 와야한다. 오류나지 않으려면 //으로 표시한다.
		String path = "c:\\java81";
		path = "c:\test81";
		System.out.println(path);
		
		// 나의 이름은 "아무개" 입니다
		// 출력 작성
		System.out.println("나의 이름은 \"아무개\" 입니다.");  
		
		// \\로 특수한 문자들을 특수한 상수값으로 사용가능
		// \사용은 그대로 표시해준다는 의미
		
	}

}
