/*読み込んだ値が１未満であれば改行文字を出力をしないようにlist4-7およびlist4-8を書き換えたプログラムをそれぞれ作成せよ */
package chap04_06;
import java.util.Scanner;
public class E04_06 {
	public static void main(String[] args) {
		// list4-7 (list4-8もコンパイルエラーにならないよう変数名に1を加える
		//スキャナクラスのインスタンスを生成する
		Scanner stdIn1 = new Scanner(System.in);
		//読み込みの表示
		System.out.print("何個*を表示しますか");
		//テキスト指定の整数値を読み込む
		int n1 = stdIn1.nextInt();
		//iを定義する
		int i1 = 0;
		//ループを開始する
		while (i1 < n1) {
			//*を表示する
			System.out.print("*");
			//iをインクリメントする
			i1++;
		}
		//1以上の場合改行を出力する
		if(i1 >= 1) {
			//改行の出力
			System.out.println();
		}
		//list4-8 (list4-7も記述するので変数名に2を加える
		//スキャナクラスのインスタンスを生成する
		Scanner stdIn2 = new Scanner(System.in);
		//読み込みの表示
		System.out.print("何個*を表示しますか");
		//テキスト指定の整数値を読み込む
		int n2 = stdIn2.nextInt();
		//iを定義する
		int i2 = 0;
		//ループを開始する
		while (i2 <= n2) {
			//*を表示する
			System.out.print("*");
			//iをインクリメントする
			i2++;
		}
		//1以上の場合改行を出力する
		if(i2 >= 1) {
			//改行の出力
			System.out.println();
		}

	}
}
