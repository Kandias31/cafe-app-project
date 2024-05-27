/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
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

        jPanel2 = new javax.swing.JPanel();
        panelRound2 = new PanelRound.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        signbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        regbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1194, 834));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(111, 72, 41));
        panelRound2.setPreferredSize(new java.awt.Dimension(503, 578));
        panelRound2.setRoundBottomLeft(60);
        panelRound2.setRoundBottomRight(60);
        panelRound2.setRoundTopLeft(60);
        panelRound2.setRoundTopRight(60);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fullname");
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        fullname.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        panelRound2.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 417, 54));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        emailAdd.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        emailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddActionPerformed(evt);
            }
        });
        panelRound2.add(emailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 417, 54));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        pword.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        panelRound2.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 417, 54));

        signbtn.setBackground(new java.awt.Color(219, 167, 57));
        signbtn.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        signbtn.setForeground(new java.awt.Color(255, 255, 255));
        signbtn.setText("Sign Up");
        signbtn.setBorderPainted(false);
        signbtn.setPreferredSize(new java.awt.Dimension(192, 54));
        signbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signbtnActionPerformed(evt);
            }
        });
        panelRound2.add(signbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sudah punya akun?");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 120, 20));

        regbtn.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        regbtn.setForeground(new java.awt.Color(219, 167, 57));
        regbtn.setText("Login");
        regbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regbtnMouseClicked(evt);
            }
        });
        panelRound2.add(regbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        jPanel2.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void signbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signbtnActionPerformed
        String fullName, email, password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:Mysql://localhost:3306/cafe";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement stat = conn.createStatement();
            if("".equals(fullname.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Full Name is require", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(emailAdd.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error", JOptionPane.ERROR_MESSAGE);
            } else if("".equals(pword.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                fullName = fullname.getText();
                email = emailAdd.getName();
                password = pword.getText();
                System.out.println(password);
                
                query = "INSERT INTO userlog(fullname, email, password)" + "VALUES('"+ fullName +"', '" + email +"' , '"+ password +"')";
                
                stat.execute(query);
                fullname.setText("");
                emailAdd.setText("");
                pword.setText("");
                JOptionPane.showMessageDialog(null, "Account has been created successfully");
            }
        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_signbtnActionPerformed

    private void regbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regbtnMouseClicked
        // TODO add your handling code here:
        login Login = new login();
        Login.setVisible(true);
        Login.pack();
        Login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_regbtnMouseClicked

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailAdd;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private PanelRound.PanelRound panelRound2;
    private javax.swing.JPasswordField pword;
    private javax.swing.JLabel regbtn;
    private javax.swing.JButton signbtn;
    // End of variables declaration//GEN-END:variables
}