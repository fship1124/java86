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
	    System.out.println("웹튠 관리 프로그램");
	    printView(printChar, printCount);
	    System.out.println();
		System.out.println("1. 전체조회");
		System.out.println("2. 작가조회");
		System.out.println("3. 장르조회");
		System.out.println("4. 평점조회");
		System.out.println("5. 제목조회");
		System.out.println("6. 종료");
		printView(printChar, printCount);
		System.out.println();
		
		System.out.print("메뉴중 조회할 항목을 선택하세요(1-6) : ");
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
		
		System.out.printf("등록된 웹툰 전체 조회---------\n");
		System.out.printf("등록된 웹툰 %s개\n", list.size());
		System.out.println("번호\t제목\t\t요일\t작가\t장르\t평점");
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
		
		System.out.print("조회할 작가를 입력하세요 : ");
		String inAuthor = sc.nextLine();
		System.out.println("번호\t제목\t\t요일\t작가\t장르\t평점");
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
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	
	
	public void printView (char ch, int t) {
		for (int i = 0 ; i <= t; i++ ){
			System.out.print(ch);
			
		}
	}
}











