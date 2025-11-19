package q12;

public abstract class Beverage {

	private String name;                   //品名
	private String unit;                   //単位
	private int    price;                  //単価
	private int    quantity;               //注文数
	private int    totalAmount;            //合計金額

	//初期化する
	public Beverage(String name, String unit, int price){
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	//注文数(注文数を決定する)
	public void order(int quantity){
		this.quantity = quantity;
		totalAmount = price * quantity;
	}

	//情報を表示する
	public void display(){
		System.out.println("品名      :" + name);
		System.out.println("単位      :" + unit);
		System.out.println("単価      :" + price);
		System.out.println("注文数    :" + quantity);
		System.out.println("合計金額  :" + totalAmount);
	}
}