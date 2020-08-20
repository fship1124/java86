/*
 * 	 quiz01.txt 파일의 내용을 읽어서 아래와 같이 출력되도록 코딩 작성
 * 
 *   출력형식>
 *   
 *   총 인원 : 5명
 *   김씨 인 사람 2명
 *   ------------------------------
 *   김래원:인천광역시 학익동:36
 *   김명민:.........
 *   ------------------------------
 */

package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("src/day08/quiz/quiz02.txt");
		
		Scanner sc = new Scanner(f);
		int line = 0;
		int count = 0;
		String result ="";

		while (sc.hasNextLine()) {
			line++;
			String sa1 = sc.nextLine();
			
			if (sa1.startsWith("김")) {
				count++;
				
				result += sa1+"\n";
			}
		}
		System.out.println("총 인원 : " + line + "명");
		System.out.println("김씨 인원 : " + count + "명");
		System.out.println("-------------------------------");
		System.out.println(result);
		System.out.println("-------------------------------");
		
	}

}
