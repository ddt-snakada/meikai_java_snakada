/*三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ平均は実数として表示すること*/
package chap05_04;

import java.util.Scanner;

public class E05_04 {
	public static void main(String[] args) {		
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("x:");
		// intで読み込む
		int xNumber = stdIn.nextInt();
		// 読み込みの表示
		System.out.print("y:");
		// intで読み込む
		int yNumber = stdIn.nextInt();
		// 読み込みの表示
		System.out.print("z:");
		// intで読み込む
		int zNumber = stdIn.nextInt();
		//平均を表示 .0をつけて小数まで表示する
		System.out.println((xNumber + yNumber + zNumber)/3.0);
	}

}
