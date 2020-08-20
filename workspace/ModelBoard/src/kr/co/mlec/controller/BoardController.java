package kr.co.mlec.controller;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import framework.Controller;
import framework.ModelAndView;
import framework.RequestMapping;
import kr.co.mlec.board.Board;
import kr.co.mlec.board.Comment;
import kr.co.mlec.service.BoardService;
import kr.co.mlec.service.BoardServiceImpl;

@Controller
public class BoardController {
	private BoardService service;
	
	public BoardController () {
		service = new BoardServiceImpl();
	}
	
	@RequestMapping("/board/list.do")
	public ModelAndView list() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<Board> list = service.list();
		mav.addAttribute("list", list);
		mav.setView("list.jsp");
		return mav;
	}
	
	@RequestMapping("/board/detail.do")
	public ModelAndView detail(int no) throws Exception {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> detail = service.detail(no);
		mav.addAttribute("board", detail.get("board"));
		mav.addAttribute("file", detail.get("file"));
		mav.setView("detail.jsp");
		return mav;
	}
	
	@RequestMapping("/board/delete.do")
	public String delete (int findNo) throws Exception {
		service.delete(findNo);
		return "redirect:list.do";
	}
	
	@RequestMapping("/board/update.do")
	public String update(Board board) throws Exception {
		service.update(board);
		return "redirect:list.do";
	}
	
	@RequestMapping("/board/commentList.do")
	public String commentList(int no) throws Exception {
		service.listComment(no);
		return "ajax:" + new Gson().toJson(no);
	}
	
	@RequestMapping("/board/commentDelet.do")
	public String commentDeletAjax(int no, int commentNo) throws Exception {
		service.commentDelete(commentNo);
		return "ajax:" + new Gson().toJson(service.listComment(no));
	}
	
	@RequestMapping("/board/commentRegist.do")
	public String commentRegistAjax(int no, Comment comment) throws Exception {
		service.commentRegist(comment);
		return "ajax:" + new Gson().toJson(service.listComment(no));
	}
	
	@RequestMapping("/board/commentUpdate.do")
	public String commentUpdateAjax(Comment comment) throws Exception {
		service.commentUpdate(comment);
		return "ajax{}";
		
	}
}
