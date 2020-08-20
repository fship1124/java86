package Webtoon.ui;

import util.PrintUtil;

public class WebtoonMemberUI extends BaseUI {

	public void execute() {
		try{
		while (true) {
			PrintUtil.printView(viewChar, viewCount);
			System.out.println("1. 전체 조회");
			System.out.println("2. 선택 조회");
			System.out.println("3. 로그 아웃");
			System.out.println("0. 종료");
			PrintUtil.printView(viewChar, viewCount);
			System.out.print("선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			BaseUI ui=null;
			switch (menu) {
			case 1:
				ui = new SelectAllUI();
				break;
			case 2:
				ui = new SelectOneUI();
				break;
			case 3:
				ui = new StartUI();
				break;
			case 0:
				ui = new ExitUI();
				break;
			}
			ui.execute();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
