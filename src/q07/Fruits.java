package q07;

public class Fruits {

	static final double TAX = 0.08; //消費税率
	String name; //品名
	String unit; //単位
	int price; //価格
	int num; //注文数

	//以下に必要なコードを記述してください。


	public void initialize(String name, String unit, int price) {
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	public void order(int num) {
		this.num = num;
	}

	public int getTotal() {
		return price * num;
	}

	public void display() {
		System.out.println("品名     :" + this.name);
		System.out.println("単位     :" + this.unit);
		System.out.println("単価     :" + this.price);
		System.out.println("注文数   :" + this.num);
	}

	public void displayTotal() {
		System.out.println("売上金額 :" + this.num * this.price);
	}

}
