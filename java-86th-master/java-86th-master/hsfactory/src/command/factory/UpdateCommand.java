package command.factory;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FactoryDAO;
import VO.FactoryVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int factoryId = Integer.parseInt(request.getParameter("factoryId"));
		String factoryName = request.getParameter("factoryName");
		String factoryAdress = request.getParameter("factoryAdress");
	
		FactoryVO factory = new FactoryVO();
		factory.setFactoryId(factoryId);
		factory.setFactoryName(factoryName);
		factory.setFactoryAdress(factoryAdress);
		new FactoryDAO().updateFactory(factory);
	}

}
