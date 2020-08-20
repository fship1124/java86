package kr.co.mlec.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.util.MyAppSqlConfig;

public class BoardDAO {
	private static SqlSession session = null;
	
	public BoardDAO () {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public List selectList () {
		return session.selectList("board.BoardDAO.selectList");
	}
	
	public Board selectListByNo (int no) {
		return session.selectOne("board.BoardDAO.selectListByNo", no);
	}
	
	public BoardFile selectListFileByNo (int no) {
		return session.selectOne("board.BoardDAO.selectListFileByNo", no);
	}
	
	public void deleteBoard(int no) {
		session.delete("board.BoardDAO.deleteBoard", no);
	}

	public void updateBoard(Board board) {
		session.update("board.BoardDAO.updateBoard", board);
	}
	
	public List<Comment> selectCommentByNo(int no) {
		return session.selectList("board.BoardDAO.selectCommentByNo", no);
	}
	
	public void deleteComment(int commentNo) {
		session.delete("board.BoardDAO.deleteComment", commentNo);
		session.commit();
	}
	public void updateComment(Comment comment) {
		session.update("board.BoardDAO.updateComment", comment);
		session.commit();
	}
	public void insertComment(Comment comment) {
		session.insert("board.BoardDAO.insertComment", comment);
		session.commit();
	}
}
