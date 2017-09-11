
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabed2976
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner in = new Scanner(System.in);

        // ask the user for the the initial they put it in
        System.out.println("Please enter the amount of money you want to put in?");
        double balance = in.nextDouble();

        //ask the user what is the interest rate for that
        System.out.println("What is yout interest rate?");
        double rate = in.nextDouble();
        
        //create a variable for the year fo when it reaches to a million dollars
        int millionYear = 0;
        
        //create a varaible for the year when it doubles
        int doubleYear = 0;
        
        
        while(true){
            //create a formula to calculate the yearly rate for the account
        double yearlyRate = Math.pow ((rate + 1), millionYear);
        millionYear++;
        
        // create a variable to calualte the futurebalance of the users account by multiplying the yearly rate by the current balance of the account
        double futureBalance = yearlyRate * balance;
        //create an if statement that if the futurebalance is less than when the balance is multiplied by 2 
        if(futureBalance <= (2 * balance)){
            doubleYear++;
        }
        //create an if statement that if the future balance is greater than 10 billion
        if (futureBalance >= 10000000){
            //printing outwhen the balance will reach 1 million and how long it doubled
            System.out.println("It will take " + (millionYear - 1) + "years(s) to reach 1 million in savings and " + doubleYear + " years(s) to double");
            break;
        }
        
        
        
        
        
        
        
    }
}
}



       