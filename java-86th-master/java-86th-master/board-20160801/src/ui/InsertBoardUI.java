package ui;

import board.BoardVO;
import util.PrintUtil;

public class InsertBoardUI extends BaseUI {
public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("등록 메뉴 선택");
		PrintUtil.PrintChar(c, count);
		System.out.print("제목 : ");
		board.setTitle(sc.nextLine());
		System.out.print("작성자 : ");
		board.setWriter(sc.nextLine());
		System.out.print("내용 : ");
		board.setContent(sc.nextLine());
		PrintUtil.PrintChar(c, count);
		dao.insertBoard(board);
		System.out.println("글 등록이 완료되었습니다.");
	}
}
