/*正の整数値を0までカウントダウンするlist4-4をfor分で実現せよ*/
package chap04_11;

import java.util.Scanner;

public class E04_11 {

	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//カウントダウンの宣言
		System.out.println("カウントダウンします。");
		//xを定義する
		int x;
		//xが0より大きくなるまで入力を繰り返す
		for(x = 0; x <= 0; ) {
			//xに数値を入力する
			x = stdIn.nextInt();
		}
		//xをデクリメントしていき、xが0以上の間ループする
		for(; x >= 0; x--) {
			//xを出力する
			System.out.println(x);
		}	
	}

}
