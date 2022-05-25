/*読み込んだ整数値の全ての約数を表示するlist4-13を書き換えて、約数の表示終わった後に、約数の個数を表示するプログラムを作成せよ*/
package chap04_17;

import java.util.Scanner;

public class E04_17 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("整数値:");
		// nを読み込む
		int n = stdIn.nextInt();
		//countを定義する
		int count = 0;
		// n回ループする
		for (int i = 1; i <= n; i++) {
			// nがiの倍数なら
			if (n % i == 0) {
				// 約数を表示する
				System.out.println(i);
				count++;
			}
		}
		//約数の個数を表示する
		System.out.println("約数は"+ count + "個です");
	}
}
