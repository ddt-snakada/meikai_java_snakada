/*右に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ*/
package chap03_01;

import java.util.Scanner;

public class E03_01 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("整数値:");
		// 整数値を読み込む
		int readNumber = stdIn.nextInt();
		// 整数値が0以上であるなら
		if (readNumber >= 0) {
			// そのまま表示
			System.out.print("その絶対値は" + readNumber + "です。");
			// 0より小さい時
		} else {
			// マイナス１をかける
			readNumber = readNumber * -1;
			// 表示をする
			System.out.print("その絶対値は" + readNumber + "です。");
		}
	}

}
