/*list4-4のwhile文の終了時にxの値が-1になることを確認するプログラムを作成せよ*/

package chap04_04;
import java.util.Scanner;

public class E04_04 {
	public static void main(String[] args) {
		//整数値の入力をするインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//カウントダウンの表示をする
		System.out.println("カウントダウンします。");
		//テキスト指定のxを定義する
		int x;
		//ループする
		do {
			//正の整数値の表示
			System.out.print("正の整数値:");
			//xに入力をする
			x = stdIn.nextInt();
		//正の整数値をいれるまでループする
		}while(x <= 0);
		//ループを開始する
		while(x >= 0) {
			//xを表示する
			System.out.println(x);
			//デクリメントする
			x--;
		}
		//以下から-1を確認するプログラム
		//-1の場合
		if(x == -1) {
			//-1であることを表示
			System.out.print("xは-1です。");
		//-1以外の場合
		}else {
			//-1でないことを表示-１
			System.out.print("xは-1ではありません。");
		}
	}
}
