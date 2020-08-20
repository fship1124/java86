package VO;

import java.util.Date;

public class ShipmentVO {
	private int shipmentId;
	private int materialId;
	private int cpWarehouseId;
	private int logisticWarehouseId;
	private int companyId;
	private int materialQuantity;
	private Date shipmentRegDate;
	
	private String materialUnit;
	private String cpWarehouseName;
	private String logisticWarehouseName;
	private String companyName;

	private String materialName;
	private int materialCost;
	
	public int getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(int materialCost) {
		this.materialCost = materialCost;
	}
	public String getMaterialUnit() {
		return materialUnit;
	}
	public void setMaterialUnit(String materialUnit) {
		this.materialUnit = materialUnit;
	}
	
	public int getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public int getCpWarehouseId() {
		return cpWarehouseId;
	}
	public void setCpWarehouseId(int cpWarehouseId) {
		this.cpWarehouseId = cpWarehouseId;
	}
	public int getLogisticWarehouseId() {
		return logisticWarehouseId;
	}
	public void setLogisticWarehouseId(int logisticWarehouseId) {
		this.logisticWarehouseId = logisticWarehouseId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getMaterialQuantity() {
		return materialQuantity;
	}
	public void setMaterialQuantity(int materialQuantity) {
		this.materialQuantity = materialQuantity;
	}
	public Date getShipmentRegDate() {
		return shipmentRegDate;
	}
	public void setShipmentRegDate(Date shipmentRegDate) {
		this.shipmentRegDate = shipmentRegDate;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getCpWarehouseName() {
		return cpWarehouseName;
	}
	public void setCpWarehouseName(String cpWarehouseName) {
		this.cpWarehouseName = cpWarehouseName;
	}
	public String getLogisticWarehouseName() {
		return logisticWarehouseName;
	}
	public void setLogisticWarehouseName(String logisticWarehouseName) {
		this.logisticWarehouseName = logisticWarehouseName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}
