/*n段の正方形を表示するプログラムを作成せよ。右に示すのは、nが3のときの実行結果である*/
package chap04_20;

import java.util.Scanner;

public class E04_20 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// nの定義
		int n = stdIn.nextInt();
		//段数のループをする
		for (int step = 0; step < n; step++) {
			//1段に表示する個数のループ
			for (int number = 0; number < n; number++) {
				System.out.print("*");
			}
			//1段に表示する個数を終えたら改行する
			System.out.println();
		}
	}
}
