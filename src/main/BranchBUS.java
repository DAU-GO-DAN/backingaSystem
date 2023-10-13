package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class BranchBUS {
    static BranchDAO braDAO = new BranchDAO();
    static ArrayList<BranchDTO> braAL = new ArrayList<>();
//    static int i;
    public BranchBUS() {
        readData();
    }
    
    public ArrayList readData(ArrayList AL){
        AL = braDAO.readDataFromSQL();
        return AL;
    }
    
    public void readData(){
        braAL = braDAO.readDataFromSQL();
    }
    
    public void add(BranchDTO braTemp){
        braDAO.add(braTemp);
        braAL.add(braTemp);
    }
    
    public void del(String ID){
        braDAO.del(ID);
        braAL.removeIf(bra -> bra.getBranchID().equals(ID));
    }
    
    public void edit(BranchDTO braTemp, String ID){
        braDAO.edit(braTemp, ID);
        braAL.removeIf(bra -> bra.getBranchID().equals(ID));
        braAL.add(braTemp);
    }
    
    public DefaultTableModel sort(String option){
        DefaultTableModel model = new DefaultTableModel();
        braAL = braDAO.sort(option);
        model.addColumn("Mã chi nhánh");
        model.addColumn("Tên chi nhánh");
        model.addColumn("Địa chỉ chi nhánh");
        model.addColumn("Quản lí chi nhánh");
        for (BranchDTO branchDTO : braAL) {
            Vector row = new Vector<>();
            row.add(branchDTO.getBranchID());
            row.add(branchDTO.getBranchName());
            row.add(branchDTO.getBranchAddress());
            row.add(branchDTO.getBranchManager());
            model.addRow(row);
        }
        return model;
    }
    
    public BranchDTO searchByID(String ID){
        for (BranchDTO branchDTO : braAL) {
            if(branchDTO.getBranchID().equals(ID)) return branchDTO;
        }
        return null; 
    }
    
    public String outputIDByName(String name)
    {
        for (BranchDTO branchDTO : braAL) {
            if(branchDTO.getBranchName().equals(name)) return branchDTO.getBranchID();
        }
        return null; 
    }
    
    public String outputNameByID(String ID)
    {
        for (BranchDTO branchDTO : braAL) {
            if(branchDTO.getBranchID().equals(ID)) return branchDTO.getBranchName();
        }
        return null; 
    }
    
    public DefaultTableModel search(String option, String keyword){
        DefaultTableModel model = new DefaultTableModel();
        try{
            model.addColumn("Mã chi nhánh");
            model.addColumn("Tên chi nhánh");
            model.addColumn("Địa chỉ chi nhánh");
            model.addColumn("Quản lí chi nhánh");
            if(option.equals("Mã")){
                BranchDTO braTemp = braDAO.searchByID(keyword);
                Vector row = new Vector<>();
                    row.add(braTemp.getBranchID());
                    row.add(braTemp.getBranchName());
                    row.add(braTemp.getBranchAddress());
                    row.add(braTemp.getBranchManager());
                    model.addRow(row);
            }else{
                braAL = braDAO.searchByName(keyword);
                for (BranchDTO branchDTO : braAL) {
                    Vector row = new Vector<>();
                    row.add(branchDTO.getBranchID());
                    row.add(branchDTO.getBranchName());
                    row.add(branchDTO.getBranchAddress());
                    row.add(branchDTO.getBranchManager());
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
        model.addColumn("Mã chi nhánh");
        model.addColumn("Tên chi nhánh");
        model.addColumn("Địa chỉ chi nhánh");
        model.addColumn("Quản lí chi nhánh");
        for (BranchDTO branchDTO : braAL) {
            Vector row = new Vector<>();
            row.add(branchDTO.getBranchID());
            row.add(branchDTO.getBranchName());
            row.add(branchDTO.getBranchAddress());
            row.add(branchDTO.getBranchManager());
            model.addRow(row);
        }
        return model;
        
    }    
    
    //---------BLA BLA BLA---------//
    //Sử dụng sau khi đã đọc dữ liệu
    public boolean isUnique(String ID){
        return braDAO.isUniqueID(ID);
    }
    public String normalization(String s){
        String result = "";
        s = s.trim().replaceAll("\\s+", " ");
        String words[] = s.split(" ");
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        return result;
    }
    
    public String generateBranchID(){
        String id=null;
        String prefix = "CN";
        Random rand = new Random();
        int num=100;
        while(id==null){
            num++;
            id = prefix + num;
            if(braDAO.isUniqueID(id)) break;
            else id = null;
        }
        return id;
    }
    
    public String generateBranchName(BranchDTO braTemp){
        String result = "";
        String temp = braTemp.getBranchAddress();
        int index = braTemp.getBranchAddress().indexOf(",");
        if(index != -1){
            temp = braTemp.getBranchAddress().substring(0, index);
        }
        String[] words = temp.split(" ");
        for (String word : words) {
            result += word.substring(0,1);
        }
        return "SoGu"+result;
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
    
    public void printExcel(String fileName, String folder){
        try{
            //Khởi tạo file excel
            XSSFWorkbook workBook = new XSSFWorkbook();
            XSSFSheet sheet = workBook.createSheet("Branch");
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
            cell.setCellValue("Mã chi nhánh");
            cell.setCellStyle(style);
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên chi nhánh");
            cell.setCellStyle(style);
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Địa chỉ chi nhánh");
            cell.setCellStyle(style);
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Quản lý chi nhánh");
            cell.setCellStyle(style);
            //add data
            for (BranchDTO bra : braAL) {
                rownum++;
                row = sheet.createRow(rownum);
                
                cell = row.createCell(0,CellType.STRING);
                cell.setCellValue(bra.getBranchID());
                cell = row.createCell(1,CellType.STRING);
                cell.setCellValue(bra.getBranchName());
                cell = row.createCell(2,CellType.STRING);
                cell.setCellValue(bra.getBranchAddress());
                cell = row.createCell(3,CellType.STRING);
                cell.setCellValue(bra.getBranchManager());
                
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
