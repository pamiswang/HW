package moneyCard;

public class Card {
    String cardID="" ;
    int money=0;//成員變數
    
    void add(int money) {
	money=money+money;
	System.out.println("卡號"+cardID);
	System.out.println("未使用this" + money);
    }
    
    
    void addThis(int money) {//參數
	this.money=this.money+money;
	System.out.println("卡號"+cardID);
	System.out.println("有使用this" + this.money);
    }  
    
    
    
    
}
