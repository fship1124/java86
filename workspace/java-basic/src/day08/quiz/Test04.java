/*
 * 	 quiz01.txt ������ ������ �о �Ʒ��� ���� ��µǵ��� �ڵ� �ۼ�
 * 
 *   �������>
 *   
 *   �� �ο� : 5��
 *   �达 �� ��� 2��
 *   ------------------------------
 *   �跡��:��õ������ ���͵�:36
 *   ����:.........
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
			
			if (sa1.startsWith("��")) {
				count++;
				
				result += sa1+"\n";
			}
		}
		System.out.println("�� �ο� : " + line + "��");
		System.out.println("�达 �ο� : " + count + "��");
		System.out.println("-------------------------------");
		System.out.println(result);
		System.out.println("-------------------------------");
		
	}

}
