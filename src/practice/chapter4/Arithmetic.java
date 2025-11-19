package practice.chapter4;

public class Arithmetic {

	// メンバ変数
	public int num1;
	public int num2;

	// コンストラクタ
	public Arithmetic() {
		System.out.println("計算を開始します");
	}

	// メンバメソッド
	public void fourArithmeticOperations() {
		System.out.printf("四則演算を開始します。num1:%d num2:%d",num1,num2);
		System.out.println(); // 改行
		System.out.println("num1+num2="+(num1+num2));
		System.out.println("num1-num2="+(num1-num2));
		System.out.println("num1*num2="+(num1*num2));
		System.out.println("num1/num2="+(num1/num2));
	}

}
