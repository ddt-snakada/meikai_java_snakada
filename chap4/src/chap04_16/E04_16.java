/*読み込んだ個数だけ*を表示するlist4-11を書き換えて、5個表示するごとに改行するプログラムを作成せよ*/
package chap04_16;

import java.util.Scanner;

public class E04_16 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("何個*を表示しますか");
		// nを読み込む
		int n = stdIn.nextInt();
		// n回ループする
		for (int i = 0; i < n; i++) {
			// *を表示する
			System.out.print("*");
			// i+1が5の倍数なら改行を
			if ((i + 1) % 5 == 0) {
				// 改行を表示する
				System.out.println();
			}
		}
	}
}
