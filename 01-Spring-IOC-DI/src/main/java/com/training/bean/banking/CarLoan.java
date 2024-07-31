/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean.banking;

/**
 *
 * @author Administrator
 */
public class CarLoan implements Loan{
    
    double loanAmt;

    @Override
    public void setLoanAmount(double amount) {
        this.loanAmt=amount;
    }

    @Override
    public double getInterestAmount() {
       return this.loanAmt*12*15.0/100.0;
    }

    @Override
    public String toString() {
        return "CarLoan{" + "loanAmt=" + loanAmt + '}';
    }
    
}
