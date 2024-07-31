/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean.trading;

import java.util.Map;

/**
 *
 * @author Administrator
 */
public class Sales {
    
    Map<Customer,Payment> payments;

    public Map<Customer, Payment> getPayments() {
        return payments;
    }

    public void setPayments(Map<Customer, Payment> payments) {
        this.payments = payments;
    }
    
    
}
