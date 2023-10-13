
package main;

import java.sql.ResultSet;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.security.Security;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CustomerDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    CustomerDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(CustomerDTO cus)
    {
        try{
            String qry = "INSERT INTO Customer VALUES ("
                + "'" + cus.getCustomerID() + "'"
                + "," + "N'" + cus.getCusFirstName() + "'"
                + "," + "N'" + cus.getCusLastName() + "'"
                + "," + "'" + cus.getPhone() + "'"
                + "," + "'" + cus.getBirthDay() + "'"
                + "," + "'" + cus.getUsername() + "'"
                + "," + "'" + cus.getPassword() + "'"
                + "," + "'" + cus.getEmail() + "'"
                + "," + "N'" + cus.getGender() + "'"
                + "," + "'" + cus.getDayCreated() + "'"
                + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm khách hàng thất bại!");
            }
        }
        catch (SQLException ex){
            
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "Delete from Customer where customerID =" +"'"+ID+"'";
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex){
            
        }
    }
    
    public void edit(String ID, CustomerDTO cus)
    {
        try{
            String qry = "update Customer "
                    + "set "
                    + " cusFirstName = N'" + cus.getCusFirstName() + "', "
                    + " cusLastName = N'" +cus.getCusLastName()+ "', "
                    + " phone = '" +cus.getPhone()+ "', "
                    + " birthDay = '" +cus.getBirthDay()+ "', "
                    + " email = '" +cus.getEmail()+ "', "
                    + " Gender = N'" +cus.getGender()+ "' "
                    + " where customerID = '"+ID+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            
        }
        catch (SQLException ex){
            
        }
    }
    
    public CustomerDTO findByID(String ID)
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
    
    public ArrayList findByFirstName(String Name)
    {
        ArrayList CusList = new ArrayList<CustomerDTO>();
        try{
            String qry = "Select * from Customer ";
            qry = qry+"Where cusFirstName like N'%" +Name+"%'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                CustomerDTO customerTemp = new CustomerDTO();
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
                CusList.add(customerTemp);
            }
        }
        catch (SQLException ex){
            
        }
        return CusList;
    }
    
    public ArrayList findByLastName(String Name)
    {
        ArrayList CusList = new ArrayList<CustomerDTO>();
        try{
            String qry = "Select * from Customer ";
            qry = qry+"Where cusLastName like N'%" +Name+"%'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                CustomerDTO customerTemp = new CustomerDTO();
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
                CusList.add(customerTemp);
            }
        }
        catch (SQLException ex){
            
        }
        return CusList;
    }
    
    public ArrayList findByFullName(String Name)
    {
        ArrayList CusList = new ArrayList<CustomerDTO>();
        try{
            String qry = "Select * from Customer ";
            qry = qry+"Where cusFirstName + ' ' + cusLastName like N'%" +Name+"%'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                CustomerDTO customerTemp = new CustomerDTO();
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
                CusList.add(customerTemp);
            }
        }
        catch (SQLException ex){
            
        }
        return CusList;
    }
    
    public CustomerDTO loginCustomer(String username)
    {
        CustomerDTO customerTemp = new CustomerDTO();
        try{
            String qry = "Select * from Customer ";
            qry = qry+"Where username = '"+username+"'";
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
    
    public boolean checkIDExist(String ID)
    {
        boolean isExist = false;
        try{
            String qry = "Select customerID from Customer where customerID = '"+ID+"'";
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
    
    public boolean loginCheck(String username, String password)
    {
        boolean isCorrect = false;
        try{
            String qry = "select * from customer "
                    + "where username = '"+username+"' and password = '"+password+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                isCorrect = true;
            }
        }
        catch (SQLException ex){
            
        }
        return isCorrect;
    }
    
    public boolean UsernameCheck(String username)
    {
        boolean isExist = false;
        try{
            String qry = "select * from Customer "
                    +"where username = '"+username+"'";
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
    
    public boolean EmailCheck(String email)
    {
        boolean isExist = false;
        try{
            String qry = "select * from Customer "
                    + "where email = '"+email+"'";
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
    
    public ArrayList readCusList()
    {
        ArrayList CusList = new ArrayList<CustomerDTO>();
        try{
            String qry = "Select * from Customer";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                CustomerDTO customerTemp = new CustomerDTO();
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
                CusList.add(customerTemp);
            }
        }
        catch (SQLException ex){
            
        }
        return CusList;
    }
}
