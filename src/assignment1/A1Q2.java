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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner in =  new Scanner (System.in);
        
        // store in the numbers using an array
        int[] numbers = new int [3];
        
        // ask the user to input the three numbers
        System.out.println("Please indicate the three numbers.");
        
        // create a for loop to go through the numbers
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();  
        }
        
        //create a variable for the product
        int product = 1;
        
        //create a for loop to go through the numbers again
        for (int i = 0; i < numbers.length; i++){
            product = product * (numbers[i]);
        }
        // print out the product
        System.out.println(product);
        
        // create a variable for the product taken to the power 2
        double square = 0;
        
        // use a method to take the product to the power of 2
         square = Math.pow(product, 2);
        
        // print out the power 
        System.out.println(square);
        
        // create a variable for the square root for the sqaured of the product
        double root = 0;
        
        // use a method to take the sqaure root of the squared product
        root = Math.sqrt(square);
        
        // output the square root of the squared product
        System.out.println(root);
        
        
          
        
        
        
        
        
    }
}
