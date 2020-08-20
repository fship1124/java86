package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest07 {
	private static void a() throws FileNotFoundException{
		try {
			FileReader fr = new FileReader("data/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("예외의 직접 처리 구문 실행");
			throw e;            // throw사용은 또다시 e 의 예외가 발생함. 인위적으로 발생시킴.
			                    // 인위적으로 발생시켜 try구문에서 예외가 나오면 간접처리로 던지겠다라는 의미.
		}
	}
	public static void main(String[] args) {
		try {
			a();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
