package Board;

import java.util.Scanner;

import util.ArrayList;

public class BoardUI {
	Scanner sc = new Scanner(System.in);
	BoardDAO dao;
	BoardUI() {
		dao = new BoardDAO();
	}
	
	public void start(){
		while(true) {
			System.out.println("------------------");
			System.out.println("1. 전체글 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글 등록");
			System.out.println("4. 글 수정");
			System.out.println("5. 글 삭제");
			System.out.println("0. 종료");
			System.out.println("------------------");
			System.out.print("메뉴 선택 : ");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 0 : exit();
			case 1 : searchAll(); break;
			case 2 : searchOne(); break;
			case 3 : add(); break;
			case 4 : mod(); break;
			case 5 : del(); break;		
			}			
		
		}
	}
		
	public void searchAll() {
		ArrayList list = dao.selectBoard();	
		if (list.size()==0) {
			System.out.println("글이 존재 하지 않습니다.");
		}
		else {
			System.out.println("----------------");
			System.out.printf("글번호\t제목\t작성자\n");
			System.out.println("----------------");
			for (int i = list.size() - 1 ; i >= 0; i-- ) {
				Board board = (Board)list.get(i);
				System.out.printf("%d\t%s\t%s\n", board.getNo(),board.getTitle(),board.getWriter());				
			}			
			System.out.println("----------------");
		}
	}
	
	public void searchOne() {
		System.out.print("글번호 : ");
		int selNo = Integer.parseInt(sc.nextLine());
		Board board = (Board)dao.selectByNo(selNo);
		if (board == null) {
			System.out.println("해당번호의 글이 존재 하지 않습니다.");
		}
		else {
			System.out.printf("글번호 : %d\n", board.getNo());
			System.out.printf("글제목 : %s\n", board.getTitle());
			System.out.printf("작성자 : %s\n", board.getWriter());
			System.out.printf("글내용 : %s\n", board.getContent());
		}
	}

	public void add() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		
		dao.insertBoard(board);
		System.out.println("글 작성이 완료 되었습니다.");
	}
	
	public void mod() {
		System.out.print("수정할 글번호 : ");
		int modNo = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 제목 : ");
		String modTitle = sc.nextLine();
		
		Board board = new Board();
		board.setNo(modNo);
		board.setTitle(modTitle);
		
		if (dao.updateBoard(board) == true) {
			System.out.println("글 수정이 완료되었습니다.");
		}
		else {
			System.out.println("해당 글이 없습니다.");
		}
	}
	
	public void del() {
		System.out.print("삭제할 글번호 : ");
		int delNo = Integer.parseInt(sc.nextLine());
				
		if (dao.deleteBoard(delNo) == true) {
			System.out.println("글 삭제가 완료되었습니다.");
		}
		else {
			System.out.println("해당 글이 없습니다.");
		}
	}
	
	public void exit() {
		System.out.println("종료합니다.");
		System.exit(0);
	}
	
	
}
