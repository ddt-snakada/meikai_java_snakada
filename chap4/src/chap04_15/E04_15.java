/*身長と標準体重の対応表を表示するプログラムを作成せよ。表示する身長の範囲（開始値/終了値/増分）、整数値として読み込むこと
 * 標準体重は(身長-100)*0.9によって求められる*/
package chap04_15;

import java.util.Scanner;

public class E04_15 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//入力の促し
		System.out.println("何cmから：");
		//始まりを定義する
		int startNumber = stdIn.nextInt();
		//入力の促し
		System.out.println("何cmまで：");
		//終わりを定義する
		int endNumber = stdIn.nextInt();
		//入力の促し
		System.out.println("何cmごと：");
		//間隔を定義する
		int everyNumber = stdIn.nextInt();
		//標準体重を定義する
		double normalWeight;
		//始まりから終わりまでループする。終わりの数を超えた時点でループは終了する
		for(; startNumber <= endNumber; startNumber = startNumber + everyNumber) {
			//標準体重を計算する
			normalWeight = (startNumber - 100) * 0.9;
			//標準体重を出力していく
			System.out.println(startNumber + " " + normalWeight);
		}	

	}
}
