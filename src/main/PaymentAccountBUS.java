
package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PaymentAccountBUS {
    ArrayList<PaymentAccountDTO> accList;
    static PaymentAccountDAO accData = new PaymentAccountDAO();
    
    public ArrayList readDAO()
    {
        return accData.readData();
    }
    
    void readData()
    {
        if(accList == null)
            accList = new ArrayList<PaymentAccountDTO>();
        accList = accData.readData();
    }
    
    void add(PaymentAccountDTO account)
    {
        accData.add(account);
        accList.add(account);
    }
    
    void delete(String ID)
    {
        accData.delete(ID);
        accList.removeIf(acc -> acc.getAccountID().equals(ID));
    }
    
    void deleteByCustomer(String ID)
    {
        accData.deleteByCustomer(ID);
        for(Iterator<PaymentAccountDTO> iter = accList.iterator(); iter.hasNext(); )
        {
            PaymentAccountDTO account = iter.next();
            if(account.getCustomerID().equals(ID))
            {
                iter.remove();
            }
        }
    }
    
    void edit(String ID, PaymentAccountDTO account)
    {
        accData.edit(ID, account);
        accList.removeIf(acc -> acc.getAccountID().equals(ID));
        accList.add(account);
    }
    
    public CustomerDTO getOwner(String ID)
    {
        return accData.getOwner(ID);
    }
    
    public CustomerDTO getOwnerByNumber(String Number)
    {
        String cusID = accData.getOwnerIDByNum(Number);
        
        return accData.getOwner(cusID);
    }
    
    public long getBalanceByNumber(String number)
    {
        long balance = 0;
        for(PaymentAccountDTO account : accList)
        {
            if(account.getAccountNumber().contains(number))
            {
                balance = account.getAccountBalance();
            }
        }
        return balance;
    }
    
    public PaymentAccountDTO getAccByNum(String num)
    {
        return accData.getAccByNum(num);
    }
    
    PaymentAccountBUS()
    {
        readData();
    }
    
    ArrayList<PaymentAccountDTO> searchByID(String ID)
    {
        ArrayList<PaymentAccountDTO> matchingAccounts = new ArrayList<>();
        for(PaymentAccountDTO account : accList)
        {
            if(account.getAccountID().contains(ID))
            {
                matchingAccounts.add(account);
            }
        }
        return matchingAccounts;
    }
    
    ArrayList<PaymentAccountDTO> searchByNumber(String Number)
    {
        ArrayList<PaymentAccountDTO> matchingAccounts = new ArrayList<>();
        for(PaymentAccountDTO account : accList)
        {
            if(account.getAccountNumber().contains(Number))
            {
                matchingAccounts.add(account);
            }
        }
        return matchingAccounts;
    }
    
    ArrayList<PaymentAccountDTO> searchByOwnerID(String ID)
    {
        ArrayList<PaymentAccountDTO> matchingAccounts = new ArrayList<>();
        for(PaymentAccountDTO account : accList)
        {
            if(account.getCustomerID().contains(ID))
            {
                matchingAccounts.add(account);
            }
        }
        return matchingAccounts;
    }
    
    ArrayList<PaymentAccountDTO> searchByOwnerName(String Name)
    {
        ArrayList<PaymentAccountDTO> matchingAccounts = new ArrayList<>();
        for(PaymentAccountDTO account : accList)
        {
            if(account.getCustomerName().toLowerCase().contains(Name.toLowerCase()))
            {
                matchingAccounts.add(account);
            }
        }
        return matchingAccounts;
    }
    
    ArrayList<PaymentAccountDTO> searchByCreatedDate(String Date)
    {
        ArrayList<PaymentAccountDTO> matchingAccounts = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(PaymentAccountDTO account : accList)
        {
            LocalDate createdDay = account.getCreatedDate();
            String formattedCreatedDay = createdDay.format(formatter);
            if(formattedCreatedDay.equals(Date))
            {
                matchingAccounts.add(account);
            }
        }
        return matchingAccounts;
    }
    
    
    public boolean checkIDExist(String ID)
    {
        return accData.checkIDExist(ID);   
    }
    
    public boolean checkNumberExist(String number)
    {
        return accData.checkAccNumber(number);
    }
    
    public String generateID()
    {
        String prefix = "ACC";
        String accountID = null;
        boolean isUnique = false;
        Random rand = new Random();
        int num;
        while(!isUnique)
        {
            num = rand.nextInt(90000) + 10000;
            accountID = prefix + num;
            if(checkIDExist(accountID) == false)
                isUnique = true;
        }
        return accountID;
    }
    
    public String generateAccNumber()
    {
        String accountNumber = null;
        int num;
        boolean isUnique = false;
        Random rand = new Random();
        while(!isUnique)
        {
            num = rand.nextInt(90000000) + 10000000;
            accountNumber = num + "";
            if(checkNumberExist(accountNumber) == false)
                isUnique = true;
        }
        return accountNumber;
    }
}
