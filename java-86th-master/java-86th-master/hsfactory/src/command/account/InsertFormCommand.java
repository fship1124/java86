package command.account;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CodeManagementDAO;
import VO.CodeManagementVO;
import base.command.BaseCommand;

public class InsertFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CodeManagementVO> authorityCodeList = new CodeManagementDAO().selectListCodeByTypeName ("authority");
		request.setAttribute("authorityCodeList", authorityCodeList);
	}

}
