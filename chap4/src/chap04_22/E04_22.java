/*n段のピラミッドを表示するプログラムを作成せよ
 * 第i行目には（i-1）*2+1個の'*'を表示して、
 * 最終行である第n行目には(n-1)*2+1個の'*'記号を表示すること*/
package chap04_22;

import java.util.Scanner;

public class E04_22 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("段数は:");
		// 整数値を読み込む
		int stepNumber = stdIn.nextInt();
		//ピラミッドの最下層の*の数を求める
		int maxStarNumber = (stepNumber - 1) * 2 + 1;
		//i番目の*の数を定義する
		int iStarNumber;
		// 最初のループは段数なので読み込んだ段数だけループする
		for (int i = 1; i <= stepNumber; i++) {
			// ピラミッドの最下層の*の数だけループする
			for (int loopNumber = 0; loopNumber < maxStarNumber; loopNumber++) {
				//i番目の*の数を求める
				iStarNumber = (i - 1) * 2 + 1;
				// 前半のスペースを表示する。＊の最大数から段で表示する＊を引いて1/2数だけ表示する
				if(loopNumber < (maxStarNumber - iStarNumber)/2) {
					// 空白を表示する
					System.out.print(" ");
				// *を表示する。ifの条件にi段で表示する＊分を足す
				}else if (loopNumber < (maxStarNumber-iStarNumber)/2 + iStarNumber) {
					// *を表示する
					System.out.print("*");
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
