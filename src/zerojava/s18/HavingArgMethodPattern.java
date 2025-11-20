package zerojava.s18;

public class HavingArgMethodPattern {
	public static void main(String[] args) {
		havingArgMethod("メソッド");
	}
	
	public static void havingArgMethod(String s) {
		System.out.println("引数を1つもつメソッドです。");
		System.out.println("引数値：" + s);
	}
}
