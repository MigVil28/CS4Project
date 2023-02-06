import java.util.ArrayList;

public class Hand extends Pile{
	
	public int getValue(){
		int sum = 0;
		for(int i = 0; i < cards.size(); i++){
			Card x = cards.get(i);
			if(!x.getStatus()){
				sum += x.getValue();
			}
		}
		return sum;
	}
	public int getSize(){
		return Hand.cards.size();
	}
}