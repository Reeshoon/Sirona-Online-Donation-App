/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedonationsystem;

/**
 *
 * @author USER
 */
public class Policy extends javax.swing.JFrame {

    /**
     * Creates new form Policy
     */
    public Policy() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(43, 182, 115));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Privacy Policy\nWe built the Sirona Blood Donation System app as a Free app.\nThis SERVICE is provided by at no cost and is intended for use as is.\nThis page is used to inform visitors regarding our policies with the \ncollection, use, and disclosure of Personal Information if anyone \ndecided to use our Service.\nIf you choose to use our Service, then you agree to the collection and \nuse of information in relation to this policy. The Personal Information \nthat we collect is used for providing and improving the Service. We \nwill not use or share your information with anyone except as described \nin this Privacy Policy.\nThe terms used in this Privacy Policy have the same meanings as in our \nTerms and Conditions, which is accessible at Sirona Blood Donation \nSystem unless otherwise defined in this Privacy Policy.\nInformation Collection and Use\nFor a better experience, while using our Service, we may require you \nto provide us with certain personally identifiable information, \nincluding but not limited to Name, Address, Date of Birth, Age, \nBlood Group, Contact Number. The information that we request will be \nretained by us and used as described in this privacy policy.\nThe app does use third party services that may collect information \nused to identify you.\nLink to privacy policy of third party service providers used by the \napp\n\nGoogle Play Services\nLog Data\nWe want to inform you that whenever you use our Service, in a case \nof an error in the app we collect data and information (through \nthird party products) on your phone called Log Data. This Log \nData may include information such as your device Internet Protocol \n(“IP”) address, device name, operating system version, the \nconfiguration of the app when utilizing our Service, the time and \ndate of your use of the Service, and other statistics.\nCookies\nCookies are files with a small amount of data that are commonly \nused as anonymous unique identifiers. These are sent to your \nbrowser from the websites that you visit and are stored on your \ndevice's internal memory.\nThis Service does not use these “cookies” explicitly. However, \nthe app may use third party code and libraries that use “cookies” \nto collect information and improve their services. You have the \noption to either accept or refuse these cookies and know when a \ncookie is being sent to your device. If you choose to refuse our \ncookies, you may not be able to use some portions of this Service.\nService Providers\nWe may employ third-party companies and individuals due to the\n following reasons:\nTo facilitate our Service;\nTo provide the Service on our behalf;\nTo perform Service-related services; or\nTo assist us in analyzing how our Service is used.\nWe want to inform users of this Service that these third parties \nhave access to your Personal Information. The reason is to perform\nthe tasks assigned to them on our behalf. However, they are \nobligated not to disclose or use the information for any other \npurpose.\nSecurity\nWe value your trust in providing us your Personal Information, \nthus we are striving to use commercially acceptable means of \nprotecting it. But remember that no method of transmission over \nthe internet, or method of electronic storage is 100% secure and \nreliable, and we cannot guarantee its absolute security.\nLinks to Other Sites\nThis Service may contain links to other sites. If you click on a \nthird-party link, you will be directed to that site. Note that \nthese external sites are not operated by us. Therefore, we \nstrongly advise you to review the Privacy Policy of these \nwebsites. We have no control over and assume no responsibility \nfor the content, privacy policies, or practices of any third-party\nsites or services.\nChildren’s Privacy\nThese Services do not address anyone under the age of 13. We do \nnot knowingly collect personally identifiable information from \nchildren under 13. In the case we discover that a child under \n13 has provided us with personal information, we immediately \ndelete this from our servers. If you are a parent or guardian \nand you are aware that your child has provided us with personal \ninformation, please contact us so that we will be able to do \nnecessary actions.\nChanges to This Privacy Policy\nWe may update our Privacy Policy from time to time. Thus, you \nare advised to review this page periodically for any changes. \nWe will notify you of any changes by posting the new Privacy \nPolicy on this page. These changes are effective immediately \nafter they are posted on this page.\nContact Us\nIf you have any questions or suggestions about our Privacy Policy, \ndo not hesitate to contact us at faysalrahman424@gmail.com.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 590, 930));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filedonationsystem/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jTextField1.setBackground(new java.awt.Color(43, 182, 115));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Terms and Agreement ");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 530, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Signup obj=new Signup();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Policy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Policy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Policy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Policy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Policy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
