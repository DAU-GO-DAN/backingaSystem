package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeBUS {
    static ArrayList<EmployeeDTO> empAL = new ArrayList<EmployeeDTO>();
    static EmployeeDAO empDAO = new EmployeeDAO();
    private BranchBUS braBUS = new BranchBUS();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public EmployeeBUS() {
    }   
    
    public void readData(){
        if(empAL==null) empAL = new ArrayList<EmployeeDTO>();
        empAL = empDAO.readDataFromSQL();
    }
    
    public void add(EmployeeDTO emp){
        empDAO.add(emp);
        empAL.add(emp);
    }
    
    public void delete(String ID){
        empDAO.delete(ID);
        empAL.removeIf(emp -> emp.getEmpID().equals(ID));
    }
    
    public void edit(EmployeeDTO empTemp, String ID){
        empDAO.edit(empTemp, ID);
        empAL.removeIf(emp -> emp.getEmpID().equals(ID));
        empAL.add(empTemp);
    }

    public DefaultTableModel sort(String option){
        DefaultTableModel model = new DefaultTableModel();
        empAL = empDAO.sort(option);
        model.addColumn("Mã nhân viên");
        model.addColumn("Họ");
        model.addColumn("Tên");
        model.addColumn("Ngày sinh");
        model.addColumn("Giới Tính");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Lương");
        model.addColumn("Chi nhánh");
        for (EmployeeDTO emp : empAL) {
            Vector row = new Vector<>();
            row.add(emp.getEmpID());
            row.add(emp.getEmpLastName());
            row.add(emp.getEmpFirstName());
            row.add(emp.getBirthday().format(formatter));
            row.add(emp.getGender());
            row.add(emp.getPhone());
            row.add(emp.getAddress());
            row.add(emp.getSalary());
            row.add(changeIDToName(emp.getBranch()));
            model.addRow(row);
        }
        return model;
    }
    
    public EmployeeDTO searchByID(String ID){
        for (EmployeeDTO emp : empAL) {
            if(emp.getEmpID().equals(ID)) return emp;
        }
        return null;
    }
    
    public DefaultTableModel search(String option, String keyword){
        DefaultTableModel model = new DefaultTableModel();
        try{
            model.addColumn("Mã nhân viên");
            model.addColumn("Họ");
            model.addColumn("Tên");
            model.addColumn("Ngày sinh");
            model.addColumn("Giới Tính");
            model.addColumn("Số điện thoại");
            model.addColumn("Địa chỉ");
            model.addColumn("Lương");
            model.addColumn("Chi nhánh");
            if(option.equals("Mã")){
                EmployeeDTO empTemp = empDAO.searchByID(keyword);
                Vector row = new Vector<>();
                row.add(empTemp.getEmpID());
                row.add(empTemp.getEmpLastName());
                row.add(empTemp.getEmpFirstName());
                row.add(empTemp.getBirthday().format(formatter));
                row.add(empTemp.getGender());
                row.add(empTemp.getPhone());
                row.add(empTemp.getAddress());
                row.add(empTemp.getSalary());
                row.add(changeIDToName(empTemp.getBranch()));
                model.addRow(row);
            }else{
                empAL = empDAO.searchByName(keyword);
                for (EmployeeDTO emp : empAL) {
                    Vector row = new Vector<>();
                    row.add(emp.getEmpID());
                    row.add(emp.getEmpLastName());
                    row.add(emp.getEmpFirstName());
                    row.add(emp.getBirthday().format(formatter));
                    row.add(emp.getGender());
                    row.add(emp.getPhone());
                    row.add(emp.getAddress());
                    row.add(emp.getSalary());
                    row.add(changeIDToName(emp.getBranch()));
                    model.addRow(row);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not found");
        }
        return model;
    }
    
    public DefaultTableModel printTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã nhân viên");
        model.addColumn("Họ");
        model.addColumn("Tên");
        model.addColumn("Ngày sinh");
        model.addColumn("Giới Tính");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Lương");
        model.addColumn("Chi nhánh");
        for (EmployeeDTO emp : empAL) {
            Vector row = new Vector<>();
            row.add(emp.getEmpID());
            row.add(emp.getEmpLastName());
            row.add(emp.getEmpFirstName());
            row.add(emp.getBirthday().format(formatter));
            row.add(emp.getGender());
            row.add(emp.getPhone());
            row.add(emp.getAddress());
            row.add(emp.getSalary());
            row.add(changeIDToName(emp.getBranch()));
            model.addRow(row);
        }
        return model;
    }
    
    //----------VALIDATOR----------//
    public String generateID()
    {
        String prefix = "NV";
        String empID = null;
        Random rand = new Random();
        int num;
        while(empID==null)
        {
            num = rand.nextInt(900000) + 100000;
            empID = prefix + num;
            if(empDAO.isUniqueID(empID)){
                
            }else{
                empID = null;
            }
        }
        return empID;
    }
    
    public String normalization(String s){
        String result = "";
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        return result;
    }
    
    public boolean checkValidDate(String date){
        try{
            LocalDate.parse(date);
            return true;
        }catch(DateTimeParseException e){
            return false;
        }
    }
    
    public String changeIDToName(String ID){
        ArrayList<BranchDTO> braList =  new ArrayList<>();
        braList = braBUS.readData(braList);
        for (BranchDTO bra : braList) {
            if(bra.getBranchID().equals(ID)) return bra.getBranchName();
        }
        return null;
    }
    
    public void importData(JTable table, String namePath){
        try {
            FileInputStream file = new FileInputStream(new File(namePath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            int rowCount = sheet.getLastRowNum();
            int columnCount = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowCount][columnCount];

            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < columnCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell.toString();
                }
            }

            String[] columnNames = new String[columnCount];
            Row headerRow = sheet.getRow(0);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = headerRow.getCell(j);
                columnNames[j] = cell.toString();
            }
//            table.getColumnModel().getColumn(3).setCellRenderer(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            table.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
            
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void printExcel(String folder, String fileName){
        try{
            //Khởi tạo file excel
            XSSFWorkbook workBook = new XSSFWorkbook();
            XSSFSheet sheet = workBook.createSheet("Employee");
            //Tạo font cho cell
            XSSFFont font = workBook.createFont();
            font.setBold(true);
            //Áp font vào cell
            XSSFCellStyle style = workBook.createCellStyle();
            style.setFont(font);
            //Bắt đầu truyền dữ liệu cho excel
            Cell cell;
            Row row;
            int rownum = 0;
            row = sheet.createRow(rownum); // tạo dòng đầy tiên trên sheet
            //Tạo tiêu đề cho file muốn in
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã nhân viên");
            cell.setCellStyle(style);
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Họ");
            cell.setCellStyle(style);
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Tên");
            cell.setCellStyle(style);
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số điện thoại");
            cell.setCellStyle(style);
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày sinh");
            cell.setCellStyle(style);
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Địa chỉ");
            cell.setCellStyle(style);
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell.setCellStyle(style);
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Chi nhánh");
            cell.setCellStyle(style);
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Lương");
            cell.setCellStyle(style);
            //add data
            for (EmployeeDTO emp : empAL) {
                rownum++;
                row = sheet.createRow(rownum);
                
                cell = row.createCell(0,CellType.STRING);
                cell.setCellValue(emp.getEmpID());
                cell = row.createCell(1,CellType.STRING);
                cell.setCellValue(emp.getEmpLastName());
                cell = row.createCell(2,CellType.STRING);
                cell.setCellValue(emp.getEmpFirstName());
                cell = row.createCell(3,CellType.STRING);
                cell.setCellValue(emp.getPhone());
                cell = row.createCell(4,CellType.STRING);
                cell.setCellValue(emp.getBirthday());
                cell = row.createCell(5,CellType.STRING);
                cell.setCellValue(emp.getAddress());
                cell = row.createCell(6,CellType.STRING);
                cell.setCellValue(emp.getGender());
                cell = row.createCell(7,CellType.STRING);
                cell.setCellValue(emp.getBranch());
                cell = row.createCell(8,CellType.NUMERIC);
                cell.setCellValue(emp.getSalary());
            }
            File f = new File(folder + fileName + ".xlsx");
            FileOutputStream outFile = new FileOutputStream(f);
            workBook.write(outFile);
            JOptionPane.showMessageDialog(null, "In Excel thành công");
        }catch(IOException e){
            
        }
    }
    
    public void printPDF(JTable table){
        try{
            table.print(JTable.PrintMode.FIT_WIDTH, null, null);
            JOptionPane.showMessageDialog(null, "In PDF thành công");
        }catch(Exception e){
            
        }
    }
    
}
