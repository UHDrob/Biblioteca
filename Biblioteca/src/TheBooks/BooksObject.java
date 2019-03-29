/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBooks;

import java.util.Scanner;

/**
 * Created Mar 28, 2019
 * @author Roberto Gomez
 */
public class BooksObject 
{
    String filepath = "books.txt";
    private static Scanner x;
    
// Define STATE
    public static class  Book
    {
        private String bookIdArray;
        private String bookTitleArray;
        private String barcodeArray;
        private String bookDateArray;
        private String categoryArray;
        private String bookTypeArray;
        private String publisherArray;
        private String bookPriceArray;

// Define CONSTRUCTOR
        public Book (String bookID, String bTitle, String bCode, String cat, String bType, String pub, String Phone, String bPrice)
        {
            this.bookIdArray = bookID;
            this.bookTitleArray = bTitle;
            this.barcodeArray = bCode;
            this.bookDateArray = cat;
            this.categoryArray = bType;
            this.bookTypeArray = pub;
            this.publisherArray = pub;
            this.bookPriceArray = bPrice;
        }   

    public String getbookid()
    {
        return bookIdArray;
    }
    
    public String getbooktitle()
    {
        return bookTitleArray;
    }
    
    public String getbarcode()
    {
        return barcodeArray;
    }
    
    public String getbookday()
    {
        return bookDateArray;
    }
    
    public String getcategory()
    {
        return categoryArray;
    }
    
    public String getbooktype()
    {
        return bookTypeArray;
    }
    
    public String getpublisher()
    {
        return publisherArray;
    }
    
    public String getbookprice()
    {
        return bookPriceArray;
    }
    



    }
}
