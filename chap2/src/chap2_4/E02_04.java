// 右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成性よ.
package chap2_4;
//javaのスキャナークラスをインポートする
import java.util.Scanner;

public class E02_04 {
	// main関数を定義する
	public static void main(String[] args) {
		// スキャナークラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		// 整数値を読み込む
		int number = stdIn.nextInt();
		// 変数を定義し10加えた値を代入する
		int plusNumber = number + 10;
		// 変数を定義し10減じた値を代入する
		int minusNumber = number - 10;
		// 画面に出力する
		System.out.println("10を加えた値は"+ plusNumber + "です");
		// 画面に出力する
		System.out.println("10を減じた値は"+ minusNumber + "です");
	}

}
