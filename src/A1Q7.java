
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabed2976
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner in = new Scanner(System.in);
        
       //create a variable to store in the initial year
        int initialYear = 1999;
        
       //create a variable to store in the initial population
        int initialPopulation = 6;
        
        //create a variable to strore in the current year
        int Year = 0;
        
        
        //create a formula to calculate future population
        while (true){
            double futurePop = Math.pow(1.014, Year);
            
            //create a formula to find the populationrate by multiplying the initial population in that year by the future population
            double Populationrate = initialPopulation * futurePop;
            
            //create an if statement that if the population rate is greater than 10 billion
            if(Populationrate > 10){
                //printing out when the population will reach 10 billion 
                // to find on what year it will extend is multiply the  the year that the user wanted to have by the current year
                System.out.println((Year * initialYear) + " will be the year that the population will exceed at 10 billion");
                break;
            }
            Year++;
        }
        
        
        
        


    }
}
