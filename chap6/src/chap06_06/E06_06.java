/* テストの点数の合計点 ・平均点・最高点・最低点を表示するプログラムを作成せよ。人数と点数は、キーボードから読み込むこと*/
package chap06_06;
import java.util.Scanner;


public class E06_06 {
	public static void main(String[] args) {
		// スキャナーのインスタンス生成
		Scanner stdIn = new Scanner(System.in);
		// 人数の表示
		System.out.print("人数を入力せよ");
		// 人数の入力
		int humanCount = stdIn.nextInt();
		// 人数の表示
		System.out.print(humanCount + "人の点数を入力せよ");
		// 点数配列の定義
		int[] point = new int[humanCount];
		// 要素数だけループ
		for (int i = 0; i < humanCount; i++) {
			// 要素の入力
			System.out.print((i + 1) +"番の点数:");
			point[i] = stdIn.nextInt();
		}
		// 合計格納用変数
		int sumPoint = point[0];
		// 最大値格納用変数
		int maxPoint = point[0];
		// 最小値格納用変数
		int minPoint = point[0];
		// 要素数だけループ
		for (int i = 1; i < humanCount; i++) {
			// 最大値より取得点が大きい場合
			if (maxPoint < point[i]) {
				// 最大値を更新
				maxPoint = point[i];
			}
			//最小値より取得点が小さい場合
			if (minPoint > point[i]) {
				// 最小値を更新
				minPoint = point[i];
			}
			// 合計を更新
			sumPoint = sumPoint + point[i];
		}
		// 合計値を出力
		System.out.println("合計点は" + sumPoint + "点です。");
		// 平均値を出力
		System.out.println("平均点は" + (sumPoint + 0.0) / humanCount + "点です。");
		// 最高点を出力
		System.out.println("最高点は" + maxPoint + "点です。");
		// 最低点を出力
		System.out.println("最低点は" + minPoint + "点です。");
	}
}

