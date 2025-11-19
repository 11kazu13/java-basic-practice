package q11;

public class Main{

	public static void main(String args[]){

		Menu[] menus = new Menu[5];       //販売

		//インスタンスの生成
		menus[0] = new AppOrder("みそラーメン", 680);
		menus[1] = new AppOrder("マーボー豆腐",650);
		menus[2] = new AppOrder("チャーハン",630);
		menus[3] = new CallOrder("餃子",350);
		menus[4] = new CallOrder("からあげ",300);

		//注文する
		menus[0].order(5);
		menus[1].order(2);
		menus[2].order(4);
		menus[3].order(6);
		menus[4].order(3);



	}
}
