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

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String factoryName = request.getParameter("factoryName");
		String factoryAdress = request.getParameter("factoryAdress");
		Date factoryRegDate  = null;
		try {
			factoryRegDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("factoryRegDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		FactoryVO factory = new FactoryVO();
		factory.setFactoryName(factoryName);
		factory.setFactoryAdress(factoryAdress);
		factory.setFactoryRegDate(factoryRegDate);
		new FactoryDAO().insertFactory(factory);
	}

}
