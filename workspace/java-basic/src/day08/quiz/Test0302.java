/*
 * 	 quiz01.txt ������ ������ �о �Ʒ��� ���� ��µǵ��� �ڵ� �ۼ�
 * 
 *   �������>
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
		while (sc.hasNextLine()) {    //next ������ �ִ��� Ȯ��
			String line = sc.nextLine();
			if (line.endsWith(".txt")) {
			System.out.println(++lineNum + " : " + line);
		
			}
		}
	}

}
