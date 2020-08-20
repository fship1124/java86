package VO;

import java.util.Date;

public class WarehouseVO {
	// 송재홍 VO	
	private int warehouseId;
	private String warehouseName;
	private String warehouseType;
	private String inventoryManagementAlgorism;
	private Date warehouseRegDate;
	
	// 효순누나 VO
	private int wHouseId;  //창고 Id
	private String wHouseName; //창고 명
	private int wHouseType; // 창고 타입
	private String wHouseTypeName;  // 창고 타입 명
	private int factoryId; // 공장 id
	private String factoryIdName;  // 공장 이름
	private String inventoryAlgorismName;  //재고 관리명
	private int inventoryAlgorism;  //재고 관리
	private Date wHouseRegDate; // 등록날짜
	private int typeId;
	
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}
	public String getInventoryManagementAlgorism() {
		return inventoryManagementAlgorism;
	}
	public void setInventoryManagementAlgorism(String inventoryManagementAlgorism) {
		this.inventoryManagementAlgorism = inventoryManagementAlgorism;
	}
	public Date getWarehouseRegDate() {
		return warehouseRegDate;
	}
	public void setWarehouseRegDate(Date warehouseRegDate) {
		this.warehouseRegDate = warehouseRegDate;
	}
	public int getwHouseId() {
		return wHouseId;
	}
	public void setwHouseId(int wHouseId) {
		this.wHouseId = wHouseId;
	}
	public String getwHouseName() {
		return wHouseName;
	}
	public void setwHouseName(String wHouseName) {
		this.wHouseName = wHouseName;
	}
	public int getwHouseType() {
		return wHouseType;
	}
	public void setwHouseType(int wHouseType) {
		this.wHouseType = wHouseType;
	}
	public String getwHouseTypeName() {
		return wHouseTypeName;
	}
	public void setwHouseTypeName(String wHouseTypeName) {
		this.wHouseTypeName = wHouseTypeName;
	}
	public int getFactoryId() {
		return factoryId;
	}
	public void setFactoryId(int factoryId) {
		this.factoryId = factoryId;
	}
	public String getFactoryIdName() {
		return factoryIdName;
	}
	public void setFactoryIdName(String factoryIdName) {
		this.factoryIdName = factoryIdName;
	}
	public String getInventoryAlgorismName() {
		return inventoryAlgorismName;
	}
	public void setInventoryAlgorismName(String inventoryAlgorismName) {
		this.inventoryAlgorismName = inventoryAlgorismName;
	}
	public int getInventoryAlgorism() {
		return inventoryAlgorism;
	}
	public void setInventoryAlgorism(int inventoryAlgorism) {
		this.inventoryAlgorism = inventoryAlgorism;
	}
	public Date getwHouseRegDate() {
		return wHouseRegDate;
	}
	public void setwHouseRegDate(Date wHouseRegDate) {
		this.wHouseRegDate = wHouseRegDate;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	
}
