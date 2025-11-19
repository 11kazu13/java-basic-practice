package q10;

public class Main{
	public static void main(String args[]){

		//インスタンスの生成
		Member buiesu = new Member("武井江洲太郎", 26, 3);
		Manager modesu = new Manager("茂出須一郎", 45,"部長");

		//情報を表示
		System.out.println("------------------------------------");
		buiesu.print();
		System.out.println("------------------------------------");
		modesu.print();
		System.out.println("------------------------------------");

	}
}

