/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class Read_binary {
    public static void main(String[] args)
    {
    // The name of the file to open.
        String fileName = "temp.txt";

        try {
            // Use this for reading the data.
            byte[] buffer = new byte[1000];//byte-type in which only 0 and 1 is accepted

            FileInputStream inputStream = 
                new FileInputStream(fileName);

            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1)//0 and 1 k alawa kuch bhi daala toh -1 print krta h 
            {//waha p null tha 
                // Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
                System.out.println(buffer);
                total += nRead;//format applied here is hexa to show but reading in binary
            }   

            // Always close files.
            inputStream.close();        

            System.out.println("Read " + total + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
