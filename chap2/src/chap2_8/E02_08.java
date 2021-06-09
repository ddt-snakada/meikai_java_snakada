/*キーボードかみ読み込んだプラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ */
package chap2_8;
import java.util.Random;
import java.util.Scanner;
public class E02_08 {
	// main関数を定義する
	public static void main(String[] args) {
		//ランダムクラスのインスタンスを生成
		Random rand = new Random();
		//10までのランダム整数を生成
		int randomNumber = rand.nextInt(10);
		// スキャナークラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		// キーボードか値を読み込む
		int enterNumber = stdIn.nextInt();
		//結果を表示する
		System.out.println("結果は"+ (enterNumber + randomNumber - 5) + "です");
	}
}



