package practice.chapter5;

public class Person {

	// 氏名と年齢を表すインスタンス変数
	private String name;
	private int age;

	// コンストラクタ
	public Person(String name, int age) {
		// インスタンス変数を初期化
		this.name = name;
		this.age = age;
	}

	// インスタンス変数を表示して自己紹介を行うメソッド
	public void sayHello() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "歳です。");
	}

	// 歩く動作を表すメソッド
	public void walk() {
		// ToDo 年齢が35歳未満の場合

		// ToDo 年齢が35歳以上の場合

	}
}
