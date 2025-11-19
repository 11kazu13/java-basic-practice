package practice.chapter5;

public class LuxuryCar extends CarAbstractBase {

	// 親クラスのコンストラクタを明示的に呼び出す
	public LuxuryCar(String serialId, String carName, int price) {
		super(serialId, carName, price);
	}

	// ToDo 抽象メソッドrunをオーバーライドして実装

	// 動作確認用のmainメソッド
	public static void main(String[] args) {
		// 抽象クラスはインスタンス化できない
		// CarAbstractBase myCar = new CarAbstractBase("6AA-ZVW51", "PRIUS", 3000000);

		/* ToDo LuxuryCarをインスタンス化しメソッドを呼び出す
		 * LuxuryCarクラス定義後に下記コードのコメントアウトを外してください
		 */
		// LuxuryCar myLuxuryCar = new LuxuryCar("3BA-GSE31", "LEXUS IS", 6500000);
		// myLuxuryCar.run();
		// myLuxuryCar.showCarInfo();
	}
}