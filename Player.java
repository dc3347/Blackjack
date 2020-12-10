/**
 * Author: Danielle Cai
 * 
 * This is the player class
 * 
*/

import java.util.ArrayList;
public class Player {
    private ArrayList<Card> hand; // the player's cards
    private Player p;
    private Deck cards; 
		
    public Player(){		
        // create the player's hand here
        hand= new ArrayList<Card>();
    } 

    public ArrayList<Card> getHand(){
        return hand;
    }

    public void addCard(Card c){
        // add the card c to the player's hand
        hand.add(c);
    }

    public void reset(ArrayList<Card> h){
        p=new Player();
        hand=h;
        hand.clear(); //clears the arraylist of card objects
        cards = new Deck();
        cards.shuffle();
    }   
  }