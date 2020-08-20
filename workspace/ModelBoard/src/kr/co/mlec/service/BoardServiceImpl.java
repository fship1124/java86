package kr.co.mlec.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.mlec.board.Board;
import kr.co.mlec.board.BoardDAO;
import kr.co.mlec.board.Comment;

public class BoardServiceImpl implements BoardService{
	private BoardDAO dao;
	
	public BoardServiceImpl() {
		dao = new BoardDAO();
	}

	@Override
	public List<Board> list() throws Exception {
		return dao.selectList();
	}

	@Override
	public Map<String, Object> detail(int no) throws Exception {
		Map<String, Object> detail = new HashMap<>();
		detail.put("board", dao.selectListByNo(no));
		detail.put("file", dao.selectListFileByNo(no));
		return detail;
	}

	@Override
	public void delete(int no) throws Exception {
		dao.deleteBoard(no);
	}

	@Override
	public void update(Board board) throws Exception {
		dao.updateBoard(board);
	}

	@Override
	public void commentDelete(int commentNo) throws Exception {
		dao.deleteComment(commentNo);
	}

	@Override
	public void commentRegist(Comment comment) throws Exception {
		dao.insertComment(comment);
	}

	@Override
	public void commentUpdate(Comment comment) throws Exception {
		dao.updateComment(comment);
	}

	@Override
	public List<Comment> listComment(int no) throws Exception {
		return dao.selectCommentByNo(no);
	}

	
	 
}
