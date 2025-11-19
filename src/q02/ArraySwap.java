package q02;

public class ArraySwap {
	public static void main(String[] args) {

		int[] array = {24, 10, 55, 69, 2, 91, 73, 12, 32, 46}; //数字の配列

		System.out.println("入れ替え前の配列");

		//以下に必要なコードを記述してください。

		/*「","(カンマ)」の表示について
		 * 通常のforループに組み込むと、最後の要素の後にも「","(カンマ)」が表示されます。
		 * 最後の要素かどうかは「array.length -1」で確かめましょう。
		*/

		/*配列を前半と後半に分ける
		 *一番大きい添え字を取得して
		 *ループで前から、添え字で後ろから要素を取得
		 *①tmpに前半の要素を代入
		 *②前半の要素に後半の要素を代入
		 *③後半の要素にtmpを代入
		 *④indexを1減らす
		*/

		int num = array.length / 2; //入れ替え回数の宣言
		int index = array.length - 1; //一番大きい添え字を宣言
		int tmp = 0; //配列要素の一時退避用変数の宣言

		//for文を利用して、配列要素を入れ替え回数分出力
		for(int i=0; i < ; i++) {
			tmp = ;
			array[i] = ;
			array[index] = ;

		}

		System.out.println("\n入れ替え後の配列");

	}
}
