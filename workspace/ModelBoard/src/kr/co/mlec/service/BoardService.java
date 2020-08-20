package kr.co.mlec.service;

import java.util.List;
import java.util.Map;

import kr.co.mlec.board.Board;
import kr.co.mlec.board.Comment;

public interface BoardService {
	
	/** 게시물 리스트 조회 기능*/
	public List<Board> list() throws Exception;
	
	/** 게시물 상세 조회 기능*/
	public Map<String, Object> detail(int no) throws Exception;

	/** 게시물 삭제 기능*/
	public void delete(int no) throws Exception;

	/** 게시물 수정 기능*/
	public void update(Board board) throws Exception;

	/** 댓글 삭제 기능*/
	public void commentDelete(int commentNo) throws Exception;

	/** 댓글 등록 기능*/
	public void commentRegist(Comment comment) throws Exception;
	
	/** 댓글 수정 기능 */
	public void commentUpdate(Comment comment) throws Exception;
	
	/** 댓글 수정 list ajax*/
	public List<Comment> listComment(int no) throws Exception;
}
