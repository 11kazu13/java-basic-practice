package q13;

public class Main {

	public static void main(String args[]){

		//インスタンス生成
		MemberInterface buiesu = new Member("武井江洲太郎", 3);
		PlayingManager modesu = new PlayingManager("茂出須一郎",22,"部長","マネジメント");

		//情報を表示
		buiesu.printName();
		buiesu.printYear();
		System.out.println("----------------------------------------");
		modesu.printName();
		modesu.printYear();
		modesu.printPosition();
		modesu.printSpecialty();
		System.out.println("----------------------------------------");
	}
}
