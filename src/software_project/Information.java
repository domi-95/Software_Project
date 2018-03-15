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
        
       //ATM inuse = new ATM (1500, "Kokkola");                  // sollte GUI aufrufen
       
     //  new gui.ChooseATM().setVisible(true);
     
        try {
            //InputStream f = new FileInputStream("C:\\Users\\das\\Documents\\NetBeansProjects\\Software_Project\\src\\software_project\\Test.txt");
            InputStream f = new FileInputStream("src/software_project/Test.txt");
            int size = f.available();
            for(int i = 0; i < size; i++) {
            System.out.print((char)f.read() + "  ");
         }
            f.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
 
                
        
        
    }
    
 
}
