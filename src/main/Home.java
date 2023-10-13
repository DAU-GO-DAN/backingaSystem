
package main;

import java.awt.GridLayout;
import javax.swing.UIManager;


public class Home extends javax.swing.JFrame {
    
    private CustomerDTO customer;
    
    public Home(CustomerDTO customer) {
        this.customer = customer;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        mytextfield1 = new main.Mytextfield();
        mainpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Contain = new javax.swing.JPanel();
        Chao = new javax.swing.JPanel();
        lbHello = new javax.swing.JLabel();
        Features = new javax.swing.JPanel();
        lbAccountManage = new javax.swing.JLabel();
        lbTransaction = new javax.swing.JLabel();
        lbLoan = new javax.swing.JLabel();
        lbPassBook = new javax.swing.JLabel();
        lbTransactionHistory = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        Others = new javax.swing.JPanel();
        lbLogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(10, 77, 104));

        jPanel5.setBackground(new java.awt.Color(8, 131, 149));

        mytextfield1.setEditable(false);
        mytextfield1.setText("SoGuBank");
        mytextfield1.setSuffixIcon(new javax.swing.ImageIcon(getClass().getResource("/main/PNG/search (2).png"))); // NOI18N
        mytextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mytextfield1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mytextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mytextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpanel.setBackground(new java.awt.Color(5, 191, 219));
        mainpanel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/PNG/Banner.png"))); // NOI18N

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Chao.setBackground(new java.awt.Color(5, 191, 219));

        lbHello.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbHello.setForeground(new java.awt.Color(255, 255, 255));
        lbHello.setText("Chào quý khách");
        lbHello.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout ChaoLayout = new javax.swing.GroupLayout(Chao);
        Chao.setLayout(ChaoLayout);
        ChaoLayout.setHorizontalGroup(
            ChaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHello, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        ChaoLayout.setVerticalGroup(
            ChaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbHello, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Features.setBackground(new java.awt.Color(5, 191, 219));
        Features.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Features.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbAccountManage.setBackground(new java.awt.Color(242, 248, 255));
        lbAccountManage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAccountManage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAccountManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/PNG/credit-card.png"))); // NOI18N
        lbAccountManage.setText("Quản lý tài khoản");
        lbAccountManage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAccountManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccountManageMouseClicked(evt);
            }
        });

        lbTransaction.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTransaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTransaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/PNG/funding.png"))); // NOI18N
        lbTransaction.setText("Chuyển tiền");
        lbTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTransactionMouseClicked(evt);
            }
        });

        lbLoan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbLoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/PNG/borrow.png"))); // NOI18N
        lbLoan.setText("Vay tiêu dùng");
        lbLoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbPassBook.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPassBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/PNG/piggy-bank.png"))); // NOI18N
        lbPassBook.setText("Sổ tiết kiệm");
        lbPassBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPassBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPassBookMouseClicked(evt);
            }
        });

        lbTransactionHistory.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTransactionHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTransactionHistory.setText("Lịch Sử Giao Dịch");
        lbTransactionHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTransactionHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTransactionHistoryMouseClicked(evt);
            }
        });

        lbInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo.setText("Thông Tin Cá Nhân");
        lbInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout FeaturesLayout = new javax.swing.GroupLayout(Features);
        Features.setLayout(FeaturesLayout);
        FeaturesLayout.setHorizontalGroup(
            FeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeaturesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPassBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTransaction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAccountManage, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(lbTransactionHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FeaturesLayout.setVerticalGroup(
            FeaturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeaturesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAccountManage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPassBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTransactionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        Others.setBackground(new java.awt.Color(5, 191, 219));

        javax.swing.GroupLayout OthersLayout = new javax.swing.GroupLayout(Others);
        Others.setLayout(OthersLayout);
        OthersLayout.setHorizontalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        OthersLayout.setVerticalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainLayout = new javax.swing.GroupLayout(Contain);
        Contain.setLayout(ContainLayout);
        ContainLayout.setHorizontalGroup(
            ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Features, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Others, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Chao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContainLayout.setVerticalGroup(
            ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainLayout.createSequentialGroup()
                .addComponent(Chao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Features, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Others, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbLogOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbLogOut.setForeground(new java.awt.Color(204, 255, 204));
        lbLogOut.setText("Đăng Xuất");
        lbLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbLogOut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mytextfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mytextfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mytextfield2ActionPerformed

    private void mytextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mytextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mytextfield1ActionPerformed

    private void lbTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTransactionMouseClicked
        mainpanel.removeAll();
        mainpanel.revalidate();
        mainpanel.repaint();
        TransactionManage transPanel = new TransactionManage(mainpanel, customer);
        mainpanel.setLayout(new GridLayout(1, 1));
        mainpanel.add(transPanel);        
    }//GEN-LAST:event_lbTransactionMouseClicked

    private void lbPassBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPassBookMouseClicked
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.revalidate();
        mainpanel.repaint();
        PassBookManage pBManage = new PassBookManage(customer);
        mainpanel.setLayout(new GridLayout(1,1));
        mainpanel.add(pBManage);
    }//GEN-LAST:event_lbPassBookMouseClicked

    private void lbAccountManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountManageMouseClicked
        mainpanel.removeAll();
        mainpanel.revalidate();
        mainpanel.repaint();
        AccountManage accPanel = new AccountManage(customer);
        mainpanel.setLayout(new GridLayout(1,1));
        mainpanel.add(accPanel);
        mainpanel.revalidate();
        mainpanel.repaint();
    }//GEN-LAST:event_lbAccountManageMouseClicked

    private void lbLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogOutMouseClicked
        // TODO add your handling code here:
        LoginUI login = new LoginUI();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbLogOutMouseClicked

    private void lbTransactionHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTransactionHistoryMouseClicked
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.revalidate();
        mainpanel.repaint();
        TransactionUserManage transPanel = new TransactionUserManage(customer);
        System.out.println("home : " +customer.getCustomerID());
        mainpanel.setLayout(new GridLayout(1,1));
        mainpanel.add(transPanel);
        mainpanel.revalidate();
        mainpanel.repaint();
    }//GEN-LAST:event_lbTransactionHistoryMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            // Set Windows look and feel
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chao;
    private javax.swing.JPanel Contain;
    private javax.swing.JPanel Features;
    private javax.swing.JPanel Others;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbAccountManage;
    private javax.swing.JLabel lbHello;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbLoan;
    private javax.swing.JLabel lbLogOut;
    private javax.swing.JLabel lbPassBook;
    private javax.swing.JLabel lbTransaction;
    private javax.swing.JLabel lbTransactionHistory;
    private javax.swing.JPanel mainpanel;
    private main.Mytextfield mytextfield1;
    // End of variables declaration//GEN-END:variables
}
