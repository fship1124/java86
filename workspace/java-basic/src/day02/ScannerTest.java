package day02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);  //System.in 현재실행하는 입력창에서 입력받겠다.는 의미
	
		System.out.print("이름 : ");
		String name = sc.nextLine();   // nextLine : 줄단위로 읽겠다.(입력한 데이터가 있을때까지 커서가 대기.엔터를 치는 순간 줄단위로읽어서 scanner가 보는 공간으로 보내기)
		System.out.println("name : " + name);
		
		System.out.print("나이 : ");
		String age = sc.nextLine();
		System.out.println("age : " + age);
		
	}

}
