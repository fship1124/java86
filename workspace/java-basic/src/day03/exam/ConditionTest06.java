package day03.exam;

import java.util.Scanner;
public class ConditionTest06 {
	public static void main(String[] args) {
		
//		System.out.println((int)'1');
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		String sInPut = sc.nextLine();
		char inPut = sInPut.charAt(0);
		
		
		if (( 'A' <= inPut && inPut <= 'Z') || ('a' <= inPut && inPut <= 'z') ) {
			System.out.println("�������Դϴ�.");
		} else if ('0' <= inPut && inPut <= '9'){
			System.out.println("���� �Դϴ�.");			
		}
	}

}
