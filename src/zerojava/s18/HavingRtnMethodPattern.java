package zerojava.s18;

public class HavingRtnMethodPattern {
	public static void main(String[] argas) {
		int result = havingRtnMethod();
		System.out.println("一度変数にメソッドの戻り値を代入してから出力する。");
		System.out.println(result);
		
		System.out.println("直接メソッドの戻り値を入力する");
		System.out.println(havingRtnMethod());
	}
	
	public static int havingRtnMethod() {
		return 100 / 2;
	}
}
