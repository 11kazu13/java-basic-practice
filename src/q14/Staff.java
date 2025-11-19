package q14;

public class Staff {

	private String name; //名前
	private String birthplace; //出身地
	private int income;	 //月収(万円)

	//コンストラクタ
	public Staff(String name,String birthplace,int income){
		this.name = name;
		this.birthplace = birthplace;
		this.income = income;
	}

	//情報を表示
	public void display(){

		System.out.print(name + "さん > ");
		System.out.print("出身地: " + birthplace +" > ");
		System.out.println("月収: " + income + "万円");

	}

	//ゲッター
	public String getName(){
		return name;
	}

	public String getbirthplace(){
		return birthplace;
	}

	public int getIncome(){
		return income;
	}

}
