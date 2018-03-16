/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author FT7673
 */
public class InstancesFile {
    
    public static void main(String[] args) {
        
        System.out.println(accountlist);
                
        
        
    }
  
   public static ArrayList<Customer> customerlist= new ArrayList<Customer>();  
   public static  ArrayList<Banking_account> accountlist = new ArrayList<Banking_account>();
   public static ArrayList<ATM> ATMlist = new ArrayList<ATM>();
   
   
   static{
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
 
       
       accountlist.add(new Banking_account(customerlist.get(0), "051235", 3000.45));
       accountlist.add(new Banking_account(customerlist.get(1), "0666", 30.50));
       accountlist.add(new Banking_account(customerlist.get(2), "02345",4000.45));
       
       ATMlist.add(new ATM(10000, "Kokkola"));
       ATMlist.add(new ATM(15000, "Tampere"));
       ATMlist.add(new ATM(12500, "Helsinki"));
      
       
   }
   
   
    
}
