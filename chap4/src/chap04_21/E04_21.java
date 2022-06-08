/*list4-16左下側が直角の三角形を表示するプログラムであった。直角が左上側、右下側、右上側を表示するプログラムをそれぞれ作成せよ */
package chap04_21;

import java.util.Scanner;

public class E04_21 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("段数は:");
		// 整数値を読み込む
		int stepNumber = stdIn.nextInt();
		// 直角が左上側の三角形を表示する
		System.out.println("直角が左上側の三角形を表示する");
		// 最初のループは段数なので読み込んだ段数だけループする
		for (int step = 0; step < stepNumber; step++) {
			// 2個目のループは最初に全てを表示して回数を減らしていく
			for (int number = 0; number < (stepNumber - step); number++) {
				// *を表示する
				System.out.print("*");
			}
			// 改行を表示する
			System.out.println();
		}
		// 直角が右下側の三角形を表示する
		System.out.println("直角が右下側の三角形を表示する");
		// 最初のループは段数なので読み込んだ段数だけループする
		for (int step = 0; step < stepNumber; step++) {
			// 2個目のループも段数分だけループする
			for (int loopNumber = 0; loopNumber < stepNumber; loopNumber++) {
				//空白を段数-1個最初の段で表示し、１個ずつ減らしていく
				if(loopNumber < (stepNumber - (step - 1))) {
					// 空白を表示する
					System.out.print(" ");
				//*を段数ごとに１個ずつ増やし表示する
				}else {
					// *を表示する
					System.out.print("*");
				}
			}
			// 改行を表示する
			System.out.println();
		}
		// 直角が右上側の三角形を表示する
		System.out.println("直角が右上側の三角形を表示する");
		// 最初のループは段数なので読み込んだ段数だけループする
		for (int step = 0; step < stepNumber; step++) {
			// 2個目のループも段数分だけループする
			for (int loopNumber = 0; loopNumber < stepNumber; loopNumber++) {
				//最初の段が空白がなしで1個ずつ増える
				if(loopNumber < step) {
					// 空白を表示する
					System.out.print(" ");
				//*を段数で1個ずつ減らしてく
				}else {
					// *を表示する
					System.out.print("*");
				}
			}
			// 改行を表示する
			System.out.println();
		}
	}
}
