
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner 
        Scanner in = new Scanner (System.in);
 
        //create an array to store in the words
        String [] words = new String [10];
        
        //crete a variable to kepp count of character in the array
        int total = 0;

        //create a for loop to go through the characters
        for (int i = 0; i < 10; i++){
            //ask the user to enter 10 words
            System.out.println("Please Enter a word: ");
            words[i] = in.nextLine();
        }
        //create a for loop to keep track of the numbers of letters in the wor
        for (int i = 0; i < 10; i++){
            String term = words[i];
            //create a variable to convert the word to chracter length in numbers
            int count = term.length();
            // add to variable
            total = count + total;
        }
        //create a formula to find the average of the word length
        int avg = total / 10;
        //printing out the average length of the chracter(s)
        System.out.println("The average word length is " + avg + " character(s) long.");
        
        
        
    }
}
