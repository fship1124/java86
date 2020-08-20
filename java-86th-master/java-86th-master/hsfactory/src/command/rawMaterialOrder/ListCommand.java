package command.rawMaterialOrder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerOrderDAO;
import DAO.RawMaterialOrderDAO;
import VO.CustomerOrderVO;
import VO.RawMaterialOrderVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in rawMaterialOrder > ListCommand");
		
		List<RawMaterialOrderVO> list = new ArrayList<>();
		
		RawMaterialOrderDAO dao = new RawMaterialOrderDAO();
		list = dao.selectRawMaterialOrder();
		
		System.out.println(list.size());
		request.setAttribute("list", list);
	}
}
