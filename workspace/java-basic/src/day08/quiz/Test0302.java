/*
 * 	 quiz01.txt 파일의 내용을 읽어서 아래와 같이 출력되도록 코딩 작성
 * 
 *   출력형식>
 *   
 *   1. c.txt
 */

package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test0302 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("src/day08/quiz/test01.txt");
		
		Scanner sc = new Scanner(f);
		int lineNum = 0;
		while (sc.hasNextLine()) {    //next 라인이 있는지 확인
			String line = sc.nextLine();
			if (line.endsWith(".txt")) {
			System.out.println(++lineNum + " : " + line);
		
			}
		}
	}

}
