package zerojava.s11;

public class ElseIfStatement {
	public static void main(String[] args) {
		int num = 556;
		
		if(num > 555) {
			System.out.println("555より大きな数です。");
			
		}else if(num == 555) {
			System.out.println("555です。");
			
		}else {
			System.out.println("555よりも小さい数です。");
		}
	}

}
