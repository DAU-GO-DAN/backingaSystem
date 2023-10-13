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
public class TransactionHistoryDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    TransactionHistoryDAO()
    {
        conn = MyConnection.getConnection();
    }
    
    public CustomerDTO getCustomer(String ID)
    {
        CustomerDTO customerTemp = new CustomerDTO();
        try{
            String qry = "Select * from Customer ";
            qry = qry+"Where customerID = '"+ID+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                customerTemp.setCustomerID(rs.getString("customerID"));
                customerTemp.setCusFirstName(rs.getString("cusFirstName"));
                customerTemp.setCusLastName(rs.getString("cusLastName"));
                customerTemp.setPhone(rs.getString("phone"));
                customerTemp.setBirthDay(rs.getDate("birthDay").toLocalDate());
                customerTemp.setUsername(rs.getString("username"));
                customerTemp.setPassword(rs.getString("password"));
                customerTemp.setEmail(rs.getString("email"));
                customerTemp.setGender(rs.getString("Gender"));
                customerTemp.setDayCreated(rs.getDate("DayCreated").toLocalDate());
            }
            
        }
        catch (SQLException ex){
            
        }
        return customerTemp;
    }
    
    public void add(TransactionHistoryDTO history)
    {
        try{
            String qry = "insert into TransactionHistory values ("
                    + "'" +history.getTransID()+ "', "
                    + "'" +history.getSenderID()+ "', "
                    + "'" +history.getSenderAcc()+ "', "
                    + "'" +history.getReceiverID()+ "', "
                    + "'" +history.getReceiverAcc()+ "', "
                    + "N'" +history.getTransContent()+ "', "
                    + "'" +history.getTransDate()+ "', "
                    + "" +history.getTransAmount()+ ", "
                    + "" +history.getFee()+ ", "
                    + "" +history.getSenderRemain()+ ", "
                    + "" +history.getReceiverRemain()+ ") ";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm lịch sử thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm lịch sử thất bại!");
            }
        }
        catch (SQLException ex){
            
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from TransactionHistory "
                    + " where transID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
           
        }
    }
    
    
    
    public boolean checkIDExist(String ID)
    {
        boolean isExist = false;
        try
        {
            String qry = "select * from TransactionHistory "
                    + " where transID = '" +ID+ "'";
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
    
    public ArrayList readData()
    {
        ArrayList list = new ArrayList<TransactionHistoryDTO>();
        try{
            String qry = "select * from TransactionHistory";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                TransactionHistoryDTO history = new TransactionHistoryDTO();
                history.setTransID(rs.getString("transID"));
                history.setSenderID(rs.getString("senderID"));
                history.setSenderAcc(rs.getString("senderAcc"));
                history.setReceiverID(rs.getString("receiverID"));
                history.setReceiverAcc(rs.getString("receiverAcc"));
                history.setTransContent(rs.getString("transContent"));
                history.setTransAmount(Long.parseLong(rs.getString("transAmount")));
                history.setFee(Long.parseLong(rs.getString("fee")));
                history.setSenderRemain(Long.parseLong(rs.getString("senderRemain")));
                history.setReceiverRemain(Long.parseLong(rs.getString("receiverRemain")));
                history.setTransDate(rs.getDate("transDate").toLocalDate());
                list.add(history);
            }
        }
        catch (SQLException ex){
            
        }
        
        return list;
    }
}
