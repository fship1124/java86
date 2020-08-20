package quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/quiz/ajaxquiz1")
public class Quiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		List<BoardListVO> list = new ArrayList<>();
		QuizDAO dao = new QuizDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		PrintWriter out = resp.getWriter();
		list = dao.getBoard();
		for (BoardListVO bv : list) {
			bv.setDate((sdf.format(bv.getRegDate())));
		}
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println(json);
		out.println(json);
		out.close();
		
	}
	
}
