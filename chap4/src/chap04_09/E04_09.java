/*右に示すように、正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ*/
package chap04_09;
import java.util.Scanner;
public class E04_09 {
	public static void main(String[] args) {
		//スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("nの値:");
		//nを読み込む
		int n = stdIn.nextInt();
		//sequenceNumberを定義する 1からスタート
		int sequenceNumber = 1;
		//積の合計の変数を定義する
		int sumProduct = 1;
		//n回ループする
		while (sequenceNumber <= n) {
			//積の掛け算をnまでしていく
			sumProduct = sumProduct * sequenceNumber;
			//sequenceNumberをインクリメントする
			sequenceNumber++;
		}
		//結果を表示する
		System.out.print("1から" + n + "までの積は" + sumProduct + "です");
	}
}
