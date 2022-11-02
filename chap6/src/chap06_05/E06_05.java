/* 配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ。
 * 表示の形式は、初期化子と同じ形式、すなわち、各要素の値のコンマを区切って{}で囲んだ形式とする。*/
package chap06_05;
import java.util.Scanner;


public class E06_05 {
	public static void main(String[] args) {
		// スキャナーのインスタンス生成
		Scanner stdIn = new Scanner(System.in);
		// 要素数の表示
		System.out.print("要素数 : ");
		// 要素数の入力
		int itemCount = stdIn.nextInt();
		// 配列の定義
		int[] a = new int[itemCount];
		// 要素数だけループ
		for (int i = 0; i < itemCount; i++) {
			// 要素の入力
			System.out.print("a[" + i + "]  = ");
			a[i] = stdIn.nextInt();
		}
		// フォーマットの前半出力
		System.out.print("a = {");
		// 要素数だけループ
		for (int i = 0; i < itemCount; i++) {
			// 最終ループだけ出力の形式を変える
			if(i != itemCount - 1) {
				// 要素の出力
				System.out.print(a[i] + ", ");
			} else {
				// 最後の要素の出力
				System.out.print(a[i] + "}");
			}			
		}
	}
}
