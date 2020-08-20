package board;

import java.util.List;

public class board {
	public static void main(String[] args) {
		List<BoardVO> boardList = new BoardDAO().selectList();
		System.out.println(boardList.size());
		for (BoardVO b :  boardList) {
			System.out.println(b.getContent());
		}
		
	}
}
