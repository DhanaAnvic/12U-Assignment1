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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner in = new Scanner (System.in);
        
        
        // ask the committee how much are the cost for the dj
        System.out.println("How much is the expense you spend for the food?");
        //create a variable for the food
        double food = in.nextDouble();
        
        // ask the committee how much they spend for the Dj
        System.out.println("How much did you spend for the DJ?");
        //create a variable for the DJ 
        double DJ = in.nextDouble();
        
        //ask the committe how much the expense for the hall rental
        System.out.println("How much is the expense for the hall rental?");
        //creata a variable for the hall rental
        double hall = in.nextDouble();
        
        // ask the committee for how much they spend for the decorations
        System.out.println("How much did you spend for the decorations?");
        //create a variable for the decorations
        double decorations = in.nextDouble();
        
        // ask the user how much they paid for the wait staff
        System.out.println("How much did you spend for the pay of the wait staffs?");
        //create a variable for the cost they spend for the staff
        double staff = in.nextDouble();
        
        //ask the committee is there are any miscellaneous expense
        System.out.println("How much were the miscellaneous expense?");
        //create a variable tp store in the value for the miscellaneous expense
        double expense = in.nextDouble();
        
        // create a variable for the ticket price
        double tickets = 35;
        
        //find the total cost for the prom by adding them 
        double total = food + DJ + hall + decorations + staff + expense;
        double breakeven = total / tickets;
         int breakevenround = (int) Math.round (breakeven);
        System.out.println("The total cost for the prom is " + total + " You will need to sell " + breakevenround + " tickets to break even.");
        
        
         
        
        
        
            
        
        
    }
}
