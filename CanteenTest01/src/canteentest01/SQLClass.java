/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteentest01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Shadow
 */
public class SQLClass {
    
    Connection con=null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    private String conStr = "jdbc:mysql://localhost:3306/voteandordersystem";
    private String dbUname="root";
    private String dbPword="123456";
    private int canteen;
    private int i,j;
    
    private void setConnection(){
        try{
            con = DriverManager.getConnection(conStr, dbUname, dbPword);
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Please contact your Administrator and check your Database</body></html> ").setVisible(true);
        }
    }
    
    public void test(){
        try{
            setConnection();
            stmt = con.createStatement();
            String qur1 = ("SELECT * FROM user;");
            ResultSet rst = stmt.executeQuery(qur1);
            if(rst.next()){
                String id = rst.getString(1);
                String name = rst.getString(2);
                String pword = rst.getString(3);
                System.out.println("nsbm id: " + id);
                System.out.println("Name: " + name);
                System.out.println("password: " + pword);
            }
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
        }
        
    }
    
    public int[] checkLogin(String[] s1){
        int[] tmp = {0,0};
        String pword=null;
        int canteen=0;
        try{
            setConnection();
            stmt = con.createStatement();
            String qur1,qur2,qur3;
            qur1="select Password,CanteenNo from admindetails where NIC="+s1[0]+";";
            ResultSet rst1,rst2;
            rst1 = stmt.executeQuery(qur1);
            while(rst1.next()){
                pword = rst1.getString("Password");
                if(pword.isEmpty()){
                    tmp[0]=0;
                }
                else{ 
                    if(pword.equals(s1[1])){
                        tmp[0]=1;
                    }
                    else{
                        tmp[0]=2;
                    }
                }
                canteen = Integer.parseInt(rst1.getString("CanteenNo"));
                if(canteen!=0){
                    tmp[1]=canteen;
                }
            }
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
        }
        return tmp;
    }
    
    public String[] getAdminMenu(int t1){
        String[] tmp = new String[7];
        Calculations s1 = new Calculations();
        try{
            setConnection();
            stmt = con.createStatement();
            String qur1,qur2,qur3;
            ResultSet rst1,rst2,rst3;
            qur1="select * from menuitems where (Date=?) and (CanteenNo=?);";
            pstmt = con.prepareStatement(qur1);
            pstmt.setString(1,s1.getDateStr());
            pstmt.setInt(2,t1);
            rst1 = pstmt.executeQuery();
            while(rst1.next()){
                tmp[0] = rst1.getString("Fish");
                tmp[1] = rst1.getString("Chicken");
                tmp[2] = rst1.getString("Egg");
                tmp[3] = rst1.getString("Curry01");
                tmp[4] = rst1.getString("Curry02");
                tmp[5] = rst1.getString("Curry03");
                tmp[6] = rst1.getString("Veg");
            }
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
        }
        return tmp;
    }
    
    public String[][] getCurryNames(String t1,int t2){
        String[][] tmp =new String[3][3];
        try{
            setConnection();
            String qur1,qur2,qur3;
            ResultSet rst,rst2,rst3;
            qur1="select * from votingmenu where (PrepDate=?) and (CanteenNo=?);";
            pstmt = con.prepareStatement(qur1);
            pstmt.setString(1,t1);
            pstmt.setInt(2, t2);
            rst = pstmt.executeQuery();
            while(rst.next()){
                tmp[0][0]=rst.getString("Opt1.1");
                tmp[0][1]=rst.getString("Opt1.2");
                tmp[0][2]=rst.getString("Opt1.3");
                
                tmp[1][0]=rst.getString("Opt2.1");
                tmp[1][1]=rst.getString("Opt2.2");
                tmp[1][2]=rst.getString("Opt2.3");
                
                tmp[2][0]=rst.getString("Opt3.1");
                tmp[2][1]=rst.getString("Opt3.2");
                tmp[2][2]=rst.getString("Opt3.3");
            }
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
        }
        return tmp;
    }
    
    public int[][] getVotingCount(String t1,int t2){
        int[][] tmp = new int[6][3];
        tmp[2][2]=0;
        try{
            setConnection();
            String qur1,qur2,qur3;
            ResultSet rst,rst2,rst3;
            qur1="select * from voteresult where (PrepDate=?) and (CanteenNo=?);";
            pstmt =con.prepareStatement(qur1);
            pstmt.setString(1,t1);
            pstmt.setInt(2,t2);
            rst = pstmt.executeQuery();
            while(rst.next()){
                tmp[0][0] = Integer.parseInt(rst.getString("Fish01"));
                tmp[0][1] = Integer.parseInt(rst.getString("Fish02"));
                tmp[0][2] = Integer.parseInt(rst.getString("Fish03"));
                
                tmp[1][0] = Integer.parseInt(rst.getString("Chicken01"));
                tmp[1][1] = Integer.parseInt(rst.getString("Chicken02"));
                tmp[1][2] = Integer.parseInt(rst.getString("Chicken03"));
                
                tmp[2][0] = Integer.parseInt(rst.getString("Egg01"));
                tmp[2][1] = Integer.parseInt(rst.getString("Egg02"));
                
                tmp[3][0] = Integer.parseInt(rst.getString("Opt1.1"));
                tmp[3][1] = Integer.parseInt(rst.getString("Opt1.2"));
                tmp[3][2] = Integer.parseInt(rst.getString("Opt1.3"));
                
                tmp[4][0] = Integer.parseInt(rst.getString("Opt2.1"));
                tmp[4][1] = Integer.parseInt(rst.getString("Opt2.2"));
                tmp[4][2] = Integer.parseInt(rst.getString("Opt2.3"));
                
                tmp[5][0] = Integer.parseInt(rst.getString("Opt3.1"));
                tmp[5][1] = Integer.parseInt(rst.getString("Opt3.2"));
                tmp[5][2] = Integer.parseInt(rst.getString("Opt3.3"));
            }
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
        }
        return tmp;
    }
    
    public int setAdmin(int[] t1,String[] s1){
        int tmp=0;
        try{
            setConnection();
            String qur1,qur2,qur3;
            ResultSet rst1,rst2,rst3;
            System.out.println("");
            qur1="insert into admindetails" + " values (?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(qur1);
            preparedStmt.setString (1, s1[0]);
            preparedStmt.setInt (2, t1[0]);
            preparedStmt.setString   (3, s1[1]);
            preparedStmt.setInt (4, t1[1]);
            preparedStmt.setString    (5, s1[2]);

            // execute the preparedstatement
            preparedStmt.execute();
            
            tmp=1;
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
            tmp=0;
        }
        return tmp;
    }
    
    public int removeAdmin(String t1){
        int tmp=0;
        try{
            setConnection();
            String qur1,qur2,qur3;
            ResultSet rst1,rst2,rst3;
            qur1="delete from admindetails where NIC=(?);";
            pstmt = con.prepareCall(qur1);
            pstmt.setString(1,t1);
            pstmt.execute();
            tmp=1;
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
            tmp=0;
        }
        return tmp;
    }
    
    public int setVoting(int t1,String[] s1,String[][] s2,String[][] s3){
        int tmp=0;
        try{
            setConnection();
            String qur1,qur2,qur3;
            ResultSet rst1,rst2,rst3;
            qur1="insert into votingmenu" + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            pstmt = con.prepareStatement(qur1);
            
            pstmt.setString(1,s1[1]);
            pstmt.setString(2,s1[0]);
            
            pstmt.setInt(3,t1);
            
            pstmt.setString(4,s2[0][0]);
            pstmt.setString(5,s2[0][1]);
            pstmt.setString(6,s2[0][2]);
            
            pstmt.setString(7,s2[1][0]);
            pstmt.setString(8,s2[1][1]);
            pstmt.setString(9,s2[1][2]);
            
            pstmt.setString(10,s2[2][0]);
            pstmt.setString(11,s2[2][1]);
            
            pstmt.setString(12,s3[0][0]);
            pstmt.setString(13,s3[0][1]);
            pstmt.setString(14,s3[0][2]);
            
            pstmt.setString(15,s3[1][0]);
            pstmt.setString(16,s3[1][1]);
            pstmt.setString(17,s3[1][2]);
            
            pstmt.setString(18,s3[2][0]);
            pstmt.setString(19,s3[2][1]);
            pstmt.setString(20,s3[2][2]);
            
            pstmt.execute();
            tmp=1;
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
            tmp=0;
        }
        return tmp;
    }    
    
    private void dump(){
        try{
            setConnection();
            stmt = con.createStatement();
            String qur1,qur2,qur3;
            ResultSet rst1,rst2,rst3;
            qur1=";";
            rst1 = stmt.executeQuery(qur1);
            if(rst1.next()){
                String id = rst1.getString(1);
                String name = rst1.getString(2);
                String pword = rst1.getString(3);
            }
        }
        catch (Exception x){
            new Massage("<html><body>Something went wrong !!!<br>Query Error !!!</body></html> ").setVisible(true);
        }
    }
}
