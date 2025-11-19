package q16;

public class Main {

	public static void main(String args[]) {
		if (args.length != 2) {
			System.out.println("引数は'数値1 数値2'の形で入力してください");
			System.exit(-1);
		}

		int num1; //一つ目の数字
		int num2; //二つ目の数字

		//以下に必要なコードを記述してください。

		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);

		Union.unionWords(num1, num2);

	}
}
