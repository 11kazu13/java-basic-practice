package q09;

//メインクラス
public class Main{

	public static void main(String args[]){

		/*Scannerクラス版
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] s = str.split("[ 　]+");];
		*/

		//引数の要素数が2つではない場合
		if(args.length != 2){
			System.out.println("自分の生まれ年と相手の生まれ年を"
							+ "西暦'yyyy'の形で入力してください。");
			//プログラムを終了させる。
			System.exit(-1);
		}

		//Zodiacインスタンス生成
		Fortune z = new Fortune(args[0],args[1]);

		//FortuneTelling z = new FortuneTelling(s[0],s[1]);

		//診断結果の表示
		z.printResult();
	}
}
