/*
 *  ������ ����
 *  ---------------------------------
 *  �����	��⵵ ������	22��
 *  ���� ....
 *  ����	����Ư����ġ�� ����	42��
 *  ---------------------------------
 */

package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("src/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		System.out.println("������ ����");
		System.out.println("---------------------------------");
		while (sc.hasNextLine()){
		    String info = sc.nextLine();
		    String[] pInfo = info.split(":");
		    System.out.printf("%s\t%s\t%s\n", pInfo[0], pInfo[1], pInfo[2] + "��");
	}
	System.out.println("---------------------------------");
	}
}




