
package resultsystem;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSetMetaData;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FaceRecognition extends javax.swing.JFrame {
    String fname,lname,mail,mob,ques,ans,pass;

    
    public FaceRecognition() {
        initComponents();
        new Config().connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        excel = new javax.swing.JButton();
        waytogenerate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(86, 61, 124));

        jLabel7.setBackground(new java.awt.Color(86, 61, 124));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signup.png"))); // NOI18N

        jLabel1.setText("jLabel1");

        excel.setBackground(new java.awt.Color(86, 61, 124));
        excel.setForeground(new java.awt.Color(255, 255, 255));
        excel.setText("feed Details");
        excel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });

        waytogenerate.setBackground(new java.awt.Color(86, 61, 124));
        waytogenerate.setForeground(new java.awt.Color(255, 255, 255));
        waytogenerate.setText("Back");
        waytogenerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        waytogenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waytogenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(waytogenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(excel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waytogenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 340, 510);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(720, 0, 60, 60);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(86, 61, 124));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Put Your Face Front To The Camera");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 80, 440, 60);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(86, 61, 124));
        jLabel12.setText("Click Generate Button To Get Results");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 170, 280, 20);

        btnsignup.setBackground(new java.awt.Color(86, 61, 124));
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("Get Results");
        btnsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup);
        btnsignup.setBounds(480, 360, 160, 50);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(86, 61, 124));
        jLabel13.setText("AND");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(540, 130, 40, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(776, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        try
	{
            String path = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\ResultSystem\\faceRecognizer.py";
            String command = "python "+path;
            Process p = Runtime.getRuntime().exec(command);
            //ProcessBuilder builder = new ProcessBuilder("python F:\\opencvPrograms\\facedetect.py");
            //Process newProcess = builder.start();
            int processComplete = p.waitFor();
            if(processComplete == 0)
            {
                String path_for_student_id_python = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\ResultSystem\\studentID.txt";
                String content = new String(Files.readAllBytes(Paths.get(path_for_student_id_python)));
                int id = Integer.parseInt(content);
                int tempForID = id;
		
                //System.out.println(id);       // FOR PRINTING ROLL AND CLASS TOGETHER
                
                // For Extracting class and roll of Students
                int rem1 = id%10;       // for roll
                id = id/10;
                int rem2 = id%10;       // for roll
                id = id/10;     // for class
                String forRem1 = Integer.toString(rem1);
                String forRem2 = Integer.toString(rem2);
                String ROLL = forRem2+forRem1;
                int CLASS = id;
                
                getExaminationDetails(Integer.parseInt(ROLL), CLASS);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not Successfull");
            }
        }
	catch(Exception e)
	{
            e.printStackTrace();
	}
        
    }//GEN-LAST:event_btnsignupActionPerformed

    public void getExaminationDetails(int roll, int standard)
    {
        //System.out.println("Roll = "+roll +"Class = "+standard);
        
        String sql_selectMarks = "SELECT * FROM class_"+standard+ " where roll="+roll;
        String sql_selectStudent = "SELECT * FROM class_"+standard+"_details WHERE roll="+roll;
        try
        {
            Config.stmt1.executeQuery(sql_selectMarks);
            Config.rs1=Config.stmt1.getResultSet();
            Config.stmt2.executeQuery(sql_selectStudent);
            Config.rs2=Config.stmt2.getResultSet();
            
            if(Config.rs1.next() && Config.rs2.next())
            {
                System.out.println(Config.rs1.getString("SST"));
            
        
        /*
            This is for making result pdf file.
        */
        
        try {
            // TODO add your handling code here:
          Document myDocument = new Document();
          PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(Config.rs2.getString("name")+".pdf"));
         
          myDocument.open();
          
          PdfPTable table = new PdfPTable(2);
          //PdfPTable table2 = new PdfPTable(1);
          myDocument.add(new Paragraph(Config.rs2.getString("name") ,FontFactory.getFont(FontFactory.TIMES_BOLD,32,Font.BOLD,BaseColor.DARK_GRAY ))); 
          myDocument.add(new Paragraph("S/o "+Config.rs2.getString("fname"),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.PLAIN,BaseColor.DARK_GRAY))); 
          myDocument.add(new Paragraph("Roll : "+Config.rs1.getString("roll"),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.PLAIN,BaseColor.DARK_GRAY)));
          
          myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
          

          myDocument.add(new Paragraph("Marks",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD,BaseColor.DARK_GRAY  )));
          
          ResultSetMetaData md = Config.rs1.getMetaData();
          int col = md.getColumnCount();
          //System.out.println(col);
          table.setHeaderRows(1);
          //table.addCell(md.getColumnName(1));
          for(int i=2,j=2; i<=col&&j<=col; i++,j++)
          {
              table.addCell(md.getColumnName(i));
              
              table.addCell(Config.rs1.getString(j));
              
          }
          
          
          
          myDocument.add(table);
          
          
           myDocument.close();
          JOptionPane.showMessageDialog(null,"Result successfully generated");
            
     }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
     }
     finally {
            
            try{
                //Config.rs1.close();
                //Config.stmt1.close();
                
            }
            catch(Exception e){
           
         
            }
        }
     
            
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
        
        
        
        
    }
    
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Feed_n_Read_Data().setVisible(true);
    }//GEN-LAST:event_excelActionPerformed

    private void waytogenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waytogenerateActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new WayToGenerate().setVisible(true);
    }//GEN-LAST:event_waytogenerateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FaceRecognition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceRecognition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceRecognition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceRecognition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceRecognition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JButton excel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton waytogenerate;
    // End of variables declaration//GEN-END:variables
}
