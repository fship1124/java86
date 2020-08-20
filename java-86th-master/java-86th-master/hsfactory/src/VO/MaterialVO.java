package VO;

import java.util.Date;

public class MaterialVO {
	// 송재홍 VO부분
	private int materialId;
	private String materialName;
	private String materialType;
	private int materialCost;
	private String materialUnit;
	private Date materialRegDate;
	
	
	// 효순누나 VO부분
	private int mtrId;
	private String mtrName;
	private int mtrType;
	private int mtrCost;
	private String mtrUnit;
	private Date mtrRegDate;
	private String mtrTypeName;
	private String orderColId;
	
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
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
	public Date getMaterialRegDate() {
		return materialRegDate;
	}
	public void setMaterialRegDate(Date materialRegDate) {
		this.materialRegDate = materialRegDate;
	}
	public int getMtrId() {
		return mtrId;
	}
	public void setMtrId(int mtrId) {
		this.mtrId = mtrId;
	}
	public String getMtrName() {
		return mtrName;
	}
	public void setMtrName(String mtrName) {
		this.mtrName = mtrName;
	}
	public int getMtrType() {
		return mtrType;
	}
	public void setMtrType(int mtrType) {
		this.mtrType = mtrType;
	}
	public int getMtrCost() {
		return mtrCost;
	}
	public void setMtrCost(int mtrCost) {
		this.mtrCost = mtrCost;
	}
	public String getMtrUnit() {
		return mtrUnit;
	}
	public void setMtrUnit(String mtrUnit) {
		this.mtrUnit = mtrUnit;
	}
	public Date getMtrRegDate() {
		return mtrRegDate;
	}
	public void setMtrRegDate(Date mtrRegDate) {
		this.mtrRegDate = mtrRegDate;
	}
	public String getMtrTypeName() {
		return mtrTypeName;
	}
	public void setMtrTypeName(String mtrTypeName) {
		this.mtrTypeName = mtrTypeName;
	}
	public String getOrderColId() {
		return orderColId;
	}
	public void setOrderColId(String orderColId) {
		this.orderColId = orderColId;
	}
	
	
}
