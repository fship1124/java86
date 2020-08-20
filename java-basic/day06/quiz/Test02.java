/*
	빵의 이름 : _소보르
	가격 : 1200
	칼로리 : 330
	계속 입력하시겠습니까?(Y/N) : Y 
	
	빵의 이름 : _단팥빵
	가격 : 1200
	칼로리 : 330
	계속 입력하시겠습니까?(Y/N) : N
	
	빵 정보 입력이 완료되었습니다.

	입력된 빵의 이름
	----------------
	소보르    1200   312
	단팥빵    2000   350
	----------------
	
	배열을 활용 : Bread
 */

package day06.quiz;

import java.util.Scanner;

class Bread {
	String name;
	int price;
	int cal;
}
public class Test02 {
	public static void main(String[] args) {
		Bread [] list = new Bread[10];
		int pos = 0;
		
		Scanner sc = new Scanner(System.in);
		outer : 
		while (true) {
			Bread b = new Bread();
			System.out.print("빵의 이름 : ");
			b.name = sc.nextLine();
			System.out.print("가격 : ");
			b.price = Integer.parseInt(sc.nextLine());
			System.out.print("칼로리 : ");
			b.cal = Integer.parseInt(sc.nextLine());
			list[pos++] = b;
			
			System.out.print("계속 입력하시겠습니까?(Y/N) : ");
			String isContinue = sc.nextLine();
			switch (isContinue) {
			case "N": case "n":
				break outer;
			}
		}
		System.out.println("입력된 빵의 이름");
		System.out.println("--------------------");
		for (int i = 0; i < pos; i++) {
			System.out.printf(
				"%s\t%d\t%d\n", list[i].name, list[i].price, list[i].cal);
		}
		
	}
}










