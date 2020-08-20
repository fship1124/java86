package day03.exam;

import java.util.Scanner;
public class ConditionTest01 {
	public static void main(String [] args){
		
		System.out.print("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int s1 = Integer.parseInt(sc.nextLine());
		
		String ms;
		if(s1 > 11){
			ms = "5000";
		} else if(5 > s1){
			ms = "무료";		
		} else {
			ms = "2500";
		}
		System.out.printf("입장료는 %s원 입니다.", ms);
		
	}

}

