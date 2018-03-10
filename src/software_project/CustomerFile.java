/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import java.util.ArrayList;

/**
 *
 * @author FT7673
 */
public class CustomerFile {
   public static final ArrayList<Customer> customerlist= new ArrayList<Customer>();  
   public static final ArrayList<Banking_account> accountlist = new ArrayList<Banking_account>();
   public static int pin[];
   
   static{
       customerlist.add(new Customer("Max",1000,2351));
       accountlist.add(new Banking_account(customerlist.get(0), 051235, 3000.45));
       pin[0] = customerlist.get(0).getPin();
       customerlist.add (new Customer("Moritz",  50 , 1001));
       accountlist.add(new Banking_account(customerlist.get(1), 0666, 30.50));
       pin[1] = customerlist.get(1).getPin();
       customerlist.add(new Customer ("Lotta",  275 , 5678));
       accountlist.add(new Banking_account(customerlist.get(2), 02345,4000.45));
       pin[2] = customerlist.get(2).getPin();
       
   }
    
}
