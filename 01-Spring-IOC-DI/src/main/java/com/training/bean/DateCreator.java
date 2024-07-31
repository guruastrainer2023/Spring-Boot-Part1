/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class DateCreator {
    public Date createDate(int year,int month,int dt){
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DATE, dt);
        return c.getTime();
    }
}
