/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.controllerRegister;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author WIN10
 */
public class registerView extends javax.swing.JFrame {
    controllerRegister cR;
    viewLogin vL;
    /**
     * Creates new form registerView
     */
    public registerView() {
        initComponents();
        cR = new controllerRegister(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameRegisterView = new javax.swing.JTextField();
        namaRegisterView = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatRegisterView = new javax.swing.JTextArea();
        submitRegisterView = new javax.swing.JButton();
        passwordRegisterView = new javax.swing.JPasswordField();
        rePasswordRegisterVieww = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KIRYU LAUNDRY");

        jLabel2.setText("Username");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Password");

        jLabel6.setText("Re-Password");

        namaRegisterView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaRegisterViewActionPerformed(evt);
            }
        });

        alamatRegisterView.setColumns(20);
        alamatRegisterView.setRows(5);
        jScrollPane1.setViewportView(alamatRegisterView);

        submitRegisterView.setText("Submit");
        submitRegisterView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRegisterViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitRegisterView)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameRegisterView)
                                    .addComponent(namaRegisterView)
                                    .addComponent(jScrollPane1)
                                    .addComponent(passwordRegisterView)
                                    .addComponent(rePasswordRegisterVieww))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameRegisterView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaRegisterView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordRegisterView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rePasswordRegisterVieww, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(submitRegisterView)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaRegisterViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaRegisterViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaRegisterViewActionPerformed

    private void submitRegisterViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRegisterViewActionPerformed
        // TODO add your handling code here:
        cR.register();        
        if(cR.status.equals("sukses")){
            vL = new viewLogin();
            vL.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_submitRegisterViewActionPerformed

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
            java.util.logging.Logger.getLogger(registerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerView().setVisible(true);
            }
        });
    }

    public JTextArea getAlamatRegisterView() {
        return alamatRegisterView;
    }

    public void setAlamatRegisterView(JTextArea alamatRegisterView) {
        this.alamatRegisterView = alamatRegisterView;
    }

    public JTextField getNamaRegisterView() {
        return namaRegisterView;
    }

    public void setNamaRegisterView(JTextField namaRegisterView) {
        this.namaRegisterView = namaRegisterView;
    }

    public JPasswordField getPasswordRegisterView() {
        return passwordRegisterView;
    }

    public void setPasswordRegisterView(String passwordRegisterView) {
        this.passwordRegisterView.setText(passwordRegisterView);
    }

    public JPasswordField getRePasswordRegisterVieww() {
        return rePasswordRegisterVieww;
    }

    public void setRePasswordRegisterVieww(String rePasswordRegisterVieww) {
        this.rePasswordRegisterVieww.setText(rePasswordRegisterVieww);
    }

    public JButton getSubmitRegisterView() {
        return submitRegisterView;
    }

    public void setSubmitRegisterView(JButton submitRegisterView) {
        this.submitRegisterView = submitRegisterView;
    }

    public JTextField getUsernameRegisterView() {
        return usernameRegisterView;
    }

    public void setUsernameRegisterView(JTextField usernameRegisterView) {
        this.usernameRegisterView = usernameRegisterView;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatRegisterView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaRegisterView;
    private javax.swing.JPasswordField passwordRegisterView;
    private javax.swing.JPasswordField rePasswordRegisterVieww;
    private javax.swing.JButton submitRegisterView;
    private javax.swing.JTextField usernameRegisterView;
    // End of variables declaration//GEN-END:variables
}
