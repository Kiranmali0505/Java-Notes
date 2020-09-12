/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_handling;

import java.io.FileWriter;
import java.io.IOException;
/*
 *
 * @author Soniya
 */
public class TextFileWritingExample1 {
    public static void main (String[]args)
    {
        try
        {
            FileWriter writer=new FileWriter("MyFile.txt",true);
            writer.write("Hello World");
            writer.write("\r\n");
            writer.write("Good Bye...!!!1");
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
