/*float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ*/
package chap05_02;

import java.util.Scanner;

public class E05_02 {
	public static void main(String[] args) {		
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("x:");
		// floatで読み込む
		float floatNumber = stdIn.nextFloat();
		//floatを表示
		System.out.println("x = " + floatNumber);
		// 読み込みの表示
		System.out.print("y:");
		//dobleで読み込む
		double doubleNumber = stdIn.nextDouble();
		//doubleを表示
		System.out.println("y = " + doubleNumber);
	}

}
