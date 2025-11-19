package zerojava.s10;

public class StringComparison {
	public static void main(String[] args) {
		String name = "山田花子";
		boolean result = name.equals("田中太郎");
		
		System.out.println("name = " + name);
		System.out.print("name.equals(\"田中太郎\"):");
		System.out.println(result);
		
		result = name.equals("山田花子");
		System.out.print("name.equals(\"山田花子\":");
		System.out.println(result);
		
	}
}
