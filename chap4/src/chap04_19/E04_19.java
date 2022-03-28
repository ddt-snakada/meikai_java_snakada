/*季節を求めるlist4-1の月の読み込みにおいて、１〜１２以外の値が入力された場合は、再入力させるように修正したプログラムを作成せよ*/
package chap04_19;

import java.util.Scanner;

public class E04_19 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// リトライの定義
		int retry;
		do {
			//doの外でmonthを定義する
			int month;
			//正しい値力されるまでループする
			do {
				// 読み込みの表示
				System.out.print("季節を求めます。\n何月ですか：");
				// monthを読み込む
				month = stdIn.nextInt();
			//12より大きいまたは1より小さい場合はループする
			} while (month > 12 || month < 1);
			// 3~5月の場合
			if (month >= 3 && month <= 5)
				// テキスト通りにブロックを書かず表示
				System.out.print("それは春です");
			// 6~8月の場合
			else if (month >= 6 && month <= 8)
				// テキスト通りにブロックを書かず表示
				System.out.print("それは夏です");
			// 9~11月の場合
			else if (month >= 9 && month <= 11)
				// テキスト通りにブロックを書かず表示
				System.out.print("それは秋です");
			// 12~2月の場合
			else if (month == 12 || month == 1 || month == 2)
				// テキスト通りにブロックを書かず表示
				System.out.print("それは冬です");
			// リトライ表示
			System.out.println("もう一度？1・・・Yes/0・・・No:");
			// リトライの入力
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}

