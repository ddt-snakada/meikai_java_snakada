/*合計でなく平均も求めるようにlist4-17およびlist4-18のプログラムを書き換えよ*/
package chap04_25;

import java.util.Scanner;

public class E04_25_2 {
	//list4-18のプログラム
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
			System.out.print("整数:");
			// 整数値を読み込む
			int t = stdIn.nextInt();
			if(sum + t > 1000) {
				//0の場合ループから抜けるテキスト指定なのブロックにはしない
				System.out.println("合計が1000をこえました。");
				System.out.println("最後の数値は無視します。");
				break;
			}			
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
