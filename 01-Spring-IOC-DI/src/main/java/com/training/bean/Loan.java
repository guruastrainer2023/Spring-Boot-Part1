package com.training.bean;

public class Loan {
	
	String customerName;
	double loanAmount;
	double interest;
	
	public Loan(String customerName, double loanAmount, double interest) {
		super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Loan [customerName=" + customerName + ", loanAmount=" + loanAmount + ", interest=" + interest + "]";
	}
	
	
	

}
