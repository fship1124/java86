/*
 1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)
 1회. 숫자를 입력하세요(1 - 1000) : 3
 3보다 큰 값 입니다.
 2회. 숫자를 입력하세요(1 - 1000) : 500
 500보다 큰 값 입니다.
 3회. 숫자를 입력하세요(1 - 1000) : 250
 정답입니다.
 
 1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)
 1회. 숫자를 입력하세요(1 - 1000) : 3
 3보다 큰 값 입니다.
 2회. 숫자를 입력하세요(1 - 1000) : 500
 500보다 큰 값 입니다.
 ...
 10회. 숫자를 입력하세요(1 - 1000) : 250
 10회안에 맞추기 게임에 실패하였습니다.
 정답은 85입니다.
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
        	System.out.printf("%d회. 숫자를 입력하세요(1 - 1000) : ", i);
        	int num = sc.nextInt();
        	
        	if ( num == ans ) {
        		System.out.printf("%d회. 정답입니다.", i);
        	} else if (num > ans) {
        		System.out.printf("%d회. %d보다 작은 값입니다.", i, num );
        	} else if (num < ans) {
        		System.out.printf("%d회. %d보다 큰 값입니다.", i, num);
        	}	
        	
        	if (i == 10) {
        		System.out.printf("%d회안에 맞추기 게임에 실패하였습니다.\n정답은 %d입니다.",i, ans);
        	break;
        	}
        	
        }
	}

	}
	
