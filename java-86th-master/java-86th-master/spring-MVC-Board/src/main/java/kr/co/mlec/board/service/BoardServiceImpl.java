package kr.co.mlec.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.repository.mapper.BoardDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.BoardFile;
import kr.co.mlec.repository.vo.Comment;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;

	@Override
	public List<Board> list() throws Exception {
		return boardDao.selectBoard();
	}
	@Override
	public void deleteComment(int commentNo) throws Exception {
		boardDao.deleteComment(commentNo);		
	}
	@Override
	public void registComment(Comment comment) throws Exception {
		boardDao.insertComment(comment);
	}
	@Override
	public void updateComment(Comment comment) throws Exception {
		boardDao.updateComment(comment);
	}
	@Override
	public void delete(int no) throws Exception {
		boardDao.deleteBoard(no);
	}
	@Override
	public void update(Board board) throws Exception {
		boardDao.updateBoard(board);
	}
	@Override
	public Board updateForm(int no) throws Exception {
		return boardDao.selectBoardByNo(no);
	}
	
	@Override
	public Map<String, Object> detail(int findNo) throws Exception {
		Map<String, Object> result = new HashMap<>();
		result.put("board", boardDao.selectBoardByNo(findNo));
		// 게시물과 연관된 파일 정보 추출
		result.put("file", boardDao.selectBoardFileByNo(findNo));
		return result;
	}
	
	@Override
	public void write(Board board, BoardFile boardFile) throws Exception {
		int no = boardDao.insertBoard(board);
		if (boardFile != null) {
			boardFile.setNo(no);
			boardDao.insertBoardFile(boardFile);
		}
	}
	
	@Override
	public List<Comment> listComment(int no) throws Exception {
		return boardDao.selectCommentByNo(no);
	}
}









