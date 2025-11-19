package zerojava.s16;

public class BreakStatement {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			
			if (i == 5) {
				break;
			}
			System.out.println(i + "回目のループ");
		}
	}

}
