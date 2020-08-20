package VO;

import java.util.Date;

public class ProcessVO {
	private int processId;
	private String processName;
	private int materialId;
	private String materialName;
	private Date processRegDate;
	
	private int epId;
	private String epmType;
	private int materialQuantity;
	private int cycle;
	
	
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
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public Date getProcessRegDate() {
		return processRegDate;
	}
	public void setProcessRegDate(Date processRegDate) {
		this.processRegDate = processRegDate;
	}
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getEpmType() {
		return epmType;
	}
	public void setEpmType(String epmType) {
		this.epmType = epmType;
	}
	public int getMaterialQuantity() {
		return materialQuantity;
	}
	public void setMaterialQuantity(int materialQuantity) {
		this.materialQuantity = materialQuantity;
	}
	public int getCycle() {
		return cycle;
	}
	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
	@Override
	public String toString() {
		return "ProcessVO [processId=" + processId + ", processName=" + processName + ", materialId=" + materialId
				+ ", materialName=" + materialName + ", processRegDate=" + processRegDate + ", epId=" + epId
				+ ", epmType=" + epmType + ", materialQuantity=" + materialQuantity + ", cycle=" + cycle + "]";
	}
}
