package day03.exam;

import java.util.Scanner;
public class ConditionTest01 {
	public static void main(String [] args){
		
		System.out.print("���̸� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		int s1 = Integer.parseInt(sc.nextLine());
		
		String ms;
		if(s1 > 11){
			ms = "5000";
		} else if(5 > s1){
			ms = "����";		
		} else {
			ms = "2500";
		}
		System.out.printf("������ %s�� �Դϴ�.", ms);
		
	}

}

