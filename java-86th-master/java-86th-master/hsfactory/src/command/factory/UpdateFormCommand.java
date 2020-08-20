package command.factory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FactoryDAO;
import VO.FactoryVO;
import base.command.BaseCommand;

public class UpdateFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String updateFactoryId = request.getParameter("factoryId");	
		List<FactoryVO> factoryList = new FactoryDAO().selectListFactory();
		request.setAttribute("factoryList", factoryList);
		request.setAttribute("updateFactoryId", updateFactoryId);
	}

}
