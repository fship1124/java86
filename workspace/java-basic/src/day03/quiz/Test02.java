/*
 1���� 1000������ ���ڸ� ���ߴ� �����Դϴ�.(�� 10ȸ)
 1ȸ. ���ڸ� �Է��ϼ���(1 - 1000) : 3
 3���� ū �� �Դϴ�.
 2ȸ. ���ڸ� �Է��ϼ���(1 - 1000) : 500
 500���� ū �� �Դϴ�.
 3ȸ. ���ڸ� �Է��ϼ���(1 - 1000) : 250
 �����Դϴ�.
 
 1���� 1000������ ���ڸ� ���ߴ� �����Դϴ�.(�� 10ȸ)
 1ȸ. ���ڸ� �Է��ϼ���(1 - 1000) : 3
 3���� ū �� �Դϴ�.
 2ȸ. ���ڸ� �Է��ϼ���(1 - 1000) : 500
 500���� ū �� �Դϴ�.
 ...
 10ȸ. ���ڸ� �Է��ϼ���(1 - 1000) : 250
 10ȸ�ȿ� ���߱� ���ӿ� �����Ͽ����ϴ�.
 ������ 85�Դϴ�.
 */

package day03.quiz;

import java.util.Random;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int ans = r.nextInt(1000) + 1;

        Scanner sc = new Scanner(System.in);
	    
        for ( int i = 1; i <= 10; i++) {
        	System.out.printf("%dȸ. ���ڸ� �Է��ϼ���(1 - 1000) : ", i);
        	int num = sc.nextInt();
        	
        	if ( num == ans ) {
        		System.out.printf("%dȸ. �����Դϴ�.", i);
        	} else if (num > ans) {
        		System.out.printf("%dȸ. %d���� ���� ���Դϴ�.", i, num );
        	} else if (num < ans) {
        		System.out.printf("%dȸ. %d���� ū ���Դϴ�.", i, num);
        	}	
        	
        	if (i == 10) {
        		System.out.printf("%dȸ�ȿ� ���߱� ���ӿ� �����Ͽ����ϴ�.\n������ %d�Դϴ�.",i, ans);
        	break;
        	}
        	
        }
	}

	}
	
