package day12.quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test01 {
	// 정상수행시 : 1 - 2 - 4 - 5
	// 예외발생시 : 1 - 3 - 4 - 5
	// 예외처리 루틴 없을때(비정상 종료) : 1 - 4
	// return과 함께 사용시 : 1 - 3 - 4
	public static void main(String[] args) {
		System.out.println(1);
		try {
//			System.out.println(1 / 0);
			FileReader fr = new FileReader("data/a1.txt");
			System.out.println(2);
		} catch (FileNotFoundException e) {
			System.out.println(3);
			return;
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}




