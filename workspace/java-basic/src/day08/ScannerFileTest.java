package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;;
public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
		// 스캐너 클래스를 활용한 파일 읽기     이클립스는 현재 실행되는 프로젝트 디렉토리로 찾아간다.
    	// 실제 이클립스 참조 경로
    	// 프로젝트명/src/day08
    	File f = new File("src/day08/test01.txt");
    	
    	Scanner sc = new Scanner(f);
    	while (sc.hasNextLine()) {         //넥스트라인을 할게 있는지 없는지 판단하는것. boolean형을 반환한다
    	System.out.println(sc.nextLine());
    	}
	}
}
