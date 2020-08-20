package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest06 {
	// throws 키워드의 의미
	// 메서드를 호출하는 쪽으로 예외를 던져서 대신 처리하게 한다.
	private static void a() throws FileNotFoundException {
		FileReader fr = new FileReader("data/a.txt");
	}
	
	// RuntimeException 관련 예외들은 예외처리를 선택적으로 할 수 있다. 
	private static void b() throws ArithmeticException {
		// ArithmeticException         // runtimException 은 실행시 오류이므로 컴파일시 오류해결안해도 됨
		System.out.println(1 / 0);
	}
    public static void main(String[] args) {
    	try {
    	b();                           // try catch를 코딩하지 않아도 오류가 나지 않음은 런타임오류임이다. 하지만 코딩하는 이유는 
    	a();
    	} catch (FileNotFoundException e ) {
    		e.printStackTrace();
    	} catch (Exception e) {
    	}
	}
}
