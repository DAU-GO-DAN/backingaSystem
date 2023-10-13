package main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmployeeDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    EmployeeDAO(){
        conn = MyConnection.getConnection();
    }
    
    public void add(EmployeeDTO emp){
       try{
           String qry = "INSERT INTO Employee VALUES("
                   + "'" + emp.getEmpID() + "'"
                   + "," + "N'" + emp.getEmpLastName() + "'"
                   + "," + "N'" + emp.getEmpFirstName() + "'"
                   + "," + "N'" + emp.getPhone() + "'"
                   + "," + "N'" + emp.getBirthday() + "'"
                   + "," + "N'" + emp.getAddress() + "'"
                   + "," + "N'" + emp.getGender() + "'"
                   + "," + "N'" + emp.getSalary() + "'"
                   + "," + "N'" + emp.getBranch() + "')";
           stmt = conn.createStatement();
           int rowsAffected = stmt.executeUpdate(qry);
           if(rowsAffected==1){
               JOptionPane.showMessageDialog(null, "Thành công");
           }else{
               JOptionPane.showMessageDialog(null, "Thất bại");
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
   
    public void edit(EmployeeDTO emp, String ID){
        try{
            String qry = "UPDATE Employee SET "
                    + "empLastName = N'" + emp.getEmpLastName()+ "', "
                    + "empFirstName = N'" + emp.getEmpFirstName()+ "', "
                    + "phone = '" + emp.getPhone()+ "', "
                    + "birthday = '" + emp.getBirthday()+ "', "
                    + "address = N'" + emp.getAddress()+ "', "
                    + "gender = N'" + emp.getGender()+ "', "
                    + "salary = N'" + emp.getSalary()+ "', "
                    + "branch = N'" + emp.getBranch()+ "'"
                    + "WHERE empID = '" + ID +"'";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected>0){
                JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi cập nhật");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(String ID){
        try{
             String qry = "DELETE FROM Employee WHERE empID = " + "'" + ID + "'";
             stmt = conn.createStatement();
             int rowAffected = stmt.executeUpdate(qry);
             if(rowAffected>=1){
                 JOptionPane.showMessageDialog(null, "Thành công");
             }
             else{
                 JOptionPane.showMessageDialog(null, "Thất bại");
             }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList sort(String option){
        ArrayList empList = new ArrayList<EmployeeDTO>();
        try{
            String qry;
            if(option.equals("Mã")){
                qry = "SELECT * FROM Employee ORDER BY empID";
            }else if(option.equals("Tên")){
                qry = "SELECT * FROM Employee ORDER BY empFirstName";
            }else{
                qry = "SELECT * FROM Employee ORDER BY salary";
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                EmployeeDTO empTemp = new EmployeeDTO();
                empTemp.setEmpID(rs.getString("empID"));
                empTemp.setEmpLastName(rs.getString("empLastName"));
                empTemp.setEmpFirstName(rs.getString("empFirstName"));
                empTemp.setPhone(rs.getString("phone"));
                empTemp.setBirthday(rs.getDate("birthday").toLocalDate());
                empTemp.setAddress(rs.getString("address"));
                empTemp.setGender(rs.getString("gender"));
                empTemp.setSalary(rs.getLong("salary"));
                empTemp.setBranch(rs.getString("branch"));
                empList.add(empTemp);
            }
        }catch(SQLException e){
            
        }
        return empList;
    }
    
    
    
    public EmployeeDTO searchByID(String ID){
        EmployeeDTO empTemp = new EmployeeDTO();
        try{
            String qry = "SELECT * FROM Employee WHERE empID = '" + ID + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                empTemp.setEmpID(rs.getString("empID"));
                empTemp.setEmpLastName(rs.getString("empLastName"));
                empTemp.setEmpFirstName(rs.getString("empFirstName"));
                empTemp.setPhone(rs.getString("phone"));
                empTemp.setBirthday(rs.getDate("birthday").toLocalDate());
                empTemp.setAddress(rs.getString("address"));
                empTemp.setGender(rs.getString("gender"));
                empTemp.setSalary(rs.getLong("salary"));
                empTemp.setBranch(rs.getString("branch"));
            }
        }catch(SQLException e){
            
        }
        return empTemp;
    }
    
    public ArrayList searchByName(String name){
        ArrayList<EmployeeDTO> empList = new ArrayList<>();
        try{
            String qry = "SELECT * FROM Employee WHERE empFirstName LIKE N'%" + name + "%'" ;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                EmployeeDTO empTemp = new EmployeeDTO();
                empTemp.setEmpID(rs.getString("empID"));
                empTemp.setEmpLastName(rs.getString("empLastName"));
                empTemp.setEmpFirstName(rs.getString("empFirstName"));
                empTemp.setPhone(rs.getString("phone"));
                empTemp.setBirthday(rs.getDate("birthday").toLocalDate());
                empTemp.setAddress(rs.getString("address"));
                empTemp.setGender(rs.getString("gender"));
                empTemp.setSalary(rs.getLong("salary"));
                empTemp.setBranch(rs.getString("branch"));
                empList.add(empTemp);
            }
        }catch(SQLException e){
            
        }
        return empList; 
    }

    public ArrayList readDataFromSQL(){
        ArrayList empList = new ArrayList<EmployeeDTO>();
        try{
            String qry = "SELECT * FROM Employee";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                EmployeeDTO empTemp = new EmployeeDTO();
                empTemp.setEmpID(rs.getString("empID"));
                empTemp.setEmpLastName(rs.getString("empLastName"));
                empTemp.setEmpFirstName(rs.getString("empFirstName"));
                empTemp.setPhone(rs.getString("phone"));
                empTemp.setBirthday(rs.getDate("birthday").toLocalDate());
                empTemp.setAddress(rs.getString("address"));
                empTemp.setGender(rs.getString("gender"));
                empTemp.setSalary(rs.getLong("salary"));
                empTemp.setBranch(rs.getString("branch"));
                empList.add(empTemp);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Failed");
        }
        return empList;
    }
   
   //--------VALIDATOR---------//
    public boolean isUniqueID(String ID){
        boolean isUnique = true;
        try{
            String qry = "SELECT * FROM Employee WHERE empID = '" + ID + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                isUnique = false;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return isUnique;
    }
}
