/*list4-3の数あてゲームのプレーヤが入力できる回数に制限を設けたプログラムを作成せよ。
 * 制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること*/
package chap04_27;

import java.util.Scanner;
import java.util.Random;

public class E04_27 {

	public static void main(String[] args) {
		// 乱数を生成するインスタンを生成する
		Random rand = new Random();
		// 整数値の入力をするインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 正解を作成する
		int correctAnswer = rand.nextInt(99);
		// 数あてゲーム開始の宣言
		System.out.println("数あてゲーム開始!!");
		// 数あてゲームの説明
		System.out.println("0~99の数を当ててください.");
		// プレイヤーが入力するための変数
		int enteredNumber;
		// 制限回数
		int limitCount = 5;
		// 間違えた回数の定義
		int wrongCount = 0;
		// 入力からヒントまでをループする
		do {			
			// 間違えカウントが制限と同値になった場合
			if (wrongCount == limitCount) {
				// 答えを表示する
				System.out.println("答えは" + correctAnswer + "です。");
				// 数あてのループから抜ける
				break;
			}
			// 問いかけ
			System.out.print("いくつかな？");
			// 標準入力を行う
			enteredNumber = stdIn.nextInt();
			// 答えより入力の数が大きい場合
			if (enteredNumber > correctAnswer) {
				// ヒントの出力
				System.out.println("もっと小さい数だよ");
				// 答えより入力の数が小さい場合
			} else if (enteredNumber < correctAnswer) {
				// 負数であることを出力する
				System.out.println("もっと大きい数だよ");
			// 正解の場合
			} else {
				// 正解であることを表示する
				System.out.println("正解です。");
				// ループから抜ける
				break;
			}
			// 間違えたカウントを追加する
			wrongCount++;
			// 無限ループする 
		} while (true);
	}

}