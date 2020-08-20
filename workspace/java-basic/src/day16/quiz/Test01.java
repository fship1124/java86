/*
 * 파일의 내용을 읽어서 아래와 같은 형식으로 출력
 * 파일형식 : 이름:자바:SQL:Jdbc
 * 수료기준
 * - 자바 : 70점 이상
 * - SQL : 80점 이상
 * - Jdbc : 80점 이상
 * 단, 출력결과는 score-result.txt에 출력
 * 
 * 실행시의 결과 출력 형식
 * 
 * 김기수 : 자바(수료), SQL(미수료), Jdbc(미수료)
 * 이기수 : 자바(수료), SQL(미수료), Jdbc(수료)
 * 박수리 : 자바(수료), SQL(수료), Jdbc(미수료)
 * 
 */
package day16.quiz;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("data/score.txt"));
			 FileWriter fos = new FileWriter("data/score-result.txt");

		) {

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				String array[] = line.split(":");

				String name = array[0];
				int javaScore = Integer.parseInt(array[1]);
				int sqlScore = Integer.parseInt(array[2]);
				int JabcScore = Integer.parseInt(array[3]);     

				String result = name + ":" + "자바(" + (javaScore >= 70 ? "수료" : "미수료") + ")" + "SQL("
						+ (sqlScore > 80 ? "수료" : "미수료") + ")" + "Jabc(" + (JabcScore > 80 ? "수료" : "미수료") + ")";

				fos.write(result + "\n");
				

			} 

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
