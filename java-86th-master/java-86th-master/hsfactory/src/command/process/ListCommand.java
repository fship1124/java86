package command.process;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProcessDAO;
import VO.ProcessVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("command.process > ListCommand");
		
		List<ProcessVO> list = new ArrayList<>();
		ProcessDAO dao = new ProcessDAO();
		list = dao.selectProcess();
		System.out.println(list.size());
		request.setAttribute("list", list);

	}
}
