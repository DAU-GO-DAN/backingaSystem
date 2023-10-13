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
public class PassBookDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    PassBookDAO()
    {
        conn = MyConnection.getConnection();
    }
    
    public void add(PassBookDTO PassBook)
    {
        try{
            String qry = "insert into PassBook values ( "
                    + "'" +PassBook.getID()+ "', "
                    + "'" +PassBook.getCustomerID()+ "', "
                    + "'" +PassBook.getBranchID()+ "', "
                    + "'" +PassBook.getCreatedDate()+ "', "
                    + "" +PassBook.getDepositAmount()+ ", "
                    + "" +PassBook.getInterest()+ ", "
                    + "'" +PassBook.getBookType()+ "', "
                    + "N'" +PassBook.getMonth()+ "', "
                    + "'" +PassBook.getDepositDate()+ "', "
                    + "'" +PassBook.getChangeDate()+ "', "
                    + "" +PassBook.getInterestAmount()+ ", "
                    + "N'" +PassBook.getStatus()+ "') ";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại!");
            }
        }
        catch (SQLException ex){
            
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from PassBook "
                    + " where bookID = '" +ID+ "'";
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(qry);
            if(i == 1)
            {
                System.out.println("ss");
            }
        }
        catch (SQLException ex){
            
        }
    }
    
    public void edit(String ID, PassBookDTO PassBook)
    {
        try{
            String qry = "update PassBook "
                    + " set "
                    + " status = N'" +PassBook.getStatus()+ "', "
                    + " actionDate = '" +PassBook.getChangeDate()+ "' "
                    + " where bookID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
            
        }
    }
    
    public boolean checkIDExist(String ID)
    {
        boolean isExist = false;
        try{
            String qry = "select * from PassBook "
                    + " where bookID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                isExist = true;
            }
        }
        catch (SQLException ex){
            
        }
        return isExist;
    }
    
    public ArrayList List()
    {
        ArrayList PBList = new ArrayList<PassBookDTO>();
        try{
            String qry = "select * from PassBook";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                PassBookDTO book = new PassBookDTO();
                book.setID(rs.getString("bookID"));
                book.setCustomerID(rs.getString("customerID"));
                book.setBranchID(rs.getString("branchID"));
                book.setCreatedDate(rs.getDate("createdDate").toLocalDate());
                book.setDepositAmount(Long.parseLong(rs.getString("depositAmount")));
                book.setInterest(Float.parseFloat(rs.getString("interest")));
                book.setBookType(rs.getString("bookType"));
                book.setMonth(rs.getString("monthPeriod"));
                book.setDepositDate(rs.getDate("depositDate").toLocalDate());
                book.setChangeDate(rs.getDate("actionDate").toLocalDate());
                book.setInterestAmount(Long.parseLong(rs.getString("interestAmount")));
                book.setStatus(rs.getString("status"));
                PBList.add(book);
            }
        }
        catch (SQLException ex){
        
        }
        
        return PBList;
    }
}
