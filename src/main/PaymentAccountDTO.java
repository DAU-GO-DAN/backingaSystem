
package main;

import java.time.LocalDate;

public class PaymentAccountDTO {
    String accountID, accountNumber, customerID, status;
    long accountBalance;
    LocalDate createdDate;

    PaymentAccountDTO() {
        
    }

    public String getAccountID() {
        return accountID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getStatus() {
        return status;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
    
    public String getCustomerName()
    {
        String name = null;
        CustomerBUS bus = new CustomerBUS();
        bus.readData();
        for(CustomerDTO customer : bus.cusList)
        {
            if(this.getCustomerID().equals(customer.getCustomerID()))
            {
                name = customer.getCusFullName();
            }
        }
        return name;
    }
    
    public void DecreaseBalance(long amount)
    {
        setAccountBalance(accountBalance - amount);
    }
    
    public void IncreaseBalance(long amount)
    {
        setAccountBalance(accountBalance + amount);
    }

    public PaymentAccountDTO(String accountID, String accountNumber, String customerID, String status, int accountBalance, LocalDate createdDate) {
        this.accountID = accountID;
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.status = status;
        this.accountBalance = accountBalance;
        this.createdDate = createdDate;
    }
    
    
}
