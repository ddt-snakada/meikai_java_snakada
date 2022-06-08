/*0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ*/
package chap05_07;

public class E05_07 {
	public static void main(String[] args) {
		// 2乗を表示する数の定義
		double squareNumber;
		// ループを1000回する floatNumberは0.001を足していき
		for (float floatNumber = 0.0F; floatNumber <= 1.0F; floatNumber += 0.001F) {
			// 表示用変数に２乗を代入する
			squareNumber = floatNumber * floatNumber;
			// squareNumberを10桁表示
			System.out.printf("%f10\n", squareNumber);
		}
	}

}
