/* 要素型がint型である配列を作り、全要素を1~10の乱数で埋め尽くす(1以上10以下の値を代入する)プログラムを作成せよ
 * 要素数はキーボードから読み込むこと。 */
package chap06_09;
import java.util.Scanner;
import java.util.Random;

public class E06_09 {
	public static void main(String[] args) {
		// ランダムクラスのインスタンスを生成する
		Random random = new Random();
		// スキャナークラスのインプットを生成する
		Scanner standardInput = new Scanner(System.in);
		// 文の表示
		System.out.print("配列の要素数:");
		// 配列の要素数
		int arraySize = standardInput.nextInt();
		// int型配列を宣言
		int[] intArray = new int[arraySize]; 
		// 配列のサイズだけループ
		for (int j = 0; j < arraySize; j++) {
			// ランダムな数を配列に代入
			intArray[j] = random.nextInt(10) + 1;
		}	
		// ループ様変数
		int index = 0;
		// 拡張for文で全要素を走査する
		for (int intNumber :intArray) {
			// 代入した結果を表示
			System.out.println("intArray[" + index + "]= " + intNumber);
			// インクリメント
			index++;
		}

	}		
}