/*
 * ������ �Է¹޾� 1~000������ ������ �������� ������ ����Ͻÿ�
 */

package day03.exam;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� :");
		int num = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		for (int k = 2 ; k <= 1000; k++){
			for (int i = 1 ; i < k ; i++){
				if(k % i == 0){
					sum += i;
				}
			}
		if (sum == k){	
			System.out.print(k + " ");
			
			count++;
			if (count == num) {
				break;
			}
		}
		sum = 0;		
		
		}
		
	}

}
