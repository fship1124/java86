package VO;

import java.util.Date;

public class CustomerOrderVO {
	// input
	private String customerOrderName;
	private Date customerOrderDeadline;
	private int companyId;
	private int materialId;
	private int materialQuantity;
	
	// output
	private int customerOrderId;
	private Date customerOrderRegDate;
	private String companyName;
	private String codeName;
	private String materialName;
	
	
	public String getCustomerOrderName() {
		return customerOrderName;
	}
	public void setCustomerOrderName(String customerOrderName) {
		this.customerOrderName = customerOrderName;
	}
	public Date getCustomerOrderDeadline() {
		return customerOrderDeadline;
	}
	public void setCustomerOrderDeadline(Date customerOrderDeadline) {
		this.customerOrderDeadline = customerOrderDeadline;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public int getMaterialQuantity() {
		return materialQuantity;
	}
	public void setMaterialQuantity(int materialQuantity) {
		this.materialQuantity = materialQuantity;
	}
	public int getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public Date getCustomerOrderRegDate() {
		return customerOrderRegDate;
	}
	public void setCustomerOrderRegDate(Date customerOrderRegDate) {
		this.customerOrderRegDate = customerOrderRegDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
}
