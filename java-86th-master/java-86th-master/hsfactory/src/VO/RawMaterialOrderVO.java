package VO;

import java.util.Date;

public class RawMaterialOrderVO {

	private int rawMaterialOrderId;  // 재료 구입 주문 번호
	private String rawMaterialOrderName; // 제품 구입 주문 명
	private int companyId;           // 회사 번호
	private int materialId;          // 제품 번호
	private int rawMaterialQuantity; // 제품 수량
	
	private int status;              // 상태 번호
	private String worker;           // 작업자
	private String administrator;    // 관리자
	private Date rawMaterialOrderRegDate;    // 등록 날짜
	private Date rawMaterialWarehousingDate; // 입고 날짜
	
	private String companyName;      // 회사 명
	private String materialName;     // 제품 명
	private String codeName;         // 상태 코드 명
	
	
	public int getRawMaterialOrderId() {
		return rawMaterialOrderId;
	}
	public void setRawMaterialOrderId(int rawMaterialOrderId) {
		this.rawMaterialOrderId = rawMaterialOrderId;
	}
	public String getRawMaterialOrderName() {
		return rawMaterialOrderName;
	}
	public void setRawMaterialOrderName(String rawMaterialOrderName) {
		this.rawMaterialOrderName = rawMaterialOrderName;
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
	public int getRawMaterialQuantity() {
		return rawMaterialQuantity;
	}
	public void setRawMaterialQuantity(int rawMaterialQuantity) {
		this.rawMaterialQuantity = rawMaterialQuantity;
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
	public Date getRawMaterialOrderRegDate() {
		return rawMaterialOrderRegDate;
	}
	public void setRawMaterialOrderRegDate(Date rawMaterialOrderRegDate) {
		this.rawMaterialOrderRegDate = rawMaterialOrderRegDate;
	}
	public Date getRawMaterialWarehousingDate() {
		return rawMaterialWarehousingDate;
	}
	public void setRawMaterialWarehousingDate(Date rawMaterialWarehousingDate) {
		this.rawMaterialWarehousingDate = rawMaterialWarehousingDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	@Override
	public String toString() {
		return "RawMaterialOrderVO [rawMaterialOrderId=" + rawMaterialOrderId + ", rawMaterialOrderName="
				+ rawMaterialOrderName + ", companyId=" + companyId + ", materialId=" + materialId
				+ ", rawMaterialQuantity=" + rawMaterialQuantity + ", status=" + status + ", worker=" + worker
				+ ", administrator=" + administrator + ", rawMaterialOrderRegDate=" + rawMaterialOrderRegDate
				+ ", rawMaterialWarehousingDate=" + rawMaterialWarehousingDate + ", companyName=" + companyName
				+ ", materialName=" + materialName + ", codeName=" + codeName + "]";
	}
}
