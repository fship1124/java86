package Board;

import util.ArrayList;

public class BoardDAO {
	private int no = 0;
	ArrayList list;
	BoardDAO(){
		list = new ArrayList();
	}
	
	public ArrayList selectBoard() {
		return list;
	}
	
	public Board selectByNo(int selNo) {
		for (int i = 0; i < list.size(); i++){
			Board b = (Board) list.get(i);
			if (b.getNo() == selNo) {
				return b;
			}
		}
		return null;
	}
	
	public void insertBoard (Board board) {
		board.setNo(++no);
		list.add(board);
	}
	
	public boolean updateBoard (Board board) {
		for (int i = 0; i < list.size(); i++){
			Board b = (Board) list.get(i);
			if (b.getNo() == board.getNo()) {
				b.setTitle(board.getTitle());
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteBoard (int delNo) {
		for (int i = 0; i < list.size(); i++){
			Board b = (Board) list.get(i);
			if (b.getNo() == delNo) {
				list.remove(i);
				return true;
			}
		}
		return false;	
	}
	
}
	

