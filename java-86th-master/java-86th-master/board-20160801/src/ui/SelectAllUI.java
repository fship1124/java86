package ui;

import java.text.SimpleDateFormat;
import java.util.List;

import board.BoardVO;
import util.PrintUtil;

public class SelectAllUI extends BaseUI {
	public void execute() {
		System.out.println("전체조회 선택");
		List<BoardVO> list = dao.selectAll();
		PrintUtil.PrintChar(c, count);
		System.out.println("번호\t글쓴이\t제목\t내용\t등록일시");
		PrintUtil.PrintChar(c, count);
		if (list.size() > 0) {
			for (BoardVO board : list) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\n", board.getNo(), board.getTitle(), board.getWriter(),
						board.getContent(), new SimpleDateFormat("yyyy/MM/dd").format(board.getRegDate()));
			}
		} else {
			System.out.println("자료가 존재하지 않습니다.");
		}
		PrintUtil.PrintChar(c, count);
	}
}
