package java_book;

public class j2_3 {
	public static void main(String[] args) {
		System.out.println("ようこそ、占いの館へ。");
		System.out.print("あなたの名前は？");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("貴方の年齢を教えてください。");
		int age = new java.util.Scanner(System.in).nextInt();
		int fortune = new java.util.Random().nextInt(4);
		++fortune;
		System.out.println("占いの結果が出ました！");
		System.out.printf("%d歳の%sさん、あなたの運気番号は%dです。\n", age, name, fortune);
		System.out.println("(①大吉 ②中吉 ③吉 ④凶)");
	}
}