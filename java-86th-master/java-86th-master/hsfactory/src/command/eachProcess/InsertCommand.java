package command.eachProcess;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EachProcessDAO;
import VO.EachProcessVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in eachProcess > InsertCommand");
		
		String name = request.getParameter("eachProcessName");    // 개별 공정 주문 명
		
		String[] outputMaterials = request.getParameterValues("outputMaterial");
		String[] inputMaterials = request.getParameterValues("inputMaterial");
		String[] outputQuantitys = request.getParameterValues("outputQuantity");
		String[] inputQuantitys = request.getParameterValues("inputQuantity");
		
		System.out.println(name);
		
		EachProcessDAO dao = new EachProcessDAO();
		EachProcessVO vo = new EachProcessVO();
		
		vo.setEpName(name);
		int epId = dao.insertEachProcess(vo);
		System.out.println("insert epId : " + epId);
		
		System.out.println("outputMaterials.length : " + outputMaterials.length);
		

		int j = 0;
		for (String val : outputMaterials) {
			if (!val.equals("")) {
				System.out.println("case 2");
				System.out.println(val);
				
				int materialId =  Integer.parseInt(val);
				int materialQuantty = Integer.parseInt(outputQuantitys[j++]);
				System.out.println(materialId);
				System.out.println(materialQuantty);
				
				EachProcessVO outVo = new EachProcessVO();
				outVo.setEpId(epId);
				outVo.setEpmType(0);
				outVo.setMaterialId(materialId);
				outVo.setMaterialQuantity(materialQuantty);
				dao.insertEachProcessMaterial(outVo);
			}
		}
		
		int i = 0;
		System.out.println("inputMaterials.length : " + inputMaterials.length);
		for (String val : inputMaterials) {
			if (!val.equals("")) {
				System.out.println("case 3");
				System.out.println("i : " + i);
				System.out.println(val);
				int materialId =  Integer.parseInt(val);
				System.out.println(inputQuantitys[0]);
				System.out.println(inputQuantitys[1]);
				int materialQuantty = Integer.parseInt(inputQuantitys[i++]);
				System.out.println(materialId);
				System.out.println(materialQuantty);
				
				EachProcessVO inVo = new EachProcessVO();
				inVo.setEpId(epId);
				inVo.setEpmType(1);
				inVo.setMaterialId(materialId);
				inVo.setMaterialQuantity(materialQuantty);
				dao.insertEachProcessMaterial(inVo);
			}
		}
		
		
		
		/*
		
		for (int i = 0; i < outputMaterials.length; i++) {
			if (!(inputMaterials[i] == "")) {
				System.out.println("case 3");
				System.out.println(outputMaterials[i]);
				int materialId =  Integer.parseInt(outputMaterials[i]);
				int materialQuantty = Integer.parseInt(outputQuantitys[i]);
				System.out.println(materialId);
				System.out.println(materialQuantty);
				
				EachProcessVO outVo = new EachProcessVO();
				outVo.setEpId(epId);
				outVo.setEpmType(0);
				outVo.setMaterialId(materialId);
				outVo.setMaterialQuantity(materialQuantty);
				dao.insertEachProcessMaterial(outVo);
			}
		}
		
		
		System.out.println("inputMaterials.length : " + inputMaterials.length);
		for (int i = 0; i < inputMaterials.length; i++) {
			if (inputMaterials[i] != "") {
				int materialId =  Integer.parseInt(inputMaterials[i]);
				int materialQuantty = Integer.parseInt(inputQuantitys[i]);
				System.out.println(materialId);
				System.out.println(materialQuantty);
				
				EachProcessVO inVo = new EachProcessVO();
				inVo.setEpId(epId);
				inVo.setEpmType(1);
				inVo.setMaterialId(materialId);
				inVo.setMaterialQuantity(materialQuantty);
				dao.insertEachProcessMaterial(inVo);
			}
		}
		*/
	}
}
