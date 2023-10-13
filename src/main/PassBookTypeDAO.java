/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DUC PHU
 */
public class PassBookTypeDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    PassBookTypeDAO()
    {
        conn = MyConnection.getConnection();
    }
    
    public void add(PassBookTypeDTO type)
    {
        try{
            String qry = "insert into PassBookType values ( "
                    + "'" + type.getTypeID()+ "'" + ", "
                    + type.getPeriod()+ ", "
                    + "N'" + type.getMonthPeriod()+ "'" + ", "
                    + type.getInterestRate()
                    + " )";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại!");
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin !");
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from PassBookType "
                    + " where typeID ='" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi xóa thông tin !");
        }
    }
    
    public void edit(String ID, PassBookTypeDTO type)
    {
        try{
            String qry = "Update PassBookType "
                    + "set "
                    + " typeID = '" +type.getTypeID()+ "', "
                    + " period = " +type.getMonthPeriod()+ ", "
                    + " monthPeriod = N'" +type.getMonthPeriod()+ "', "
                    + " interestRate = " +type.getInterestRate()
                    + " where typeID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi sửa thông tin !");
        }
    }
    
    public boolean checkMonthExist(String month)
    {
        boolean isExist = false;
        try{
            String qry = "select * from PassBookType "
                    + " where  monthPeriod = N'" +month+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                isExist = true;
            }
        }
        
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi kiểm tra thông tin !");
        }
        return isExist;
    }
    
    public ArrayList readPBTypeList()
    {
        ArrayList TypeList = new ArrayList<PassBookTypeDTO>();
        try{
            String qry = "select * from PassBookType";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                PassBookTypeDTO type = new PassBookTypeDTO();
                type.setTypeID(rs.getString("typeID"));
                type.setMonthPeriod(rs.getString("monthPeriod"));
                type.setInterestRate(rs.getFloat("interestRate"));
                type.setPeriod(rs.getInt("period"));
                TypeList.add(type);
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin khách hàng!");
        }
        return TypeList;
    }
}
