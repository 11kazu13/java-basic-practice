package zerojava.s11;

public class IfBranchStatement {
	public static void main(String args[]) {
		int height = 175;
		
		if (height < 160) {
			System.out.println("平均身長よりも少し小さいです。");
			
		}else if (height < 170) {
			System.out.println("平均身長です。");
			
		}else if (height < 180) {
			System.out.println("平均身長よりも少し大きいです。");
			
		}else {
			System.out.println("平均身長を圧倒しています");
		}
	}

}
