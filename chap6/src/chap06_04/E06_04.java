/*List6-5を書き換えて、右に示すよう縦向きの棒グラフで表示するプログラムを作成せよ。
 * 最下段には、インデックスを10で割った剰余を表示すること*/
package chap06_04;
import java.util.Random;
import java.util.Scanner;


public class E06_04 {
	public static void main(String[] args) {
		// テキスト通りに記述
		Random rand = new Random();
		// テキスト通りに記述
		Scanner stdIn = new Scanner(System.in);
		// テキスト通りに記述
		System.out.print("要素数 : ");
		// テキスト通りに記述
		int n = stdIn.nextInt();
		// テキスト通りに記述
		int[] a = new int[n];
		// テキスト通りに記述
		for (int i = 0; i < n; i++) {
			// テキスト通りに記述
			a[i] = 1 + rand.nextInt(10);
		}
		// 乱数で生成される最大値だけloopする　最上段から表示していくためデクリメントしていく
		for (int i = 10 ; i > 0; i--) {
			// 配列の要素数だけループする
			for (int j = 0; j < n ; j++) {
				// 配列の中身が現在の段番号以上の場合
				if( i <= a[j] ){
					// 「* 」を表示する
					System.out.print("* ");
				// 配列の中身が現在の段番号より小さい場合
				}else {
					// スペース2つを出力する
					System.out.print("  ");
				}
			}
			// 段が変わる際に改行する
			System.out.println();
		}
		// 下から2段目の---を表示する
		for (int loopI = 0 ; loopI < n; loopI++) {
			// 「--」を表示する
			System.out.print("--");
		}
		// 段が変わる際に改行する
		System.out.println();
		// インデックスを10で割った値を表示する
		for (int loopI = 0 ; loopI < n; loopI++) {
			// * を表示する
			System.out.print(loopI%10 + " ");
		}
	}

}
