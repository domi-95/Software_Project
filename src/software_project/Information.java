/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FT7673
 */
public class Information {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Customer max = new Customer("Max", 27892, 1000 , 2351);
        Banking_account bama = new Banking_account( max, 051235, 3000.45);
        
        Customer moritz = new Customer("Moritz", 27893, 50 , 1001);
        Banking_account bamo = new Banking_account( moritz, 0666, 30.50);
        
        Customer lotta = new Customer("Lotta", 27894, 275 , 5678);
        Banking_account balo = new Banking_account( lotta, 02345,4000.45);
        
        ArrayList<Integer> pins = new ArrayList<Integer>(100);              //max. 100 Customer
        
       // for (int i = 0; i < Customer.class.getccounter(); i++){
            
        //}
        new gui.InsertCard().setVisible(true);
        
        System.out.println("bitch");
       

        
    }
}
