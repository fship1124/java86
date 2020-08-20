package command.material;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CompanyDAO;
import DAO.MaterialDAO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int mtrId = Integer.parseInt(request.getParameter("mtrId"));
		
		MaterialDAO dao = new MaterialDAO();
		dao.deleteMaterial(mtrId);
	}
}
