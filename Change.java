/**
 * This program determines how to provide change given the amount received
 * and the amount due.
 * 
 * @author: Danielle Cai, uni: dc3347
 * @date: 9/19/18
 */

import java.util.Scanner;

public class Change{
  
    public static void main(String[] args){
        
        // get info from the cashier
        Scanner AmountDue = new Scanner(System.in); // amount due
        System.out.println("Enter the amount due in cents: ");
        int cost;
        cost = AmountDue.nextInt(); 
      
        Scanner AmountRec = new Scanner(System.in); // amount received from the customer
        System.out.println("Enter the amount received in cents: ");
        int payed;
        payed = AmountRec.nextInt(); 
        
        // declare variables
        int changedue = payed-cost; // calculates change by taking difference in payment and cost
        int temp; // temp stores the remaining change that needs to be returned
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
      
        //constants
        final int DOLLAR_VALUE = 100; //cents
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        final int PENNY_VALUE = 1;
      
        // do calculations
        dollars = changedue/DOLLAR_VALUE;
        temp = changedue - (dollars*DOLLAR_VALUE); //multiply by 100 to change back to cents
        quarters = temp/QUARTER_VALUE;
        temp = temp - (quarters*QUARTER_VALUE); //multiply by 25 to change to cents
        dimes = temp/DIME_VALUE;
        temp = temp- (dimes*DIME_VALUE); //multiply by 10 to change back to cents
        nickels = temp/NICKEL_VALUE;
        temp = temp - (nickels*NICKEL_VALUE); //multiply by 5 to change back to cents
        pennies = temp;
      
        // present results
        System.out.println();
        System.out.println("Give the customer: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
      
    }// end of main method

}	// end of class
