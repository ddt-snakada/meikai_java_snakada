/*右に示すように、正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ*/
package chap04_08;
import java.util.Scanner;
public class E04_08 {
	public static void main(String[] args) {
		//スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("整数値:");
		//桁数表示する整数値を読み込む
		int enteredNumber = stdIn.nextInt();
		//digitCountを定義する
		int digitCount = 1;
		//10でわっていき0より大きい間ループする
		while (enteredNumber / 10 > 0 ) {
			//入力された整数値を10で割る
			enteredNumber = enteredNumber / 10;
			//digitCountをインクリメントする
			digitCount++;
		}
		//桁を表示する
		System.out.print(digitCount + "桁です");
	}
}
