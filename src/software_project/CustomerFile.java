/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import java.util.ArrayList;
import sun.applet.Main;

/**
 *
 * @author FT7673
 */
public class CustomerFile {
  
   public static ArrayList<Customer> customerlist= new ArrayList<Customer>();  
   public static  ArrayList<Banking_account> accountlist = new ArrayList<Banking_account>();
   public static ArrayList<ATM> ATMlist = new ArrayList<ATM>();
   
   
   static{
       Customer max = new Customer("Max",1000,2351);
       customerlist.add(max);
       accountlist.add(new Banking_account(max, "051235", 3000.45));
     
       customerlist.add (new Customer("Moritz",  50 , 1001));
       accountlist.add(new Banking_account(customerlist.get(1), "0666", 30.50));
      
       customerlist.add(new Customer ("Lotta",  275 , 5678));
       accountlist.add(new Banking_account(customerlist.get(2), "02345",4000.45));
       
       ATMlist.add(new ATM(10000, "Kokkola"));
       ATMlist.add(new ATM(15000, "Tampere"));
       ATMlist.add(new ATM(12500, "Helsinki"));
      
       
   }
   
   
    
}
