package kr.co.mlec.board.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.BoardFile;
import kr.co.mlec.repository.vo.Comment;

@Controller("kr.co.mlec.board.controller.BoardController")
@RequestMapping("/board")
public class BoardController {
	
	// @Autowired : 객체생성을 bean에서 하나에 관리하기 위해 사용.
	@Autowired
	private BoardService service;
	
	@RequestMapping("/write.do")
	public String write(MultipartHttpServletRequest mRequest) throws Exception {

		ServletContext context = mRequest.getServletContext();
		String path = context.getRealPath("/upload");
		
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		String datePath = sdf.format(new Date());
		
		String savePath = path + datePath;
		File f = new File(savePath);
		if (!f.exists()) f.mkdirs();
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		Board board = new Board();
		board.setTitle(mRequest.getParameter("title"))
		     .setWriter(mRequest.getParameter("writer"))
		     .setContent(mRequest.getParameter("content"));
		
		// 게시물 저장 처리 부탁..
		MultipartFile  file = mRequest.getFile("attachFile");
		BoardFile boardFile = null;
		String oriFileName = file.getOriginalFilename();
		if (oriFileName != null && !oriFileName.equals("")) {
			// 확장자 처리
			String ext = "";
			// 뒤쪽에 있는 . 의 위치 
			int index = oriFileName.lastIndexOf(".");
			if (index != -1) {
				// 파일명에서 확장자명(.포함)을 추출
				ext = oriFileName.substring(index);
			}
			
			// 파일 사이즈
			long fileSize = file.getSize();
			System.out.println("파일 사이즈 : " + fileSize);
			
			// 고유한 파일명 만들기	
			String realFileName = "mlec-" + UUID.randomUUID().toString() + ext;
			System.out.println("저장할 파일명 : " + realFileName);
		
			// 임시저장된 파일을 원하는 경로에 저장
			file.transferTo(new File(savePath + "/" + realFileName));
						
			boardFile = new BoardFile();
			boardFile.setOriFileName(oriFileName);
			boardFile.setRealFileName(realFileName);
			boardFile.setFilePath(datePath);
			boardFile.setFileSize(fileSize);
		}
		service.write(board, boardFile);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/updateForm.do")
	public void updateForm(@RequestParam(value="no") int no, Model model) throws Exception {
		model.addAttribute("board", service.updateForm(no));
	}
	
	@RequestMapping("/update.do")
	public String update(Board board) throws Exception {
		service.update(board);
		return "redirect:list.do";
	}
	
	@RequestMapping("/list.do")
	public void list(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}
	
	@RequestMapping("/detail.do")
	public void detail(int no, Model model) throws Exception {
		Map<String, Object> result = service.detail(no);
		model.addAttribute("board", result.get("board"));
		model.addAttribute("file", result.get("file"));
	}
	
	@RequestMapping("/delete.do")
	public String delete(int no) throws Exception {
		service.delete(no);
		return "redirect:list.do";
	}
	
	@RequestMapping("/commentDelete.do")
	@ResponseBody
	public List<Comment> commentDeleteAjax(int no, int commentNo) throws Exception {
		service.deleteComment(commentNo);
		return service.listComment(no);
	}
	
	@RequestMapping("/commentList.do")
	@ResponseBody
	public List<Comment> commentListAjax(int no) throws Exception {
		return service.listComment(no);
	}
	
	@RequestMapping("/commentRegist.do")
	@ResponseBody
	public List<Comment> commentRegistAjax(int no, Comment comment) throws Exception {
		service.registComment(comment);
		return service.listComment(no);
	}
	
	@RequestMapping("/commentUpdate.do")
	@ResponseBody
	public String commentUpdateAjax(Comment comment) throws Exception {
		service.updateComment(comment);
		return "{}";
	}
}







