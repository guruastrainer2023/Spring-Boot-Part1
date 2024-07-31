package com.training.bean;

public class Department {
	String name;
	String managerName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", managerName=" + managerName + "]";
	}
	
	
}
