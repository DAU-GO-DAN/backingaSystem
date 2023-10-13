/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DUC PHU
 */
public class TransactionHistoryBUS {
    ArrayList<TransactionHistoryDTO> historyList;
    static TransactionHistoryDAO historyData = new TransactionHistoryDAO();
    
    public ArrayList readDAO()
    {
        return historyData.readData();
    }
    
    void readData()
    {
        if(historyList == null)
            historyList = new ArrayList<TransactionHistoryDTO>();
        historyList = historyData.readData();
    }
    
    void add(TransactionHistoryDTO history)
    {
        historyData.add(history);
        historyList.add(history);
    }
    
    void delete(String ID)
    {
        historyData.delete(ID);
        historyList.removeIf(history -> history.getTransID().equals(ID));
    }
    
    TransactionHistoryBUS()
    {
        readData();
    }
    
    public CustomerDTO getCustomer(String ID)
    {
        return historyData.getCustomer(ID);
    }
    
    ArrayList<TransactionHistoryDTO> searchByID(String ID)
    {
        ArrayList<TransactionHistoryDTO> matchingHistory = new ArrayList<>();
        for(TransactionHistoryDTO history : historyList)
        {
            if(history.getTransID().contains(ID))
            {
                matchingHistory.add(history);
            }
        }
        return matchingHistory;
    }
    
    ArrayList<TransactionHistoryDTO> searchBySenderID(String ID)
    {
        ArrayList<TransactionHistoryDTO> matchingHistory = new ArrayList<>();
        for(TransactionHistoryDTO history : historyList)
        {
            if(history.getSenderID().contains(ID))
            {
                matchingHistory.add(history);
            }
        }
        return matchingHistory;
    }
    
    ArrayList<TransactionHistoryDTO> searchBySenderName(String name)
    {
        ArrayList<TransactionHistoryDTO> matchingHistory = new ArrayList<>();
        for(TransactionHistoryDTO history : historyList)
        {
            if(history.getSenderName().toLowerCase().contains(name.toLowerCase()))
            {
                matchingHistory.add(history);
            }
        }
        return matchingHistory;
    }
    
    ArrayList<TransactionHistoryDTO> searchByReceiverID(String ID)
    {
        ArrayList<TransactionHistoryDTO> matchingHistory = new ArrayList<>();
        for(TransactionHistoryDTO history : historyList)
        {
            if(history.getReceiverID().contains(ID))
            {
                matchingHistory.add(history);
            }
        }
        return matchingHistory;
    }
    
    ArrayList<TransactionHistoryDTO> searchByReceiverName(String name)
    {
        ArrayList<TransactionHistoryDTO> matchingHistory = new ArrayList<>();
        for(TransactionHistoryDTO history : historyList)
        {
            if(history.getReceiverName().toLowerCase().contains(name.toLowerCase()))
            {
                matchingHistory.add(history);
            }
        }
        return matchingHistory;
    }
    
    public boolean checkIDExist(String ID)
    {
        return historyData.checkIDExist(ID);
    }
    
    public String generateID()
    {
        String prefix = "TRN";
        String transID = null;
        boolean isUnique = false;
        Random rand = new Random();
        int num;
        while(!isUnique)
        {
            num = rand.nextInt(90000) + 10000;
            transID = prefix + num;
            if(checkIDExist(transID) == false)
                isUnique = true;
        }
        return transID;
    }
    
    
}
