/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author DUC PHU
 */
public class TransactionUserForm extends javax.swing.JPanel {

    /**
     * Creates new form TransactionUserForm
     */
    private TransactionUser transUser;
    static Validator doValid = new Validator();
    public TransactionUserForm(TransactionUser transUser) {
        this.transUser = transUser;
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

        lbName = new javax.swing.JLabel();
        lbTransDate = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        lbRemain = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lbName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbName.setText("Test Test Test Test");

        lbTransDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTransDate.setText("dd/mm/yyyy");

        lbAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAmount.setText("999.999.999.999");

        lbRemain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRemain.setText("999.999.999.999");

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-icon-20.png"))); // NOI18N
        btnEdit.setText("Chi Tiết");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lbTransDate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lbAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lbRemain, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnEdit)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(lbTransDate)
                .addComponent(lbAmount)
                .addComponent(lbRemain)
                .addComponent(btnEdit))
        );

        lbName.setText(getTargetName());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        lbTransDate.setText(doValid.toUIDate(transUser.getTransDate()));
        lbAmount.setText(transUser.getAmount());
        lbRemain.setText(transUser.getRemain());
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        TransUserInfo transInfo = new TransUserInfo(transUser);
        transInfo.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    public String getTargetName()
    {
        CustomerBUS cusBus = new CustomerBUS();
        CustomerDTO customer = new CustomerDTO();
        customer = cusBus.getCustomer(transUser.getTargetID());
        return customer.getCusFullName();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRemain;
    private javax.swing.JLabel lbTransDate;
    // End of variables declaration//GEN-END:variables
}
