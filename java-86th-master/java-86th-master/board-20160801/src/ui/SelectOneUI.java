package ui;

import java.text.SimpleDateFormat;

import board.BoardVO;
import util.PrintUtil;

public class SelectOneUI extends BaseUI {
	public void execute() {
		System.out.println("선택조회 메뉴 선택");
		PrintUtil.PrintChar(c, count);
		System.out.print("조회하실 글번호 : ");
		int no = Integer.parseInt(sc.nextLine());
		BoardVO board = dao.selectOne(no);
		if (board==null) {
			System.out.println("해당 번호 글이 존재하지 않습니다.");
		} else {
			PrintUtil.PrintChar(c, count);
			System.out.println("번호 : " + board.getNo());
			System.out.println("제목 : " + board.getTitle());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("내용 : " + board.getContent());
			System.out.println("등록일시 : " + new SimpleDateFormat("yyyy/MM/dd").format(board.getRegDate()));
			PrintUtil.PrintChar(c, count);			
		}
	}
}
