/*
 * �Է� ���� �� num
 * ��� num �� ��� 10�ڸ�
 * 
 */

package day03.exam;


import java.util.Scanner;
public class LoopTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(2 - 10) : ");
		int num = Integer.parseInt(sc.nextLine());
		

		
		int k = 0;
		for (int i = 1; i <= 10; i++){
			k = num*i;
		System.out.printf("%d ", k);
		}
		
		
	}

}








