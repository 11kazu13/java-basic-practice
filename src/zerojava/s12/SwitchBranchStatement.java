package zerojava.s12;

public class SwitchBranchStatement {
	public static void main(String[] args) {
		int dayOfWeek = 100;
		
		switch (dayOfWeek) {
		case 1:
			System.out.println("本日は日曜日です。");
			break;
		case 2:
			System.out.println("本日は月曜日です。");
			break;
		case 3:
			System.out.println("本日は火曜日です。");
			break;
		case 4:
			System.out.println("本日は水曜日です。");
			break;
		case 5:
			System.out.println("本日は木曜日です。");
			break;
		case 6:
			System.out.println("本日は金曜日です。");
			break;
		case 7:
			System.out.println("本日は土曜日です。");
			break;
		default:
			System.out.println("不正な値です。");
		}
	}

}
