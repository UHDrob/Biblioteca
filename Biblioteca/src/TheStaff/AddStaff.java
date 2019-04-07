/*
 * STAFF FORM
 * FIELDS:  Accounts, First Name, Last Name, Birthday, Gender, Email, Phone, Status
 * FILE:   staff.txt
 */
package TheStaff;


import TheStaff.StaffObject.Staff;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 * Created Mar 23 2019
 * Modified April 4, 2019
 * @author Roberto Gomez
 * @version 2
 */
public class AddStaff extends javax.swing.JInternalFrame {

    /**
     * Feb 19, 2019 Roberto: Creates new form AddStaff
     */
    public AddStaff() {
        initComponents();
        // Feb 20, 2019 Roberto: Update the Table
        Show_Staff_In_JTable();
    }
    
    // Feb 20 2019 Roberto: This is the file that has all the data for this package
    String filepath = "staff.txt";
    private static Scanner x;
    ArrayList<Staff> updateList = getListStaff();
    
    
   // Feb 19, 2019 Roberto: This section search for a Record in the file by Employee ID
        public static void searchAccount (String searchterm, String filepath) throws FileNotFoundException
        {
            boolean found = false;
            String employeeID = "";
            String firstName = "";
            String lastName = "";
            String birthday;
            String gender;
            String username;
            String password;
            String email;
            String phone;
            String status;
            
            try
            {
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");
                
                while(x.hasNext() && !found )
                {
                    employeeID = x.next();
                    firstName = x.next();
                    lastName = x.next();
                    birthday = x.next();                
                    gender = x.next();
                    username = x.next();
                    password = x.next();
                    email = x.next();
                    phone = x.next();
                    status = x.next();
                    
                    if ( employeeID.equals(searchterm))
                    {
                        found = true;
                    }
                }
                if (found)
                {
                    JOptionPane.showMessageDialog(null, "Employee ID: " + employeeID
                            + "\nFirst Name: " + firstName
                            + "\nLast Name: " + lastName);
                            
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
        public static void saveRecord(String account, String FirstName, String LastName, String Birthday, String Gender, String Username, String Password, String Email, String Phone, String Status, String FilePath)
        {
            try
            {
                FileWriter fw = new FileWriter(FilePath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                pw.println(account + ", " + FirstName + ", " + LastName + ", "
                        + Birthday + ", " + Gender + ", " + Username + ", "
                        + Password + ", " + Email + ", "
                        + Phone + ", " + Status + "\n");
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
        public void save(String fileName) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(fileName))) 
        {
         //   
         //      
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
        lbl_titleMembers = new javax.swing.JLabel();
        lbl_accountLookup = new javax.swing.JLabel();
        txt_searchAccount = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_account = new javax.swing.JLabel();
        lbl_firstName = new javax.swing.JLabel();
        lbl_lastName = new javax.swing.JLabel();
        lbl_Birthday = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        txt_employeeid = new javax.swing.JTextField();
        txt_firstName = new javax.swing.JTextField();
        txt_lastName = new javax.swing.JTextField();
        txt_birthday = new com.toedter.calendar.JDateChooser();
        combo_gender = new javax.swing.JComboBox<>();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        combo_status = new javax.swing.JComboBox<>();
        btn_clear = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Staff = new javax.swing.JTable();
        lbl_control = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titleMembers.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_titleMembers.setText("Add Staff");
        jPanel1.add(lbl_titleMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        lbl_accountLookup.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        lbl_accountLookup.setText("Employee ID Lookup:");
        jPanel1.add(lbl_accountLookup, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 15, 140, 20));
        jPanel1.add(txt_searchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 9, 120, 30));

        btn_search.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 150, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 60));

        lbl_account.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_account.setText("Employee ID");
        jPanel1.add(lbl_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lbl_firstName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_firstName.setText("First Name");
        jPanel1.add(lbl_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbl_lastName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_lastName.setText("Last Name");
        jPanel1.add(lbl_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lbl_Birthday.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_Birthday.setText("Birthday");
        jPanel1.add(lbl_Birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        lbl_gender.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_gender.setText("Gender");
        jPanel1.add(lbl_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lbl_username.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_username.setText("Username");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        lbl_password.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_password.setText("Password");
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        lbl_email.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_email.setText("Email");
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lbl_phone.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_phone.setText("Phone");
        jPanel1.add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        lbl_status.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_status.setText("Status");
        jPanel1.add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));
        jPanel1.add(txt_employeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, 30));
        jPanel1.add(txt_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 160, 30));
        jPanel1.add(txt_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 30));

        txt_birthday.setDateFormatString("MM, dd, yyyy");
        txt_birthday.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txt_birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 30));

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "male", "female" }));
        jPanel1.add(combo_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, 30));
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 160, 30));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 30));
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 30));
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 160, 30));

        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "active", "inactive" }));
        jPanel1.add(combo_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 150, 30));

        btn_clear.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 150, 40));

        btn_add.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 150, 40));

        btn_update.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 150, 40));

        btn_delete.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 150, 40));

        jTable_Staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account", "First Name", "Last Name", "Birthday", "Gender", "Username", "Password", "Email", "Phone", "Status"
            }
        ));
        jTable_Staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_StaffMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Staff);

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
            String employeeID = txt_employeeid.getText();
            String firstname = txt_firstName.getText();
            String lastname = txt_lastName.getText();
            
            
            // String birthday = txt_birthday.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); //  yyyy-MM-dd
            String addDate = dateFormat.format(txt_birthday.getDate());
            String birthday = addDate;
            
            String gender = combo_gender.getSelectedItem().toString();
            //String gender = combo_gender.toString();
            
            String username = txt_username.getText();
            String password = txt_password.getText();
            
            String email = txt_email.getText();
            String phone = txt_phone.getText();
            String status = combo_status.getSelectedItem().toString();
             
            saveRecord(employeeID, firstname, lastname, birthday, gender, username, password, email, phone, status, filepath);
            
            JOptionPane.showMessageDialog(null, "New Staff has been created");
            Show_Staff_In_JTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "One or More Fields are Empty");
        }   
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // Feb 19, 2019 Roberto: This section will search by Account
        String searchterm = txt_searchAccount.getText();
        try {
            searchAccount(searchterm, filepath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "SEARCH ERROR");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        
        // Feb 19, 2019 Roberto; This section will search by Account
        txt_employeeid.setText(null);
        txt_firstName.setText(null);
        txt_lastName.setText(null);
        txt_username.setText(null);
        txt_password.setText(null);
        txt_email.setText(null);
        txt_phone.setText(null);
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jTable_StaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_StaffMouseClicked
        // Mar 26, 2019 Roberto:  Selection from table
        int index = jTable_Staff.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable_StaffMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if(!txt_employeeid.getText().equals(""))
        {
            // Feb 4 2019 Roberto: Delete from Table
            int index = jTable_Staff.getSelectedRow();
           ((DefaultTableModel)jTable_Staff.getModel()).removeRow(index); 
           
            // Feb 4 2019 Roberto: Delete from Array
            updateList.remove(index);
            clearAll();
            JOptionPane.showMessageDialog(null,"Record has been DELETED!");
            try {
                WriteFileStaff(filepath);
            } catch (IOException ex) {
                Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        JOptionPane.showMessageDialog(null,"Staff Not Deleted: No Staff ID to Delete");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if(!txt_employeeid.getText().equals(""))
        {
            // Feb 4 2019 Roberto: Update to Table
            int index = jTable_Staff.getSelectedRow();
           ((DefaultTableModel)jTable_Staff.getModel()).removeRow(index); 
           
            // Feb 4 2019 Roberto: Update to Array
            String account = txt_employeeid.getText();
            String firstname = txt_firstName.getText();
            String lastname = txt_lastName.getText();
            
            
            // String birthday = txt_birthday.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); //  yyyy-MM-dd
            String addDate = dateFormat.format(txt_birthday.getDate());
            String birthday = addDate;
            
            String gender = combo_gender.getSelectedItem().toString();
            //String gender = combo_gender.toString();
            
            String username = txt_username.getText();
            String password = txt_password.getText();
            
            String email = txt_email.getText();
            String phone = txt_phone.getText();
            String status = combo_status.getSelectedItem().toString();
             
            
            
            JOptionPane.showMessageDialog(null,"Record has been UPDATED!");
            try {
                WriteFileStaff(filepath);
            } catch (IOException ex) {
                Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        JOptionPane.showMessageDialog(null,"Staff cannot be Updated: No Staff ID to Update");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    
    
    // Define BEHAVIOR
        public ArrayList<Staff> getListStaff()
        {
            String acct = ""; 
            String firstName = ""; 
            String lastName = "";
            String birthday = "";
            String gender = "";
            String username = "";
            String password = "";
            String email = "";
            String phone = "";
            String status = "";
            
            ArrayList<Staff> staffArrayList = new ArrayList<Staff>();
  
            try
            {
               
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");

                while (  x.hasNext() )
                {
                    acct = x.next();
                    firstName = x.next();
                    lastName = x.next();
                    birthday = x.next();                
                    gender = x.next();
                    username = x.next();
                    password = x.next();
                    email = x.next();
                    phone = x.next();
                    status = x.next();
                   
                  
                    Staff line = new Staff(acct, firstName, lastName, birthday, gender, username, password, email, phone, status);
                    staffArrayList.add(line);
  

                }
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null, "ArrayList Error HERE" + e); // e
            }

            return staffArrayList;
        
        }
        
    // Feb 19, 2019 Roberto: For the ArrayList Part C 
        public void Show_Staff_In_JTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTable_Staff.getModel();
        model.setRowCount(0);
        //DefaultTableModel model = (DefaultTableModel) jTable_Members.getModel();
        ArrayList<Staff> list = getListStaff();
        
        JTableHeader Theader = jTable_Staff.getTableHeader();
        Theader.setBackground(Color.blue);
        Theader.setForeground(Color.WHITE );
        
        Object rowData[] = new Object[10];
        for(int i=0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getaccount();
            rowData[1] = list.get(i).getfirstname();
            rowData[2] = list.get(i).getlastname();
            rowData[3] = list.get(i).getbirthday();
            rowData[4] = list.get(i).getgender();
            rowData[5] = list.get(i).getusername();
            rowData[6] = list.get(i).getpassword();
            rowData[7] = list.get(i).getemail();
            rowData[8] = list.get(i).getphone();
            rowData[9] = list.get(i).getstatus();
            model.addRow(rowData);
        }
        
    }
    
  
      // Mar 23, 2019 Roberto : ReadFileMembers set filename and confirm for debugging
        public void ReadFileMembers(String fileName)
        {

            boolean found = false;
            String memberID = ""; 
            String firstName = ""; 
            String lastName = "";
            String dob ="";
            String gender = "";
            String username = "";
            String password = "";
            String email = "";
            String phoneNumber = "";
            String status = "";
            
            try
            {
                x = new Scanner(new File(fileName));
                x.useDelimiter("[,\n]");
                while(x.hasNext() )
                {
                    memberID = x.next();
                    firstName = x.next();
                    lastName = x.next();
                    dob = x.next();
                    gender = x.next();
                    username = x.next();
                    password = x.next();
                    email = x.next();
                    phoneNumber = x.next();
                    status = x.next();

                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }      
        
         // April 4, 2019 Roberto : WriteFileMembers back to staff.txt
        public void WriteFileStaff( String fileName) throws IOException
                // Write Arraylist X back to staff.txt
        {
            // ArrayList<Member> updateList = getListMembers();
            FileWriter writer = new FileWriter("staff.txt"); 
            for(Staff str: updateList)
            {
                writer.write(str.getaccount() +"," + str.getfirstname() + "," + str.getlastname() + "," + str.getbirthday()+"," + str.getgender() 
                        + "," + str.getusername() + "," + str.getpassword() + "," + str.getemail() + "," + str.getphone() + "," + str.getstatus() + "\n");
            }
            writer.close();

        }        
        
        
        
   // Feb 19 2019 Roberto: Check Input Fields to verify they are not empty
        public boolean checkInputs()
        {
            if (    txt_employeeid.getText() == null
                    || txt_firstName.getText() == null
                    || txt_lastName.getText() == null
                    || txt_username.getText() == null
                    || txt_password.getText() == null
                    || txt_email.getText() == null
                    || txt_phone.getText() == null)
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
                    txt_employeeid.setText(getListStaff().get(index).getaccount());
                    txt_firstName.setText(getListStaff().get(index).getfirstname());
                    txt_lastName.setText(getListStaff().get(index).getlastname());
                    
                    // Birthday
                    try {
                    Date addDate = null;
                    addDate = new SimpleDateFormat("MM-dd-yyyy").parse((String)getListStaff().get(index).getbirthday());
                    txt_birthday.setDate(addDate);     
 
                    } catch (ParseException ex) {
                            Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    // Gender
                    //combo_gender.setSelectedItem(getListMembers().get(index).getgender());  
                    //combo_gender.setSelectedIndex(2);
                    if ( getListStaff().get(index).getgender().equals("female"))
                            {   
                                combo_gender.setSelectedItem("female");
                            }
                    else
                    {
                        combo_gender.setSelectedItem("male");
                    }
                    // String gender = combo_gender.getSelectedItem().toString();
                    
                    txt_username.setText(getListStaff().get(index).getusername());
                    txt_password.setText(getListStaff().get(index).getusername());
                            
                    txt_email.setText(getListStaff().get(index).getemail());
                    txt_phone.setText(getListStaff().get(index).getphone());
                    
                    // Status
                    combo_status.setSelectedItem(getListStaff().get(index).getstatus());
    }
    
    public void clearAll()
    {
        txt_employeeid.setText(null);
        txt_firstName.setText(null);
        txt_lastName.setText(null);
        txt_username.setText(null);
        txt_password.setText(null);
        txt_email.setText(null);
        txt_phone.setText(null); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Staff;
    private javax.swing.JLabel lbl_Birthday;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_accountLookup;
    private javax.swing.JLabel lbl_control;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_titleMembers;
    private javax.swing.JLabel lbl_username;
    private com.toedter.calendar.JDateChooser txt_birthday;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_employeeid;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_searchAccount;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
