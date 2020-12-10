/**
*
* This class represents a calendar year. It contains 
* a method that determines if the year is a leap year.
* 
* @author: Danielle Cai, uni: dc3347
* @date: 9/19/18
*
*/

public class Year{
    
    // declare your instance variables here
    private int thisyear;

  
    // write your constructor here
    public Year(int y){
        // your code here
       thisyear = y;
    }

  
    public boolean isLeapYear(){
        // your code here 
        if (thisyear%400 == 0 || (thisyear%4 == 0 && thisyear%100 != 0))
            return true;
        else
            return false;
        
    }

}    

