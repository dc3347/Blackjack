/**
 * Author: Danielle Cai
 * This is the card class, creates cards to go into deck
 * 
 * 

A game proceeds as follows: A player is dealt two cards face up. If the point total is exactly 21 the player 
wins immediately. If the total is not 21, the dealer is dealt two cards, one face up and one face down. 
A player then determines whether to ask the dealer for another card (called a “hit”) or to “stay” with 
his/her current hand. A player may ask for several “hits.” When a player decides to “stay” the dealer 
begins to play. If the dealer has 21 it immediately wins the game. Otherwise, the dealer must take “hits” 
until the total points in its hand is 17 or over, at which point the dealer must “stay.” If the dealer goes over 
21 while taking “hits” the game is over and the player wins. If the dealer’s points total exactly 21, the dealer wins immediately. 
When the dealer and player have finished playing their hands, the one with the highest point total is the winner. 
Play is repeated until the player decides to quit. 

A deck of playing cards contains 52 cards, made up of 13 cards from 4 suits (clubs, diamonds, hearts, and spades). 
You may assume that there are several decks or you may use a single deck. 
Regardless of the implementation, cards will need to be recycled if all the cards are used and there is no winner yet. 
The deck, or decks, should be shuffled prior to the start of a new game…and there are several ways to do that using random numbers. 
It is up to you to determine how an ace is valued. 
One approach is to provide players with a choice. Another approach is to program a strategy that will be 
automatically implemented. There are multiple strategies that can be used…one might be to always value an ace 
as 11 points so long as the total points in a hand will be 21 or less. A separate strategy may be needed for the dealer. 


*/


public class Card{
	
    private int suit; // use integers 1-4 to encode the suit 
    //(club, diamond, heart, spades)
	  private int rank; // use integers 1-13 to encode the rank
    
  	public Card(int s, int r){
		    //make a card with suit s and value r
		    suit=s;
        rank=r;
	  }
	
	  public String toString(){
		    // use this method to easily print a Card object
		    String card;
        String stringRank="-1";
        String stringSuit="-1";
        
        if (rank>1 && rank<11){
            //stringRank= Integer.toString(rank);
            stringRank=""+rank;
        }
		    else if (rank==11){
            stringRank= "Jack";
        }
        else if (rank==12){
            stringRank="Queen";
        }
        else if (rank ==13){
            stringRank="King";
        }
        else if (rank==1){
            stringRank="Ace";
        }
        
        //convert numbers to suit names
        if (suit==1){
            stringSuit="Clubs";
        }
        else if (suit==2){
            stringSuit="Diamonds";
        }
        else if (suit==3){
            stringSuit="Hearts";
        }
        else{ //suit==4
            stringSuit="Spades";
        }
        card= stringRank+ " of " +stringSuit;
        return card;
	  }
	
	  public int getRank(){ //1-13
        return rank;
    }
}
