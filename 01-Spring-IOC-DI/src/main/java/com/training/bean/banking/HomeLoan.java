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
public class HomeLoan implements Loan{

    double la;
    
    @Override
    public void setLoanAmount(double amount) {
        this.la=amount;
    }

    @Override
    public double getInterestAmount() {
        return this.la*12*0.11;
    }

    @Override
    public String toString() {
        return "HomeLoan{" + "la=" + la + '}';
    }
    
}
