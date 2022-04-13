/*list4-5のx--が--xとなっていたら、どのような出力が得られるかを検討せよ。プログラムを作成して実行結果を確認すること*/


/*検討結果x--から--xにする場合表示される数がxからスタートではなくxから１引いた数からスタートする*/

package chap04_05;
import java.util.Scanner;

public class E04_05 {
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
			//xを表示するx--から--xに修正している
			System.out.println(--x);
		}
	}
}
