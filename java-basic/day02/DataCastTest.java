package day02;

public class DataCastTest {
	public static void main(String[] args) {
		byte b = 1;
		int i = 128;
		
//		byte b2 = i;  // 오류 발생
		byte b2 = (byte)i;  // 명시적 형변환, 다운 캐스팅
		System.out.println("b2 = " + b2);
		
		int i2 = b;  // 묵시적, 암묵적, 업캐스팅
		System.out.println("i2 = " + i2);
		
		char c = 'a';
		// a 문자의 아스키 코드를 출력
		int i3 = c;
		System.out.println(i3);
		
		// b 문자의 아스키 코드를 출력
		System.out.println((int)'b');
	}
}








