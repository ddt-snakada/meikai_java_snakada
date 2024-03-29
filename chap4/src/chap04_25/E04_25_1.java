/*正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。素数とは2以上n未満のいずれの数でも割り切れない整数nのことである*/
package chap04_25;

import java.util.Scanner;

public class E04_25_1 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//説明の表示
		System.out.println("整数を加算します。");
		// 読み込みの表示
		System.out.print("何個加算しますか:");
		// 整数値を読み込む
		int n = stdIn.nextInt();
		//合計値の定義をする
		int sum = 0;
		//平均を定義する
		int average = 0;
		//読み込んだ整数値分ループする
		for (int i = 0; i < n; i++) {
			//説明と読み込みのの表示
			System.out.print("整数(0で終了):");
			// 整数値を読み込む
			int t = stdIn.nextInt();
			//0の場合ループから抜けるテキスト指定なのでブロックにはしない
			if(t == 0) break;
			//合計を加算する
			sum+=t;
			//平均を計算する iが0からはじまるので1加算する
			average = sum / (i + 1);
		}
		//合計の出力
		System.out.println("合計は" + sum + "です。");
		//平均の出力
		System.out.println("平均は" + average + "です。");
	}
}
