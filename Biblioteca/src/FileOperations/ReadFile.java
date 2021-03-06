/*
 * University of Houston - Downtown
 * CS 3318 OOP
 * Roberto Gomez
 *
 * FileOperations.java
 */
package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Created: Feb 17, 2019
 * Modified: Mar 23, 2019
 * @author Roberto Gomez
 * @version 2
 */
public class ReadFile 
{
   
    // Mar 23, 2019 Roberto : ReadFileMembers set filename and confirm for debugging
        public void ReadFileMembers()
        {
            Scanner keyboard = new Scanner(System.in);
                        
            // the text file will be members.txt
            String fileName = "member.txt";
            
            // DEBUGGING: Display input entered on the console
            // JOptionPane.showMessageDialog(null, "\nThe file name is: " + fileName);
        
    
        // Feb 18, 2019 Roberto : Read the data and display on the Console
      
        // Mar 23, 3019 Roberto : Intialize fileIn to Empty    
        Scanner fileIn = null; 
            try
            {
                // Attempt to open the file
                fileIn = new Scanner ( new FileInputStream(fileName));
            }
            catch (FileNotFoundException e)
            {
                // DEBUGGING: this block executed if the file is not found and then the program exits
                JOptionPane.showMessageDialog(null, "File not found");
                System.exit(0);
            }
            
            // DEBUGGING: if the program gets here then the file was opened successfully
            // JOptionPane.showMessageDialog(null, "The file is now open. \n");
            
            // DEBUGGING: Display the data
            // System.out.println("Here is the data:\n");
            // while (fileIn.hasNext())  // keep reading if there is another line
            // {
            //     String line = fileIn.nextLine();  // read the line
            //     String [] lineArray = line.split(","); // delimiter betweeen fields
            //     for (String s : lineArray)
            //    {
            //        System.out.print(s + " "); // add space between fields for output
            //     }
            //    System.out.println();
            // }
            
            // Load to ArrayList
            Scanner x;
            boolean found = false;
            String memberID = ""; 
            String firstName = ""; 
            String lastName = "";
            String dob ="";
            String gender = "";
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
                    email = x.next();
                    phoneNumber = x.next();
                    status = x.next();
                    System.out.println(memberID + " " + firstName + " " + lastName + " " + dob
                             + " " + gender + " " + email + " " + phoneNumber + " " + status);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
                       
            fileIn.close();
            
            // DEBUGGING: Close the file 
            // JOptionPane.showMessageDialog(null, "The file is now closed. \n");
        }
       
}


