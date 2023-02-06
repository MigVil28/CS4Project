import java.util.ArrayList;

public class Pile{
	protected static ArrayList<Card> cards = new ArrayList<Card>();
	
	public void addCard(Card c){
		cards.add(c);
	}
	public void removeCard(Card c){
		cards.remove(c);
	}
}