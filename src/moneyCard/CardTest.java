package moneyCard;

public class CardTest {

    public static void main(String[] args) {
	Card c = new Card();
	c.cardID = "001";
	c.money = 300 ;
	
	c.add(1000);
	c.addThis(1000);
	
    }
    
}
