package command.warehouse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.WarehouseDAO;
import VO.WarehouseVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<WarehouseVO> whList = new ArrayList<>();
		WarehouseDAO dao = new WarehouseDAO();
		whList = dao.selectList();
		
		request.setAttribute("whList", whList);
	}

}
