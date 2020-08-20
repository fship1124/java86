package Webtoon.ui;

import util.PrintUtil;

public class InsertUI extends BaseUI {
	char viewChar = '-';
	int viewCount = 30;
	public void execute() {
		PrintUtil.printView(viewChar, viewCount);
		System.out.println("웹툰 등록 메뉴");
		PrintUtil.printView(viewChar, viewCount);
		System.out.println("1. 신규 웹툰 생성");
		System.out.println("2. 새로운 웹툰 회차 업로드");
		System.out.println("3. 상위 메뉴");
		System.out.println("0. 종료");
		PrintUtil.printView(viewChar, viewCount);
		System.out.print("선택 : ");
		int menu = Integer.parseInt(sc.nextLine());
		BaseUI ui=null;
		switch (menu) {
		case 1:
			ui = new InsertWebtoonUI();
			break;
		case 2:
			ui = new InsertWebtoonSubUI();
			break;
		case 3:
			ui = new WebtoonAdminUI();
			break;
		case 0:
			ui = new ExitUI();
			break;
		}
		ui.execute();
		
	}

}
