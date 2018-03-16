/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author FT7673
 */
public class Information {
    public static void main(String[] args) {
        
       
     
        try {
              Scanner s = new Scanner(new File("src/software_project/CustomerFile.txt"));
            
            
            while(s.hasNextLine()){
               
                String help = s.nextLine();
                String [] help1 = help.split(",");
                String namehelp = help1[0];
                int cashhelp = Integer.parseInt(help1[1]);
                String pinhelp = help1[2];
                InstancesFile.customerlist.add(new Customer(namehelp,cashhelp, pinhelp));
            }
           
         }
          
        catch (FileNotFoundException e){
            System.out.print("Exception");
        }
 
                
        for (int i = 0; i< InstancesFile.customerlist.size(); i++){
            System.out.println(InstancesFile.customerlist.get(i));
               
                    
        }
        
        
    }
    
 
}
