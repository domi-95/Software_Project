/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import java.util.Scanner;

/**
 *
 * @author FT7673
 */
public class Information {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer max = new Customer("Max", 27892, 1000 , 2351);
        Banking_account ba = new Banking_account( max, 051235, 3000.45);
        
        new gui.InsertCard().setVisible(true);
        
        System.out.println("bitch");
       

        
    }
}
