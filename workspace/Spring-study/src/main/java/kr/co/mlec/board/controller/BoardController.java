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

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/write.do")
	public String write (MultipartHttpServletRequest mRequest) throws Exception {
		
		// 1. 파일저장 디렉토리 경로
		//	1)파일저장 될 upload 폴더의 디렉토리 경로 
		ServletContext context = mRequest.getServletContext();
		String path = context.getRealPath("/upload");
		//	2)파일저장 될 디렉토리중 날짜형식의 디렉토리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String datePath = sdf.format(new Date());
		//	3)파일저장 될 디렉토리 풀 주소구하기(1+2)
		String savePath = path + datePath;
		
		// 2.파일저장
		File f = new File(savePath);
		if (!f.exists()) f.mkdirs();
		
		// 3.dao로 보낼 게시물 정보
		Board board = new Board();
		board.setTitle(mRequest.getParameter("title"))
			 .setWriter(mRequest.getParameter("writer"))
			 .setContent(mRequest.getParameter("content"));
		
		// 4.dao로 보낼 게시물 파일 정보
		MultipartFile file = mRequest.getFile("attachFile");
		String oriFileName = file.getOriginalFilename();
		BoardFile boardFile = null;
		if (oriFileName != null && !oriFileName.equals("")) {
			// 1)확장자 처리
			String ext = "";
			int index = oriFileName.lastIndexOf(".");
			if (index != -1) {
				ext = oriFileName.substring(index); //파일명에서 확장자명(.포함) 추출
			}
			// 2)파일 사이즈
			long fileSize = file.getSize();
			// 3)고유한 파일명 만들기(풀주소)
			String realFileName = "mlec-" + UUID.randomUUID().toString() + ext;
			// 4)임시저장된 파일을 원하는 경로에 저장
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
	
	@RequestMapping("/list.do")
	public void list(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}
	
	@RequestMapping("/updateForm.do")
	public void updateForm(@RequestParam(value="no") int no, Model model) throws Exception{
		model.addAttribute("board", service.updateForm(no));
	}
	
	@RequestMapping("/update.do")
	public String update(Board board) throws Exception {
		service.update(board);
		return "redirect:list.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int no) throws Exception{
		service.delete(no);
		return "redirect:list.do";
	}
	
	@RequestMapping("/detail.do")
	public void detail(int no, Model model) throws Exception{
		Map<String, Object> result = service.detail(no);
		model.addAttribute("board", result.get("board"));
		model.addAttribute("file", result.get("file"));
	}
	
	@RequestMapping("/commentList.do")
	@ResponseBody
	public List<Comment> commentListAjax(int no) throws Exception{
		return service.listCommnet(no);
	}
	
	@RequestMapping("/commentDelete.do")
	@ResponseBody
	public List<Comment> commentDeleteAjax(int commnetNo) throws Exception{
		return service.deleteComment(commnetNo);
	}
	
	@RequestMapping("/commentRegist.do")
	@ResponseBody
	public List<Comment> commentRegistAjax(int no, Comment commnet) throws Exception {
		service.registComment(no, commnet);
		return service.listCommnet(no);
	}
	
	@RequestMapping("/commentUpdate.do")
	@ResponseBody
	public List<Comment> commentUpdateAjax(int no, Comment commnet) throws Exception  {
		service.updateComment(commnet);
		return service.listCommnet(no);
	}
	
}







