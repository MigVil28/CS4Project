import java.util.ArrayList;

public class DiscardPile extends Pile{
	private Card lastThrown = null;

	
	public void addCard(Card c){
		cards.add(c);
		lastThrown = c;
	}
}