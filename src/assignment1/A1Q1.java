/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author fabed2976
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner in =  new Scanner (System.in);
        
        //ask the user to input their name
        System.out.println("Please indicate your name");
        
        //create a variable for the name
        String name = in.nextLine();
        
        //print out the name with hello
        System.out.println("HELLO! " + name);
        
        
    }
}
