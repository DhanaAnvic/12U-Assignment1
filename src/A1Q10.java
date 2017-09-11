
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner in = new Scanner (System.in);
        
        //create a variable to know how many is the words that the user entered
        int count = 0;
        
        while (true){
            //ask the user to enter a word
            System.out.println("Enter a word: ");
            String word = in.nextLine();
            count++;
            
            // create an if statement that if the word ewuals to END it print ou the the numbers the user have entered
            if (word.equals("END")){
                System.out.println("You have entered " + (count--) + " words(s)");
                break;
            }
        }
       
        
        
        
        
    }
}
