package zerojava.s10;

public class LogicalOperator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 35;
		String gender = "female";
		
		System.out.println("年齢：" + age);
		System.out.println("性別：" + gender);
		
		boolean result = (age >= 18) && (gender.equals("male"));
		System.out.println("成人男性判定：" + result);
		
		result = (age >= 18) || (gender.equals("male"));
		System.out.println("成人または男性判定：" + result);
		
		result = !((age >= 18) && (gender.equals("male")));
		System.out.println("成人男性ではない：" + result);
	}

}
