package q06;

class Main{

	public static void main(String args[]){

		//Fruitsインスタンスの生成
		Fruits banana = new Fruits();

		int total = 0; //合計金額
		int tax   = 0; //消費税

		//bananaのinitializeメソッドを呼び出し
		banana.initialize("バナナ", "房", 200);

		//bananaのOrderメソッドを呼び出し
		banana.order(10);

		total = banana.getTotal(); //合計金額にgetTotalメソッドの結果を代入
		tax   = (int)(total * Fruits.TAX); //消費税に合計金額×消費税率を代入

		//結果の出力
		System.out.println("------------------------------");
		System.out.println("品名     : " + banana.name);
		System.out.println("単位     : " + banana.unit);
		System.out.println("単価     : " + banana.price);
		System.out.println("注文数   : " + banana.stock);
		System.out.println("------------------------------");
		System.out.println("売上金額 : " + total);
		System.out.println("消費税   : " + tax);
		System.out.println("合計     : " + (total + tax));
		System.out.println("------------------------------");

	}
}
