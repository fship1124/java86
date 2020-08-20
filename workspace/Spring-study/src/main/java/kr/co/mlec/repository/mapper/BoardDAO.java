/**
 *  DAO : Date Access Object
 *  insert 
 *  update
 *  delete
 *  select
 */
package kr.co.mlec.repository.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.BoardFile;
import kr.co.mlec.repository.vo.Comment;
import kr.co.mlec.util.MyAppSqlConfig;

@Repository
public class BoardDAO {
	
	private static SqlSession session = null;
	public BoardDAO () {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	public int insertBoard(Board board) {
		session.insert("kr.co.mlec.repository.mapper.BoardDAO.insertBoard", board);
		session.commit();
		return board.getNo();
	}
	public int updateBoard(Board board) {
		int cnt = session.update("kr.co.mlec.repository.mapper.BoardDAO.updateBoard", board);
		session.commit();
		return cnt;
	}
	
	public int deleteBoard(int delNo) {
		int cnt = session.delete("kr.co.mlec.repository.mapper.BoardDAO.deleteBoard", delNo);
		session.commit();
		return cnt;		
	}
	
	public List<Board> selectBoard() {
		return session.selectList("kr.co.mlec.repository.mapper.BoardDAO.selectBoard");
	}
	/**
	 * 매개변수에 해당하는 글번호의 게시물을 반환하는 기능
	 * @param no
	 * @return  null 이 반환될 경우 해당 번호의 게시물이 존재하지 않는경우
	 *          null 이 아닌값이 반환된 경우는 해당 번호의 게시물을 찾은 경우
	 */
	public Board selectBoardByNo(int findNo) {
		return session.selectOne(
				"kr.co.mlec.repository.mapper.BoardDAO.selectBoardByNo", findNo);
	}
	public void insertBoardFile(BoardFile boardFile) {
		session.insert("kr.co.mlec.repository.mapper.BoardDAO.insertBoardFile", boardFile);
		session.commit();
	}
	public BoardFile selectBoardFileByNo(int findNo) {
		return session.selectOne(
				"kr.co.mlec.repository.mapper.BoardDAO.selectBoardFileByNo", findNo);
	}
	public void insertComment(Comment comment) {
		session.insert("kr.co.mlec.repository.mapper.BoardDAO.insertComment", comment);
		session.commit();
	}
	public List<Comment> selectCommentByNo(int findNo) {
		return session.selectList("kr.co.mlec.repository.mapper.BoardDAO.selectCommentByNo", findNo);
	}
	public void deleteComment(int commentNo) {
		session.delete("kr.co.mlec.repository.mapper.BoardDAO.deleteComment", commentNo);
		session.commit();
	}
	public void updateComment(Comment comment) {
		session.update("kr.co.mlec.repository.mapper.BoardDAO.updateComment", comment);
		session.commit();
	}
}










