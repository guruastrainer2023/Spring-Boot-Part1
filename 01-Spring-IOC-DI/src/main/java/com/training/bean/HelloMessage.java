/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean;

import com.training.bean.banking.Account;

/**
 *
 * @author Administrator
 */
public class HelloMessage {
    
    private String message;
    private int age;
    private Account account;

    public HelloMessage(String message, int age, Account account) {
        this.message = message;
        this.age=age;
        this.account=account;
    }

    @Override
    public String toString() {
        return "HelloMessage{" + "message=" + message + ", age=" + age + '}';
    }
    
    

   

   
    
    
}
