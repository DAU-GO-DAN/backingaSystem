
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PaymentAccountDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    PaymentAccountDAO()
    {
        conn = MyConnection.getConnection();
    }
    
    public CustomerDTO getOwner(String ID)
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
    
    public String getOwnerIDByNum(String Num)
    {
        PaymentAccountDTO account = new PaymentAccountDTO();
        try{
            String qry = " select * from PaymentAccount "
                    + " where accountNumber = '" +Num+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                account.setCustomerID(rs.getString("customerID"));
            }
        }
        catch (SQLException ex){
            
        }
        return account.getCustomerID();
    }
    
    public PaymentAccountDTO getAccByNum(String Num)
    {
        PaymentAccountDTO account = new PaymentAccountDTO();
        try{
            String qry = " select * from PaymentAccount "
                    + " where accountNumber = '" +Num+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                account.setAccountID(rs.getString("accountID"));
                account.setAccountNumber(rs.getString("accountNumber"));
                account.setCustomerID(rs.getString("customerID"));
                account.setStatus(rs.getString("status"));
                account.setCreatedDate(rs.getDate("releaseDate").toLocalDate());
                account.setAccountBalance(Long.parseLong(rs.getString("accountBalance")));
            }
        }
        catch (SQLException ex){
            
        }
        return account;
    }
    
    public void add(PaymentAccountDTO account)
    {
        try
        {
            String qry = "insert into PaymentAccount values (" 
                    + "'" + account.getAccountID() + "'"
                    + "," + "'" + account.getAccountNumber() + "'"
                    + "," + "'" + account.getCustomerID() + "'"
                    + "," + "N'" + account.getStatus() + "'"
                    + "," + "'" + account.getCreatedDate() + "'"
                    + "," + account.getAccountBalance()
                    + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm tài khoản thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm tài khoản thất bại!");
            }
        }
        catch (SQLException ex){
            
        }
    }
    
    public void delete(String ID)
    {
        try
        {
            String qry = "delete from PaymentAccount "
                    + " where accountID ='" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
            
        }
    }
    
    public void edit(String ID, PaymentAccountDTO account)
    {
        try
        {
            String qry = "Update PaymentAccount "
                    + " set "
                    + " status = N'" +account.getStatus()+ "', "
                    + " accountBalance = " +account.getAccountBalance()+ ""
                    + " where accountID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
            
        }
    }
    
    public void deleteByCustomer(String CusID)
    {
        try{
            String qry = "delete from PaymentAccount "
                    + " where customerID = '" +CusID+ "'";
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
            String qry = "select * from PaymentAccount "
                    + " where accountID = '" +ID+ "'";
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
    
    public boolean checkAccNumber(String number)
    {
        boolean isExist = false;
        try
        {
            String qry = "select * from PaymentAccount "
                    + " where accountNumber = '" +number+ "'";
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
        ArrayList list = new ArrayList<PaymentAccountDTO>();
        try
        {
            String qry = "select * from PaymentAccount";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                PaymentAccountDTO accountTemp = new PaymentAccountDTO();
                accountTemp.setAccountID(rs.getString("accountID"));
                accountTemp.setAccountNumber(rs.getString("accountNumber"));
                accountTemp.setCustomerID(rs.getString("customerID"));
                accountTemp.setStatus(rs.getString("status"));
                accountTemp.setCreatedDate(rs.getDate("releaseDate").toLocalDate());
                accountTemp.setAccountBalance(Long.parseLong(rs.getString("accountBalance")));
                list.add(accountTemp);
            }
        }
        catch (SQLException ex){
            
        }
        
        return list;
    }
    
}
