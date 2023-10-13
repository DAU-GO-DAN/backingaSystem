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
public class TransactionHistoryDTO {
    private String transID;
    private String senderID, senderAcc, receiverID, receiverAcc, transContent;
    private LocalDate transDate;
    private Long transAmount, fee, senderRemain, receiverRemain;

    static private CustomerBUS cusBUS = new CustomerBUS();

    public String getSenderAcc() {
        return senderAcc;
    }

    public String getReceiverAcc() {
        return receiverAcc;
    }

    public static CustomerBUS getCusBUS() {
        return cusBUS;
    }

    public void setSenderAcc(String senderAcc) {
        this.senderAcc = senderAcc;
    }

    public void setReceiverAcc(String receiverAcc) {
        this.receiverAcc = receiverAcc;
    }

    public static void setCusBUS(CustomerBUS cusBUS) {
        TransactionHistoryDTO.cusBUS = cusBUS;
    }
    
    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }
    
    public String getSenderID() {
        return senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public String getTransContent() {
        return transContent;
    }

    public LocalDate getTransDate() {
        return transDate;
    }

    public Long getTransAmount() {
        return transAmount;
    }

    public Long getFee() {
        return fee;
    }

    public Long getSenderRemain() {
        return senderRemain;
    }

    public Long getReceiverRemain() {
        return receiverRemain;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public void setTransContent(String transContent) {
        this.transContent = transContent;
    }

    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }

    public void setTransAmount(Long transAmount) {
        this.transAmount = transAmount;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public void setSenderRemain(Long senderRemain) {
        this.senderRemain = senderRemain;
    }

    public void setReceiverRemain(Long receiverRemain) {
        this.receiverRemain = receiverRemain;
    }
    
    public String getSenderName()
    {
        String name = null;
        CustomerBUS bus = new CustomerBUS();
        for(CustomerDTO customer : bus.cusList)
        {
            if(this.getSenderID().equals(customer.getCustomerID()))
            {
                name = customer.getCusFullName();
            }
        }
        return name;
    }
    
    public String getReceiverName()
    {
        String name = null;
        CustomerBUS bus = new CustomerBUS();
        for(CustomerDTO customer : bus.cusList)
        {
            if(this.getReceiverID().equals(customer.getCustomerID()))
            {
                name = customer.getCusFullName();
            }
        }
        return name;
    }
}
