/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheMembers;

import java.util.Scanner;

/**
 *
 * @author Rob77
 */
public class MembersObject 
{
    String filepath = "member.txt";
    private static Scanner x;
    
// Define STATE
    public class  Member
    {
        private String accountArray;
        private String firstNameArray;
        private String lastNameArray;
        private String birthdayArray;
        private String genderArray;
        private String emailArray;
        private String phoneArray;
        private String statusArray;

// Define CONSTRUCTOR
        public Member(String Id, String FName, String LName, String DoB, String Gender, String Email, String Phone, String Status)
        {
            this.accountArray = Id;
            this.firstNameArray = FName;
            this.lastNameArray = LName;
            this.birthdayArray = DoB;
            this.genderArray = Gender;
            this.emailArray = Email;
            this.phoneArray = Phone;
            this.statusArray = Status;
        }   

    public String getaccount()
    {
        return accountArray;
    }
    
    public String getfirstname()
    {
        return firstNameArray;
    }
    
    public String getlastname()
    {
        return lastNameArray;
    }
    
    public String getbirthday()
    {
        return birthdayArray;
    }
    
    public String getgender()
    {
        return genderArray;
    }
    
    public String getemail()
    {
        return emailArray;
    }
    
    public String getphone()
    {
        return phoneArray;
    }
    
    public String getstatus()
    {
        return statusArray;
    }
    



    }
}
