
package main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LoginUI extends javax.swing.JFrame {

    public LoginUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbAcountName5 = new javax.swing.JLabel();
        tfAccountName = new javax.swing.JTextField();
        lbAcountName6 = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();
        lbSwitchToRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(71, 108, 155));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 221, 214));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("So Gu Bank");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sugobank-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(236, 249, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Nhập");

        lbAcountName5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName5.setText("Tên Tài Khoản");

        tfAccountName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfAccountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccountNameActionPerformed(evt);
            }
        });

        lbAcountName6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName6.setText("Mật Khẩu");

        jbLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbLogin.setText("Đăng Nhập");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        lbSwitchToRegister.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lbSwitchToRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSwitchToRegister.setText("Chưa có Tài Khoản ? Đăng Ký");
        lbSwitchToRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSwitchToRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSwitchToRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbLogin)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSwitchToRegister)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbAcountName6)
                            .addComponent(lbAcountName5)
                            .addComponent(tfAccountName)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(209, 209, 209))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbAcountName5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbAcountName6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbSwitchToRegister)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfAccountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccountNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccountNameActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        CustomerBUS bus = new CustomerBUS();
        bus.readData();
        String username = tfAccountName.getText();
        char[] passwordChars = pfPassword.getPassword();
        String password = String.valueOf(passwordChars);
        
        if(bus.loginCheck(username, password) == true)
        {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
            CustomerDTO customer = new CustomerDTO();
            customer = bus.loginCustomer(username);
            this.dispose();
            Home home = new Home(customer);
            home.setVisible(true);
        }
        else if(username.equals("admin") && password.equals("12345"))
        {
            AdminPanel admin = new AdminPanel();
            admin.setVisible(true);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Sai thông tin đăng nhập");
    }//GEN-LAST:event_jbLoginActionPerformed

    private void lbSwitchToRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSwitchToRegisterMouseClicked
        RegisterUI regisFrame = new RegisterUI();
        regisFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbSwitchToRegisterMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // Set Windows look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel lbAcountName5;
    private javax.swing.JLabel lbAcountName6;
    private javax.swing.JLabel lbSwitchToRegister;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfAccountName;
    // End of variables declaration//GEN-END:variables
}
