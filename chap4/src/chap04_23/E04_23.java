/*n段のピラミッドを表示するプログラムを作成せよ
第i行目には1%10を表示すること*/
package chap04_23;

import java.util.Scanner;

public class E04_23 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("段数は:");
		// 整数値を読み込む
		int maxStepNumber = stdIn.nextInt();
		//ピラミッドの最下層の*の数を求める
		int maxStarNumber = (maxStepNumber - 1) * 2 + 1;
		//i番目の*の数を定義する
		int iStarNumber;
		// 最初のループは段数なので読み込んだ段数だけループする
		for (int step = 1; step <= maxStepNumber; step++) {
			// ピラミッドの最下層の*の数だけループする
			for (int loopNumber = 0; loopNumber < maxStarNumber; loopNumber++) {
				//i番目の*の数を求める
				iStarNumber = (step - 1) * 2 + 1;
				// 前半のスペースを表示する。＊の最大数から段で表示する＊を引いて1/2数だけ表示する
				if(loopNumber < (maxStarNumber - iStarNumber)/2) {
					// 空白を表示する
					System.out.print(" ");
				// *を表示する。ifの条件にi段で表示する＊分を足す
				}else if (loopNumber < (maxStarNumber-iStarNumber)/2 + iStarNumber) {
					// iを表示する
					System.out.print(step%10);
				//後半のスペースを表示する
				}else {
					// 空白を表示する
					System.out.print(" ");
				}
			}
			// 改行を表示する
			System.out.println();
		}
	}
}
