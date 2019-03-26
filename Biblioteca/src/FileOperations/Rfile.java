/*
 * University of Houston - Downtown
 * CS 3300  OOP
 * Roberto Gomez
 * 
 * Create a program in Java that would read data from a file and display on the console. Following are the requirements:
1. The code should have two classes. One with main method and second for file operations.
2. main method should invoke the File Operations class and methods to perform all read/display operations.
3. User prompts should and clear and concise. 
 */
package FileOperations;

import java.util.ArrayList;

/**
 * Created Feb 18, 2019
 * Modified: Feb 24,2019
 * @author Roberto Gomez
 * @version 1
 */
public class Rfile 
{
    public static void main(String[] args)
    {

        
        ReadFile fileNew ;  // declaration of the object of type FileOperations
        fileNew = new ReadFile();   // Invoke Constructor FileOperations
        ArrayList<String> membersArray;
        membersArray = new ArrayList<>();
        fileNew.ReadFileMembers();  // run method ReadFileMembers a
 
        
    }
}
