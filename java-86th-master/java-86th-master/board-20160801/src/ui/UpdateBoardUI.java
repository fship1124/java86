package ui;

import board.BoardVO;
import util.PrintUtil;

public class UpdateBoardUI extends BaseUI {
public void execute() {
		System.out.println("글수정 메뉴 선택");
		BoardVO board = new BoardVO();
		PrintUtil.PrintChar(c, count);
		System.out.print("번호 : ");
		board.setNo(Integer.parseInt(sc.nextLine()));
		System.out.print("제목 : ");
		board.setTitle(sc.nextLine());
		System.out.print("내용 : ");
		board.setContent(sc.nextLine());
		PrintUtil.PrintChar(c, count);
		int result = dao.updateBoard(board);
		if (result==0) {
			System.out.println("해당글이 존재하지 않습니다.");
		} else {
			System.out.println(board.getNo() + "번글 수정이 완료되었습니다.");
		}
		
	}
}
