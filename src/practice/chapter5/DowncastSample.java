package practice.chapter5;

public class DowncastSample {

	public static void main(String[] args) {
		// ToDo Childクラスをインスタンス化しChild型の変数childに格納

		// ToDo Parentクラスから継承されたsayHelloメソッドを呼び出す

		// ToDo Childクラスで定義したcryメソッドを呼び出す

		// ToDo 暗黙的キャストにより親クラス型の変数parentに格納

		// ToDo ParentクラスのsayHelloメソッドは呼び出し可能

		// Parent型なのでChildクラスのcryメソッドは呼び出し不可
		// parent.cry();

		// ToDo 明示的なダウンキャストによりChildクラスのcryメソッドを呼び出す

	}
}

class Parent {
	public void sayHello() {
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent {
	public void cry() {
		System.out.println("おぎゃー！");
	}
}