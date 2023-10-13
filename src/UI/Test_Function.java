/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author DUC PHU
 */
public class Test_Function {
    
    static private String generateRateID(String monthPeriod) {
        // Extract the numeric value from monthPeriod
        String[] parts = monthPeriod.split(" ");
        int months = Integer.parseInt(parts[0]);

        // Generate the rateID
        String rateID = "LS" + String.format("%02d", months);
        return rateID;
    }
    
    public static void main(String args[]) {
//        System.out.println(generateRateID("24 tháng"));

        String monthPeriod = "4 tháng";
        int numberOfMonths = Integer.parseInt(monthPeriod.split(" ")[0]);
        System.out.println(numberOfMonths);
    }
}
