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
public class TransactionUser {
    LocalDate transDate;
    String targetID, userAcc, transContent, transID;
    String amount, fee, remain;

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    
    
    public LocalDate getTransDate() {
        return transDate;
    }

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc;
    }
    
    public String getTargetID() {
        return targetID;
    }

    public String getTransContent() {
        return transContent;
    }

    public String getAmount() {
        return amount;
    }

    public String getFee() {
        return fee;
    }

    public String getRemain() {
        return remain;
    }

    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }

    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }

    public void setTransContent(String transContent) {
        this.transContent = transContent;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void setRemain(String remain) {
        this.remain = remain;
    }
    
    
}
