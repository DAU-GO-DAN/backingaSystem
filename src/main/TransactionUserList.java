/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author DUC PHU
 */
public class TransactionUserList {
    ArrayList<TransactionUser> transList;
    static TransactionHistoryBUS historyData = new TransactionHistoryBUS();
    static Validator doValid = new Validator();
    
    public ArrayList readDAO(String cusID)
    {
        ArrayList<TransactionUser> list = new ArrayList<>();
        for(TransactionHistoryDTO history : historyData.historyList)
        {
            if(history.getReceiverID().equals(cusID) 
                    || history.getSenderID().equals(cusID))
            {
                if(history.getReceiverID().equals(cusID))
                {
                    TransactionUser transTemp = new TransactionUser();
                    transTemp.setTransID(history.getTransID());
                    transTemp.setTargetID(history.getSenderID());
                    transTemp.setTransContent(history.getTransContent());
                    transTemp.setAmount("+" +doValid.formatMoney(history.getTransAmount()));
                    transTemp.setFee(doValid.formatMoney(history.getFee()));
                    transTemp.setRemain(doValid.formatMoney(history.getReceiverRemain()));
                    transTemp.setTransDate(history.getTransDate());
                    transTemp.setUserAcc(history.getReceiverAcc());
                    list.add(transTemp);
                }
                else if(history.getSenderID().equals(cusID))
                {
                    TransactionUser transTemp = new TransactionUser();
                    transTemp.setTransID(history.getTransID());
                    transTemp.setTargetID(history.getReceiverID());
                    transTemp.setTransContent(history.getTransContent());
                    transTemp.setAmount("-" +doValid.formatMoney(history.getTransAmount()));
                    transTemp.setFee(doValid.formatMoney(history.getFee()));
                    transTemp.setRemain(doValid.formatMoney(history.getSenderRemain()));
                    transTemp.setTransDate(history.getTransDate());
                    transTemp.setUserAcc(history.getSenderAcc());
                    list.add(transTemp);
                }
            }
        }
        return list;
    }
    
    public void readData(String CusID)
    {
        transList = readDAO(CusID);
    }
}
