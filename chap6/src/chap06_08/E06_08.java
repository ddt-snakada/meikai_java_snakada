/* doble型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。要素数と全要素の値はキーボードから呼び込むこと */
package chap06_08;
import java.util.Random;
import java.util.Scanner;
public class E06_08 {
	public static void main(String[] args) {
		// スキャナークラスのインプットを生成する
		Scanner standardInput = new Scanner(System.in);
		// 文の表示
		System.out.print("配列の要素数");
		// 配列の要素数
		int arraySize = standardInput.nextInt();
		// double型配列を宣言
		double[] doubleArray = new double[arraySize]; 
		// 配列のサイズだけループ
		for (int j = 0; j < arraySize; j++) {
			// 文の表示
			System.out.print("配列["+ j + "]:");
			// 配列に数値を入れる
			doubleArray[j] = standardInput.nextDouble();
		}
		//合計値変数の宣言
		double sum = 0;		
		// 拡張for文で全要素を走査する
		for (double doubleNumber :doubleArray) {
			// 加算していく
			sum += doubleNumber;
		}
		// 合計の表示
		System.out.println("合計値:" + sum);
		// 平均値の表示
		System.out.print("平均値:" + sum / arraySize);
	}		
}