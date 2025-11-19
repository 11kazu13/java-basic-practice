package practice.chapter7;

public class ThrowExceptionPractice {

	/*
	 * TODO
	 * 適切なtry-catchとthrowsを設定してください。
	 * try-catchはshowMessageメソッドを呼び出すmainメソッドに追記してください。
	 * mainメソッドのcatchブロック内では例外が発生した場合に「例外が発生しました。」と表示してください。
	 *
	 */
	public static void main(String[] args) {
		String message1 = "throwとthrowsは別物です。";
		String message2 = null;

			showMessage(message1);
			showMessage(message2);

	}

	/*
	 * TODO
	 * スロー宣言はshowMessageメソッドに追記してください。
	 * throwsする例外はExceptionとします。
	 *
	 */
	public static void showMessage(String message) {
		if (message == null || message.isEmpty()) {
			throw new Exception("引数の値が不正です。");
		}
		System.out.println(message);
	}

}
