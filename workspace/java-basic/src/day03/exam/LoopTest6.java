package day03.exam;

import java.util.Scanner;
public class LoopTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� :");
		int num = sc.nextInt();
		
		int sum = 0;
		for ( int i = 1; i < num; i++){
			if(num % i == 0){
				sum += i;
			}
		}
        if(sum == num){
        	System.out.printf("%d�� ������ �Դϴ�.", num);
        } else {
        	System.out.printf("%d�� �������� �ƴմϴ�.", num);       	
        }
	}

}
