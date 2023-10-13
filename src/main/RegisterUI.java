/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RegisterUI extends javax.swing.JFrame {

    public RegisterUI() {
        initComponents();
    }
    
    static Validator doValid = new Validator();
    static CustomerBUS cusBUS =  new CustomerBUS();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbRegister = new javax.swing.JButton();
        lbSwitchToLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pfPassword = new javax.swing.JPasswordField();
        lbAcountName4 = new javax.swing.JLabel();
        lbAcountName3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbPasswordWarn = new javax.swing.JLabel();
        lbAcountName7 = new javax.swing.JLabel();
        lbAcountName = new javax.swing.JLabel();
        lbUsernameWarn = new javax.swing.JLabel();
        tfAccountName = new javax.swing.JTextField();
        rbtnFemale = new javax.swing.JRadioButton();
        lbBirthDayWarn = new javax.swing.JLabel();
        pfRePassword = new javax.swing.JPasswordField();
        lbEmailWarn1 = new javax.swing.JLabel();
        lbLastNameWarn = new javax.swing.JLabel();
        tfBirthDay = new javax.swing.JTextField();
        lbRePasswordWarn1 = new javax.swing.JLabel();
        lbAcountName2 = new javax.swing.JLabel();
        lbAcountName5 = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        lbPhoneWarn = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        lbAcountName6 = new javax.swing.JLabel();
        lbAcountName1 = new javax.swing.JLabel();
        lbFirstNameWarn = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();

        genderBtnGroup.add(rbtnMale);
        genderBtnGroup.add(rbtnFemale);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 243, 193));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(71, 108, 155));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sugobank-icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 221, 214));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("So Gu Bank");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(236, 249, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Ký");

        jbRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbRegister.setText("Đăng Ký");
        jbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisterActionPerformed(evt);
            }
        });

        lbSwitchToLogin.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lbSwitchToLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSwitchToLogin.setText("Đã có Tài Khoản ? Đăng Nhập");
        lbSwitchToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSwitchToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSwitchToLoginMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(236, 249, 255));

        pfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfPasswordFocusLost(evt);
            }
        });
        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfPasswordKeyPressed(evt);
            }
        });

        lbAcountName4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName4.setText("Ngày Sinh");

        lbAcountName3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName3.setText("Số Điện Thoại");

        tfEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });

        lbPasswordWarn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbPasswordWarn.setForeground(new java.awt.Color(255, 33, 71));

        lbAcountName7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName7.setText("Nhập lại Mật Khẩu");

        lbAcountName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName.setText("Email");

        lbUsernameWarn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbUsernameWarn.setForeground(new java.awt.Color(255, 33, 71));

        tfAccountName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfAccountName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAccountNameFocusLost(evt);
            }
        });
        tfAccountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccountNameActionPerformed(evt);
            }
        });
        tfAccountName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAccountNameKeyPressed(evt);
            }
        });

        rbtnFemale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtnFemale.setText("Nữ");
        rbtnFemale.setActionCommand("Nữ");

        lbBirthDayWarn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbBirthDayWarn.setForeground(new java.awt.Color(255, 33, 71));

        pfRePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfRePasswordFocusLost(evt);
            }
        });
        pfRePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfRePasswordKeyPressed(evt);
            }
        });

        lbEmailWarn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEmailWarn1.setForeground(new java.awt.Color(255, 33, 71));

        lbLastNameWarn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbLastNameWarn.setForeground(new java.awt.Color(255, 33, 71));

        tfBirthDay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfBirthDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBirthDayFocusLost(evt);
            }
        });
        tfBirthDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBirthDayActionPerformed(evt);
            }
        });
        tfBirthDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBirthDayKeyPressed(evt);
            }
        });

        lbRePasswordWarn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRePasswordWarn1.setForeground(new java.awt.Color(255, 33, 71));

        lbAcountName2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName2.setText("Giới Tính");

        lbAcountName5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName5.setText("Tên Tài Khoản");

        rbtnMale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtnMale.setText("Nam");
        rbtnMale.setSelected(true);
        rbtnMale.setActionCommand("Nam");

        lbPhoneWarn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbPhoneWarn.setForeground(new java.awt.Color(255, 33, 71));

        tfFullName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFullNameActionPerformed(evt);
            }
        });

        lbAcountName6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName6.setText("Mật Khẩu");

        lbAcountName1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcountName1.setText("Tên đầy đủ");

        lbFirstNameWarn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbFirstNameWarn.setForeground(new java.awt.Color(255, 33, 71));

        tfPhone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });
        tfPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPhoneKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbUsernameWarn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAcountName5)
                            .addComponent(tfAccountName)
                            .addComponent(lbAcountName6)
                            .addComponent(pfPassword)
                            .addComponent(lbPasswordWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEmail)
                            .addComponent(lbAcountName)
                            .addComponent(lbEmailWarn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAcountName7)
                            .addComponent(lbRePasswordWarn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbAcountName3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAcountName1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFirstNameWarn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPhoneWarn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbAcountName2)
                                .addComponent(lbAcountName4)
                                .addComponent(lbLastNameWarn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbBirthDayWarn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbAcountName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFirstNameWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbAcountName2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnMale)
                            .addComponent(rbtnFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLastNameWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbAcountName3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbAcountName4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbPhoneWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAcountName5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAcountName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmailWarn1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsernameWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAcountName7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAcountName6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRePasswordWarn1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPasswordWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbBirthDayWarn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lbSwitchToLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSwitchToLogin)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFullNameActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void tfAccountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccountNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccountNameActionPerformed

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        
        String usernameTest = tfAccountName.getText();
        String emailTest = tfEmail.getText();
        
        char[] passwordChars = pfPassword.getPassword();
        String password = String.valueOf(passwordChars);
        
        char[] confirmPasswordChars = pfRePassword.getPassword();
        String confirmPassword = String.valueOf(confirmPasswordChars);
        
        String dateString = tfBirthDay.getText();
        
        String fullName = tfFullName.getText();
        String[] nameParts = fullName.trim().split("\\s+");
        String lastName = nameParts[nameParts.length - 1];
        String firstName = String.join(" ", Arrays.copyOfRange(nameParts, 0, nameParts.length - 1));
        
        if(usernameTest.trim().isEmpty()
                || doValid.isPassword(password) == false
                || doValid.isPasswordMatch(password, confirmPassword) == false
                || doValid.isEmail(emailTest) == false
                || !"DEFAULT".equals(doValid.isValidDate(dateString)))
        {
            JOptionPane.showMessageDialog(null, "Thông tin đăng ký chưa hợp lệ");
        }
        else if(doValid.isExistedUsername(usernameTest))
        {
            JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại");
        }
        else if(doValid.isExistedEmail(emailTest))
        {
            JOptionPane.showMessageDialog(null, "Email đã được sử dụng");

        }
        else{
            
            
            
            cusBUS.readData();
            CustomerDTO customerTemp = new CustomerDTO();
            customerTemp.setCustomerID(cusBUS.generateID());
            
            String gender = genderBtnGroup.getSelection().getActionCommand();
            
            customerTemp.setCusFirstName(firstName);
            customerTemp.setCusLastName(lastName);
            customerTemp.setPhone(tfPhone.getText());
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dateString, formatter);
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate formattedDate = LocalDate.parse(date.format(formatter));
            customerTemp.setBirthDay(formattedDate);
            
            customerTemp.setUsername(tfAccountName.getText());
            customerTemp.setPassword(password);
            customerTemp.setEmail(tfEmail.getText());
            customerTemp.setGender(gender);
            LocalDate dayCreated = LocalDate.now();
            customerTemp.setDayCreated(dayCreated);
            
            cusBUS.add(customerTemp);
            JOptionPane.showMessageDialog(null, "Đăng Ký thành công");
            LoginUI login = new LoginUI();
            login.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void lbSwitchToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSwitchToLoginMouseClicked
        LoginUI logFrame = new LoginUI();
        logFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbSwitchToLoginMouseClicked

    private void tfPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPhoneKeyPressed

        if( (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')  || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE)
        {
            tfPhone.setEditable(true);
        }
        else
            tfPhone.setEditable(false);
    }//GEN-LAST:event_tfPhoneKeyPressed

    private void tfAccountNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAccountNameFocusLost
        String usernameTest = tfAccountName.getText();
        
        if(usernameTest.trim().isEmpty())
        {
            lbUsernameWarn.setText("Vui lòng nhập tài khoản");
        }
        else if(doValid.isExistedUsername(usernameTest))
        {
            lbUsernameWarn.setText("Tài khoản đã tồn tại");
        }
    }//GEN-LAST:event_tfAccountNameFocusLost

    private void tfAccountNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAccountNameKeyPressed
        lbUsernameWarn.setText("");
    }//GEN-LAST:event_tfAccountNameKeyPressed

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        
        String email = tfEmail.getText();
        if(doValid.isEmail(email) == false)
        {
            lbEmailWarn1.setText("Email không hợp lệ");
        }
        else if(doValid.isExistedEmail(email))
        {
            lbEmailWarn1.setText("Email đã được sử dụng");
        }
    }//GEN-LAST:event_tfEmailFocusLost

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        lbEmailWarn1.setText("");
    }//GEN-LAST:event_tfEmailKeyPressed

    private void pfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPasswordFocusLost
        char[] passwordChars = pfPassword.getPassword();
        String password = String.valueOf(passwordChars);
        
        if(doValid.isPassword(password) == false)
        {
            lbPasswordWarn.setText("Mật khẩu phải từ 8 ký tự trở lên");
        }
    }//GEN-LAST:event_pfPasswordFocusLost

    private void pfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPasswordKeyPressed
        lbPasswordWarn.setText("");
    }//GEN-LAST:event_pfPasswordKeyPressed

    private void pfRePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfRePasswordFocusLost
        char[] passwordChars = pfPassword.getPassword();
        String password = String.valueOf(passwordChars);
        char[] confirmPasswordChars = pfRePassword.getPassword();
        String confirmPassword = String.valueOf(confirmPasswordChars);
        
        
        if(doValid.isPasswordMatch(password, confirmPassword) == false
                && doValid.isPassword(password))
        {
            lbRePasswordWarn1.setText("Mật khẩu nhập lại chưa chính xác");
        }
        else if(doValid.isPassword(password) == false)
            lbRePasswordWarn1.setText("Vui lòng nhập đúng định dạng mật khẩu");
    }//GEN-LAST:event_pfRePasswordFocusLost

    private void pfRePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfRePasswordKeyPressed
        lbRePasswordWarn1.setText("");
    }//GEN-LAST:event_pfRePasswordKeyPressed

    private void tfBirthDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBirthDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBirthDayActionPerformed

    private void tfBirthDayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBirthDayKeyPressed
        // TODO add your handling code here:
        lbBirthDayWarn.setText("");
    }//GEN-LAST:event_tfBirthDayKeyPressed

    private void tfBirthDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBirthDayFocusLost
        String dateString = tfBirthDay.getText();
        if("ILLEGAL".equals(doValid.isValidDate(dateString)))
        {
            lbBirthDayWarn.setText("Bạn phải trên 18 tuổi");
        }
        else if ("ERROR".equals(doValid.isValidDate(dateString)))
        {
            lbBirthDayWarn.setText("Nhập ngày theo định dạng dd/mm/yyyy");
        }
    }//GEN-LAST:event_tfBirthDayFocusLost

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
                new RegisterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbRegister;
    private javax.swing.JLabel lbAcountName;
    private javax.swing.JLabel lbAcountName1;
    private javax.swing.JLabel lbAcountName2;
    private javax.swing.JLabel lbAcountName3;
    private javax.swing.JLabel lbAcountName4;
    private javax.swing.JLabel lbAcountName5;
    private javax.swing.JLabel lbAcountName6;
    private javax.swing.JLabel lbAcountName7;
    private javax.swing.JLabel lbBirthDayWarn;
    private javax.swing.JLabel lbEmailWarn1;
    private javax.swing.JLabel lbFirstNameWarn;
    private javax.swing.JLabel lbLastNameWarn;
    private javax.swing.JLabel lbPasswordWarn;
    private javax.swing.JLabel lbPhoneWarn;
    private javax.swing.JLabel lbRePasswordWarn1;
    private javax.swing.JLabel lbSwitchToLogin;
    private javax.swing.JLabel lbUsernameWarn;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPasswordField pfRePassword;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField tfAccountName;
    private javax.swing.JTextField tfBirthDay;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
