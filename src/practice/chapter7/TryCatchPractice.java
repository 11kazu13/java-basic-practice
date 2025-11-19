package practice.chapter7;

public class TryCatchPractice {

	public static void main(String[] args) {
    	String str1 = null;
    	String str2 = "str1の長さは";

    	/*
    	 * TODO
    	 * 適切なtry-catchとfinallyを設定してください。
    	 * なお発生する例外はNullPointerExceptionとし、例外が発生した場合”ヌルぽです。”と表示してください。
    	 * また、例外が発生するしないに関わらず最後に”終了”を表示してください。
    	 *
    	 */
    	System.out.println(str2 + str1.length());
	}

}
