package command.notice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import DAO.NoticeDAO;
import VO.NoticeFileVO;
import VO.NoticeVO;
import base.command.BaseCommand;
import util.BitFileRenamePolicy;

public class InsertCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("/upload");

		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		String datePath = sdf.format(new Date());

		String savePath = path + datePath;
		File f = new File(savePath);
		if (!f.exists())
			f.mkdirs();

		// 파일 처리를 위한 API 클래스 호출
		MultipartRequest mRequest = new MultipartRequest(request, savePath, 1024 * 1024 * 10, "UTF-8",
				new BitFileRenamePolicy());

		// 게시판과 파일 테이블에 저장할 글번호를 조회
		NoticeVO notice = new NoticeVO();
		notice.setTitle(mRequest.getParameter("title"));
		notice.setWriter(mRequest.getParameter("writer"));
		String contents = mRequest.getParameter("content");
		contents = contents.replace("\r\n","<br>");
		notice.setContent(contents);

		// 게시물 저장 처리 부탁..
		NoticeDAO dao = new NoticeDAO();
		int noticeId = dao.insertNotice(notice);

		File file = mRequest.getFile("attachFile");
		if (file != null) {
			String oriFileName = mRequest.getOriginalFileName("attachFile");
			String realFileName = mRequest.getFilesystemName("attachFile");
			long fileSize = file.length();

			NoticeFileVO noticeFile = new NoticeFileVO();
			noticeFile.setNoticeId(noticeId);
			noticeFile.setOriFileName(oriFileName);
			noticeFile.setRealFileName(realFileName);
			noticeFile.setFilePath(datePath);
			noticeFile.setFileSize(fileSize);

			dao.insertNoticeFile(noticeFile);
		}

	}
}