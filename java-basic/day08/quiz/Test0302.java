/*
 *    quiz01.txt ������ ������ �о �Ʒ��� ����
 *    ��µǵ��� �ڵ� �ۼ�
 *    
 *    �������>
 *    
 *    1. a.java
 *    2. b.java
 *    3. c.txt
 *    4. d.jpg
 *    5. e.doc
 */
package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test0302 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("src/day08/quiz/quiz01.txt");
		Scanner sc = new Scanner( f );
		int lineNum = 0;
		while (sc.hasNextLine()) {
			System.out.println(
				++lineNum + " : " + sc.nextLine());
		}
	}
}










