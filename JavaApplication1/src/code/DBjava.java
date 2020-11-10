/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class DBjava {
    
    public static Connection connect(){
        
        Connection conn=null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
                
            
            
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
        
        }
        
        
        
        return conn;
    }
    
}
