package day02.exam;

import java.util.Scanner;

public class Test02 {
	public static void main(String [] args){	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int aa = Integer.parseInt( sc.nextLine() );
		
		int hour = aa / 3600; 
		int minute = (aa / 60) / 60;
		int second = aa % 60;
		
		
		System.out.println(aa + "초는 " + hour + "시간 " + minute + "분 " + second + "초입니다.");
		
		
	}

}
