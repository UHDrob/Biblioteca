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
        private String authorArray;
        private String isbnArray;
        private String genreArray;
        private String priceArray;
        private String mediaTypeArray;


// Define CONSTRUCTOR
        public Book (String bookID, String bTitle, String bAuthor, String isbn, String bGenre, String price, String mediaType)
        {
            this.bookIdArray = bookID;
            this.bookTitleArray = bTitle;
            this.authorArray = bAuthor;
            this.isbnArray = isbn;
            this.genreArray = bGenre;
            this.priceArray = price;
            this.mediaTypeArray = mediaType;
        }   
        
        public String getbookid()
        {
            return bookIdArray;
        }
    
        public String getbooktitle()
        {
            return bookTitleArray;
        }
    
        public String getauthor()
        {
            return authorArray;
        }
    
        public String getisbn()
        {
            return isbnArray;
        }
    
        public String getgenre()
        {
            return genreArray;
        }
    
        public String getprice()
        {
            return priceArray;
        }
    
        public String getmediaType()
        {
            return mediaTypeArray;
        }
    
    }
}
