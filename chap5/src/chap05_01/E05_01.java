/*10進数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ*/
package chap05_01;

import java.util.Scanner;

public class E05_01 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("整数:");
		// 整数値を読み込む
		int readNumber = stdIn.nextInt();
		//printfを用いて8進数を表示
		System.out.printf("8進数では%o \n",readNumber);
		//printfを用いて16進数を表示
		System.out.printf("16進数では%x \n",readNumber);
	}

}
