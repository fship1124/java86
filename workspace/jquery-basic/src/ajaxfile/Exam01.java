package ajaxfile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/ajaxFile/exam01")
public class Exam01 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String upload = "C:/java86/workspace/jquery-basic/WebContent/upload";
		MultipartRequest mRequest = new MultipartRequest(
				request,
				upload,
				1024 * 1024 * 100,
				"utf-8",
				new DefaultFileRenamePolicy());
		String msg = mRequest.getParameter("msg");
		System.out.println("일반 데이터(msg) : " + msg);
		
		String oriFileName = mRequest.getOriginalFileName("attachFile");
		System.out.println("원본 파일명 : " + oriFileName);
		
		String realFilName = mRequest.getFilesystemName("attachFile");
		System.out.println("서버 파일명 : " + realFilName);
		
		oriFileName = mRequest.getOriginalFileName("attachFile1");
		System.out.println("원본 파일명 : " + oriFileName);
		
		realFilName = mRequest.getFilesystemName("attachFile1");
		System.out.println("서버 파일명 : " + realFilName);
	}
	
}
