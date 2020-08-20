package kr.co.mlec.board.service;

import java.util.List;
import java.util.Map;

import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.BoardFile;
import kr.co.mlec.repository.vo.Comment;

/** 게시판 기능 메서드 */
public interface BoardService {
	
	public List<Board> list() throws Exception;

	public void write(Board board, BoardFile boardFile) throws Exception;

	public Board updateForm(int no) throws Exception;

	public void update(Board board) throws Exception;

	public void delete(int no) throws Exception;

	public Map<String, Object> detail(int no) throws Exception;

	public List<Comment> listCommnet(int no) throws Exception;

	public List<Comment> deleteComment(int commnetNo) throws Exception;

	public void registComment(int no, Comment commnet) throws Exception;

	public void updateComment(Comment commnet) throws Exception;
	
	
}
