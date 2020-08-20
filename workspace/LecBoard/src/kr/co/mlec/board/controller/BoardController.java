package kr.co.mlec.board.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.oreilly.servlet.MultipartRequest;

import framework.Controller;
import framework.ModelAndView;
import framework.RequestMapping;
import framework.RequestParam;
import framework.WebUtil;
import kr.co.mlec.board.Board;
import kr.co.mlec.board.BoardFile;
import kr.co.mlec.board.Comment;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.service.BoardServiceImpl;
import kr.co.mlec.util.BitFileRenamePolicy;

@Controller
public class BoardController {
private BoardService service;
	
	public BoardController () {
		service = new BoardServiceImpl();
	}
	
	@RequestMapping("/board/commentList.do")
	public String commentList(int no) throws Exception {
		return "ajax:" + new Gson().toJson(service.listComment(no));
	}
	
	@RequestMapping("/board/commentDelete.do")
	public String commentDeleteAjax(int no, int commentNo) throws Exception {
		
//		int no = Integer.parseInt(request.getParameter("no"));
//		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		service.commentDelete(commentNo);
		return "ajax:" + new Gson().toJson(service.listComment(no));
	}
	
	@RequestMapping("/board/commentRegist.do")
	public String commentRegistAjax(int no, Comment comment) throws Exception {
		
//		int no = Integer.parseInt(request.getParameter("no"));
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		
		/* WebUtil 클래스 생성으로 set 처리 한번에 실행
		Comment comment = new Comment();
		comment.setNo(no);
		comment.setContent(request.getParameter("content"));
		comment.setId(request.getParameter("id"));
		*/
//		Comment comment = (Comment)WebUtil.getParamToVO(Comment.class, request);
		
		
		service.commentRegist(comment);

//		List<Comment> list = service.listComment(no);
//		System.out.println(list);
//		String a = new Gson().toJson(
//				service.listComment(no));
//		System.out.println(a);
		return "ajax:" + new Gson().toJson(service.listComment(no));
	}
	
	@RequestMapping("/board/commentUpdate.do")
	public String commentUpdateAjax(Comment comment) throws Exception {
		
		/*
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		Comment comment = new Comment();
		comment.setContent(request.getParameter("content"));
		comment.setCommentNo(commentNo);
		*/
//		Comment comment = (Comment)WebUtil.getParamToVO(Comment.class, request);
		service.commentUpdate(comment);
		
		return "ajax:{}";
	}
	
	@RequestMapping("/board/delete.do")
	public String delete(int no) throws Exception {  //String : 넘어가고자하는 view page 정보
		
//		int no = Integer.parseInt(request.getParameter("no"));
		service.delete(no);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/board/detail.do")
	public ModelAndView detail(int no) throws Exception {
		ModelAndView mav = new ModelAndView();
//		int findNo = Integer.parseInt(request.getParameter("no"));
		/* ajax로 아래 기능을 대신해서 삭제해도 됨
		try {
			mav.addAttribute("commentNo", Integer.parseInt(request.getParameter("commentNo")));	
		} catch (NumberFormatException e) { }
		*/
		Map<String, Object> detail = service.detail(no);
		mav.addAttribute("file",  detail.get("file"));
		mav.addAttribute("board", detail.get("board"));
		
		mav.setView("detail.jsp");
		return mav;
	}
	
	@RequestMapping("/board/list.do")
	public ModelAndView list() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<Board> list = service.list();
		
		mav.addAttribute("list", list);
		mav.setView("list.jsp");
		return mav;
	}
	
	@RequestMapping("/board/update.do")
	public String update(Board board) throws Exception {
		
		/*
		Board board = new Board();
		board.setNo(Integer.parseInt(request.getParameter("no")));
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContent(request.getParameter("content"));
		 */
		// 위와 같이 파라미터값을 받아와서 set 처리하는 것을 한번에 실행하도록 WebUtil 클래스 생성
//		Board board = (Board)WebUtil.getParamToVO(Board.class, request);
		
		service.update(board);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/board/updateForm.do")
	public ModelAndView updateForm(@RequestParam(value="no")int no) throws Exception {
		ModelAndView mav = new ModelAndView();
		// 매개변수에 넣어주고 dispatcherServlet을 변경
//		int no = Integer.parseInt(request.getParameter("no"));
		Board board = service.updateForm(no);
		mav.addAttribute("board", board);
		
		mav.setView("updateForm.jsp");
		return mav;
	}
	
	@RequestMapping("/board/write.do")
	public String write(HttpServletRequest request) throws Exception {
		
		
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("/upload");
		
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		String datePath = sdf.format(new Date());
		
		String savePath = path + datePath;
		File f = new File(savePath);
		if (!f.exists()) f.mkdirs();
		
		// 파일 처리를 위한 API 클래스 호출
		MultipartRequest mRequest = new MultipartRequest(
				request, 
				savePath, 
				1024 * 1024 * 10, 
				"UTF-8",
				new BitFileRenamePolicy()
		);
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		Board board = new Board();
		board.setTitle(mRequest.getParameter("title"));
		board.setWriter(mRequest.getParameter("writer"));
		board.setContent(mRequest.getParameter("content"));
		
		File file = mRequest.getFile("attachFile");
		BoardFile boardFile = null;
		if (file != null) {
			String oriFileName = mRequest.getOriginalFileName("attachFile");
			String realFileName = mRequest.getFilesystemName("attachFile");
			long fileSize = file.length();
			boardFile = new BoardFile();
			boardFile.setOriFileName(oriFileName);
			boardFile.setRealFileName(realFileName);
			boardFile.setFilePath(datePath);
			boardFile.setFileSize(fileSize);
		}
		
		service.write(board, boardFile);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/board/writeForm.do")
	public void writeForm() throws Exception {}
	
	
	
	
}
