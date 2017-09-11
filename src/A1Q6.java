
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner 
        Scanner in = new Scanner(System.in);
        
        while(true){
        //ask the user to input a number between 50 and 100
            System.out.println("Please indicate a number between 50 and 100");
            //create a a variable to store in the number
            int number = in.nextInt();
            String word = in.nextLine();
        
            // create an if statement to know if the number that the user has entered in is greater or less than 50 and 100
            if(number <= 100 && number >=50){
                //create a for loop to countdown from 100 by 5s
                for (int i = 100; i >= number; i = i - 5){
                    //print out the value of i
                     System.out.println(i);
                }
            } else {
                System.out.println("Please enter the number again");
            }
            
            if (word.equals("END")){
                break;
            }
            
            
            
    
        
        
        }
    }
}


