package kr.co.mlec.file;

import java.io.File;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/file")
public class UploadController {

	@Autowired
	ServletContext servletContext;     // 웹어플리케이션 자체를 꺼내올때 쓰이는..
	  
	@RequestMapping(value="/upload.do", method=RequestMethod.POST)
	public ModelAndView fileUpload(MultipartHttpServletRequest mRequest) throws Exception {
		
		// 실행되는 웹어플리케이션의 실제 경로 가져오기
		String uploadDir = servletContext.getRealPath("/upload/");
		System.out.println(uploadDir);
		
		// 현재 디렉토리가 졵재하지 않는 다면 생성해라
		File f = new File(uploadDir);
		if (!f.exists()) f.mkdirs();
		
		// view page 정보 받아오기
		ModelAndView mav = new ModelAndView("file/uploadResult");

		String id = mRequest.getParameter("id");
		System.out.println("id : " + id);
		
		Iterator<String> iter = mRequest.getFileNames();   // Iterator(순환자) 동적으로 파일명 얻기(여러개올수 있으므로 반복형태임)
		while(iter.hasNext()) {
			
			String formFileName = iter.next();   // formFileName = attachFile1 다음반복에는 attachFile2
			// 폼에서 파일을 선택하지 않아도 객체 생성됨
			MultipartFile mFile = mRequest.getFile(formFileName);   // 스프링에서는 파일이 있던 없던 무조건 객체가 생성된다.
			
			// 원본 파일명
			String oriFileName = mFile.getOriginalFilename();
			System.out.println("원본 파일명 : " + oriFileName);
			
			if(oriFileName != null && !oriFileName.equals("")) {   // mFile 대신 oriFileName 쓰는 이유는 mFile은 무조건 값이 있으므로..
			
				// 확장자 처리
				String ext = "";
				// oriFileName에서 뒤쪽에 있는 . 의 위치 
				int index = oriFileName.lastIndexOf(".");
				if (index != -1) {
					// 파일명에서 확장자명(.포함)을 추출
					ext = oriFileName.substring(index);
				}
				
				// 파일 사이즈
				long fileSize = mFile.getSize();
				System.out.println("파일 사이즈 : " + fileSize);
				
				// 고유한 파일명 만들기	
				String saveFileName = "mlec-" + UUID.randomUUID().toString() + ext;
				System.out.println("저장할 파일명 : " + saveFileName);
			
				// 임시저장된 파일을 원하는 경로에 저장
				mFile.transferTo(new File(uploadDir + "/" + saveFileName));
			} 
		} 
		return mav;
	}
}
