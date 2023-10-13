/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author DUC PHU
 */
public class PassBookTypeDTO {
    String typeID, MonthPeriod;
    int period;
    float interestRate;

    public String getTypeID() {
        return typeID;
    }

    public String getMonthPeriod() {
        return MonthPeriod;
    }

    public int getPeriod() {
        return period;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public void setMonthPeriod(String MonthPeriod) {
        this.MonthPeriod = MonthPeriod;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    
    
}
