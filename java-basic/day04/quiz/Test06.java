/*
����� ���� ���� �Է��ϼ���(1-10) : 3
����� ���� ���� �Է��ϼ���(1-10) : 4
<<<<
>>>>
<<<<

����� ���� ���� �Է��ϼ���(1-10) : 4
����� ���� ���� �Է��ϼ���(1-10) : 4
>>>>
<<<<
>>>>
<<<<

 */
package day04.quiz;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� ���� ���� �Է��ϼ���(1-10) : ");
		int row = Integer.parseInt(s.nextLine());
		
		System.out.print("����� ���� ���� �Է��ϼ���(1-10) : ");
		int column = Integer.parseInt(s.nextLine());
		
		int count = 1;
		char ch = '\u0000';
	    while (row >= 1) {
	    	ch = (row % 2 == 1) ? '<' : '>';
	    	while (count <= column) {
	            System.out.print(ch);
	            count++;
	        }
	        row--;
	        count = 1;
	        System.out.println();
	    }
	}
}
