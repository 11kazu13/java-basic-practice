package zerojava.s18;

public class HavingRtnAndArgMethod {
	public static void main(String[] args) {
		
		System.out.println("一度変数にメソッドの戻り値を代入してから出力する。");
		String pythonBirth = pythonBirth(1991);
		System.out.println(pythonBirth);
		
		System.out.println("メソッドの戻り値を直接出力する。");
		System.out.println(pythonBirth(1991));
	}
	
	public static String pythonBirth(int year) {
		return "pythonは" + year + "年に誕生しました。";
	}
}
