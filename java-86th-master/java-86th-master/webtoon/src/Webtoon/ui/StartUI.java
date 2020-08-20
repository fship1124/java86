package Webtoon.ui;

import util.PrintUtil;

public class StartUI extends BaseUI {
	public void execute() {
		try{
			while (true) {
				PrintUtil.printView(viewChar, viewCount);
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("0. 종료");
				PrintUtil.printView(viewChar, viewCount);
				System.out.print("선택 : ");
				int menu = Integer.parseInt(sc.nextLine());
				BaseUI ui=null;
				switch (menu) {
				case 1:
					ui = new LoginUI();
					break;
				case 2:
					ui = new RegistryMemberUI();
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
