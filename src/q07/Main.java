package q07;

//メインクラス
class Main{
	public static void main(String args[]){

	  //Fruitsインスタンスを生成
		Fruits banana = new Fruits("バナナ", "房", 200);

		//bananaのOrderメソッドを呼び出し
		banana.order(10);

		//結果の出力
		System.out.println("------------------------------");
		banana.display();
		System.out.println("------------------------------");
		banana.displayTotal();
		System.out.println("------------------------------");

	}
}

