package moneyCard;

public class Card {
    String cardID="" ;
    int money=0;//�����ܼ�
    
    void add(int money) {
	money=money+money;
	System.out.println("�d��"+cardID);
	System.out.println("���ϥ�this" + money);
    }
    
    
    void addThis(int money) {//�Ѽ�
	this.money=this.money+money;
	System.out.println("�d��"+cardID);
	System.out.println("���ϥ�this" + this.money);
    }  
    
    
    
    
}
