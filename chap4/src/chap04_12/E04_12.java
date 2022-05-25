/*前問とは逆に0から正の整数値までカウントアップするプログラムを作成せよ*/
package chap04_12;

import java.util.Scanner;

public class E04_12 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//カウントアップの宣言
		System.out.println("カウントアップします。");
		//xを定義する
		int x;
		//xが0より大きくなるまで入力を繰り返す
		for(x = 0; x <= 0; ) {
			//xに数値を入力する
			x = stdIn.nextInt();
		}
		//countをインクリメントしていき、countがx以下の間ループする
		for(int count = 0 ; count <= x; count++) {
			//countを出力する
			System.out.println(count);
		}	
	}
}
