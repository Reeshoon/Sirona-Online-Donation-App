/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedonationsystem;

import java.awt.Color;
import java.sql.*;

/**
 *
 * @author USER
 */
public class UpdateDonor extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonor
     */
    public static String hos_id;
    public UpdateDonor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filedonationsystem/usersobi.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 250, 220));

        jTextField1.setBackground(new java.awt.Color(174, 210, 193));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText(" Enter Donor Name");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 330, 40));

        jTextField2.setBackground(new java.awt.Color(174, 210, 193));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText(" NID of Donor");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 330, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filedonationsystem/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 60));

        jButton4.setBackground(new java.awt.Color(0, 102, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ELIGIBLE");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 280, 80));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, -1, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Hepatitis A", "Hepatitis B", "Hepatitis C", "Hepatitis D", "Hepatitis E", "Tuberculosis", "HIV" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filedonationsystem/Update Donor.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        HomeScreenUser obj=new HomeScreenUser();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
      if(jButton4.getText()=="ELIGIBLE"){ 
            jButton4.setBackground(Color.red);
            jButton4.setText("INELIGIBLE");
        }
//        else{ 
//            jButton4.setText("ELIGIBLE");
//            jButton4.setBackground(new java.awt.Color(0,102,51));
//        }
    }//GEN-LAST:event_jButton4MousePressed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jComboBox1.setEnabled(false);
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sirona","iutcse");
             String sql = "select * from donor where username='"+jTextField1.getText()+"'and nid='"+jTextField2.getText()+"'";
             PreparedStatement pst=con.prepareStatement(sql);
             ResultSet rs=pst.executeQuery();
             //System.out.println("Success");
             if(rs.next())
             {
                 //JOptionPane.showMessageDialog(null, "Login successful");
                 //System.out.println("Successful");
                 //String uid[]= new String[3];
                 String name,nid;
                 name= rs.getString("username");
                 nid=rs.getString("nid");
                 if(jButton4.getText()=="ELIGIBLE"){ 
                    String query = "update donor set eligibility='ELIGIBLE' where username='"+name+"'and nid='"+nid+"'";
                    PreparedStatement psst=con.prepareStatement(query);
                    ResultSet rs1=psst.executeQuery();
              }
                else{ 
                     String query = "update donor set eligibility='INELIGIBLE' where username='"+name+"'and nid='"+nid+"'";
                     PreparedStatement psst=con.prepareStatement(query);
                     ResultSet rs1=psst.executeQuery();
                     String query1="insert into donation_history(donorname,nid,hospital_id,donation_date) values(?,?,?,?)";
                     PreparedStatement pst1 = con.prepareStatement(query1);
                     pst1.setString(1,name); 
                     pst1.setString(2,nid);
                     pst1.setString(3,hos_id);
                     pst1.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
                     pst1.executeQuery();
                }
                 
                 /*HomeScreenUser obj=new HomeScreenUser();
                 this.setVisible(false);
                 obj.setVisible(true);*/
             }
             
    }                                        
            catch(Exception e)
               {
                   System.out.println(e);
               }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //String value= jComboBox1.getSelectedItem().toString();
        //System.out.println(value);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String value= jComboBox1.getSelectedItem().toString();
        if(value!="<None>"){
        System.out.println(value);
        jComboBox1.setEnabled(false);
        jButton4.setBackground(Color.red);
        jButton4.setText("INELIGIBLE");
        
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sirona","iutcse");
             String sql = "select * from donor where username='"+jTextField1.getText()+"'and nid='"+jTextField2.getText()+"'";
             PreparedStatement pst=con.prepareStatement(sql);
             ResultSet rs=pst.executeQuery();
             if(rs.next())
             {
                 //JOptionPane.showMessageDialog(null, "Login successful");
                 System.out.println("updating");
                 //String uid[]= new String[3];
                 String name,nid;
                 name= rs.getString("username");
                 nid=rs.getString("nid");
                 
                    String query = "update donor set eligibility='INELIGIBLE',disease='"+value+"'where username='"+name+"'and nid='"+nid+"'";
                    PreparedStatement psst=con.prepareStatement(query);
                    psst.executeQuery();
             }
             
        }                                        
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        hos_id=args[0];
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}