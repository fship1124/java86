package ui;

import util.PrintUtil;

public class DeleteBoardUI extends BaseUI {
	public void execute() {
		System.out.println("글삭제 메뉴 선택");
		PrintUtil.PrintChar(c, count);
		System.out.print("번호 : ");
		int no = Integer.parseInt(sc.nextLine());
		PrintUtil.PrintChar(c, count);
		int result = dao.deleteBoard(no);
		if (result==0) {
			System.out.println("해당글이 존재하지 않습니다.");
		} else {
			System.out.println(no + "번글 삭제가 완료되었습니다.");
		}
	}
}
