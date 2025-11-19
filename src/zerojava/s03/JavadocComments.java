package zerojava.s03;

public class JavadocComments {
	/**
	 * 名前と年齢を出力する
	 * 
	 * @param name 名前
	 * @param age 年齢
	 */
	public static void echo1(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args){
		echo1("Java太郎", 33);
	}

}
