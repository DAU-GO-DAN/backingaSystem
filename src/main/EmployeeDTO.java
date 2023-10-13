package main;

import java.time.LocalDate;

public class EmployeeDTO {
    private String empID;
    private String empLastName;
    private String empFirstName;
    private String phone;
    private LocalDate birthday;
    private String address;
    private String gender;
    private String branch;
    private long salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empID, String empLastName, String empFirstName, String phone, LocalDate birthday, String address, String gender, String branch, long salary) {
        this.empID = empID;
        this.empLastName = empLastName;
        this.empFirstName = empFirstName;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
        this.branch = branch;
        this.salary = salary;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    
}
