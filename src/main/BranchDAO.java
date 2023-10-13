/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author huynh
 */
public class BranchDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public BranchDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(BranchDTO bra){
        try{
            String qry = "insert into Branch values('"
                    + bra.getBranchID() + "', N'" 
                    + bra.getBranchName() + "', N'"
                    + bra.getBranchAddress() + "', N'"
                    + bra.getBranchManager()+ "')";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if(rowsAffected==1){
               JOptionPane.showMessageDialog(null, "Thêm chi nhánh thành công");
            }else{
               JOptionPane.showMessageDialog(null, "Thêm chi nhánh thất bại");
            }
        }catch(SQLException e){
            
        }     
    }
    
    public void del(String ID){
        try{
            String qry = "DELETE FROM Branch WHERE BranchID = '" + ID + "'";;
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected>0){
                JOptionPane.showMessageDialog(null, "Xóa chi nhánh thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Xóa chi nhánh thất bại");
            }
        }catch(SQLException e){
            
        }
    }
    
    public void edit(BranchDTO braTemp, String ID){
        try{
            String qry = "update Branch set "
                    + "branchName = '" + braTemp.getBranchName() + "', "
                    + "branchAddress = N'" + braTemp.getBranchAddress() + "', "
                    + "branchManager = N'" + braTemp.getBranchManager() + "'"
                    + "where branchID = '" + ID + "'";
            
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected>0) JOptionPane.showMessageDialog(null, "Cập nhật thông tin chi nhánh thành công");
            else JOptionPane.showMessageDialog(null, "Cập nhật thông tin chi nhánh thất bại");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList sort(String option){
        ArrayList braList = new ArrayList<BranchDTO>();
        try{
            String qry;
            if(option.equals("Mã")){
                qry = "SELECT * FROM Branch ORDER BY branchID";
            }else{
                qry = "SELECT * FROM Branch ORDER BY branchName";
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                BranchDTO braTemp = new BranchDTO();
                braTemp.setBranchID(rs.getString("branchID"));
                braTemp.setBranchName(rs.getString("branchName"));
                braTemp.setBranchAddress(rs.getString("branchAddress"));
                braTemp.setBranchManager(rs.getString("branchManager"));
                braList.add(braTemp);
            }
        }catch(SQLException e){
            
        }
        return braList;
    }
    
    public BranchDTO searchByID(String ID){
        BranchDTO braTemp = new BranchDTO();
        try{
            String qry = "SELECT * FROM Branch WHERE branchID = '" + ID + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                braTemp.setBranchID(rs.getString("branchID"));
                braTemp.setBranchName(rs.getString("branchName"));
                braTemp.setBranchAddress(rs.getString("branchAddress"));
                braTemp.setBranchManager(rs.getString("branchManager"));
            }
        }catch(SQLException e){
            
        }
        return braTemp;
    }
    
    public ArrayList searchByName(String name){
        ArrayList<BranchDTO> braList = new ArrayList<>();
        try{
            String qry = "SELECT * FROM Branch WHERE branchName LIKE N'%" + name + "%'" ;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                BranchDTO braTemp = new BranchDTO();
                braTemp.setBranchID(rs.getString("branchID"));
                braTemp.setBranchName(rs.getString("branchName"));
                braTemp.setBranchAddress(rs.getString("branchAddress"));
                braTemp.setBranchManager(rs.getString("branchManager"));
                braList.add(braTemp);
            }
        }catch(SQLException e){
            
        }
        return braList; 
    }
        
    public ArrayList readDataFromSQL(){
        ArrayList<BranchDTO> braList = new ArrayList<>();
        try{
            String qry = "select * from Branch";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                BranchDTO braTemp = new BranchDTO();
                braTemp.setBranchID(rs.getString("branchID"));
                braTemp.setBranchName(rs.getString("branchName"));
                braTemp.setBranchAddress(rs.getString("branchAddress"));
                braTemp.setBranchManager(rs.getString("branchManager"));
                braList.add(braTemp);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Đọc dữ liệu chi nhánh thất bại");
        }
        return braList;
    }
    
    
    
    //----------Xalo function--------//
    //Lý do có nó là khi ấn thêm vào mà chưa đọc dữ liệu lúc đó cần phải đọc dữ liệu để gener ID
    public boolean isUniqueID(String ID){
        try{
            String qry = "select * from Branch where branchID = '" + ID + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                return false;
            }
        }catch(SQLException e){
            
        }
        return true;
    }
}
