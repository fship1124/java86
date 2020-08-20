package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/file/upload")
public class Upload extends HttpServlet {

	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = request.getServletContext();
		String realPath = context.getRealPath("/upload");
		System.out.println("realPath : " + realPath);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("/yyyy/MM/dd");
		String path = sdf.format(new Date());
		
		// 만들어진 날짜에 해당하는 디렉토리 생성
		realPath += path;
		
		File f = new File(realPath);
		if (!f.exists()) {
			f.mkdirs();
		}
		
		MultipartRequest mRequest = new MultipartRequest(
			request,   
			realPath, // 서버에 저장할 패스
			1024 * 1024 * 100,  // 저장할 파일의 최대 사이즈 
			"UTF-8", // 요청에 대한 인코딩 처리 방식
			new BitFileRenamePolicy()  // 파일이름이 같을 경우 정책..
//			new DefaultFileRenamePolicy()  // 파일이름이 같을 경우 정책..
		);
		String msg = mRequest.getParameter("msg");
		System.out.println("msg : " + msg);
		System.out.println("파일 저장 성공");
		
		File file = mRequest.getFile("attachFile");
		// 사용자가 선택한 파일이 있는지 체크
		if (file != null) {
			// 사용자가 선택한 파일명
			String oriFileName = mRequest.getOriginalFileName("attachFile");
			System.out.println("oriFileName : " + oriFileName);
			
			// 실제 서버에 저장된 파일명
			String realFileName = mRequest.getFilesystemName("attachFile");
			System.out.println(realFileName);
			
			// 파일의 사이즈
			long size = file.length();
			System.out.println("fileSize : " + size);
		}
	}
	
	/*
	 스트림 확인용
	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		InputStream in = request.getInputStream();
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine()) {
			out.println(sc.nextLine());
		}
		out.close();
	}
	 */
}







