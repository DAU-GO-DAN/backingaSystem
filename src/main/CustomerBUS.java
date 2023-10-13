
package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class CustomerBUS {
     ArrayList<CustomerDTO> cusList;
    static CustomerDAO customerDATA = new CustomerDAO();
    
    
    
    
    public ArrayList readDAO()
    {
        
        return customerDATA.readCusList();
    }
    void readData()
    {
        
        if(cusList == null)
            cusList = new ArrayList<CustomerDTO>();
        cusList = customerDATA.readCusList();
    }
    
    CustomerBUS()
    {
        readData();
    }
    
    void add(CustomerDTO cusTemp)
    {
        
        customerDATA.add(cusTemp);
        cusList.add(cusTemp);
    }
    
    void createNewCustomer()
    {
        
    }
    
    void print()
    {
        for(CustomerDTO customer : cusList)
        {
            System.out.println("Mã khách hàng: " + customer.getCustomerID());
            System.out.println("Tên khách hàng: " + customer.getCusFirstName() + " " + customer.getCusLastName());
            System.out.println("-----------------------------------------------------");
        }
    }
    
    void delete(String ID)
    {
        
        customerDATA.delete(ID);
        cusList.removeIf(cus -> cus.getCustomerID().equals(ID));
    }
    
    void edit(CustomerDTO cusTemp, String ID)
    {
        
        customerDATA.edit(ID, cusTemp);
        cusList.removeIf(cus -> cus.getCustomerID().equals(ID));
        cusList.add(cusTemp);
    }
    
    public CustomerDTO getCustomer(String ID)
    {
        CustomerDTO customerTemp = new CustomerDTO();
        for(CustomerDTO customer : cusList)
        {
            if(customer.getCustomerID().equals(ID))
            {
                customerTemp = customer;
            }
        }
        return customerTemp;
    }
    
    public String getCustomerNameByID(String ID)
    {
        CustomerDTO customerTemp = new CustomerDTO();
        for(CustomerDTO customer : cusList)
        {
            if(customer.getCustomerID().equals(ID))
            {
                customerTemp = customer;
            }
        }
        return customerTemp.getCusFullName();
    }
    
    public CustomerDTO loginCustomer(String username)
    {
        
        return customerDATA.loginCustomer(username);
    }
    
    ArrayList<CustomerDTO> searchByID(String ID)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        for(CustomerDTO customer : cusList)
        {
            if(customer.getCustomerID().contains(ID))
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByName(String Name)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        for(CustomerDTO customer : cusList)
        {
            if(customer.getCusFullName().toLowerCase().contains(Name.toLowerCase()))
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByPhone(String Phone)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        for(CustomerDTO customer : cusList)
        {
            if(customer.getPhone().contains(Phone))
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByEmail(String Email)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        for(CustomerDTO customer : cusList)
        {
            if(customer.getEmail().contains(Email))
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByBirthDay(String Date)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(CustomerDTO customer : cusList)
        {
            
            LocalDate birthDay = customer.getBirthDay();
            String formattedBirthDay = birthDay.format(formatter);
            if(formattedBirthDay.equals(Date))
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByMonthOB(int Month)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        for(CustomerDTO customer : cusList)
        {
            int month = customer.getBirthDay().getMonthValue();
            if(month == Month)
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByYearOB(int Year)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        for(CustomerDTO customer : cusList)
        {
            int year = customer.getBirthDay().getYear();
            if(year == Year)
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    }
    
    ArrayList<CustomerDTO> searchByCreatedDay(String Date)
    {
        ArrayList<CustomerDTO> matchingCustomers = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(CustomerDTO customer : cusList)
        {
            
            LocalDate createdDay = customer.getDayCreated();
            String formattedCreatedDay = createdDay.format(formatter);
            if(formattedCreatedDay.equals(Date))
            {
                matchingCustomers.add(customer);
            }
        }
        return matchingCustomers;
    } 
    
    public boolean checkIDExist(String ID)
    {
        boolean isExist = false;
        
        isExist = customerDATA.checkIDExist(ID);
        return isExist;
    }
    
    public String generateID()
    {
        String prefix = "KH";
        String customerID = null;
        boolean isUnique = false;
        Random rand = new Random();
        int num;
        while(!isUnique)
        {
            num = rand.nextInt(900000) + 100000;
            customerID = prefix + num;
            if(checkIDExist(customerID) == false)
                isUnique = true;
        }
        return customerID;
    }
    
    public boolean loginCheck(String username, String password)
    {
        boolean isCorrect = false;
        
        isCorrect = customerDATA.loginCheck(username, password);
        return isCorrect;
    }
}
