/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author DUC PHU
 */
public class TransactionResult extends javax.swing.JPanel {

    /**
     * Creates new form TransactionResult
     */
    private JPanel mainpanel;
    private CustomerDTO customer;
    private TransactionHistoryDTO history;
    private CustomerBUS cusBus = new CustomerBUS();
    private Validator doValid = new Validator();
    public TransactionResult(JPanel mainpanel, CustomerDTO customer, TransactionHistoryDTO history) {
        this.mainpanel = mainpanel;
        this.customer = customer;
        this.history = history;
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

        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSenderName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSenderAcc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfReceiverName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfReceiverAcc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSenderRemain = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfContent = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        lbTransDate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfTransID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Back.setText("Quay Về Trang Chuyển Tiền");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Người Chuyển : ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Giao Dịch Thành Công");

        tfSenderName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfSenderName.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tài Khoản Nguồn : ");

        tfSenderAcc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfSenderAcc.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Người Nhận : ");

        tfReceiverName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfReceiverName.setText("jTextField1");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tài Khoản Đích : ");

        tfReceiverAcc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfReceiverAcc.setText("jTextField1");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Số Tiền (lệ phí 1%) : ");

        tfAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfAmount.setText("jTextField1");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Số Dư còn lại");

        tfSenderRemain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfSenderRemain.setText("jTextField1");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Nội Dung : ");

        tfContent.setColumns(20);
        tfContent.setRows(5);
        jScrollPane1.setViewportView(tfContent);
        tfContent.setText(history.getTransContent());
        tfContent.setWrapStyleWord(true);
        tfContent.setLineWrap(true);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Ngày Chuyển : ");

        lbTransDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTransDate.setText("dd/mm/yyyy");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Giao Dịch Mã : ");

        tfTransID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tfTransID.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(tfSenderName)
                    .addComponent(jLabel3)
                    .addComponent(tfSenderAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(tfAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(tfReceiverAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(tfReceiverName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(tfSenderRemain, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(lbTransDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(378, 378, 378))
            .addGroup(layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTransID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(tfTransID))
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfSenderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfReceiverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSenderAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfReceiverAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSenderRemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTransDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(32, 32, 32))
        );

        tfSenderName.setText(getSenderName());
        tfSenderAcc.setText(history.getSenderAcc());
        tfReceiverName.setText(getReceiverName());
        tfReceiverAcc.setText(history.getReceiverAcc());
        tfAmount.setText(doValid.formatMoney(history.getTransAmount()));
        tfSenderRemain.setText(doValid.formatMoney(history.getSenderRemain()));
        lbTransDate.setText(TransDate());
        tfTransID.setText(history.getTransID());
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        mainpanel.removeAll();
        mainpanel.revalidate();
        mainpanel.repaint();
        TransactionManage transPanel = new TransactionManage(mainpanel, customer);
        mainpanel.setLayout(new GridLayout(1, 1));
        mainpanel.add(transPanel);   
    }//GEN-LAST:event_BackActionPerformed

    
    public String getSenderName()
    {
        return customer.getCusFullName();
    }
    
    public String getReceiverName()
    {
        return cusBus.getCustomer(history.getReceiverID()).getCusFullName();
    }
    
    public String TransDate()
    {
        return doValid.toUIDate(history.getTransDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTransDate;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextArea tfContent;
    private javax.swing.JTextField tfReceiverAcc;
    private javax.swing.JTextField tfReceiverName;
    private javax.swing.JTextField tfSenderAcc;
    private javax.swing.JTextField tfSenderName;
    private javax.swing.JTextField tfSenderRemain;
    private javax.swing.JLabel tfTransID;
    // End of variables declaration//GEN-END:variables
}
