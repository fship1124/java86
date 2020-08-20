/**
 *  DAO : Date Access Object
 *  insert 
 *  update
 *  delete
 *  select
 */
package kr.co.mlec.repository.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.BoardFile;
import kr.co.mlec.repository.vo.Comment;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public BoardDAO() {
		System.out.println("호출됨.....");
	}
	
	public int insertBoard(Board board) {
		sqlSessionTemplate.insert("kr.co.mlec.repository.mapper.BoardDAO.insertBoard", board);
		return board.getNo();
	}
	public int updateBoard(Board board) {
		int cnt = sqlSessionTemplate.update("kr.co.mlec.repository.mapper.BoardDAO.updateBoard", board);
		return cnt;
	}
	
	public int deleteBoard(int delNo) {
		int cnt = sqlSessionTemplate.delete("kr.co.mlec.repository.mapper.BoardDAO.deleteBoard", delNo);
		return cnt;		
	}
	
	public List<Board> selectBoard() {
		return sqlSessionTemplate.selectList("kr.co.mlec.repository.mapper.BoardDAO.selectBoard");
	}
	/**
	 * 매개변수에 해당하는 글번호의 게시물을 반환하는 기능
	 * @param no
	 * @return  null 이 반환될 경우 해당 번호의 게시물이 존재하지 않는경우
	 *          null 이 아닌값이 반환된 경우는 해당 번호의 게시물을 찾은 경우
	 */
	public Board selectBoardByNo(int findNo) {
		return sqlSessionTemplate.selectOne(
				"kr.co.mlec.repository.mapper.BoardDAO.selectBoardByNo", findNo);
	}
	public void insertBoardFile(BoardFile boardFile) {
		sqlSessionTemplate.insert("kr.co.mlec.repository.mapper.BoardDAO.insertBoardFile", boardFile);
	}
	public BoardFile selectBoardFileByNo(int findNo) {
		return sqlSessionTemplate.selectOne(
				"kr.co.mlec.repository.mapper.BoardDAO.selectBoardFileByNo", findNo);
	}
	public void insertComment(Comment comment) {
		sqlSessionTemplate.insert("kr.co.mlec.repository.mapper.BoardDAO.insertComment", comment);
	}
	public List<Comment> selectCommentByNo(int findNo) {
		return sqlSessionTemplate.selectList("kr.co.mlec.repository.mapper.BoardDAO.selectCommentByNo", findNo);
	}
	public void deleteComment(int commentNo) {
		sqlSessionTemplate.delete("kr.co.mlec.repository.mapper.BoardDAO.deleteComment", commentNo);
	}
	public void updateComment(Comment comment) {
		sqlSessionTemplate.update("kr.co.mlec.repository.mapper.BoardDAO.updateComment", comment);
	}
}










