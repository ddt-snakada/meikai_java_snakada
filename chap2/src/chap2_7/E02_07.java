/*以下に示すプログラムを作成せよ。
 * 1桁の正の整数値(すなわち1以上9以下の値)をランダム成して表示。
 * 1桁の負の整数値(すなわち-9以上-1以下の値)をランダム成して表示。
 * 2桁の正の整数値(すなわち10以上99以下の値)をランダム成して表示。
 * */
package chap2_7;
import java.util.Random;
public class E02_07 {
	// main関数を定義する
	public static void main(String[] args) {
		//ランダムクラスのインスタンスを生成
		Random rand = new Random();
		//1桁の正の整数を生成
		int singleDigitPositiveNumber = rand.nextInt(10);
		//1桁の負の整数を生成
		int singleDigitNegativeNumber = -1 * rand.nextInt(10) - 1;
		//2桁の正の整数を生成
		int twoDigitPositiveNumber = rand.nextInt(90) + 10;
		// 画面に出力する
		System.out.println("1桁の正の整数は"+ singleDigitPositiveNumber + "です");
		// 画面に出力する
		System.out.println("1桁の負の整数は"+ singleDigitNegativeNumber + "です");
		// 画面に出力する
		System.out.println("2桁の正の整数は"+ twoDigitPositiveNumber + "です");
		
	}
}
