package day12.quiz;

import java.util.Scanner;

public class BankService {
 
	int balance = 0;
	
	public void execute() throws BankException {
		
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		
		System.out.print("������ : ");
		String name = sc.nextLine();
		System.out.print("�Աݾ� : ");
		int money = Integer.parseInt(sc.nextLine());
		balance = balance + money;
		System.out.println("���°� �����Ǿ����ϴ�.");
		System.out.print("----------------------------");
		System.out.printf("���� : %s", name);
		System.out.printf("���¹�ȣ : %d", ++pos);
		System.out.printf("�ʱ��Աݾ� : %d", money);
		System.out.print("----------------------------");
		
		while (true) {
			System.out.print("����(1.���� 2.�Ա� 3.����) : ");
			int inPutNo = Integer.parseInt(sc.nextLine());
			
			switch (inPutNo) {
				case 1 :
			        System.out.print("������ �ݾ�(��) : ");
			        int inPutMoney = Integer.parseInt(sc.nextLine());
			        balance = balance - inPutMoney;
			        System.out.printf("%d���� �����Ͽ����ϴ�. (�ܾ� : %d)", inPutMoney, balance);
			        break;
			    
				case 2 : 
					System.out.print("�Ա��� �ݾ�(��) : ");
					int inItMoney = Integer.parseInt(sc.nextLine());
					balance = money + inItMoney;
					break;
					
				case 3 : 
					exit();     break;
			}
		}
	}
	
	
	private void exit() {
		System.out.println("�Խ��� ���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
}
