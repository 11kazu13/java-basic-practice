package q12;


public class Main{

	public static void main(String args[]){
		//インスタンスの生成
		ProductInterface goods1 = new Alcohol("ビール","10リットル",5800,7);
		ProductInterface goods2 = new Dispencer("ビールディスペンサ","二口", 83780);

		//注文処理
		goods1.order(3);
		goods2.order(2);

		//情報の表示
		System.out.println("注文情報");
		goods1.display();
		System.out.println("----------------------------");
		goods2.display();
	}
}

