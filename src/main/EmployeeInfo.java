/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class EmployeeInfo extends javax.swing.JFrame {
    
    EmployeeBUS bus = new EmployeeBUS();
    DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public EmployeeInfo(EmployeeDTO emp) {
        initComponents();
        setValue(emp);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    
    
    //-------------GUI-------------//
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lEmpLastname = new javax.swing.JLabel();
        lPhone = new javax.swing.JLabel();
        lEmpFirstname = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lBranch = new javax.swing.JLabel();
        lBirthday = new javax.swing.JLabel();
        lGender = new javax.swing.JLabel();
        lMain = new javax.swing.JLabel();
        lEmpID = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rbMaleGender = new javax.swing.JRadioButton();
        rbFemaleGender = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        lEmpIDInfor = new javax.swing.JLabel();
        bSave = new javax.swing.JButton();
        bDelInfo = new javax.swing.JButton();
        ldvt = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lSalary = new javax.swing.JLabel();

        jTextField4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lEmpLastname.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lEmpLastname.setText("HỌ VÀ TÊN LÓT:");

        lPhone.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lPhone.setText("SỐ ĐIỆN THOẠI:");

        lEmpFirstname.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lEmpFirstname.setText("TÊN:");

        lAddress.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lAddress.setText("ĐỊA CHỈ:");

        lBranch.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lBranch.setText("CHI NHÁNH:");

        lBirthday.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lBirthday.setText("NGÀY SINH:");

        lGender.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lGender.setText("GIỚI  TÍNH:");

        lMain.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lMain.setText("THÔNG TIN KHÁCH HÀNG");

        lEmpID.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lEmpID.setText("ID:");

        txtLastname.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });

        txtBirthday.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtFirstname.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtBranch.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBranchActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMaleGender);
        rbMaleGender.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        rbMaleGender.setText("Nam");

        buttonGroup1.add(rbFemaleGender);
        rbFemaleGender.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        rbFemaleGender.setText("Nữ");

        txtPhone.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        lEmpIDInfor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lEmpIDInfor.setText("idididididididid");

        bSave.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        bSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/save24.png"))); // NOI18N
        bSave.setText("LƯU");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bDelInfo.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        bDelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/del24.png"))); // NOI18N
        bDelInfo.setText("XÓA");
        bDelInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelInfoActionPerformed(evt);
            }
        });

        ldvt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        ldvt.setText("vnd");

        txtSalary.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        lSalary.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lSalary.setText("LƯƠNG:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMain)
                .addGap(347, 347, 347))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lEmpID)
                        .addGap(18, 18, 18)
                        .addComponent(lEmpIDInfor)
                        .addGap(415, 415, 415))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lEmpLastname)
                                .addGap(18, 18, 18)
                                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lEmpFirstname)
                                    .addComponent(lGender, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMaleGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(rbFemaleGender))
                                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSalary))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ldvt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lBranch)
                                    .addComponent(lAddress)
                                    .addComponent(lBirthday)
                                    .addComponent(bDelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPhone)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lMain)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmpID)
                    .addComponent(lEmpIDInfor))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEmpLastname)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEmpFirstname)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lBirthday)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbFemaleGender)
                            .addComponent(rbMaleGender)
                            .addComponent(lGender))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lBranch)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ldvt)
                                .addComponent(lSalary)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchActionPerformed

    
    //-------------CONTROLLER---------//
    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn lưu");
        if(choice == JOptionPane.YES_OPTION){
            EmployeeDTO emp = new EmployeeDTO();
            String ID = lEmpIDInfor.getText();
            emp.setEmpID(lEmpIDInfor.getText());
            emp.setEmpFirstName(bus.normalization(txtFirstname.getText()));
            emp.setEmpLastName(bus.normalization(txtLastname.getText()));
            emp.setAddress(bus.normalization(txtAddress.getText()));
            emp.setBranch(bus.normalization(txtBranch.getText()));
            emp.setGender(rbFemaleGender.isSelected() ? rbFemaleGender.getText() : rbMaleGender.getText());
            emp.setSalary(Long.parseLong(txtSalary.getText()));
            emp.setPhone(bus.normalization(txtPhone.getText()));
            LocalDate localDate = LocalDate.parse(txtBirthday.getText());
            emp.setBirthday(localDate);
            bus.edit(emp, ID);
            this.dispose();
        }
        else{
            
        }
        
    }//GEN-LAST:event_bSaveActionPerformed

    private void bDelInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelInfoActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa tất cả các thông tin");
        if(choice == JOptionPane.YES_OPTION){
            txtLastname.setText("");
            txtFirstname.setText("");
            txtPhone.setText("");
            txtAddress.setText("");
            txtBirthday.setText("");
            txtBranch.setText("");
            txtSalary.setText("");
            rbFemaleGender.setSelected(false);
            rbMaleGender.setSelected(false);
        }else if(choice == JOptionPane.NO_OPTION){}
    }//GEN-LAST:event_bDelInfoActionPerformed

    //------------FUNCTION--------------//
    public void setValue(EmployeeDTO emp){
        lEmpIDInfor.setText(emp.getEmpID());
        txtLastname.setText(emp.getEmpLastName());
        txtFirstname.setText(emp.getEmpFirstName());
        if(emp.getGender().equals("Nam")){
            rbMaleGender.setSelected(true);
        }else{
            rbFemaleGender.setSelected(true);
        }
        txtBirthday.setText(emp.getBirthday().toString());
        txtPhone.setText(emp.getPhone());
        txtAddress.setText(emp.getAddress());
        txtBranch.setText(emp.getBranch());
        txtSalary.setText(emp.getSalary()+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelInfo;
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lBirthday;
    private javax.swing.JLabel lBranch;
    private javax.swing.JLabel lEmpFirstname;
    private javax.swing.JLabel lEmpID;
    private javax.swing.JLabel lEmpIDInfor;
    private javax.swing.JLabel lEmpLastname;
    private javax.swing.JLabel lGender;
    private javax.swing.JLabel lMain;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lSalary;
    private javax.swing.JLabel ldvt;
    private javax.swing.JRadioButton rbFemaleGender;
    private javax.swing.JRadioButton rbMaleGender;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
