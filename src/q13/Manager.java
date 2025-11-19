package q13;
//従業員クラス
public class Manager implements ManagerInterface{

	private String name; //名前
	private String position;	//職種
	private String specialty;	//得意分野

	//コンストラクタ
	public Manager(String name,String position,String specialty){
		this.name = name;
		this.position = position;
		this.specialty = specialty;
	}

	//名前を表示
	public void printName() {
		System.out.println(name + "です");
	}

	//職種を表示
	public void printPosition() {
		System.out.println("私の役職は" + position + "です");
	}

	//年収を表示
	public void printSpecialty() {
		System.out.println("得意分野は" + specialty +"です");
	}
}
