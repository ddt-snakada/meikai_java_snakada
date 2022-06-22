/*三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。平均はキャスト演算子を利用して求め、実数として表示すること*/
package chap05_05;

import java.util.Scanner;

public class E05_05 {
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
		//キャスト変換する
		double average = (double)(xNumber + yNumber + zNumber)/3;
		//平均を表示する
		System.out.println(average);
	}

}
