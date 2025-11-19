package practice.chapter3;

public class TypeConvertor {
	public static void main(String[] args) {
		// コマンドライン引数の[0]番目の値を表示する
		System.out.printf("コマンドライン引数の[0]番目で受け取った値:%s", args[0]);

		// TODO int型に変換できるようにしてください。
		int parseInt = 
		System.out.printf("int型の変換した値:%d\n", parseInt);

		// TODO Long.parseメソッドが正常に動作するように変更してみましょう。
		long parseLong = 
		System.out.printf("long型の変換した値:%dL\n", parseLong);

		// TODO float型に変換できるようにしてみしょう。ヒントは上にあります。
		float parseFloat = 
		System.out.printf("float型の変換した値:%ff\n", parseFloat);

		// TODO 適切な型を宣言してみましょう
		double parseDouble = 
		System.out.printf("double型の変換した値:%fd\n", parseDouble);
	}
}
