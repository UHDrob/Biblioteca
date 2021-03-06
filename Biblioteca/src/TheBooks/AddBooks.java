/*
 * BOOKS FORM
 * FIELDS:  BookID, Book Title, Author, ISBN, Genre, Price, Media Type
 * FILE:   book.txt
 */
package TheBooks;


import TheBooks.BooksObject.Book;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 * Created Mar 23 2019
 * Modified Mar 26 2019
 * @author Roberto Gomez
 * @version 2
 */
public class AddBooks extends javax.swing.JInternalFrame {

    /**
     * Feb 19, 2019 Roberto: Creates new form AddMember
     */
    public AddBooks() {
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
            String author = "";
            String genre = "";
            String isbn;
            String price;
            String mediaType;
            
            try
            {
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");
                
                while(x.hasNext() && !found )
                {
                    bookid = x.next();
                    booktitle = x.next();
                    author = x.next();
                    genre = x.next();
                    isbn = x.next();
                    price = x.next();
                    mediaType = x.next();
                    
                    if ( bookid.equals(searchterm))
                    {
                        found = true;
                    }
                }
                if (found)
                {
                    JOptionPane.showMessageDialog(null, "Account: " + bookid
                            + "\nBook Title: " + booktitle
                            + "\nBarcode: " + author);                            
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
        public static void saveRecord(String bID, String bTitle, String bAuthor, String bGenre, String isbn, String bPrice, String bMedia, String FilePath)
        {
            try
            {
                FileWriter fw = new FileWriter(FilePath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                pw.println(bID + ", " + bTitle + ", " + bAuthor+ ", "
                         + bGenre+ ", "+ isbn + ", " + bPrice+ ", " + bMedia +"\n");
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
        lbl_titleBooks = new javax.swing.JLabel();
        txt_searchBookID = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_account = new javax.swing.JLabel();
        lbl_firstName = new javax.swing.JLabel();
        lbl_lastName = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        txt_bookID = new javax.swing.JTextField();
        txt_bookTitle = new javax.swing.JTextField();
        txt_author = new javax.swing.JTextField();
        combo_category = new javax.swing.JComboBox<>();
        combo_booktype = new javax.swing.JComboBox<>();
        txt_isbn = new javax.swing.JTextField();
        txt_bookPrice = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Books = new javax.swing.JTable();
        lbl_control = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titleBooks.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_titleBooks.setText("Add Book");
        jPanel1.add(lbl_titleBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));
        jPanel1.add(txt_searchBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 9, 240, 30));

        btn_search.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 150, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 60));

        lbl_account.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_account.setText("Book ID");
        jPanel1.add(lbl_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lbl_firstName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_firstName.setText("Book Title");
        jPanel1.add(lbl_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lbl_lastName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_lastName.setText("Author");
        jPanel1.add(lbl_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lbl_gender.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_gender.setText("Genre");
        jPanel1.add(lbl_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        lbl_email.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_email.setText("Media Type");
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        lbl_phone.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_phone.setText("ISBN ");
        jPanel1.add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        lbl_status.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_status.setText("Book Price");
        jPanel1.add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));
        jPanel1.add(txt_bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, 30));
        jPanel1.add(txt_bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, 30));
        jPanel1.add(txt_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 160, 30));

        combo_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "FIction", "Non-Fiction" }));
        combo_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_categoryActionPerformed(evt);
            }
        });
        jPanel1.add(combo_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 150, 30));

        combo_booktype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "book", "video", "audio" }));
        jPanel1.add(combo_booktype, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 150, 30));
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 160, 30));
        jPanel1.add(txt_bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 160, 30));

        btn_clear.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 150, 40));

        btn_add.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 150, 40));

        btn_update.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_update.setText("UPDATE");
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 150, 40));

        btn_delete.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 150, 40));

        jTable_Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Title", "Author", "ISBN", "Genre", "Price", "Media Type"
            }
        ));
        jTable_Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BooksMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Books);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 302, 930, 220));

        lbl_control.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lbl_control, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 190, 210));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 980, 480));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 950, 230));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 530));

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

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // Feb 19, 2019 Roberto: This section will add the new record to the file
        if (checkInputs())    // verify the fields are not empty
        {
            String ID = txt_bookID.getText();
            String title = txt_bookTitle.getText();
            String author = txt_author.getText();
            
            //SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); //  yyyy-MM-dd
            //String addDate = dateFormat.format(txt_bookDate.getDate());
            //String birthday = addDate;
            
            //String gender = combo_category.getSelectedItem().toString();
            String isbn = txt_isbn.getText();
            String price = txt_bookPrice.getText();
            
            String media = combo_booktype.getSelectedItem().toString();
            String genre = combo_category.getSelectedItem().toString();
            if (!"Select Category".equals(combo_category)&& !"Select Type".equals(combo_booktype) )
            {
                saveRecord(ID, title, author, isbn, genre, price, media, filepath);
            
                JOptionPane.showMessageDialog(null, "New Book has been created");
                Show_Books_In_JTable();
            }    
        }
        else
        {
            JOptionPane.showMessageDialog(null, "One or More Fields are Empty");
        }   
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // Feb 19, 2019 Roberto: This section will search by Account
        String searchterm = txt_searchBookID.getText();
        try {
            searchBooks(searchterm, filepath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "SEARCH ERROR");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        
        // Feb 19, 2019 Roberto; This section will search by Account
        txt_bookID.setText(null);
        txt_bookTitle.setText(null);
        txt_author.setText(null);
        txt_bookPrice.setText(null);
        txt_isbn.setText(null);
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jTable_BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BooksMouseClicked
        // Mar 26, 2019 Roberto:  Selection from table
        int index = jTable_Books.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable_BooksMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if(!txt_bookID.getText().equals(""))
        {
            int index = jTable_Books.getSelectedRow();
           ((DefaultTableModel)jTable_Books.getModel()).removeRow(index); 
            JOptionPane.showMessageDialog(null,"Record has been DELETED!");
        }else{
        JOptionPane.showMessageDialog(null,"Book Not Deleted: No Book ID to Delete");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void combo_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_categoryActionPerformed

    
    
    // Define BEHAVIOR
        public ArrayList<Book> getListBooks()
        {
            String bookID = ""; 
            String bookTitle = ""; 
            String author = "";
            String isbn = "";
            String genre = "";
            String price = "";
            String mediaType = "";
            
            ArrayList<Book> bookArrayList = new ArrayList<Book>();

            try
            {
               
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");

                while (  x.hasNext() )
                {
                    bookID = x.next();
                    bookTitle = x.next();
                    author = x.next();
                    isbn = x.next();                
                    genre = x.next();
                    price = x.next();
                    mediaType = x.next();
                                  
                    Book line = new Book(bookID, bookTitle, author, isbn, genre, price, mediaType);
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
        
        JTableHeader Theader = jTable_Books.getTableHeader();
        Theader.setBackground(Color.blue);
        Theader.setForeground(Color.WHITE );
        
        ArrayList<Book> list = getListBooks();
       
        Object rowData[] = new Object[7];
        for(int i=0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getbookid();
            rowData[1] = list.get(i).getbooktitle();
            rowData[2] = list.get(i).getauthor();
            rowData[3] = list.get(i).getisbn();
            rowData[4] = list.get(i).getgenre();
            rowData[5] = list.get(i).getprice();
            rowData[6] = list.get(i).getmediaType();
            model.addRow(rowData);
        }
        
    }
    
  
      // Mar 23, 2019 Roberto : ReadFileMembers set filename and confirm for debugging
        public void ReadFileBooks(String fileName)
        {

            boolean found = false;
            String bookID = ""; 
            String bookTitle = ""; 
            String author= "";
            String isbn ="";
            String genre = "";
            String price = "";
            String media = "";
            
            try
            {
                x = new Scanner(new File(fileName));
                x.useDelimiter("[,\n]");
                while(x.hasNext() )
                {
                    bookID = x.next();
                    bookTitle = x.next();
                    author = x.next();
                    isbn = x.next();
                    genre = x.next();
                    price = x.next();
                    media = x.next();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }      
        
   // Feb 19 2019 Roberto: Check Input Fields to verify they are not empty
        public boolean checkInputs()
        {
            if (    // check to make sure all fields have a value  
                txt_bookID.getText().equals("") 
                || txt_bookTitle.getText().equals("")
                || txt_author.getText().equals("")   
                || txt_isbn.getText().equals("")    
                || txt_bookPrice.getText().equals(""))
            {
                return false;
            } 
            else
            {
                return true;
            }
        }
        
    
          // Show Data In Inputs
    public void ShowItem(int index)
    {
                    txt_bookID.setText(getListBooks().get(index).getbookid());
                    txt_bookTitle.setText(getListBooks().get(index).getbooktitle());
                    txt_author.setText(getListBooks().get(index).getauthor());
                    
                    
                    if ( getListBooks().get(index).getgenre().equals("Fiction"))
                            {   
                                combo_category.setSelectedItem("Fiction");
                            }
                    else
                        {
                            combo_category.setSelectedItem("Non-Fiction");
                        }
 
                    
                    if ( getListBooks().get(index).getmediaType().equals("video"))
                            {   
                                combo_category.setSelectedItem("video");
                            }
                    else
                        {
                            combo_category.setSelectedItem("book");
                        }
        
                    
                    txt_isbn.setText(getListBooks().get(index).getisbn());
                    txt_bookPrice.setText(getListBooks().get(index).getprice());
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_booktype;
    private javax.swing.JComboBox<String> combo_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Books;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_control;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_titleBooks;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_bookID;
    private javax.swing.JTextField txt_bookPrice;
    private javax.swing.JTextField txt_bookTitle;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_searchBookID;
    // End of variables declaration//GEN-END:variables
}
