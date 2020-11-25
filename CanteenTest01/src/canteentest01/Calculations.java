/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteentest01;

/**
 *
 * @author Shadow
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculations {
    
    private int tmp=0,post=0;
    private String sdate=null;
    private int date=0;
    private int t1=0;
    private int d1=0;
    private int t2=0;
    private int d2=0;
    private String canteen;
    
    public Calculations(String sdate){
        this.sdate=sdate;
        if(sdate.isEmpty()!=true){date = Integer.parseInt(sdate.replace("/", ""));}
        this.t1=date%100;
        this.d1=date/100;
        this.t2=d1%100;
        this.d2=d1/100;
    }
    
    
    public Calculations(){
        
    }
    
    // check whatever or not given date is valid
    public int[] checkDate(){
        if(sdate.isEmpty()==true){
            tmp=3;
        }
        else{
            if(sdate.length()==10){
                if(t1>0 && t1<32){
                    if(t2>0 && t2<13){
                        if(d2>2019){
                            tmp=1;
                        }
                        else{
                            post=3;
                            tmp=0;
                        }
                    }
                    else{
                        post=2;
                        tmp=0;
                    }
                }
                else{
                    post=1;
                    tmp=0;
                }
            }
            else{
                post=0;
                tmp=0;
            }
        }
        int[] tmp2 = new int[2];
        tmp2[0]=tmp;
        tmp2[1]=post;
        return tmp2;
    }
    
    // to get canteen number
    public int checkCanteen(String s1){
        int tmp=0;
        switch (s1){
            case "Canteen 01":
                tmp=1;
                break;
            case "Canteen 02":
                tmp=2;
                break;
        }
        return tmp;
    }
    
    // to validate NIC
    public int checkNIC(String s){
        int tmp1;
        if(s.length()!= 9){
            if(s.length()!= 12){tmp1=0;}
            else{ tmp1=1;}
        }
        else{tmp1=1;}
        return tmp1;
    }
    
   public int getDateInt(){
        int date=0;
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date dateobj = new Date();
        date= Integer.parseInt(df.format(dateobj));
        return date;
    }
    
    public String getDateStr(){
        String date;
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date dateobj = new Date();
        date= df.format(dateobj);
        return date;
    }
} 
