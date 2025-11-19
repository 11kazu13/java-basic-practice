package practice.chapter5;

interface Vehicle {

	// ギアをString型配列の定数として定義
	static final String[] GEAR =  {"1速", "2速", "3速", "4速", "5速", "6速"};

	// ギアチェンジする抽象メソッドshiftGear
	void shiftGear(String gear);

	// ToDo アクセルを踏む抽象メソッドgasPedalを定義

	// ToDo ブレーキを踏む抽象メソッドbrakePedalを定義

}

class Car implements Vehicle {

	//	現在のギアを1速で初期化
	private String currentGear = Vehicle.GEAR[0];

	@Override
	public void shiftGear(String gear) {
		System.out.println(this.currentGear + "から" + gear + "にシフトチェンジします。");
		this.currentGear = gear;
	}

	// ToDo gasPedalメソッドをオーバーライドして実装
	@Override
	public void gasPedal() {
		// shiftGearメソッドで6速にチェンジ(ギアの指定にはGEAR定数を用いる)

		// 「ぶぉ～ん」と出力

	}

	// ToDo brakePedalメソッドをオーバーライドして実装
	@Override
	public void brakePedal() {
		// shiftGearメソッドで1速にチェンジ(ギアの指定にはGEAR定数を用いる)

		// 「キキーッ」と出力

	}
}

public class InterfaceSample {
	public static void main(String[] args) {
		Car car = new Car();
		car.gasPedal();
		car.brakePedal();
	}
}