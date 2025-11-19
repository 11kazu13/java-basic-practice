package q10;

public class Worker{

	private String name; //名前
	private int age; //年齢

	//コンストラクタ
	public Worker(String name, int age){
				this.name = name;
				this.age  = age;
	}

	//情報を表示
	public void print(){

		System.out.print("名前は" + name);
		System.out.print("、");
		System.out.println("年齢は" + age + "歳です。");

	}

}

