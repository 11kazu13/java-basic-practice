package q05;

class Reservation{

	//レンタカーの予約状況配列 true:予約済み, false:予約空き
	boolean cars[] = {false, true, true, false, true};

	//予約状況の確認
	void check(){

	String announce = "現在"; //表示メッセージ
	int count = 0; //空車の数

	//配列のfalse数をカウント、添え字の号車情報を追加
	for(int i = 0; i < cars.length; i++){
		if(!cars[i]){
			announce += "、" + (i + 1) + "号車";
			count++;
			}
		}
	//空車数が0か否かで追加する文字を分岐
	if(count != 0){
		announce += "が空いています。";
		} else {
		announce += "全車貸出中です。";
		}
		System.out.println(announce);

	}

	//予約の実施
	void reserv(int no){

		//指定した添え字が予約空きの場合
		if(!cars[no - 1]){
			//予約済みにして、メッセージを表示
			cars[no - 1] = true;
			System.out.println(no + "号車を予約しました。");
		} else {
			//メッセージを表示
			System.out.println(no + "号車は空いていません。");
		}

	}

	//予約のキャンセル
	void cancel(int no){

		//指定した添え字が予約済みの場合
		if(cars[no - 1]){
			//予約空きにしてメッセージを表示
			cars[no - 1] = false;
			System.out.println(no + "号車の予約を取り消しました。");
			} else {
			//メッセージを表示
			System.out.println(no + "号車は予約されていません。");
		}

	}

}
