/*正の整数値を読み込んでそれが5で割り切れれば「その値は5で割り切れます。」と表示し、
 * そうでなければ「その値は５で割り切れません。」と表示すプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は「正でない値が入力されました。」と表示すること
 * */
package chap03_05;
import java.util.Scanner;
public class E03_05 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("整数値:");
		//テキスト指定の整数値を読み込む
		int intNumber = stdIn.nextInt();
		//0以下の場合
		if(intNumber <= 0) {
			//正でない表示
			System.out.print("正でない値が入力されました。");
		// 5で割ったあまりが0の場合は5で割り切れる
		}else if ((intNumber % 5) == 0) {
			//割り切れる表示
			System.out.print("その値は5で割り切れます。");
		//上記以外の場合
		}else{
			//割り切れない表示
			System.out.print("その値は5で割り切れません。");
		}
		
	}
}
