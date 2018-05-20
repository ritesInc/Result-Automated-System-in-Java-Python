
package resultsystem;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class WayToGenerate extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public WayToGenerate() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        result = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        student_class = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        student_roll = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblforgot = new javax.swing.JLabel();
        generate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(86, 61, 124));

        jLabel1.setText("jLabel1");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N

        result.setBackground(new java.awt.Color(86, 61, 124));
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setText("Go To Result");
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 370, 510);

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

        student_class.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        student_class.setToolTipText("Enter Username here");
        student_class.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel1.add(student_class);
        student_class.setBounds(480, 200, 220, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(86, 61, 124));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Put Student's Face Front To The Camera");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 70, 410, 60);

        student_roll.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        student_roll.setToolTipText("Enter Password here");
        student_roll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel1.add(student_roll);
        student_roll.setBounds(480, 310, 220, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(86, 61, 124));
        jLabel5.setText("Student's Class");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 180, 112, 20);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(86, 61, 124));
        jLabel6.setText("Roll Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 280, 100, 30);

        lblforgot.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblforgot.setForeground(new java.awt.Color(86, 61, 124));
        lblforgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforgot.setText("Save My Face");
        lblforgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblforgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblforgotMouseClicked(evt);
            }
        });
        jPanel1.add(lblforgot);
        lblforgot.setBounds(510, 460, 150, 20);

        generate.setBackground(new java.awt.Color(86, 61, 124));
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("Generate");
        generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate);
        generate.setBounds(540, 390, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(776, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here
        
        this.dispose();
        new FaceRecognition().setVisible(true);
        
    }//GEN-LAST:event_resultActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lblforgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgotMouseClicked
        try
	{
            String path = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\trainner.py";
            String command = "python "+path;
            Process p = Runtime.getRuntime().exec(command);
            //ProcessBuilder builder = new ProcessBuilder("python F:\\opencvPrograms\\facedetect.py");
            //Process newProcess = builder.start();
            int processComplete = p.waitFor();
            if(processComplete == 0)
            {
                JOptionPane.showMessageDialog(null, "Face Saved");
                student_roll.setText("");
                student_class.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Face Not Saved");
            }
        }
	catch(Exception e)
	{
            e.printStackTrace();
	}
    }//GEN-LAST:event_lblforgotMouseClicked

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        
        
        if(!student_class.getText().equals("") || !student_roll.getText().equals(""))   {
        try
        {
            String pathForIDFile = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\";
            FileWriter fw1 = new FileWriter("C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\student_id.txt");
            fw1.write(student_roll.getText());
            fw1.close();
            String pathForClassFile = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\";
            FileWriter fw2 = new FileWriter(pathForClassFile+"student_class_java.txt");
            fw2.write(student_class.getText());
            fw2.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
	{
            String path = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\datasetGenerator.py";
            String command = "python "+path;
            Process p = Runtime.getRuntime().exec(command);
            //ProcessBuilder builder = new ProcessBuilder("python F:\\opencvPrograms\\facedetect.py");
            //Process newProcess = builder.start();
            int processComplete = p.waitFor();
            if(processComplete == 0)
            {
                JOptionPane.showMessageDialog(null, "Face ID Generated");
                student_roll.setText("");
                student_class.setText("");
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
        }
        //   For Not Getting data(class and roll number) from staff   //
        else
        {
            JOptionPane.showMessageDialog(null, "Provide all Details");
        }
        
    }//GEN-LAST:event_generateActionPerformed

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
            java.util.logging.Logger.getLogger(WayToGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WayToGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WayToGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WayToGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WayToGenerate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblforgot;
    private javax.swing.JButton result;
    private javax.swing.JTextField student_class;
    private javax.swing.JTextField student_roll;
    // End of variables declaration//GEN-END:variables
}
