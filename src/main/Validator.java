
package main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

/**
 *
 * @author DUC PHU
 */
public class Validator {
    
    CustomerDAO cusData = new CustomerDAO();
    
    public boolean isEmpty(String string)
    {
        return string.trim().isEmpty();
    }
    
    public boolean isValidUsername(String username)
    {
        String pattern = "^(?![0-9])[A-Za-z0-9_]{7,14}$";
        return username.matches(pattern);
    }
    
    public boolean isExistedUsername(String username)
    {
        return cusData.UsernameCheck(username);
    }
    
    public boolean isExistedEmail(String email)
    {
        return cusData.EmailCheck(email);
    }
    
    public boolean isPassword(String password)
    {
        String pattern ="^.{8,}$";
        return password.matches(pattern);
    }
    
    public boolean isPasswordMatch(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
    
    public boolean isEmail(String email)
    {
        String pattern = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
        return email.matches(pattern);
    }
    
    public String isValidDate(String date)
    {
        String isDate = "DEFAULT";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            LocalDate dob = LocalDate.parse(date, formatter);
            LocalDate today = LocalDate.now();
            LocalDate minDate = today.minusYears(18);
            if(dob.isAfter(minDate))
            {
                isDate = "ILLEGAL";
            }
            else{
                isDate = "DEFAULT";
            }
        }
        catch(DateTimeParseException e){
            isDate = "ERROR";
        }
        return isDate;
    }
    
    public String toUIDate(LocalDate date)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = date.format(formatter);
        return dateString;
    }
    
    public LocalDate toDataDate(String dateString)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate formattedDate = LocalDate.parse(date.format(formatter));
        return formattedDate;
    }
    
    public String formatMoney(long amount)
    {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);
        return formatter.format(amount);
    }
    
    public boolean isExistAccNumber(String number)
    {
        PaymentAccountBUS accBus = new PaymentAccountBUS();
        return accBus.checkNumberExist(number);
    }
    
    public boolean isValidAccNumber(String number)
    {
        
        if (number.length() != 8) {
            return false;
        }
        
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}
