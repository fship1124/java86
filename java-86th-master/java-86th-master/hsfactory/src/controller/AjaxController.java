package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAO.ProcessDAO;
import VO.ProcessVO;

@WebServlet("/processAjax")
public class AjaxController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ajax");
		resp.setContentType("text/plain; charset=utf-8"); 
		List<ProcessVO> list = new ArrayList<>();
		ProcessDAO dao = new ProcessDAO();
		
		list = dao.selectAjaxProcess();
		System.out.println("list");
		System.out.println(list.size());
		for (ProcessVO val : list) {
			System.out.println(val.toString());
		}
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println(json);
		
		PrintWriter out = resp.getWriter();
		out.print(json);
		out.close();
	}
}
