/*
 * INVENTORY FORM
 * FIELDS:  BookID, Book Title, BarCode, Book Date, Category, Book Type, Publisher, Price
 * FILE:   book.txt
 */
package TheBooks;


import TheBooks.BooksObject.Book;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Created Mar 23 2019
 * Modified Mar 26 2019
 * @author Roberto Gomez
 * @version 2
 */
public class Inventory extends javax.swing.JInternalFrame {

    /**
     * Feb 19, 2019 Roberto: Creates new form AddMember
     */
    public Inventory() {
        initComponents();
        // Feb 20, 2019 Roberto: Update the Table
        Show_Books_In_JTable();
    }
    
    // Feb 20 2019 Roberto: This is the file that has all the data for this package
    String filepath = "book.txt";
    private static Scanner x;
    
   // Feb 19, 2019 Roberto: This section search for a Record in the file by Employee ID
        public static void searchBooks (String searchterm, String filepath) throws FileNotFoundException
        {
            boolean found = false;
            String bookid = "";
            String booktitle = "";
            String barcode = "";
            String bookdate;
            String category;
            String booktype;
            String publisher;
            String bookprice;
            
            try
            {
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");
                
                while(x.hasNext() && !found )
                {
                    bookid = x.next();
                    booktitle = x.next();
                    barcode = x.next();
                    bookdate = x.next();                
                    category = x.next();
                    booktype = x.next();
                    publisher = x.next();
                    bookprice = x.next();
                    
                    if ( booktitle.equals(searchterm))
                    {
                        found = true;
                    }
                }
                if (found)
                {
                    JOptionPane.showMessageDialog(null, "Book ID: " + bookid
                            + "\nBook Title: " + booktitle
                            + "\nBarcode: " + barcode);                            
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"record NOT found");
                }                
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }   
        }
    
        // Feb 19, 2019 Roberto: This section will save the new record in the file
        public static void saveRecord(String bID, String bTitle, String bCode, String bDate, String cat, String bType, String pub, String bPrice, String FilePath)
        {
            try
            {
                FileWriter fw = new FileWriter(FilePath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                pw.println(bID + ", " + bTitle + ", " + bCode + ", "
                        + bDate + ", " + cat + ", " + bType + ", "
                        + pub + ", " + bPrice + "\n");
                pw.flush();
                pw.close();
                
                JOptionPane.showMessageDialog(null, "Record Saved");
            }
            catch (Exception E)
            {
                JOptionPane.showMessageDialog(null, "Record NOT saved");
            }
        }
        
        // Mar 29, 2019 Roberto:  Save ArrayList to File
        public void save(String fileName) throws FileNotFoundException 
        {
            try (PrintWriter pw = new PrintWriter(new FileOutputStream(fileName))) 
            {
                    ArrayList<Book> books = new ArrayList<Book>();
                  // for (Book bookList : books)
                  //     pw.println(books.getBook());
            }
        }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_booktitle = new javax.swing.JLabel();
        lbl_titleBooks = new javax.swing.JLabel();
        txt_searchBookTitle = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panel_table = new javax.swing.JScrollPane();
        jTable_Books = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_booktitle.setText("Book Title");
        jPanel1.add(lbl_booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        lbl_titleBooks.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_titleBooks.setText("INVENTORY");
        jPanel1.add(lbl_titleBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));
        jPanel1.add(txt_searchBookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 9, 310, 30));

        btn_search.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 150, 40));

        btn_print.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 60));

        jTable_Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Title", "Barcode", "Book Date", "Category", "Book Type", "Publisher", "Book Price"
            }
        ));
        jTable_Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BooksMouseClicked(evt);
            }
        });
        panel_table.setViewportView(jTable_Books);

        jPanel1.add(panel_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 102, 930, 380));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 530));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 980, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // Feb 19, 2019 Roberto: This section will search by Account
        String searchterm = txt_searchBookTitle.getText();
        try {
            searchBooks(searchterm, filepath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "SEARCH ERROR");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void jTable_BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BooksMouseClicked
        // Mar 26, 2019 Roberto:  Selection from table
        int index = jTable_Books.getSelectedRow();
       
    }//GEN-LAST:event_jTable_BooksMouseClicked

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("University of Houston - Downtown     LIBRARY");
        MessageFormat footer = new MessageFormat(" Inventory Report");
        try{
            jTable_Books.print(JTable.PrintMode.FIT_WIDTH, header,footer);
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null, "Cannot Print");
        }
    }//GEN-LAST:event_btn_printActionPerformed

    
    
    // Define BEHAVIOR
        public ArrayList<Book> getListBooks()
        {
            String bookID = ""; 
            String bookTitle = ""; 
            String barcode = "";
            String bookDate = "";
            String category = "";
            String bookType = "";
            String publisher = "";
            String bookPrice = "";
            
            ArrayList<Book> bookArrayList = new ArrayList<Book>();

            try
            {
               
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");

                while (  x.hasNext() )
                {
                    bookID = x.next();
                    bookTitle = x.next();
                    barcode = x.next();
                    bookDate = x.next();                
                    category = x.next();
                    bookType = x.next();
                    publisher = x.next();
                    bookPrice = x.next();
                                  
                    Book line = new Book(bookID, bookTitle, barcode, bookDate, category, bookType, publisher, bookPrice);
                    bookArrayList.add(line);
                }
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null, "Error!" + e); // e
            }

            return bookArrayList;
        
        }
        
    // Feb 19, 2019 Roberto: For the ArrayList Part C 
        public void Show_Books_In_JTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTable_Books.getModel();
        model.setRowCount(0);
     
        ArrayList<Book> list = getListBooks();
       
        Object rowData[] = new Object[8];
        for(int i=0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getbookid();
            rowData[1] = list.get(i).getbooktitle();
            rowData[2] = list.get(i).getbarcode();
            rowData[3] = list.get(i).getbookday();
            rowData[4] = list.get(i).getcategory();
            rowData[5] = list.get(i).getbooktype();
            rowData[6] = list.get(i).getpublisher();
            rowData[7] = list.get(i).getbookprice();
            model.addRow(rowData);
        }
        
    }
    
  
      // Mar 23, 2019 Roberto : ReadFileMembers set filename and confirm for debugging
        public void ReadFileBooks(String fileName)
        {

            boolean found = false;
            String bookID = ""; 
            String bookTitle = ""; 
            String barcode = "";
            String bookDate ="";
            String category = "";
            String bookType = "";
            String publisher = "";
            String bookPrice = "";
            
            try
            {
                x = new Scanner(new File(fileName));
                x.useDelimiter("[,\n]");
                while(x.hasNext() )
                {
                    bookID = x.next();
                    bookTitle = x.next();
                    barcode = x.next();
                    bookDate = x.next();
                    category = x.next();
                    bookType = x.next();
                    publisher = x.next();
                    JOptionPane.showMessageDialog(null, publisher);
                    bookPrice = x.next();

                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }      
        

        

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable_Books;
    private javax.swing.JLabel lbl_booktitle;
    private javax.swing.JLabel lbl_titleBooks;
    private javax.swing.JScrollPane panel_table;
    private javax.swing.JTextField txt_searchBookTitle;
    // End of variables declaration//GEN-END:variables
}
