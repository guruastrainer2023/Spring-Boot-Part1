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
public class Customer {
    Address address;
    Account account;
    Loan loan;
    int id;
    String name;
    
    public void changeData(){
        this.name=this.name.toUpperCase();
    }
    
    public void cleanUp(){
        address=null;
        account=null;
        loan=null;
        name=null;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "address=" + address + ", account=" + account + ", loan=" + loan + ", id=" + id + ", name=" + name + '}';
    }
    
    
    
    
}
