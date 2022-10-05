/*合計でなく平均も求めるようにlist4-19のプログラムを書き換えよ。なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること*/
package chap04_26;

import java.util.Scanner;

public class E04_26 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 説明の表示
		System.out.println("整数を加算します。");
		// 読み込みの表示
		System.out.print("何個加算しますか:");
		// 整数値を読み込む
		int n = stdIn.nextInt();
		// 合計値の定義をする
		int sum = 0;
		// 平均を定義する
		int average = 0;
		// 分母を定義する
		int denominator = 0;
		// 読み込んだ整数値分ループする
		for (int i = 0; i < n; i++) {
			// 説明と読み込みのの表示
			System.out.print("整数:");
			// 整数値を読み込む
			int t = stdIn.nextInt();
			// 合計を加算する
			sum += t;
			// 読み込んだ整数値が正の数の場合
			if (t >= 0) {
				// 分母に1加算する
				denominator += 1;
			}
			// 平均を計算する 0除算がありえるので0以外の場合
			if (denominator != 0) {
				// 平均の計算
				average = sum / denominator;
			}
		}
		// 合計の出力
		System.out.println("合計は" + sum + "です。");
		//0除算でない場合
		if (denominator != 0) {
			// 平均の出力
			System.out.println("平均は" + average + "です。");
		//0除算の場合
		}else {
			System.out.println("分母が0です。");
		}
	}
}