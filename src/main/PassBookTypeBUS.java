/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
//import static main.CustomerBUS.cusList;

/**
 *
 * @author DUC PHU
 */
public class PassBookTypeBUS {
    public ArrayList<PassBookTypeDTO> typeList;
    static PassBookTypeDAO typeData = new PassBookTypeDAO();
    
    public ArrayList readDAO()
    {
        return typeData.readPBTypeList();
    }
    
    public void readData()
    {
        if(typeList == null)
            typeList = new ArrayList<PassBookTypeDTO>();
        typeList = typeData.readPBTypeList();
    }
    
    PassBookTypeBUS ()
    {
        readData();
    }
    
    void add(PassBookTypeDTO type)
    {
        typeData.add(type);
        typeList.add(type);
    }
    
    void delete(String ID)
    {
        typeData.delete(ID);
        typeList.removeIf(type -> type.getTypeID().equals(ID));
    }
    
    void edit(String ID, PassBookTypeDTO typeTemp)
    {
        typeData.edit(ID, typeTemp);
        typeList.removeIf(type -> type.getTypeID().equals(ID));
        typeList.add(typeTemp);
    }
    
    public String outputIDByMonth(String month)
    {
        PassBookTypeDTO typeTemp = new PassBookTypeDTO();
        for(PassBookTypeDTO type : typeList)
        {
            if(type.getMonthPeriod().equals(month))
            {
                typeTemp = type;
            }
        }
        return typeTemp.getTypeID();
    }
    
    public float outputRateByMonth(String month)
    {
        PassBookTypeDTO typeTemp = new PassBookTypeDTO();
        for(PassBookTypeDTO type : typeList)
        {
            if(type.getMonthPeriod().equals(month))
            {
                typeTemp = type;
            }
        }
        return typeTemp.getInterestRate();
    }
    
    public int outputPeriodByMonth(String month)
    {
        PassBookTypeDTO typeTemp = new PassBookTypeDTO();
        for(PassBookTypeDTO type : typeList)
        {
            if(type.getMonthPeriod().equals(month))
            {
                typeTemp = type;
            }
        }
        return typeTemp.getPeriod();
    }
    
    ArrayList<PassBookTypeDTO> searchByID(String ID)
    {
        ArrayList<PassBookTypeDTO> matchingTypes = new ArrayList<>();
        for(PassBookTypeDTO type : typeList)
        {
            if(type.getTypeID().contains(ID))
            {
                matchingTypes.add(type);
            }
        }
        return matchingTypes;
    }
    
    ArrayList<PassBookTypeDTO> searchByMonth(String month)
    {
        ArrayList<PassBookTypeDTO> matchingTypes = new ArrayList<>();
        for(PassBookTypeDTO type : typeList)
        {
            if(type.getMonthPeriod().contains(month))
            {
                matchingTypes.add(type);
            }
        }
        return matchingTypes;
    }
    
    ArrayList<PassBookTypeDTO> searchByInterest(float interest)
    {
        float EPSILON = 0.00001f;
        ArrayList<PassBookTypeDTO> matchingTypes = new ArrayList<>();
        for(PassBookTypeDTO type : typeList)
        {
            if( (Math.abs(type.getInterestRate() - interest) < EPSILON) )
            {
                matchingTypes.add(type);
            }
        }
        return matchingTypes;
    }
    
    public boolean checkMonthExist(String Month)
    {
        
        return typeData.checkMonthExist(Month);
        
    }
    
    public String generateID(String month)
    {
        String[] parts = month.split(" ");
        int months = Integer.parseInt(parts[0]);

        // Generate the rateID
        return "LS" + String.format("%02d", months);
        
                
    }
}
