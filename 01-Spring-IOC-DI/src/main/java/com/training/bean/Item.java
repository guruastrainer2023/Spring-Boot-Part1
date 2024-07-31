/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Item {
    private String itemName;
    private double[] priceHistory;
    private double price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double[] getPriceHistory() {
        return priceHistory;
    }

    public void setPriceHistory(double[] priceHistory) {
        this.priceHistory = priceHistory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    
    
    @Override
	public String toString() {
		return "Item [itemName=" + itemName + ", priceHistory=" + Arrays.toString(priceHistory) + ", price=" + price
				+ "]";
	}

	public void printHistory(){
        for(double d:priceHistory)
            System.out.println(d);
    }
    
}
