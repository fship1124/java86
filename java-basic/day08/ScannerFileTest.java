package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args) throws FileNotFoundException {
		// 스케너 클래스를 활용한 파일 읽기
		// 실제 이클립스 참조 경로
		// 프로젝트명/src/day08/test01.txt
		File f = new File("src/day08/test01.txt");
		
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}










