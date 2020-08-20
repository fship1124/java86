package command.account;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccountDAO;
import DAO.CodeManagementDAO;
import VO.AccountVO;
import VO.CodeManagementVO;
import base.command.BaseCommand;

public class UpdateFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CodeManagementVO> authorityCodeList = new CodeManagementDAO().selectListCodeByTypeName("authority");
		AccountVO account = new AccountDAO().selectOneAccount(request.getParameter("id"));
		request.setAttribute("authorityCodeList", authorityCodeList);
		request.setAttribute("accountVO", account);
	}

}
