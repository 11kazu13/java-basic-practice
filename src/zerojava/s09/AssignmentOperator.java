package zerojava.s09;

public class AssignmentOperator {
	public static void main(String[] args) {
		int x = 20;
		int y = 8;
		
		System.out.print("x = ");
		System.out.println(x);
		System.out.print("y = ");
		System.out.println(y);
		
		int sum = x + y;
		System.out.print("int sum = x + y:");
		System.out.println(sum);
		
		sum += x;
		System.out.print("sum += x:");
		System.out.println(sum);
		
		sum -= y;
		System.out.print("sum -= y:");
		System.out.println(sum);
		
		sum *= x;
		System.out.print("sum *= x:");
		System.out.println(sum);
		
		sum /= y;
		System.out.print("sum /= y:");
		System.out.println(sum);
	}

}
