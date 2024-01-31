package com.adv.EmployeeMangement;

public class Manager {
	private int managerId ;
	private String managerName ;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
}
