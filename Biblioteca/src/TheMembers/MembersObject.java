/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Too hh
 */
package TheMembers;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alansaavedra10
 */
public class MembersObject 
{
    String filepath = "member.txt";
    private static Scanner x;
    

    public static class  Member
    {
        
 // April 4, 2019 Alan Saavedra: Define STATE       (Data Hiding)      
        private String account;
        private String firstName;
        private String lastName;
        private String birthday;
        private String gender;
        private String email;
        private String phone;
        private String status;

// April 4, 2019 Alan Saavedra: Define CONSTRUCTOR Member
        public Member (String Id, String FName, String LName, String DoB, String Gen, String Email, String Phone, String Status)
        {
            this.account = Id;
            this.firstName = FName;
            this.lastName = LName;
            this.birthday = DoB;
            this.gender = Gen;
            this.email = Email;
            this.phone = Phone;
            this.status = Status;
        }   

        
// April 4, 2019 Alan Saavedra: GET methods
        public String getaccount()
        {
            return account;
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
        
 // April 4, 2019 Alan Saavedra: SET Methods
        public void setaccount(String acct)
        {
            account = acct;
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
        
    // Define BEHAVIOR


    }
}
