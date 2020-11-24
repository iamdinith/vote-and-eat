/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voteandeat;
import static java.lang.Integer.parseInt;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author vipar
 */
public class DatabaseClass 
{
    Connection con;
    Statement stmt;
    int activeNsbmId;
    String activeCanteen;
    int activeCanteenNo;
    
    
    //Method to connect a class to a database
     public void openConn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voteandordersystem","root","hello");
            
            
        }
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + e + ")");
        }
    }
     
    //Method to add new users
    public void insertUser(int value1, String value2, String value3)
    {
        try {
            stmt = con.createStatement();
            stmt.execute("INSERT INTO user(NSBMID,Name,Password)VALUES("+value1+",'"+value2+"','"+value3+"')");
        } 
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
            
        }
    }
    
    //Method to insert an int value to a single column
    public void insert(String tableName, String header, int value)
    {
        try 
        {
            stmt = con.createStatement();
            stmt.execute("INSERT INTO "+tableName+"("+header+")VALUES("+value+")");
        } 
        catch (NumberFormatException | SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
           
        }
    }
    
    //Method to return option name if a radio button is selected
    public String selectedRadioButton3o(JRadioButton button1, JRadioButton button2, JRadioButton button3, String option1, String option2, String option3)
    {
        
        if (button1.isSelected()) 
        {
            return option1;
        }
        
        else if (button2.isSelected())
        {
            return option2;
        }
        
        else if (button3.isSelected())
        {
            return option3;
        }
        return null;
    }
    
    //Method to return option name if a radio button is selected (two options)
    public String selectedRadioButton2o(JRadioButton button1, JRadioButton button2, String option1, String option2)
    {
        
        if (button1.isSelected()) 
        {
            return option1;
        }
        
        else if (button2.isSelected())
        {
            return option2;
        }
        return null;
    }
    
   //method to get 1 if a int value from a fieldbox exist in table
    public int validateInt(String tableName,String fieldName, JTextField textFieldName)
    {
        try {
            stmt = con.createStatement();
            String SQL = "SELECT * FROM " + tableName;
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next())
            {
                int value = rs.getInt(fieldName);
                if(value ==  parseInt(textFieldName.getText()))
                {
                    return 1;
                }
            }
        } 
        catch (NumberFormatException | SQLException ex) {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
        return 0;
  
    }
    
    //method to get 1 if a int value exist in table
    public int validateDirectInt(String tableName,String fieldName, int textFieldName)
    {
        try {
            stmt = con.createStatement();
            String SQL = "SELECT * FROM " + tableName;
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next())
            {
                int value = rs.getInt(fieldName);
                if(value == textFieldName)
                {
                    return 1;
                }
            }
        } 
        catch (NumberFormatException | SQLException ex) {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
        return 0;
  
    }
    
    //Method to get 1 if a string value froma fieldbox exist in table
    public int validateString(String tableName,String fieldName, JTextField textFieldName)
    {
        try {
            stmt = con.createStatement();
            String SQL = "SELECT * FROM " + tableName;
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next())
            {
                String value = rs.getString(fieldName);
                if(value.equals(textFieldName.getText()))
                {
                    return 1;
                }
            }
        } 
        catch (NumberFormatException | SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
            
        }
        return 0;
  
    }
    
    //Method to remove a record containing a int value
    public void removeSelected(String tableName, String header, int value)
    {
        try {
            stmt = con.createStatement();
            stmt.execute("DELETE FROM "+tableName+" WHERE "+header+" = "+value);
        } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
    }
    
    //Method to remove a record containing a int value
    public void removeAllRecords(String tableName)
    {
        try {
            stmt = con.createStatement();
            stmt.execute("DELETE FROM "+tableName);
        } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
    }
    
    //Method to add details to Admin Details 
    public void insertIntoAdminDetails(String NIC, int CanteenNo, String Name, int ContactNo, String Password)
    {
        try 
        {
            stmt = con.createStatement();
            stmt.execute("INSERT INTO admindetails(NIC, CanteenNo, Name, ContactNo, Password) VALUES('"+NIC+"',"+CanteenNo+",'"+Name+"',"+ContactNo+",'"+Password+"')");

        } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
    }
    
    //Method to add details to cart
    public void insertIntoCart(int NSBMID, String Rice,String Curry, int Quantity)
    {
        try 
        {
            Date date = new Date(System.currentTimeMillis());
            stmt = con.createStatement();
            stmt.execute("INSERT INTO cart(NSBMID, date, Rice, Curry, Quantity) VALUES("+NSBMID+",'"+date+"','"+Rice+"','"+Curry+"',"+Quantity+")");

        } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
    }
    
    //Method to enter vote result to table
    public void insertVote(String name1, String name2, String name3, String name4, String name5, String name6, int ID, Date prepDate, int CanteenNo)
    {
        try 
        {
            stmt = con.createStatement();
            stmt.execute("INSERT INTO voteresult(NSBMID,PrepDate,CanteenNo,"+name1+","+name2+","+name3+","+name4+","+name5+","+name6+") VALUES("+ID+",'"+prepDate+"',"+CanteenNo+",1,1,1,1,1,1)");

        } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,"Invalid Entry\n(" + ex + ")");
        }
        
    }
    
    //Method to get Canteen no according to Canteen name
    public void getCanteenNo()
    {
        if ("Hostel Canteen".equals(activeCanteen))
        {
            activeCanteenNo = 1;
        }
        else
            activeCanteenNo = 2;
    }
    

    
}
