package VO;

import java.util.Date;

public class ProductOrderVO {
	private int productionOrderId;      // 생산 주문 번호
	private String productionOrderName; // 생산 주문 명
	private int processId;              // 생산 공정 번호
	private String processName;         // 생산 공정 명
	private int materialId;             // 제품 번호
	private int materialQuantity;       // 제품 수량
	private int customerOrderId;        // 고객 주문 번호
	private Date customerOrderDeadline; // 마감일자
	private Date productionOrderRegDate; // 등록일자
	private Date productionOrderCompleteDate; // 생산완료 일자 
	
	private int companyId;           // 회사 번호
	private String companyName;      // 회사 명
	private int status;              // 상태 번호
	private String worker;           // 작업자
	private String administrator;    // 관리자
	
	private String materialName;     // 제품 명
	private String codeName;         // 상태 코드 명
	
	private int epmType;
	private int totalsum;            // 감소시킬 총 재고 수량
	
	
	public int getProductionOrderId() {
		return productionOrderId;
	}
	public void setProductionOrderId(int productionOrderId) {
		this.productionOrderId = productionOrderId;
	}
	public String getProductionOrderName() {
		return productionOrderName;
	}
	public void setProductionOrderName(String productionOrderName) {
		this.productionOrderName = productionOrderName;
	}
	public int getProcessId() {
		return processId;
	}
	public void setProcessId(int processId) {
		this.processId = processId;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
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
	public Date getCustomerOrderDeadline() {
		return customerOrderDeadline;
	}
	public void setCustomerOrderDeadline(Date customerOrderDeadline) {
		this.customerOrderDeadline = customerOrderDeadline;
	}
	public Date getProductionOrderRegDate() {
		return productionOrderRegDate;
	}
	public void setProductionOrderRegDate(Date productionOrderRegDate) {
		this.productionOrderRegDate = productionOrderRegDate;
	}
	public Date getProductionOrderCompleteDate() {
		return productionOrderCompleteDate;
	}
	public void setProductionOrderCompleteDate(Date productionOrderCompleteDate) {
		this.productionOrderCompleteDate = productionOrderCompleteDate;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public int getEpmType() {
		return epmType;
	}
	public void setEpmType(int epmType) {
		this.epmType = epmType;
	}
	public int getTotalsum() {
		return totalsum;
	}
	public void setTotalsum(int totalsum) {
		this.totalsum = totalsum;
	}
	@Override
	public String toString() {
		return "ProductOrderVO [productionOrderId=" + productionOrderId + ", productionOrderName=" + productionOrderName
				+ ", processId=" + processId + ", processName=" + processName + ", materialId=" + materialId
				+ ", materialQuantity=" + materialQuantity + ", customerOrderId=" + customerOrderId
				+ ", customerOrderDeadline=" + customerOrderDeadline + ", productionOrderRegDate="
				+ productionOrderRegDate + ", productionOrderCompleteDate=" + productionOrderCompleteDate
				+ ", companyId=" + companyId + ", companyName=" + companyName + ", status=" + status + ", worker="
				+ worker + ", administrator=" + administrator + ", materialName=" + materialName + ", codeName="
				+ codeName + ", epmType=" + epmType + ", totalsum=" + totalsum + "]";
	}
}

