/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultsystem;
import java.net.*;
import java.io.*;

public class SMS {
    static String us,ps;

    static public void send(String mob) {
        try {
            // Construct data
            String data = "";
            /*
             * Note the suggested encoding for certain parameters, notably
             * the username, password and especially the message.  ISO-8859-1
             * is essentially the character set that we use for message bodies,
             * with a few exceptions for e.g. Greek characters.  For a full list,
             * see:  http://developer.bulksms.com/eapi/submission/character-encoding/
             */
            data += "username=" + URLEncoder.encode("Abhikarsh45", "ISO-8859-1");
            data += "&password=" + URLEncoder.encode("x2709204", "ISO-8859-1");
            
                        Config con=new Config();
                        con.connect();
                        String sql="select First_name,Password from Teachers where Mobile_no="+mob+"";
                        
                        try{
                        Config.stmt1.executeQuery(sql);
                        Config.rs1=Config.stmt1.getResultSet();
                        
                        if(Config.rs1.next()){
                            
                            us=Config.rs1.getString("First_name");
                            ps=Config.rs1.getString("Password");
                            
                        
                        }
                        }
                        catch(Exception e){
                            System.out.println("Exception :"+e);
                            e.printStackTrace();
                        }
                        
            
            
            
            data += "&message=" + URLEncoder.encode("your Username is :"+us+" and Password is :"+ps+"", "ISO-8859-1");
            data += "&want_report=1";
            data += "&msisdn="+mob+"";

            // Send data
            // Please see the FAQ regarding HTTPS (port 443) and HTTP (port 80/5567)
            URL url = new URL("https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");

            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();

            // Get the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                // Print the response output...
                System.out.println(line);
            }
            wr.close();
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

  
