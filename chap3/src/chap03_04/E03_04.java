/*２つの変数a,bに値を読み込んでその大小を以下のいずれかで表示するプログラムを作成せよ
 * 「aの方が大きいです。」「bの方が大きいです。」「aとbは同じ値です。」*/
package chap03_04;
import java.util.Scanner;
public class E03_04 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("変数a:");
		//テキスト指定の変数をaを読み込む
		double a = stdIn.nextDouble();
		//読み込みの表示
		System.out.print("変数b:");
		//テキスト指定の変数をbを読み込む
		double b = stdIn.nextDouble();
		//aがbより大きい場合
		if(a > b) {
			//結果の表示
			System.out.print("aの方が大きいです。");
		//bがaより大きい場合
		}else if (a < b) {
			//結果の表示
			System.out.print("bの方が大きいです。");
		// aとbが同じ値の場合
		}else {
			//結果の表示
			System.out.print("aとbは同じ値です。");
		}
	}
}
