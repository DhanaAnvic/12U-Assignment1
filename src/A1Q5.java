
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner in = new Scanner (System.in);
        
        // ask the user to input a number between 1 and 10
        System.out.println("Please input a number between 1 and 10.");
        int num = in.nextInt();

        //create a for loop to go through the number of the asterisks
        for (int i = 0; i < num; i++){
            // create a for loop according to the number of asterisks in width
             for (int k = 0; k < num; k++){
                 //print out the number of the asterisks
                 System.out.print("*");    
             }
             //print out the asterisks in a row
             System.out.println("");
     
    }
}
}

