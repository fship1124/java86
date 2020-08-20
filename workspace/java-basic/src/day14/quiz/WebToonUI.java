package day14.quiz;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebToonUI {
	private char printChar = '=';
	private int printCount = 50;
	
	private WebToonDAO dao;
	
	public WebToonUI() throws FileNotFoundException {
		dao = new WebToonDAO();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void start () {
		
		while (true) {
		printView(printChar, printCount);
		System.out.println();
	    System.out.println("��ƪ ���� ���α׷�");
	    printView(printChar, printCount);
	    System.out.println();
		System.out.println("1. ��ü��ȸ");
		System.out.println("2. �۰���ȸ");
		System.out.println("3. �帣��ȸ");
		System.out.println("4. ������ȸ");
		System.out.println("5. ������ȸ");
		System.out.println("6. ����");
		printView(printChar, printCount);
		System.out.println();
		
		System.out.print("�޴��� ��ȸ�� �׸��� �����ϼ���(1-6) : ");
		int menu = Integer.parseInt(sc.nextLine());
		
			switch (menu) {
			
			case 1: serchAll();			break;
			case 2: serchAuthor();		break;
//			case 3: serchGenre();		break;
//			case 4: serchScore();		break;
//			case 5: serchTitle();		break;
			case 6: exit();				break;
			
			}
		}
		
	}	
	

	private void serchAll() {
		List<WebToon> list = dao.selecAllWeb();
		
		System.out.printf("��ϵ� ���� ��ü ��ȸ---------\n");
		System.out.printf("��ϵ� ���� %s��\n", list.size());
		System.out.println("��ȣ\t����\t\t����\t�۰�\t�帣\t����");
		printView(printChar, printCount);
		System.out.println();
		for (int i = 0 ; i < list.size(); i ++) {
			WebToon wt = list.get(i);
			System.out.printf("%04d\t%-8s\t%d\t%s\t%d\t%3.2f\n", 
					          wt.getNo(), wt.getTitle(), wt.getDayOfWeek(), wt.getAuthor(), wt.getGenre(), wt.getScore() );
		}
	}
	
	private void serchAuthor() {
		List<WebToon> list = dao.selecAuthorWeb();
		
		System.out.print("��ȸ�� �۰��� �Է��ϼ��� : ");
		String inAuthor = sc.nextLine();
		System.out.println("��ȣ\t����\t\t����\t�۰�\t�帣\t����");
		printView(printChar, printCount);
		System.out.println();
		
		System.out.println();
		for (int i = 0 ; i<list.size() ; i++ ) {
			WebToon wt = list.get(i);
			if (wt.getAuthor().equals(inAuthor) ) {
				System.out.printf("%04d\t%-8s\t%d\t%s\t%d\t%3.2f\n", 
						wt.getNo(), wt.getTitle(), wt.getDayOfWeek(), wt.getAuthor(), wt.getGenre(), wt.getScore() );
			}
		}
	}
	
	
	private void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
	
	
	public void printView (char ch, int t) {
		for (int i = 0 ; i <= t; i++ ){
			System.out.print(ch);
			
		}
	}
}











