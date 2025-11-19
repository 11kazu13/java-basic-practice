package q13;

public class Member implements MemberInterface{

	private String name; //名前
	private int year;	 //年次

	//コンストラクタ
	public Member(String name,int year){
		this.name = name;
		this.year = year;
	}

	//名前を表示
	public void printName() {
		System.out.println(name + "です");
	}

	//社会人年数を表示
	public void printYear() {
		System.out.println("社会人" + year + "です");
	}
}
