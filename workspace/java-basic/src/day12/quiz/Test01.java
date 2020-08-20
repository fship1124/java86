package day12.quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test01 {
	// 정상수행시 : 1 - 2 - 4 - 5
	// 예외발생시 : 1 - 3 - 4 - 5
	// 예외처리 루틴 없을때(비정상 종료) : 1 - 4
	// return 과 함께 사용시 : 1 - 3 - 4           //return이 있어도 finally는 시행된다.
    public static void main(String[] args) {
		System.out.println(1);
		try {
//			System.out.println(1 / 0);
			FileReader fr = new FileReader("data/a.txt");
			System.out.println(2);
		} catch (FileNotFoundException e) {
			System.out.println(3);
			return;                // 함수를 마치라는 return.
		} finally {                // 마지막 정리작업할때 주로 많이 쓰인다. 무조건 쓰이기때문에
			System.out.println(4);
		}
		System.out.println(5);    // 5번이 실행되면 오류없이 처리되었다는 의미
    }	
}
