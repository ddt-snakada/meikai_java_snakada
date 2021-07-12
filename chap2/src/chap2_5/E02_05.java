//2つの実数値を読み込み、その和と平均を求めて表示するプログラムを表示せよ
package chap2_5;
//javaのスキャナークラスをインポートする
import java.util.Scanner;

public class E02_05 {
	// main関数を定義する
	public static void main(String[] args) {
		// スキャナークラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		// 整数値を読み込む
		double number1 = stdIn.nextDouble();
		// 整数値を読み込む
		double number2 = stdIn.nextDouble();
		//合計値と平均値の変数を定義する
		double sum,average;
		//合計値を求める
		sum = number1 + number2;
		//平均値を求める
		average = sum / 2;
		// 画面に出力する
		System.out.println("合計は"+ sum + "です");
		// 画面に出力する
		System.out.println("平均は"+ average + "です");
	}
}
