/*Author: Danielle Cai
 * 
 * This class initializes the deck of cards
 *
*/

public class Deck {
	
	private Card[] cards;
	private int top; // the index of the top of the deck
 
  //constructor
	public Deck(){
        //create object of class Card
        Card c;
		//makes a 52 card deck
        cards=new Card[52];
       
        int index=0;
        
        //initializing the deck of cards
        for (int i=1; i<=4;i++){ //13 values
            for (int j=1; j<=13;j++){ // 4 suits
                c = new Card(i,j);
                cards[index]= c; //put card in position i
                index++;
            }
        }
        top=0;
	}
	
	public void shuffle(){
		// shuffles the deck
        Card temp;     
        //swaps the first with a random card 1000 times
        for (int i=0; i<cards.length;i++){ 
            //random num between 0 and 51
            int randomPos=(int)(Math.random()*(cards.length));
            temp=cards[i];
            cards[i]=cards[randomPos];
            cards[randomPos]=temp;
        }
	}
	
	public Card deal(){
		// deal the top card in the deck  
       if (top>=52){
           top=0;
           return new Card(0,0);
       }
        else{
            top++;
            return cards[top-1];
        }
	}
}
