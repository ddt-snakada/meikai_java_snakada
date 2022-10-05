/*0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ*/
package chap05_07;

public class E05_07 {
	public static void main(String[] args) {
		// 2乗を表示する数の定義
		double squareNumber;
		// フロートの変数の宣言
		float floatNumber = 0; 
		// ループを1000回する floatNumberは0.001を足していく
		for (int loop = 0; loop < 1000; floatNumber += 0.001F,loop++) {
			// 表示用変数に２乗を代入する
			squareNumber = floatNumber * floatNumber;
			// floatNumberを10桁表示
			System.out.printf("%10.9f\n", floatNumber);			
			// squareNumberを10桁表示
			System.out.printf("%10.9f\n", squareNumber);
		}
	}

}
