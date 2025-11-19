package q11;

public class CallOrder extends Menu{

	private static final float DISCOUNT_RATE = 0.2f;     //値引率
	private static final int   MAILING_COST  = 500;      //送料

	//初期化する
	public CallOrder(String goods, int price){
		super(goods, price);
	}

	//情報を表示する
	public void display(){

		System.out.println("電話注文時の価格");
		super.display();
		System.out.println("割引額: " + discount);
		System.out.println("送料  : " + MAILING_COST);
		System.out.println("請求額: " + billed);

	}

	//割引額と請求額を計算する
	public void calcDiscount(){

		discount = (int)(totalAmount * DISCOUNT_RATE);
		billed = totalAmount - discount + MAILING_COST;

	}

}