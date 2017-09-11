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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner in = new Scanner (System.in);
        
        // ask the user to input a number between 1 and 10
        System.out.println("Please input a number between 1 and 10");
        int num = in.nextInt();
        
        //create a for loop to go through the number
        for (int i = 0; i < num; i++){
            //print out the asterisks according to the number of the asterisks
            System.out.print("*");
        }
    }
}
