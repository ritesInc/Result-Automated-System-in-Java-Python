/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultsystem;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author chiku
 */
public class Config {
   public static java.sql.Connection con; 
   public static Statement stmt1,stmt2;
   public static ResultSet rs1,rs2;
   
  
   public void connect()
   {
       try
       {
         DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
         //JOptionPane.showMessageDialog(null,"Connection success");
         stmt1=con.createStatement();
         stmt2=con.createStatement();
        //JOptionPane.showMessageDialog(null,"connection success");
       }
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(null,"Connection failed"+e);
       }
   }
        
}

    

