package practice.chapter5;

public abstract class CarAbstractBase {

	// インスタンス変数
	private String serialId;
	private String carName;
	private int price;

	// インスタンス変数を初期化するコンストラクタ
	public CarAbstractBase(String serialId, String carName, int price) {
		this.serialId = serialId;
		this.carName = carName;
		this.price = price;
	}

	// 車情報を表示するメソッド
	public void showCarInfo() {
		System.out.println("シリアルID: " + this.serialId);
		System.out.println("車名: " + this.carName);
		System.out.println("価格: " + this.price);
	}

	// ToDo:抽象メソッド
}