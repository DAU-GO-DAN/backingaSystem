/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author DUC PHU
 */
public class PassBookDTO {
    String ID, customerID, branchID, bookType, status, month;
    LocalDate createdDate, depositDate, changeDate;
    long depositAmount, interestAmount;
    float interest;

    public LocalDate getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDate changeDate) {
        this.changeDate = changeDate;
    }
    
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public String getID() {
        return ID;
    }

    public String getCustomerID() {
        return customerID;
    }
    public String getBranchID() {
        return branchID;
    }

    public String getBookType() {
        return bookType;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getDepositDate() {
        return depositDate;
    }

    public long getDepositAmount() {
        return depositAmount;
    }

    public long getInterestAmount() {
        return interestAmount;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }

    public void setDepositAmount(long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setInterestAmount(long interestAmount) {
        this.interestAmount = interestAmount;
    }
    
    
}
