package q17;

public class Fruits {

	private String name;	//品名
	private String unit;	//単位
	private int price;	//単価

	// コンストラクタ
	public Fruits(String name, String unit, int price) {
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	//ゲッター
	public String getName() {
		return name;
	}

	public String getUnit() {
		return unit;
	}

	public int getPrice() {
		return price;
	}

}