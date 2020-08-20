package VO;

import java.util.Date;

public class FactoryVO {
	private int factoryId;
	private String factoryName;
	private String factoryAdress;
	private Date factoryRegDate;
	
	public Date getFactoryRegDate() {
		return factoryRegDate;
	}
	public void setFactoryRegDate(Date factoryRegDate) {
		this.factoryRegDate = factoryRegDate;
	}
	public int getFactoryId() {
		return factoryId;
	}
	public void setFactoryId(int factoryId) {
		this.factoryId = factoryId;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getFactoryAdress() {
		return factoryAdress;
	}
	public void setFactoryAdress(String factoryAdress) {
		this.factoryAdress = factoryAdress;
	}

}
