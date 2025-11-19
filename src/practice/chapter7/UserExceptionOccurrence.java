package practice.chapter7;

import java.util.ArrayList;

public class UserExceptionOccurrence {

	/*
	 * TODO 引数numが10以上の場合にユーザー定義例外を発生させてください。
	 * このメソッド内にはtry-catch文を記述せず、ユーザー定義例外のスロー宣言をメソッドに追加してください。
	 */
	public static void displayNumber(int num) {
		// numが10より小さい場合
		if (num < 10) {
			System.out.println(num);
		}
		// numが10以上の場合
		else {
			// TODO ユーザー定義例外を発生させエラーメッセージに「例外が発生しました。」を設定してください。

		}
	}

	public static void main(String[] args) {

		// インスタンス化
		ArrayList<Integer> array = new ArrayList<>();

		// 変数に値を格納
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);

		/*
		 * TODO
		 * for文内でdisplayNumberメソッドを呼び出しローカル変数numを引数に渡してください。
		 * try-catchブロックでユーザー定義例外の例外処理を追記してください。
		 * catchブロック内では発生したユーザー定義例外のエラーメッセージを表示させてください。
		 */
		for (int i = 0; i < array.size(); i++) {
			int num = array.get(i);

		}
	}

}
