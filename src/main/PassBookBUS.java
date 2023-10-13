/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
//import static main.CustomerBUS.cusList;
//import static main.CustomerBUS.customerDATA;

/**
 *
 * @author DUC PHU
 */
public class PassBookBUS {
    public ArrayList<PassBookDTO> bookList;
    static PassBookDAO bookData = new PassBookDAO();
    
    public ArrayList readDAO()
    {
        return bookData.List();
    }
    
    void readData()
    {
        if(bookList == null)
            bookList = new ArrayList<PassBookDTO>();
        bookList = bookData.List();
    }
    
    PassBookBUS()
    {
        readData();
    }
    
    void add(PassBookDTO book)
    {
        bookData.add(book);
        bookList.add(book);
    }
    
    void delete(String ID)
    {
        bookData.delete(ID);
        bookList.removeIf(book -> book.getID().equals(ID));
    }
    
    void edit(String ID, PassBookDTO book)
    {
        bookData.edit(ID, book);
        bookList.removeIf(bookTemp -> bookTemp.getID().equals(ID));
        bookList.add(book);
    }
    
    ArrayList<PassBookDTO> searchByID(String ID)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(book.getID().contains(ID))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> searchByCustomerID(String ID)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(book.getCustomerID().contains(ID))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> searchByBranchID(String ID)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(book.getBranchID().contains(ID))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> searchByCreatedDate(java.time.LocalDate date)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(PassBookDTO book: bookList)
        {
            LocalDate createdDay = book.getCreatedDate();
            String formattedCreatedDay = createdDay.format(formatter);
            if(formattedCreatedDay.equals(date))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> searchByDepositDate(java.time.LocalDate date)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(PassBookDTO book: bookList)
        {
            LocalDate createdDay = book.getDepositDate();
            String formattedCreatedDay = createdDay.format(formatter);
            if(formattedCreatedDay.equals(date))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> searchByStatus(String status)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(book.getStatus().contains(status))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> DepositedBooks()
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(book.getStatus().equals("Đợi đáo hạn"))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> CurrentBooksByCusID(String ID)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(( book.getStatus().equals("Trong kỳ hạn") || book.getStatus().equals("Đợi đáo hạn")) && book.getCustomerID().equals(ID))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    ArrayList<PassBookDTO> NotCurrentBooksByCusID(String ID)
    {
        ArrayList<PassBookDTO> matchingBooks = new ArrayList<>();
        for(PassBookDTO book: bookList)
        {
            if(!(book.getStatus().equals("Trong kỳ hạn")) && book.getCustomerID().equals(ID))
            {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    public boolean checkIDExist(String ID)
    {
        return bookData.checkIDExist(ID);
    }
    
    public String generateID()
    {
        String prefix = "PB";
        String bookID = null;
        boolean isUnique = false;
        Random rand = new Random();
        int num;
        while(!isUnique)
        {
            num = rand.nextInt(900) + 100;
            bookID = prefix + num;
            if(checkIDExist(bookID) == false)
                isUnique = true;
        }
        return bookID;
    }
}
