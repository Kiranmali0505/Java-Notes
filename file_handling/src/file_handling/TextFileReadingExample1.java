/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_handling;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Soniya
 */
public class TextFileReadingExample1 {
    public static void main(String[]args)
    {
        try
        {
            FileReader reader=new FileReader("MyFile.txt");
            int character;
            while((character =reader.read())!=-1);
            {
                System.out.println((char)character);
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
