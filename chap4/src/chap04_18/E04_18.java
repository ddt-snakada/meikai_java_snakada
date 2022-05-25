/*右に示すように1からnまで整数値の２乗値を表示するプログラムを作成せよ*/
package chap04_18;

import java.util.Scanner;

public class E04_18 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("nの値:");
		// nを読み込む
		int n = stdIn.nextInt();
		// n回ループする
		for (int i = 1; i <= n; i++) {
			// 2乗を表示する
			System.out.println(i + "の２乗は" + i*i);
		}
	}
}
