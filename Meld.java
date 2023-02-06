import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Meld{
	private ArrayList<Card> cards = new ArrayList<Card>();
	private boolean type;
	// false  is Same Number, true is Straight Flush
	private ArrayList<Card> canSapaw = new ArrayList<Card>();

	public Meld(Card[] c, boolean t){
		Collections.addAll(cards, c);
		type = t;
		if(t){
			Card a = c[0];
			Card b = c[c.length - 1];
			int i = Card.cards.indexOf(a);
			int j = Card.cards.indexOf(b);
			Card d = null;
			Card e = null;
			if(i != 0){
				d = Card.cards.get(i - 1);
			}
			if(j != 0){
				e = Card.cards.get(j + 1);
			}
			if(d != null){
				if(a.getSuit() == d.getSuit()){
					canSapaw.add(d);
				}
			}
			if(e != null){
				if(b.getSuit() == e.getSuit()){
					canSapaw.add(e);
				}
			}
		}
		else{
			for(Card i : Card.cards){
				if(!(Arrays.asList(c).contains(i))){
					if(i.getValue() == c[0].getValue()){
						canSapaw.add(i);
					}
				}
			}
		}
	}

	public void sapaw(Card c){
		if(canSapaw.contains(c)){
			cards.add(c);
			canSapaw.remove(c);
			if(type){
				int i = Card.cards.indexOf(c);
				Card a = Card.cards.get(i + 1);
				Card b = Card.cards.get(i - 1);
				if(cards.contains(a)){
					if(b.getSuit() == c.getSuit()){
						canSapaw.add(b);
					}
				}
				if(cards.contains(b)){
					if(a.getSuit() == c.getSuit()){
						canSapaw.add(a);
					}
				}
			}
		}
	}
}