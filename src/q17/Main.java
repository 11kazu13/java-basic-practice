package q17;

public class Main {
	public static void main(String args[]) {

		//引数の要素が1つもない場合、メッセージを表示
		if(args.length < 1) {
			System.out.println("1つ以上のコードを入力してください");
			System.exit(-1);
		}

		//インスタンスの生成
		FruitsList fl = new FruitsList();

		//情報の表示
		try {
			if(args.length == 1) {
				fl.search(args[0]);
			} else {
				fl.search(args);
			}
		} catch(UserException ue) {
			System.out.println(ue.getMessage());
		}

	}
}
