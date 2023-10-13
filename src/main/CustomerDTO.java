
package main;

import java.time.LocalDate;
import java.time.Period;

public class CustomerDTO {
    private String customerID, cusLastName, cusFirstName, phone, gender;
    private String username, password, email;
    private LocalDate birthDay, dayCreated;

    public LocalDate getDayCreated() {
        return dayCreated;
    }

    public void setDayCreated(LocalDate dayCreated) {
        this.dayCreated = dayCreated;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCusLastName() {
        return cusLastName;
    }

    public void setCusLastName(String cusLastName) {
        this.cusLastName = cusLastName;
    }

    public String getCusFirstName() {
        return cusFirstName;
    }

    public void setCusFirstName(String cusFirstName) {
        this.cusFirstName = cusFirstName;
    }
    
    public String getCusFullName() {
        return cusFirstName + " " + cusLastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(this.birthDay, currentDate);
        return period.getYears();
    }
    
    public CustomerDTO()
    {
        
    }

    
    
    public CustomerDTO(String customerID, String cusLastName, String cusFirstName, String phone, String username, String password, String OTPCode, String email, LocalDate birthDay) {
        this.customerID = customerID;
        this.cusLastName = cusLastName;
        this.cusFirstName = cusFirstName;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthDay = birthDay;
    }
    
    public void print()
    {
        System.out.println("ID: "+customerID);
        System.out.println("Name : "+cusFirstName+" "+cusLastName);
        
    }
}
