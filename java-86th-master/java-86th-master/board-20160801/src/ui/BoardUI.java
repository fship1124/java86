package ui;

import util.PrintUtil;

public class BoardUI extends BaseUI {
	public void execute() {
		outer : while (true) {	
			PrintUtil.PrintChar(c, count);
			System.out.println("게시판");
			PrintUtil.PrintChar(c, count);
			System.out.println("1. 전체조회");
			System.out.println("2. 선택조회");
			System.out.println("3. 등록");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			PrintUtil.PrintChar(c, count);
			System.out.print("메뉴 선택 : ");
			int no = Integer.parseInt(sc.nextLine());
			try {
				if (no > 5) {
					throw new Exception();
				} 
			} catch (Exception e) {
				System.out.println("올바른 메뉴 선택부탁");
				continue outer;
			}
			BaseUI ui = null;
			switch (no) {
			case 1:
				ui = new SelectAllUI();
				break;
			case 2:
				ui = new SelectOneUI();
				break;
			case 3:
				ui = new InsertBoardUI();
				break;
			case 4:
				ui = new UpdateBoardUI();
				break;
			case 5:
				ui = new DeleteBoardUI();
				break;
			case 0:
				ui = new ExitUI();
				break;
			}
			ui.execute();
		}
	}
}
