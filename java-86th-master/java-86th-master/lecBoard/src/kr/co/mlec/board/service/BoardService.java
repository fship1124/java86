package kr.co.mlec.board.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import kr.co.mlec.board.Board;
import kr.co.mlec.board.BoardFile;
import kr.co.mlec.board.Comment;

public interface BoardService {
	/** 게시물의 목록 정보를 조회하는 기능 */
	public List<Board> list() throws Exception;
	
	/** 게시물 상세 페이지 조회 기능 */
	public Map<String, Object> detail(int findNo) throws Exception;
	
	/** 게시물 삭제 기능 */
	public void delete(int no) throws Exception;
	
	/** 게시물 수정 기능 */
	public void update(Board board) throws Exception;
	
	/** 게시물 수정폼 기능 */
	public Board updateForm(int no) throws Exception;
	
	/** 게시물 등록 기능  */
	public void write(Board board, BoardFile boardFile) throws Exception;
	
	
	
	/** 댓글 삭제 기능 */
	public void commentDelete(int commentNo) throws Exception;

	/** 댓글 등록 기능 */
	public void commentRegist(Comment comment) throws Exception;
	
	/** 댓글 수정 기능 */
	public void commentUpdate(Comment comment) throws Exception;
	
	/** 댓글 리스트 AJAX */
	public List<Comment> listComment(int no) throws Exception;
}
