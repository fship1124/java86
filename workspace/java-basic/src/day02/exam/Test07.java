package day02.exam;

import java.util.Scanner; 

public class Test07 {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("입력(알파벳) : ");
		
		String inputStr = sc.nextLine();
		char c = inputStr.charAt(0);
		int d = c;
		
		
		int e = (d < 97) ? d+32: d-32;
		char f = (char)e;
		
		System.out.printf("변경된 값 : %c", f);		
		
	}
	

}
