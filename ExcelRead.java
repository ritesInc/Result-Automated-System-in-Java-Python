/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultsystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 *
 * @author chiku
 */
public class ExcelRead {
     
    public static void read(String filename, String standard) throws Exception
    { 
        
        short a=0;
  short b=1;
  short c=2;
  short d=3;
  int i=0;
  Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
         Statement st=conn.createStatement();

    String value1=" ", value2=" ",value3 =" ", value4 =" ";
    //String filename  ="C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\src\\resultsystem\\airline.xls"; 
    if(filename != null && !filename.equals("")){
    try{
    FileInputStream fs =new FileInputStream(filename);
    HSSFWorkbook wb = new HSSFWorkbook(fs);
    for(int k = 0; k < wb.getNumberOfSheets(); k++){
    int j=i+1;
    HSSFSheet sheet = wb.getSheetAt(k);
    int rows  = sheet.getPhysicalNumberOfRows();
    for(int r = 1; r < rows; r++){
    HSSFRow row   = sheet.getRow(r);
    int cells = row.getPhysicalNumberOfCells(); 
    HSSFCell cell1  = row.getCell(a);
      value1 = Integer.toString((int) cell1.getNumericCellValue());
    HSSFCell cell2  = row.getCell(b);
      value2 = cell2.getStringCellValue();
    HSSFCell cell3  = row.getCell(c);
      value3 = cell3.getStringCellValue();
    HSSFCell cell4  = row.getCell(d);
      //value4 = cell4.getStringCellValue();

    System.out.println(value1+"\t"+value2+"\t"+value3+"\t"+value4);
    st.executeUpdate("insert into class_"+standard+"_details(roll,name,fname) values('"+value1+"','"+value2+"','"+value3+"')");
    
    }
        i++;
     }
    JOptionPane.showMessageDialog(null, "Database of class "+standard+" created!");
    }
    catch(Exception e){
    //System.out.println(e);
    e.printStackTrace();
    }
   }

        
    }
}
