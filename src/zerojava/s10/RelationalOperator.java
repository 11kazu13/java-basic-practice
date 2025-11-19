package zerojava.s10;

public class RelationalOperator {
	public static void main(String[] args) {
		int scoreA = 55;
		boolean isPassed = (scoreA >= 60);
		System.out.println("Aの試験結果：" + scoreA);
		System.out.println("単位判定" + isPassed);
		
		int scoreB = 67;
		isPassed = (scoreB >= 60);
		System.out.println("Bの試験結果" + scoreB);
		System.out.println("単位判定：" + isPassed);
		
		boolean result = (scoreA == scoreB);
		System.out.println("A == B:" + result);
		
		result = (scoreA != scoreB);
		System.out.println("A != B:" + result);
	}

}
