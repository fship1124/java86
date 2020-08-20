package board;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import util.MyAppSqlConfig;

public class BoardDAO {
	private static SqlSession session = null;
	public BoardDAO () {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public List<BoardVO> selectAll() {
		return session.selectList("board.BoardDAO.selectAll");
	}
	
	public BoardVO selectOne(int no) {
		return session.selectOne("board.BoardDAO.selectOne", no);
	}
	
	public void insertBoard(BoardVO board){
		session.insert("board.BoardDAO.insertBoard", board);
		session.commit();
	}
	
	public int updateBoard(BoardVO board){
		int result = session.update("board.BoardDAO.updateBoard", board);
		session.commit();
		return result;
	}
	
	public int deleteBoard(int no){
		int result = session.delete("board.BoardDAO.deleteBoard", no);
		session.commit();
		return result;
	}
	
	
}
