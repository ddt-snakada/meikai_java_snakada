//右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
package chap2_3;
// javaのスキャナークラスをインポートする
import java.util.Scanner;

public class E02_03 {
	// main関数を定義する
	public static void main(String[] args) {
		// スキャナークラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		// 整数値を読み込む
		int number = stdIn.nextInt();
		// 画面に出力する
		System.out.println(number + "と入力しましたね。");
	}

}
