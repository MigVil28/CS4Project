import java.util.ArrayList;

public class Card{
	private int val;
	private char suit;
	private String imgurl;
	private boolean inMeld = false;
	public static ArrayList<Card> cards = new ArrayList<Card>();
	public Card(int v, char s, String i){
		val = v;
		suit = s;
		imgurl = i;
		cards.add(this);
	}
	public void setStatus(boolean t){
		inMeld = t;
	}
	public char getSuit(){
		return suit;
	}
	public int getValue(){
		return val;
	}
	public boolean getStatus(){
		return inMeld;
	}
}