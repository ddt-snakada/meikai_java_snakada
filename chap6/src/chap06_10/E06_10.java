/* 連続する要素が同じ値をもつことのないように演習6-9のプログラムを改良したプログラムを作成せよ。
 * たとえば{1,3,5,5,3,2}とならないように */
package chap06_10;
import java.util.Scanner;
import java.util.Random;

public class E06_10 {
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
		// ランダムな数値を保管する変数
		int randomNumber;
		// 前の数値を保管しておく変数tmpNumber最初の数はかならず一致しないように-1;
		int tmpNumber = -1;
		// 配列のサイズだけループ
		for (int j = 0; j < arraySize; ) {
			// ランダムな数を代入
			randomNumber = random.nextInt(10) + 1;
			// 前のループの変数と一致するか確認
			if (tmpNumber == randomNumber) {
				//一致する場合は次のループ処理に進む
				continue;
			} 
			// ランダムな配列を格納する
			intArray[j] = randomNumber;
			// tmpNumberを更新する
			tmpNumber = randomNumber;
			j++;
			
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
