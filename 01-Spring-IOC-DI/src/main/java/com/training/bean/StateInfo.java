/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean;

import java.util.Map;

/**
 *
 * @author Administrator
 */
public class StateInfo {
    
    Map<String,String> info;

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "StateInfo{" + "info=" + info + '}';
    }
    
    
}
