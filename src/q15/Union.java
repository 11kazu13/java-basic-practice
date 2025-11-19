package q15;

public class Union {

	//プログラミング言語の配列
	public static String[] langugage = {"Java", "Python", "Ruby", "PHP", "C", "C++"};
	//習得レベルの配列
	public static String[] level = {"未経験者", "入門者", "初心者", "中級者", "上級者"};

	public static void unionWords(int num1, int num2) {

		//以下に必要なコードを記述してください。

			String str1 = langugage[num1];
			String str2 = level[num2];

			System.out.println(str1 + str2);


	}

}
