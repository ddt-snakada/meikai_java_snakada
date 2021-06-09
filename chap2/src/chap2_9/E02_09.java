/*以下に示すプログラムを作成せよ。
 * 0.0以上1.0未満の実数値をランダム生成して表示。
 * 0.0以上10.0未満の実数値をランダム生成して表示。
 * -1.0以上1.0未満の実数値をランダム生成して表示。
 * */
package chap2_9;
import java.util.Random;
public class E02_09 {
	// main関数を定義する
	public static void main(String[] args) {
		//ランダムクラスのインスタンスを生成
		Random rand = new Random();
		//0.0以上1.0未満の実数値をランダム生成
		double Number0to1 = rand.nextDouble();
		//0.0以上10.0未満の実数値をランダム生成
		double Number0to10 = rand.nextDouble() + rand.nextInt(10);
		//-1.0以上1.0未満の実数値をランダム生成
		double NumberNegative1toPositive1 = rand.nextDouble() + rand.nextInt(1) - 1.0;
		// 画面に出力する
		System.out.println("0.0以上1.0未満の実数値は"+ Number0to1 + "です");
		// 画面に出力する
		System.out.println("0.0以上10.0未満は"+ Number0to10 + "です");
		// 画面に出力する
		System.out.println("-1.0以上1.0未満は"+ NumberNegative1toPositive1 + "です");
	}
}



