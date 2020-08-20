package kr.co.mlec.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.mlec.repository.mapper.BoardDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.BoardFile;
import kr.co.mlec.repository.vo.Comment;

public class BoardServiceImple implements BoardService{
	@Autowired
	private BoardDAO dao;

	@Override
	public List<Board> list() throws Exception {
		
		return null;
	}

	@Override
	public void write(Board board, BoardFile boardFile) throws Exception {
		
	}

	@Override
	public Board updateForm(int no) throws Exception {
		return null;
	}

	@Override
	public void update(Board board) throws Exception {
		
	}

	@Override
	public void delete(int no) throws Exception {
		
	}

	@Override
	public Map<String, Object> detail(int no) throws Exception {
		return null;
	}

	@Override
	public List<Comment> listCommnet(int no) throws Exception {
		return null;
	}

	@Override
	public List<Comment> deleteComment(int commnetNo) throws Exception {
		return null;
	}

	@Override
	public void registComment(int no, Comment commnet) throws Exception {
		
	}

	@Override
	public void updateComment(Comment commnet) throws Exception {
		
	}

}
