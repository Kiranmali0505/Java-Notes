/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jfilechooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Advance Techno
 */
public class ReadTextFile {

   public String ReadFile( String filename)//text called as object there in this parameter
   {
       String line=null;
       try{
           File myFile=new File(filename);
           FileReader filereader=new FileReader(myFile);
           BufferedReader reader=new BufferedReader(filereader);//file k contents ko fetch krta h
           while((line=reader.readLine())!=null)//readline returns each line of fie and assigning it into a string
           {
                System.out.println(line);//printing each line
           }
           
       
       }
       catch(Exception e)
       {
            
       }
       return line;
   }  
}
