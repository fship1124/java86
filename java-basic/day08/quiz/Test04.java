/*
 *    quiz02.txt ������ ������ �о �Ʒ��� ����
 *    ��µǵ��� �ڵ� �ۼ�
 *    
 *    �������>
 *    
 *    �� �ο� : 5��
 *    �达 �� ��� 2��
 *    ----------------------
 *    �跡��:��õ������ ���͵�:36
 *    ����:.....
 *    ----------------------
 */
package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("src/day08/quiz/quiz01.txt");
		Scanner sc = new Scanner( f );
		int lineNum = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.endsWith(".txt")) {
				System.out.println(
					++lineNum + " : " + line);
			}
		}
	}
}










