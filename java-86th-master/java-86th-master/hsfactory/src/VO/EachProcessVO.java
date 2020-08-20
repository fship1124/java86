package VO;

import java.util.Date;

public class EachProcessVO {
	private int epId;
	private String epName;
	private Date epRegDate;

	private int epmId;
	private int epmType;
	private String epmTypeName;
	private int materialId;
	private String materialName;
    private int materialQuantity;
    
    private String codeName;

	public int getEpId() {
		return epId;
	}

	public void setEpId(int epId) {
		this.epId = epId;
	}

	public String getEpName() {
		return epName;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}

	public Date getEpRegDate() {
		return epRegDate;
	}

	public void setEpRegDate(Date epRegDate) {
		this.epRegDate = epRegDate;
	}

	public int getEpmId() {
		return epmId;
	}

	public void setEpmId(int epmId) {
		this.epmId = epmId;
	}

	public int getEpmType() {
		return epmType;
	}

	public void setEpmType(int epmType) {
		this.epmType = epmType;
	}

	public String getEpmTypeName() {
		return epmTypeName;
	}

	public void setEpmTypeName(String epmTypeName) {
		this.epmTypeName = epmTypeName;
	}

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

	public int getMaterialQuantity() {
		return materialQuantity;
	}

	public void setMaterialQuantity(int materialQuantity) {
		this.materialQuantity = materialQuantity;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	@Override
	public String toString() {
		return "EachProcessVO [epId=" + epId + ", epName=" + epName + ", epRegDate=" + epRegDate + ", epmId=" + epmId
				+ ", epmType=" + epmType + ", epmTypeName=" + epmTypeName + ", materialId=" + materialId
				+ ", materialName=" + materialName + ", materialQuantity=" + materialQuantity + ", codeName=" + codeName
				+ "]";
	}
    
    
   
}
