/**
 * Author: Danielle Cai
 * 
 * This is the game class
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	
    private Player p;
    private Player c;
    private Deck cards;  
    private Deck computerCards;
    private ArrayList<Card> hand;
    private ArrayList<Card> computerHand;
    Scanner scanner=new Scanner(System.in);
	
    public Game(){
        p=new Player();
        cards = new Deck();
        cards.shuffle();
        int total=0;
        for(int i=0; i<2; i++){ //make a hand of 2 cards
            //deals the card into the player's hand
            p.addCard(cards.deal());
            hand = new ArrayList<Card>(p.getHand());
            total=total+hand.get(i).getRank();
        }
        //for the computer
        c=new Player();
        computerCards= new Deck();
        computerCards.shuffle();
        c.addCard(cards.deal());
        computerHand=new ArrayList<Card>(c.getHand());
	  }
	
	 /* public void play(){
      
        
    while(p.getScore()<21 && c.getScore()<21) {
      
      p.play();
      if(p.getScore()<21)    
        c.play();
    }
    if(p.getScore()<=21&&p.getScore()>c.getScore())
      System.out.println("You win!");
    else
      System.out.println("You lose!");
  } // end of play method
} // end class*/
  
  public void play(){
       Boolean playAgain =true;
        while (playAgain){
            System.out.println("--------------------------------");
            System.out.println("Welcome to Blackjack!!");
            
            int total=0;
            System.out.println("Your hand is:");
          
            for(int i=0; i<hand.size();i++){
              System.out.println(hand.get(i));
              total=total+hand.get(i).getRank();
            }
            System.out.println("Total value is: "+total);
            System.out.println("The computer's hand is:");
          
            for(Card value:computerHand){
                System.out.println(value);
            }
            System.out.println("Do you want to draw again (y/n)?");
            String redraw = scanner.nextLine();
            Boolean drawAgain;
            if (redraw.equals("y")||redraw.equals("Y")){
                drawAgain=true;
            }
            else{
                drawAgain=false;
            } 
            while (drawAgain){
                p.addCard(cards.deal());
                hand = new ArrayList<Card>(p.getHand());
                System.out.println("Your new hand is:");
                
                for(int i=0; i<hand.size();i++){
                    System.out.println(hand.get(i));
                    total=total+hand.get(i).getRank();
                }
                System.out.println("The total value is: "+total);
                
                System.out.println("The computer's hand is:");
                for(Card value:computerHand){
                    System.out.println(value);
                }
                System.out.println("Do you want to draw again (y/n)?");
                redraw=scanner.nextLine();
                if (redraw.equals("y")||redraw.equals("Y")){
                    drawAgain=true;
                }
                else{
                    drawAgain=false;
                }
            }
            System.out.println("--------------------------------");
            System.out.println("Would you like to play again? (y/n)"); 
            String again =scanner.next();
            if(again.equals("y")||again.equals("Y")){
                p.reset(hand);
                c.reset(hand);
                for(int i=1; i<=2; i++){ //make a hand
                    p.addCard(cards.deal());//deals card into the player's hand
                }
                hand = new ArrayList<Card>(p.getHand()); 
            }
            else if(again.equals("n") || again.equals("N")){
                playAgain=false;
            }
        System.out.println("--------------------------------");
        System.out.println("Bye! Thanks for playing!!"); 
    }
}
}
	
	
    






//ADD THE STUFF BELOW AND SWITCH THE CURRENT STUFF INTO THE PLAYER CLASS

/*
import java.util.Scanner;
public class Game {
  private Player p1;//human player
  private Player p2;  //computer player
 
	private Deck cards;  
  private Deck computerCards;
	private ArrayList<Card> hand;
  private ArrayList<Card> computerHand;
  Scanner scanner=new Scanner(System.in);
  
  public Game(){
    p1=new Player(1);
    p2=new Player(0);
  }
  
 
  public void play() {
    while(p1.getScore()<21 && p2.getScore()<21) {
      p1.play();
      if(p1.getScore()<21)    
        p2.play();
    }
    if(p1.getScore()<=21&&p1.getScore()>p2.getScore())
      System.out.println("You win!");
    else
      System.out.println("You lose!");
  } // end of play method
} // end class*/