/**
 * This program converts a number of hours, days, weeks, and years into minutes.
 * 
 * @author: Danielle Cai, uni: dc3347
 * @date: 9/18/18
 */

import java.util.Scanner; // imports a scanner

public class Minutes{
    
    public static void main(String[] args){
        
        // get user input
        Scanner inputYears = new Scanner(System.in);
        System.out.println("Please enter in an integer number of years: ");
        int years;
        years = inputYears.nextInt(); //stores user input into variable called years
      
        Scanner inputWeeks = new Scanner(System.in);
        System.out.println("Please enter in an integer number of weeks: ");
        int weeks;
        weeks = inputWeeks.nextInt();
      
        Scanner inputDays = new Scanner(System.in);
        System.out.println("Please enter in an integer number of days: ");
        int days;
        days = inputDays.nextInt();
      
        Scanner inputHours = new Scanner(System.in);
        System.out.println("Please enter in an integer number of hours: ");
        int hours;
        hours = inputDays.nextInt();
      
        // do calculations
        int yearsToMinutes = years*365*24*60; // 365 days per yr, 24 hrs per day, 60 minutes per hr
        int weeksToMinutes = weeks*7*24*60; // 7 days a week, 24 hrs a day, 60 min per hr
        int daysToMinutes = days*24*60; // 24 hrs a day, 60 min per hr
        int hoursToMinutes = hours*60; // 60 min per hr
        int totalMinutes = yearsToMinutes + weeksToMinutes + daysToMinutes + hoursToMinutes;
      
        // present results
        System.out.println("That's " + totalMinutes + " minutes!!!");
 
    } // end main method
} // end class
 
