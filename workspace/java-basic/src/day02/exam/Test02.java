package day02.exam;

import java.util.Scanner;

public class Test02 {
	public static void main(String [] args){	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ��� : ");
		int aa = Integer.parseInt( sc.nextLine() );
		
		int hour = aa / 3600; 
		int minute = (aa / 60) / 60;
		int second = aa % 60;
		
		
		System.out.println(aa + "�ʴ� " + hour + "�ð� " + minute + "�� " + second + "���Դϴ�.");
		
		
	}

}
