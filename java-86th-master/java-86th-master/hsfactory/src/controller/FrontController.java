package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.command.BaseCommand;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		action(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		System.out.println("post");
		action(request, response);
	}

	private void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("action");

		String viewPage = null;
		BaseCommand cmd = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		System.out.println("com : " + com);

		switch (com) {
		
		//company
		case "/companyList.do":
			cmd = new command.company.ListCommand();
			cmd.execute(request, response);
			viewPage = "/company/list.jsp";
			break;
		case "/companyDetail.do":
			cmd = new command.company.DetailCommand();
			cmd.execute(request, response);
			viewPage = "/company/detail.jsp";
			break;
		case "/companyInsertForm.do":
			viewPage = "/company/insert.jsp";
			break;
		case "/companyInsert.do":
			cmd = new command.company.InsertCommand();
			cmd.execute(request, response);			
			viewPage = "/companyList.do";
			break;
		case "/companyUpdateForm.do":
			cmd = new command.company.UpdateCommandForm();
			cmd.execute(request, response);
			viewPage = "/company/update.jsp";
			break;
		case "/companyUpdate.do":
			cmd = new command.company.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/companyList.do";
			break;
		case "/companyDelete.do":
			cmd = new command.company.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/companyList.do";
			break;
		
		//product
		case "/materialList.do":
			cmd = new command.material.ListCommand();
			cmd.execute(request, response);
			viewPage = "/material/list.jsp";
			break;
		case "/materialDetail.do":
			cmd = new command.material.DetailCommand();
			cmd.execute(request, response);
			viewPage = "/material/detail.jsp";
			break;
		case "/materialInsertForm.do":
			viewPage = "/material/insert.jsp";
			break;
		case "/materialInsert.do":
			cmd = new command.material.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/materialList.do";
			break;
		case "/materialUpdateForm.do":
			cmd = new command.material.UpdateCommandForm();
			cmd.execute(request, response);
			viewPage = "/material/update.jsp";
			break;
		case "/materialUpdate.do":
			cmd = new command.material.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/materialList.do";
			break;
		case "/materialDelete.do":
			cmd = new command.material.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/materialList.do";
			break;
			
		//warehouse
		case "/warehouseList.do":
			cmd = new command.warehouse.ListCommand();
			cmd.execute(request, response);
			viewPage = "/warehouse/list.jsp";
			break;
		case "/warehouseDetail.do":
			cmd = new command.warehouse.DetailCommand();
			cmd.execute(request, response);
			viewPage = "/warehouse/detail.jsp";
			break;
		case "/warehouseInsertForm.do":
			viewPage = "/warehouse/insert.jsp";
			break;
		case "/warehouseInsert.do":
			cmd = new command.warehouse.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/warehouseList.do";
			break;
		case "/warehouseUpdateForm.do":
			cmd = new command.warehouse.UpdateCommandForm();
			cmd.execute(request, response);
			viewPage = "/warehouse/update.jsp";
			break;
		case "/warehouseUpdate.do":
			cmd = new command.warehouse.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/warehouseList.do";
			break;
		case "/warehouseDelete.do":
			cmd = new command.warehouse.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/warehouseList.do";
			break;
			
		//factory
		case "/factoryList.do":
			cmd = new command.factory.ListCommand();
			cmd.execute(request, response);
			viewPage = "/factory/list.jsp";
			break;
		case "/factoryInsert.do":
			cmd = new command.factory.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/factoryList.do";
			break;
		case "/factoryInsertForm.do":
			cmd = new command.factory.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/factory/insertForm.jsp";
			break;
		case "/factoryUpdate.do":
			cmd = new command.factory.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/factoryList.do";
			break;
		case "/factoryUpdateForm.do":
			cmd = new command.factory.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/factory/updateForm.jsp";
			break;
		case "/factoryDelete.do":
			cmd = new command.factory.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/factoryList.do";
			break;
			

			// eachProcess
			case "/eachProcessList.do":
				cmd = new command.eachProcess.ListCommand();
				cmd.execute(request, response);
				viewPage = "/eachProcess/list.jsp";
				break;
			case "/eachProcessDetail.do":
				cmd = new command.eachProcess.DetailCommand();
				cmd.execute(request, response);
				viewPage = "/eachProcess/detail.jsp";
				break;
			case "/eachProcessInsertForm.do":
				viewPage = "/eachProcess/insert.jsp";
				break;
			case "/eachProcessInsert.do":
				cmd = new command.eachProcess.InsertCommand();
				cmd.execute(request, response);
				viewPage = "/eachProcessList.do";
				break;
			case "/eachProcessUpdate.do":
				cmd = new command.eachProcess.UpdateCommand();
				cmd.execute(request, response);
				viewPage = "/eachProcess/update.jsp";
				break;
			case "/eachProcessDelete.do":
				cmd = new command.eachProcess.DeleteCommand();
				cmd.execute(request, response);
				viewPage = "/eachProcess/delete.jsp";
				break;

			// process
			case "/processList.do":
				cmd = new command.process.ListCommand();
				cmd.execute(request, response);
				viewPage = "/process/list.jsp";
				break;
			case "/processDetail.do":
				cmd = new command.process.DetailCommand();
				cmd.execute(request, response);
				viewPage = "/process/detail.jsp";
				break;
			case "/processInsertForm.do":
				viewPage = "/process/insert.jsp";
				break;
			case "/processInsert.do":
				cmd = new command.process.InsertCommand();
				cmd.execute(request, response);
				viewPage = "/processList.do";
				break;
			case "/processUpdate.do":
				cmd = new command.process.UpdateCommand();
				cmd.execute(request, response);
				viewPage = "/process/update.jsp";
				break;
			case "/processDelete.do":
				cmd = new command.process.DeleteCommand();
				cmd.execute(request, response);
				viewPage = "/process/delete.jsp";
				break;

			// customerOrder
			case "/customerOrderList.do":
				System.out.println("in /customerOrderList.do");
				cmd = new command.customerOrder.ListCommand();
				cmd.execute(request, response);
				viewPage = "/customerOrder/list.jsp";
				break;
			case "/customerOrderDetail.do":
				cmd = new command.customerOrder.DetailCommand();
				cmd.execute(request, response);
				viewPage = "/customerOrder/detail.jsp";
				break;
			case "/customerOrderInsertForm.do":
				viewPage = "/customerOrder/insert.jsp";
				break;
			case "/customerOrderInsert.do":
				cmd = new command.customerOrder.InsertCommand();
				cmd.execute(request, response);
				viewPage = "/customerOrderList.do";
				break;
			case "/customerOrderUpdateForm.do":
				cmd = new command.customerOrder.UpdateFormCommand();
				cmd.execute(request, response);
				viewPage = "/customerOrder/update.jsp";
				break;
			case "/customerOrderUpdate.do":
				cmd = new command.customerOrder.UpdateCommand();
				cmd.execute(request, response);
				viewPage = "/customerOrderList.do";
				break;
			case "/customerOrderDelete.do":
				cmd = new command.customerOrder.DeleteCommand();
				cmd.execute(request, response);
				viewPage = "/customerOrder/delete.jsp";
				break;

			// productOrder
			case "/productOrderList.do":
				cmd = new command.productOrder.ListCommand();
				cmd.execute(request, response);
				viewPage = "/productOrder/list.jsp";
				break;
			case "/productOrderDetail.do":
				cmd = new command.productOrder.DetailCommand();
				cmd.execute(request, response);
				viewPage = "/productOrder/detail.jsp";
				break;
			case "/productOrderInsertForm.do":
				cmd = new command.productOrder.InsertFormCommand();
				cmd.execute(request, response);
				viewPage = "/productOrder/insert.jsp";
				break;
			case "/productOrderInsert.do":
				cmd = new command.productOrder.InsertCommand();
				cmd.execute(request, response);
				viewPage = "/productOrderList.do";
				break;
			case "/productOrderUpdate.do":
				cmd = new command.productOrder.UpdateCommand();
				cmd.execute(request, response);
				viewPage = "/productOrderList.do";
				break;
			case "/productOrderDelete.do":
				cmd = new command.customerOrder.DeleteCommand();
				cmd.execute(request, response);
				viewPage = "/productOrder/delete.jsp";
				break;

			// rawMaterialOrder
			case "/rawMaterialOrderList.do":
				cmd = new command.rawMaterialOrder.ListCommand();
				cmd.execute(request, response);
				viewPage = "/rawMaterialOrder/list.jsp";
				break;
			case "/rawMaterialOrderDetail.do":
				cmd = new command.rawMaterialOrder.DetailCommand();
				cmd.execute(request, response);
				viewPage = "/rawMaterialOrder/detail.jsp";
				break;
			case "/rawMaterialOrderInsertForm.do":
				viewPage = "/rawMaterialOrder/insert.jsp";
				break;
			case "/rawMaterialOrderInsert.do":
				cmd = new command.rawMaterialOrder.InsertCommand();
				cmd.execute(request, response);
				viewPage = "/rawMaterialOrderList.do";
				break;
			case "/rawMaterialOrderUpdateForm.do":
				cmd = new command.rawMaterialOrder.UpdateFormCommand();
				cmd.execute(request, response);
				viewPage = "/rawMaterialOrder/updateForm.jsp";
				break;
			case "/rawMaterialOrderUpdate.do":
				cmd = new command.rawMaterialOrder.UpdateCommand();
				cmd.execute(request, response);
				viewPage = "/rawMaterialOrderList.do";
				break;
			case "/rawMaterialOrderDelete.do":
				cmd = new command.rawMaterialOrder.DeleteCommand();
				cmd.execute(request, response);
				viewPage = "/rawMaterialOrder/delete.jsp";
				break;

			
		//inventory
		case "/inventoryList.do":
			cmd = new command.inventory.ListCommand();
			cmd.execute(request, response);
			viewPage = "/inventory/list.jsp";
			break;
		case "/inventoryInsert.do":
			cmd = new command.inventory.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/inventoryList.do";
			break;
		case "/inventoryInsertForm.do":
			cmd = new command.inventory.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/inventory/insertForm.jsp";
			break;
		case "/inventoryUpdate.do":
			cmd = new command.inventory.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/inventoryList.do";
			break;
		case "/inventoryUpdateForm.do":
			cmd = new command.inventory.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/inventory/updateForm.jsp";
			break;
		case "/inventoryDelete.do":
			cmd = new command.inventory.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/inventoryList.do";
			break;
			
		
		//completeMaterialInventory
		case "/completeMaterialInventoryList.do":
			cmd = new command.completeMaterialInventory.ListCommand();
			cmd.execute(request, response);
			viewPage = "/completeMaterialInventory/list.jsp";
			break;
		case "/completeMaterialInventoryInsert.do":
			cmd = new command.completeMaterialInventory.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/completeMaterialInventoryList.do";
			break;
		case "/completeMaterialInventoryInsertForm.do":
			cmd = new command.completeMaterialInventory.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/completeMaterialInventory/insertForm.jsp";
			break;
		case "/completeMaterialInventoryUpdate.do":
			cmd = new command.completeMaterialInventory.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/completeMaterialInventoryList.do";
			break;
		case "/completeMaterialInventoryUpdateForm.do":
			cmd = new command.completeMaterialInventory.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/completeMaterialInventory/updateForm.jsp";
			break;
		case "/completeMaterialInventoryDelete.do":
			cmd = new command.completeMaterialInventory.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/completeMaterialInventoryList.do";
			break;
			
			//midMaterialInventory
		case "/midMaterialInventoryList.do":
			cmd = new command.midMaterialInventory.ListCommand();
			cmd.execute(request, response);
			viewPage = "/midMaterialInventory/list.jsp";
			break;
		case "/midMaterialInventoryInsert.do":
			cmd = new command.midMaterialInventory.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/midMaterialInventoryList.do";
			break;
		case "/midMaterialInventoryInsertForm.do":
			cmd = new command.midMaterialInventory.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/midMaterialInventory/insertForm.jsp";
			break;
		case "/midMaterialInventoryUpdate.do":
			cmd = new command.midMaterialInventory.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/midMaterialInventoryList.do";
			break;
		case "/midMaterialInventoryUpdateForm.do":
			cmd = new command.midMaterialInventory.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/midMaterialInventory/updateForm.jsp";
			break;
		case "/midMaterialInventoryDelete.do":
			cmd = new command.midMaterialInventory.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/midMaterialInventoryList.do";
			break;
			
			//subMaterialInventory
		case "/subMaterialInventoryList.do":
			cmd = new command.subMaterialInventory.ListCommand();
			cmd.execute(request, response);
			viewPage = "/subMaterialInventory/list.jsp";
			break;
		case "/subMaterialInventoryInsert.do":
			cmd = new command.subMaterialInventory.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/subMaterialInventoryList.do";
			break;
		case "/subMaterialInventoryInsertForm.do":
			cmd = new command.subMaterialInventory.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/subMaterialInventory/insertForm.jsp";
			break;
		case "/subMaterialInventoryUpdate.do":
			cmd = new command.subMaterialInventory.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/subMaterialInventoryList.do";
			break;
		case "/subMaterialInventoryUpdateForm.do":
			cmd = new command.subMaterialInventory.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/subMaterialInventory/updateForm.jsp";
			break;
		case "/subMaterialInventoryDelete.do":
			cmd = new command.subMaterialInventory.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/subMaterialInventoryList.do";
			break;
			
			//oriMaterialInventory
		case "/oriMaterialInventoryList.do":
			cmd = new command.oriMaterialInventory.ListCommand();
			cmd.execute(request, response);
			viewPage = "/oriMaterialInventory/list.jsp";
			break;
		case "/oriMaterialInventoryInsert.do":
			cmd = new command.oriMaterialInventory.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/oriMaterialInventoryList.do";
			break;
		case "/oriMaterialInventoryInsertForm.do":
			cmd = new command.oriMaterialInventory.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/oriMaterialInventory/insertForm.jsp";
			break;
		case "/oriMaterialInventoryUpdate.do":
			cmd = new command.oriMaterialInventory.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/oriMaterialInventoryList.do";
			break;
		case "/oriMaterialInventoryUpdateForm.do":
			cmd = new command.oriMaterialInventory.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/oriMaterialInventory/updateForm.jsp";
			break;
		case "/oriMaterialInventoryDelete.do":
			cmd = new command.oriMaterialInventory.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/oriMaterialInventoryList.do";
			break;
			
			
		//shipment
		case "/shipmentList.do":
			cmd = new command.shipment.ListCommand();
			cmd.execute(request, response);
			viewPage = "/shipment/list.jsp";
			break;
		case "/shipmentDetail.do":
			cmd = new command.shipment.DetailCommand();
			cmd.execute(request, response);
			viewPage = "/shipment/detail.jsp";
			break;
		case "/shipmentInsert.do":
			cmd = new command.shipment.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/shipmentList.do";
			break;
		case "/shipmentInsertForm.do":
			cmd = new command.shipment.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/shipment/insertForm.jsp";
			break;
		case "/shipmentUpdate.do":
			cmd = new command.shipment.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/shipmentList.do";
			break;
		case "/shipmentUpdateForm.do":
			cmd = new command.shipment.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/shipment/updateForm.jsp";
			break;
		case "/shipmentDelete.do":
			cmd = new command.shipment.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/shipmentList.do";
			break;
				
			
		//account
		case "/accountList.do":
			cmd = new command.account.ListCommand();
			cmd.execute(request, response);
			viewPage = "/account/list.jsp";
			break;
		case "/accountUpdateForm.do":
			cmd = new command.account.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/account/updateForm.jsp";
			break;
		case "/accountUpdate.do":
			cmd = new command.account.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/accountList.do";
			break;
		case "/accountInsertForm.do":
			cmd = new command.account.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/account/insertForm.jsp";
			break;
		case "/accountInsert.do":
			cmd = new command.account.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/accountList.do";
			break;
		case "/accountDelete.do":
			cmd = new command.account.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/accountList.do";
			break;
		case "/accountLoginForm.do":
			cmd = new command.account.LoginFormCommand();
			cmd.execute(request, response);
			viewPage = "/account/loginForm.jsp";
			break;
		case "/accountLogin.do":
			cmd = new command.account.LoginCommand();
			cmd.execute(request, response);
			viewPage = "/index.jsp";
			break;
		case "/accountLogout.do":
			cmd = new command.account.LogoutCommand();
			cmd.execute(request, response);
			viewPage = "/index.jsp";
			break;

		// notice
		case "/noticeList.do":
			cmd = new command.notice.ListCommand();
			cmd.execute(request, response);
			viewPage = "/notice/list.jsp";
		break;
		case "/noticeDetail.do":
			cmd = new command.notice.DetailCommand();
			cmd.execute(request, response);
			viewPage = "/notice/detail.jsp";
			break;
		case "/noticeDelete.do":
			cmd = new command.notice.DeleteCommand();
			cmd.execute(request, response);
			viewPage = "/noticeList.do";
			break;
		case "/noticeInsertForm.do":
			cmd = new command.notice.InsertFormCommand();
			cmd.execute(request, response);
			viewPage = "/notice/insertForm.jsp";
			break;
		case "/noticeInsert.do":
			cmd = new command.notice.InsertCommand();
			cmd.execute(request, response);
			viewPage = "/noticeList.do";
			break;
		case "/noticeUpdateForm.do":
			cmd = new command.notice.UpdateFormCommand();
			cmd.execute(request, response);
			viewPage = "/notice/updateForm.jsp";
			break;
		case "/noticeUpdate.do":
			cmd = new command.notice.UpdateCommand();
			cmd.execute(request, response);
			viewPage = "/noticeList.do";
			break;
		case "/noticeReplyDelete.do":
			cmd = new command.notice.ReplyDeleteCommand();
			cmd.execute(request, response);
			viewPage = "/noticeDetail.do?noticeId="+request.getParameter("noticeId");
			break;
		case "/noticeReplyUpdate.do":
			cmd = new command.notice.ReplyUpdateCommand();
			cmd.execute(request, response);
			viewPage = "/noticeDetail.do?noticeId="+request.getParameter("noticeId");
			break;
		case "/noticeReplyInsert.do":
			cmd = new command.notice.ReplyInsertCommand();
			cmd.execute(request, response);
			viewPage = "/noticeDetail.do?noticeId="+request.getParameter("noticeId");
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		rd.forward(request, response);
	}
}
