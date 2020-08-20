package command.factory;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FactoryDAO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int factoryId = Integer.parseInt(request.getParameter("factoryId"));
		new FactoryDAO().deleteFactory(factoryId);
	}
}
