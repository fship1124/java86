package command.eachProcess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EachProcessDAO;
import VO.EachProcessVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("command.eachProcess.ListCommand");
		
		List<EachProcessVO> list = new ArrayList<>();
		
//		EachProcessVO vo = new EachProcessVO();
//		
//		vo.setEpmTypeName("epm_type");
		
		EachProcessDAO dao = new EachProcessDAO();
		list = dao.selectEachProcess();
		
		System.out.println(list.size());
		List<EachProcessVO> rList = new ArrayList<>();
		for (EachProcessVO val : list) {
			
			System.out.println(val.toString());
			
			if (val.getCodeName().equals("output")) {
				rList.add(val);
			}
		}
		
		System.out.println("rList.size : " + rList.size());
		request.setAttribute("list", rList);	
		
	}
}
