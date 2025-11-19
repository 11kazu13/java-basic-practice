package q17;

import java.util.HashMap;

public class FruitsList {

	private HashMap<String, Fruits> list; //果物リスト

	//コンストラクタ
	public FruitsList() {

		//インスタンスの生成
		list = new HashMap<>();
		//要素の格納
		list.put("F001", new Fruits("リンゴ", "個", 150));
		list.put("F002", new Fruits("なし", "個", 200));
		list.put("F003", new Fruits("バナナ", "房", 100));
		list.put("F004", new Fruits("さくらんぼ", "パック", 400));
		list.put("F005", new Fruits("レーズン", "袋", 300));

	}

	//果物の検索(引数のコードが1つの場合)
	public void search(String order) throws UserException{ //
		Fruits fl = list.get(order);
		if(fl != null) {
			System.out.println("コード	品名	単位	単価");
			System.out.println("--------------------------------------------");
			System.out.println(order + "	" + fl.getName() + "	" + fl.getUnit() + "	" + fl.getPrice());
		} else {
			String msg = "コード「" + order + "」に対応する商品はありません";
			throw new UserException(msg);
		}
	}

	//果物の検索(引数のコードが複数の場合)
	public void search(String[] orders) throws UserException{

		String msg = ""; //エラーメッセージ格納用
		boolean flag = false; //エラー発生フラグ(trueならばエラー発生)

		System.out.println("コード	品名	単位	単価");
		System.out.println("--------------------------------------------");

		for(String order : orders) {
			Fruits val = list.get(order);

			if(val != null) {
				System.out.println(order + "	" + val.getName() + "	" + val.getUnit() + "	" + val.getPrice());
			} else {
				msg += "コード「" + order + "」に対応する商品はありません";
				flag = true;
			}
		}
		if(flag) {
			throw new UserException(msg);
		}

	}
}
