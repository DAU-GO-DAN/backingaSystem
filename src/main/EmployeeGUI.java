package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class EmployeeGUI extends javax.swing.JPanel {
    
    EmployeeBUS bus = new EmployeeBUS();
    
    public EmployeeGUI() {
        initComponents();
    }

    //GUI CODE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        empInforPanel = new javax.swing.JPanel();
        lMain = new javax.swing.JLabel();
        lEmpFirstName = new javax.swing.JLabel();
        lEmpLastName = new javax.swing.JLabel();
        lPhone = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lBranch = new javax.swing.JLabel();
        lGender = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        rbGender1 = new javax.swing.JRadioButton();
        rbGender2 = new javax.swing.JRadioButton();
        ControlPanel = new javax.swing.JPanel();
        bAdd = new javax.swing.JButton();
        bDel = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bPrintList = new javax.swing.JButton();
        lSort = new javax.swing.JLabel();
        lSearch = new javax.swing.JLabel();
        cbSort = new javax.swing.JComboBox<>();
        cbSearch = new javax.swing.JComboBox<>();
        bSort = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        bPrintExcel = new javax.swing.JButton();
        bPrintPDF = new javax.swing.JButton();
        bImport = new javax.swing.JButton();
        txtAdress = new javax.swing.JTextField();
        lBirthday = new javax.swing.JLabel();
        cbBirthday2 = new javax.swing.JComboBox<>();
        cbBirthday1 = new javax.swing.JComboBox<>();
        cbBirthday3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfor = new javax.swing.JTable();
        lSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();

        empInforPanel.setBackground(new java.awt.Color(255, 255, 153));
        empInforPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        lMain.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lMain.setText("THÔNG TIN NHÂN VIÊN");

        lEmpFirstName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lEmpFirstName.setText("TÊN:");

        lEmpLastName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lEmpLastName.setText("HỌ:");

        lPhone.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lPhone.setText("SỐ ĐIỆN THOẠI:");

        lAddress.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lAddress.setText("ĐỊA CHỈ:");

        lBranch.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lBranch.setText("CHI NHÁNH:");

        lGender.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lGender.setText("GIỚI TÍNH:");

        txtLastName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastNameKeyPressed(evt);
            }
        });

        txtFirstName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyPressed(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });

        txtBranch.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        buttonGroup1.add(rbGender1);
        rbGender1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        rbGender1.setSelected(true);
        rbGender1.setText("Nam");

        buttonGroup1.add(rbGender2);
        rbGender2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        rbGender2.setText("Nữ");

        ControlPanel.setBackground(new java.awt.Color(255, 204, 102));
        ControlPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        bAdd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/add.png"))); // NOI18N
        bAdd.setText("Thêm");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/del.png"))); // NOI18N
        bDel.setText("Xóa");
        bDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelActionPerformed(evt);
            }
        });

        bEdit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/pen.png"))); // NOI18N
        bEdit.setText("Sửa");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bPrintList.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bPrintList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/eye.png"))); // NOI18N
        bPrintList.setText("Xem");
        bPrintList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintListActionPerformed(evt);
            }
        });

        lSort.setBackground(new java.awt.Color(0, 0, 0));
        lSort.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lSort.setText("Sắp xếp:");

        lSearch.setBackground(new java.awt.Color(0, 0, 0));
        lSearch.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lSearch.setText("Tìm kiếm:");

        cbSort.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã", "Tên", "Lương" }));

        cbSearch.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã", "Tên" }));

        bSort.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bSort.setText("Sort");
        bSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSortActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        bSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/kinhlup.png"))); // NOI18N
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        bPrintExcel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bPrintExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/excel.png"))); // NOI18N
        bPrintExcel.setText("In Excel");
        bPrintExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintExcelActionPerformed(evt);
            }
        });

        bPrintPDF.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bPrintPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/pdf.png"))); // NOI18N
        bPrintPDF.setText("In PDF");
        bPrintPDF.setToolTipText("");
        bPrintPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintPDFActionPerformed(evt);
            }
        });

        bImport.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bImport.setText("Nhập dữ liệu từ excel");
        bImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lSearch))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lSort)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbSort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bSort)
                .addGap(75, 75, 75))
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSearch))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bPrintExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPrintList))
                        .addGap(34, 34, 34)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bPrintPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bImport, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bEdit)
                    .addComponent(bDel))
                .addGap(18, 18, 18)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPrintList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPrintExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPrintPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(bImport, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSort)
                    .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSort))
                .addGap(17, 17, 17)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(lSearch)
                        .addGap(10, 10, 10))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        txtAdress.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        lBirthday.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lBirthday.setText("NGÀY SINH:");

        cbBirthday2.setBackground(new java.awt.Color(204, 204, 204));
        cbBirthday2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbBirthday2.setForeground(new java.awt.Color(255, 204, 51));
        cbBirthday2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbBirthday1.setBackground(new java.awt.Color(204, 204, 204));
        cbBirthday1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbBirthday1.setForeground(new java.awt.Color(255, 204, 51));
        cbBirthday1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbBirthday3.setBackground(new java.awt.Color(204, 204, 204));
        cbBirthday3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbBirthday3.setForeground(new java.awt.Color(255, 204, 51));
        cbBirthday3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));

        tableInfor.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tableInfor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Địa chỉ", "Lương", "Chi nhánh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInfor);

        lSalary.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lSalary.setText("LƯƠNG:");

        txtSalary.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        javax.swing.GroupLayout empInforPanelLayout = new javax.swing.GroupLayout(empInforPanel);
        empInforPanel.setLayout(empInforPanelLayout);
        empInforPanelLayout.setHorizontalGroup(
            empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empInforPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lMain)
                .addGap(368, 368, 368))
            .addGroup(empInforPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empInforPanelLayout.createSequentialGroup()
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empInforPanelLayout.createSequentialGroup()
                                    .addComponent(lBranch)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBranch))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empInforPanelLayout.createSequentialGroup()
                                    .addComponent(lAddress)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAdress))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empInforPanelLayout.createSequentialGroup()
                                    .addComponent(lBirthday)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbBirthday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbBirthday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbBirthday3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lGender)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbGender2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empInforPanelLayout.createSequentialGroup()
                                    .addComponent(lEmpLastName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLastName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lEmpFirstName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empInforPanelLayout.createSequentialGroup()
                                    .addComponent(lPhone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPhone)))
                            .addGroup(empInforPanelLayout.createSequentialGroup()
                                .addComponent(lSalary)
                                .addGap(18, 18, 18)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empInforPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        empInforPanelLayout.setVerticalGroup(
            empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empInforPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMain)
                .addGap(18, 18, 18)
                .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empInforPanelLayout.createSequentialGroup()
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEmpLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lEmpFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lBirthday)
                            .addComponent(cbBirthday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBirthday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBirthday3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lGender)
                            .addComponent(rbGender1)
                            .addComponent(rbGender2))
                        .addGap(18, 18, 18)
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(empInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lBranch)
                            .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empInforPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empInforPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //KHÔNG VIẾT SỐ VÀO TÊN
    private void txtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyPressed
        if(evt.getKeyChar()>='A' || evt.getKeyChar()>='a' || evt.getKeyChar()>='Z' || evt.getKeyChar()>='z' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode() == evt.VK_SPACE){
            txtLastName.setEditable(true);
        }else{
            txtLastName.setEditable(false);
        }
    }//GEN-LAST:event_txtLastNameKeyPressed
    //KHÔNG VIẾT SỐ VÀO HỌ & TÊN LÓT
    private void txtFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyPressed
        if(evt.getKeyChar()>='A' || evt.getKeyChar()>='a' || evt.getKeyChar()>='Z' || evt.getKeyChar()>='z' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode() == evt.VK_SPACE){
            txtFirstName.setEditable(true);
        }else{
            txtFirstName.setEditable(false);
        }
    }//GEN-LAST:event_txtFirstNameKeyPressed
    //KHÔNG VIẾT CHỮ VÀO SDT
    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' || evt.getKeyCode() == evt.VK_BACK_SPACE){
            txtPhone.setEditable(true);
        }
        else{
            txtPhone.setEditable(false);
        }
    }//GEN-LAST:event_txtPhoneKeyPressed
    //XÓA
    private void bDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelActionPerformed
        
        String empIDTemp = (String) tableInfor.getValueAt(tableInfor.getSelectedRow(), 0);
        bus.delete(empIDTemp);
    }//GEN-LAST:event_bDelActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed

    }//GEN-LAST:event_txtLastNameActionPerformed
    //THÊM
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
        EmployeeDTO emp = new EmployeeDTO();
        if(!txtLastName.getText().isEmpty() && !txtFirstName.getText().isEmpty() 
                && !txtPhone.getText().isEmpty() && !txtAdress.getText().isEmpty() && !txtBranch.getText().isEmpty()
                && bus.checkValidDate(cbBirthday3.getSelectedItem()+"-"+cbBirthday2.getSelectedItem()+"-"+cbBirthday1.getSelectedItem())){
            emp.setEmpID(bus.generateID());
            emp.setEmpLastName(bus.normalization(txtLastName.getText()));
            emp.setEmpFirstName(bus.normalization(txtFirstName.getText()));
            emp.setPhone(bus.normalization(txtPhone.getText()));
            int x = Integer.parseInt((String) cbBirthday1.getSelectedItem());
            int y = Integer.parseInt((String) cbBirthday2.getSelectedItem());
            int z = Integer.parseInt((String) cbBirthday3.getSelectedItem());
            LocalDate localDate = LocalDate.of(z, y, x);
            emp.setBirthday(localDate);
            localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            emp.setAddress(bus.normalization(txtAdress.getText()));
            emp.setGender(rbGender1.isSelected() ? rbGender1.getText() : rbGender2.getText());
            emp.setSalary(Long.parseLong(txtSalary.getText()));
            emp.setBranch(bus.normalization(txtBranch.getText()));
            bus.add(emp);
        }else{
            JOptionPane.showMessageDialog(null, "Not enough information or invalid date");
        }
    }//GEN-LAST:event_bAddActionPerformed
    //IN DANH SÁCH RA BẢNG
    private void bPrintListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintListActionPerformed
        bus.readData();
        tableInfor.setModel(bus.printTable());
    }//GEN-LAST:event_bPrintListActionPerformed
    //SẮP XẾP
    private void bSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSortActionPerformed
        String s = (String) cbSort.getSelectedItem();
        tableInfor.setModel(bus.sort(s));
    }//GEN-LAST:event_bSortActionPerformed
    //TÌM KIẾM
    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        String option = (String) cbSearch.getSelectedItem();
        String keyword = txtSearch.getText();
        tableInfor.setModel(bus.search(option, keyword));
    }//GEN-LAST:event_bSearchActionPerformed
    //SỬA
    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        String s = (String) tableInfor.getValueAt(tableInfor.getSelectedRow(), 0);
        EmployeeDTO empTemp = bus.searchByID(s);
        EmployeeInfo empInfo = new EmployeeInfo(empTemp);
        empInfo.setVisible(true);
    }//GEN-LAST:event_bEditActionPerformed
    //In excel
    private void bPrintExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintExcelActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        PrintGUI f = new PrintGUI();
        int x = fileChooser.showSaveDialog(f);
        if(x==JFileChooser.APPROVE_OPTION){
            bus.printExcel(fileChooser.getSelectedFile().getParent(), fileChooser.getSelectedFile().getName());
            f.dispose();
        }
    }//GEN-LAST:event_bPrintExcelActionPerformed
    //In pdf dạng bảng
    private void bPrintPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintPDFActionPerformed
        bus.printPDF(tableInfor);
    }//GEN-LAST:event_bPrintPDFActionPerformed

    private void bImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        PrintGUI f = new PrintGUI();
        int x = fileChooser.showOpenDialog(f);
        if(x==JFileChooser.APPROVE_OPTION){
            String namePath = fileChooser.getSelectedFile().getParent() + fileChooser.getSelectedFile().getName();
            bus.importData(tableInfor, namePath);
        }
    }//GEN-LAST:event_bImportActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(1027,700);
                f.setLocationRelativeTo(null);
                JPanel p = new EmployeeGUI();
                f.add(p);
                f.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDel;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bImport;
    private javax.swing.JButton bPrintExcel;
    private javax.swing.JButton bPrintList;
    private javax.swing.JButton bPrintPDF;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBirthday1;
    private javax.swing.JComboBox<String> cbBirthday2;
    private javax.swing.JComboBox<String> cbBirthday3;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JPanel empInforPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lBirthday;
    private javax.swing.JLabel lBranch;
    private javax.swing.JLabel lEmpFirstName;
    private javax.swing.JLabel lEmpLastName;
    private javax.swing.JLabel lGender;
    private javax.swing.JLabel lMain;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lSalary;
    private javax.swing.JLabel lSearch;
    private javax.swing.JLabel lSort;
    private javax.swing.JRadioButton rbGender1;
    private javax.swing.JRadioButton rbGender2;
    private javax.swing.JTable tableInfor;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
