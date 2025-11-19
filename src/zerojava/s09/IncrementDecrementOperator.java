package zerojava.s09;

public class IncrementDecrementOperator {
	public static void main(String[] args) {
		int x = 20;
		
		System.out.println("x = " + x);
		
		x++;
		System.out.println("----------");
		System.out.println("xをインクリメント");
		System.out.println("x = " + x);
		
		x--;
		System.out.println("----------");
		System.out.println("xをデクリメント");
		System.out.println("x = " + x);
		
		int y = ++x;
		System.out.println("----------");
		System.out.println("xを前置インクリメント");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int z = x++;
		System.out.println("----------");
		System.out.println("xを後置インクリメント");
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
	}

}
