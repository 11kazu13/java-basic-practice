package q11;

public class AppOrder extends Menu{

	private static final float DISCOUNT_RATE = 0.15f;    //値引率

	//初期化する
	public AppOrder(String goods, int price){
		super(goods,price);
	}

	//情報を表示する
	public void display(){

		System.out.println("アプリ注文時の価格");
		super.display();
		System.out.println("割引額: " + discount);
		System.out.println("請求額: " + billed);

	}

	//割引額と請求額を計算する
	public void calcDiscount(){

		discount = (int)(totalAmount * DISCOUNT_RATE);
		billed = totalAmount - discount;

	}

}