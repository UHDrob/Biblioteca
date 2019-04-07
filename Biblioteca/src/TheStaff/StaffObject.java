/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheStaff;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * April 4, 2019 
 * @author Roberto Gomez
 */
public class StaffObject 
{
    String filepath = "staff.txt";
    private static Scanner x;
    

    public static class  Staff
    {
        
 // April 4, 2019 Roberto: Define STATE       (Data Hiding)      
        private String employeeID;
        private String firstName;
        private String lastName;
        private String birthday;
        private String gender;
        private String username;
        private String password;
        private String email;
        private String phone;
        private String status;

// April 4, 2019 Roberto: Define CONSTRUCTOR Member
        public Staff (String Id, String FName, String LName, String DoB, String Gen, String un, String pw, String Email, String Phone, String Status)
        {
            this.employeeID = Id;
            this.firstName = FName;
            this.lastName = LName;
            this.birthday = DoB;
            this.gender = Gen;
            this.username = un;
            this.password = pw;
            this.email = Email;
            this.phone = Phone;
            this.status = Status;
        }   

        
// April 4, 2019 Roberto: GET methods
        public String getaccount()
        {
            return employeeID;
        }  
        public String getfirstname()
        {
            return firstName;
        }
        public String getlastname()
        {
            return lastName;
        }
        public String getbirthday()
        {
            return birthday;
        }
        public String getgender()
        {
            return gender;
        }
        public String getusername()
        {
            return username;
        }
        public String getpassword()
        {
            return password;
        }
        
        public String getemail()
        {
            return email;
        }
        public String getphone()
        {
            return phone;
        }
        public String getstatus()
        {
            return status;
        }
        
 // April 4, 2019 Roberto: SET Methods
        public void setaccount(String acct)
        {
            employeeID = acct;
        }
        public void setfirstname(String fN)
        {
                firstName = fN;
        }
        public void setlastname(String lN)
        {
            lastName = lN;
        }
        public void setbirthday(String bd)
        {
            birthday = bd;
        }
        public void setgender(String gn)
        {
            gender = gn;
        }
        public void setemail(String em)
        {
            email = em;
        }
        public void setphone(String ph)
        {
            if (ph.length() == 10)
            {
                phone = ph;
            }
            else
                JOptionPane.showMessageDialog(null,"Phone Number should be at least 10 digits");
            
        }
        public void setstatus(String st)
        {
            status = st;
        }
        


    }
}