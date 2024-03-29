/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2.t1;

import javax.swing.JOptionPane;
import java.util.regex.*;
import java.sql.*;

/**
 *
 * @author PMSU
 */
public class SignIn extends javax.swing.JFrame {

    public static String name;
    public static String nic;
    public static String email;
    public static String city;
    public static String password;
    public static String contactnum;
    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblback = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblwms = new javax.swing.JLabel();
        lblwms1 = new javax.swing.JLabel();
        lblwms2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        txtnic = new javax.swing.JTextField();
        lblnic = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        lblcontactnum = new javax.swing.JLabel();
        txtcontactnum = new javax.swing.JTextField();
        lblsnic = new javax.swing.JLabel();
        lblsname = new javax.swing.JLabel();
        lblscity = new javax.swing.JLabel();
        lblsemail = new javax.swing.JLabel();
        lblspassword = new javax.swing.JLabel();
        lblscontactnum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warehouse Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 95, 79));

        lblback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw2/t1/back_48px.png"))); // NOI18N
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblbackMouseReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw2/t1/warehouse_64px.png"))); // NOI18N

        lblwms.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblwms.setForeground(new java.awt.Color(255, 255, 255));
        lblwms.setText("Warehouse");

        lblwms1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblwms1.setForeground(new java.awt.Color(255, 255, 255));
        lblwms1.setText("Management");

        lblwms2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblwms2.setForeground(new java.awt.Color(255, 255, 255));
        lblwms2.setText("System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(lblback)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel2)
                        .addComponent(lblwms)
                        .addComponent(lblwms1)
                        .addComponent(lblwms2))
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel2)
                    .addGap(49, 49, 49)
                    .addComponent(lblwms, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addComponent(lblwms1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)
                    .addComponent(lblwms2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        txtname.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 0, 0));
        lblname.setText("Name :");

        btnnext.setBackground(new java.awt.Color(0, 95, 79));
        btnnext.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        txtnic.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnicKeyReleased(evt);
            }
        });

        lblnic.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblnic.setForeground(new java.awt.Color(0, 0, 0));
        lblnic.setText("NIC :");

        txtcity.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtcity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcityKeyReleased(evt);
            }
        });

        lblcity.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblcity.setForeground(new java.awt.Color(0, 0, 0));
        lblcity.setText("City :");

        txtemail.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblemail.setForeground(new java.awt.Color(0, 0, 0));
        lblemail.setText("Email :");

        txtpassword.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });

        lblpassword.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 0, 0));
        lblpassword.setText("Password :");

        lblcontactnum.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblcontactnum.setForeground(new java.awt.Color(0, 0, 0));
        lblcontactnum.setText("Contact Num :");

        txtcontactnum.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtcontactnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontactnumKeyReleased(evt);
            }
        });

        lblsnic.setFont(new java.awt.Font("Consolas", 2, 28)); // NOI18N
        lblsnic.setForeground(new java.awt.Color(204, 0, 0));

        lblsname.setFont(new java.awt.Font("Consolas", 2, 28)); // NOI18N
        lblsname.setForeground(new java.awt.Color(204, 0, 0));

        lblscity.setFont(new java.awt.Font("Consolas", 2, 28)); // NOI18N
        lblscity.setForeground(new java.awt.Color(204, 0, 0));

        lblsemail.setFont(new java.awt.Font("Consolas", 2, 28)); // NOI18N
        lblsemail.setForeground(new java.awt.Color(204, 0, 0));

        lblspassword.setFont(new java.awt.Font("Consolas", 2, 28)); // NOI18N
        lblspassword.setForeground(new java.awt.Color(204, 0, 0));

        lblscontactnum.setFont(new java.awt.Font("Consolas", 2, 28)); // NOI18N
        lblscontactnum.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpassword)
                            .addComponent(lblcontactnum)
                            .addComponent(lblemail)
                            .addComponent(lblcity)
                            .addComponent(lblnic)
                            .addComponent(lblname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblsnic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblsname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblscity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblsemail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblspassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcontactnum, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblscontactnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsname))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnic)
                    .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsnic))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblscity))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsemail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblspassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontactnum)
                    .addComponent(txtcontactnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblscontactnum))
                .addGap(36, 36, 36)
                .addComponent(btnnext)
                .addGap(96, 96, 96))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1043, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void checkdb(){
        try {
            
            String url ="jdbc:mysql://localhost:3306/wms";
            String uname ="root";
            String pass ="18765121";
            String query1 = "SELECT * FROM registration WHERE nic = '"+nic+"'";
            String query2 = "SELECT * FROM registration WHERE email = '"+email+"'";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pass);
            Statement st = connection.createStatement();
            ResultSet rs1 = st.executeQuery(query1);

            if( rs1.next()){
                JOptionPane.showMessageDialog(null,"Entered NIC already exists");
                i=0;
            }
            ResultSet rs2 = st.executeQuery(query2);
            if( rs2.next()){
                JOptionPane.showMessageDialog(null,"Entered EMAIL already exists");
                i=0;
            }
           st.close();
           connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
         static int i=1;
    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
          i=1;
         
         name = txtname.getText();
         nic = txtnic.getText();
         email = txtemail.getText();
         city = txtcity.getText();
         password = txtpassword.getText();
         contactnum = txtcontactnum.getText();
        
        if(name.equals("") || nic.equals("") || email.equals("") || city.equals("") || password.equals("") || contactnum.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter requested details");
            i=0;
        }
        
        if(contactnum.length()==10){} else{JOptionPane.showMessageDialog(null,"Please enter a valid contact number");i=0;}
        if(!nic.equals("")){
            if(nic.length()==10){
                String PATTERN = "^[0-9]{0,9}[vV]{0,1}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(nic);
        
        if(!match.matches()){
            JOptionPane.showMessageDialog(null,"Please enter a valid NIC number");
            i=0;
        }
            }
            else if(nic.length()==12){
                String PATTERN = "^[0-9]{0,12}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(nic);
        
        if(!match.matches()){
            JOptionPane.showMessageDialog(null,"Please enter a valid NIC number");
            i=0;
        }
            }
            else{
            JOptionPane.showMessageDialog(null,"Please enter a valid NIC number");
            i=0;
            }                       
        }
        if(lblsname.getText().equals("*") || lblsnic.getText().equals("*") || lblsemail.getText().equals("*") || lblscity.getText().equals("*") || lblspassword.getText().equals("*") || lblscontactnum.getText().equals("*")){
            JOptionPane.showMessageDialog(null,"Please enter valid details");
            i=0;
        }
        
        if(i==1){
            System.out.println("Checking ...");
            checkdb();
        if(i==1){
        new SignIn2().setVisible(true);
        this.setVisible(false);
        }    
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        try {      
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtname.getText());
        
        if(!match.matches()){
            lblsname.setText("*");
        }
        else{
            lblsname.setText(null);
        }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }      
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyReleased
        // TODO add your handling code here:
        try {
        String PATTERN = "^[0-9vV]{0,12}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtnic.getText());
        
        if(!match.matches()){
            lblsnic.setText("*");
        }
        else{
            lblsnic.setText(null);
        }           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtnicKeyReleased

    private void txtcityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcityKeyReleased
        // TODO add your handling code here:
        try {      
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtcity.getText());
        
        if(!match.matches()){
            lblscity.setText("*");
        }
        else{
            lblscity.setText(null);
        }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtcityKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        try {      
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@]{1}[gmail]{5}[.]{1}[com]{3}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtemail.getText());
        
        if(!match.matches()){
            lblsemail.setText("*");
        }
        else{
            lblsemail.setText(null);
        }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        // TODO add your handling code here:
        try {
        String PATTERN = "^[a-zA-Z0-9]{0,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtpassword.getText());
        
        if(!match.matches()){
            lblspassword.setText("*");
        }
        else{
            lblspassword.setText(null);
        }           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtcontactnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactnumKeyReleased
        // TODO add your handling code here:
        try {
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtcontactnum.getText());
        
        if(!match.matches()){
            lblscontactnum.setText("*");
        }
        else{
            lblscontactnum.setText(null);
        }           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtcontactnumKeyReleased

    private void lblbackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseReleased
        // TODO add your handling code here:
        new SorL().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblbackMouseReleased

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontactnum;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblscity;
    private javax.swing.JLabel lblscontactnum;
    private javax.swing.JLabel lblsemail;
    private javax.swing.JLabel lblsname;
    private javax.swing.JLabel lblsnic;
    private javax.swing.JLabel lblspassword;
    private javax.swing.JLabel lblwms;
    private javax.swing.JLabel lblwms1;
    private javax.swing.JLabel lblwms2;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcontactnum;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
