package day12.quiz;

import java.util.Scanner;

public class BankService {
 
	int balance = 0;
	
	public void execute() throws BankException {
		
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		
		System.out.print("계좌주 : ");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		balance = balance + money;
		System.out.println("계좌가 개설되었습니다.");
		System.out.print("----------------------------");
		System.out.printf("고객명 : %s", name);
		System.out.printf("계좌번호 : %d", ++pos);
		System.out.printf("초기입금액 : %d", money);
		System.out.print("----------------------------");
		
		while (true) {
			System.out.print("선택(1.인출 2.입금 3.종료) : ");
			int inPutNo = Integer.parseInt(sc.nextLine());
			
			switch (inPutNo) {
				case 1 :
			        System.out.print("인출할 금액(원) : ");
			        int inPutMoney = Integer.parseInt(sc.nextLine());
			        balance = balance - inPutMoney;
			        System.out.printf("%d원을 인출하였습니다. (잔액 : %d)", inPutMoney, balance);
			        break;
			    
				case 2 : 
					System.out.print("입금할 금액(원) : ");
					int inItMoney = Integer.parseInt(sc.nextLine());
					balance = money + inItMoney;
					break;
					
				case 3 : 
					exit();     break;
			}
		}
	}
	
	
	private void exit() {
		System.out.println("게시판 프로그램을 종료합니다.");
		System.exit(0);
	}
	
}
