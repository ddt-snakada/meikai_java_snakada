/*正の整数を読み込んで、それを3で割った値に応じて「その値は3で割り切れます。」「その値を３で割ったあまりは１です。」「その値を３で割ったあまりは２です。」
 のいずれかをひょうじするプログラムを作成せよ。
 ※正でない値を読み込んだ場合は「正でない値が入力されました。」と表示すること
 * */


package chap03_07;
import java.util.Scanner;
public class E03_07 {
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
		// 3で割ったあまりが0の場合3の倍数
		}else if ((intNumber % 3) == 0) {
			//3の倍数表示
			System.out.print("その値は3で割り切れます。");
		//あまりが1の場合
		}else if ((intNumber % 3) == 1){
			//1のあまりの表示
			System.out.print("その値を３で割ったあまりは１です。");
		//上記以外の場合　つまりあまりが２の場合
		}else {
			//2のあまりの表示
			System.out.print("その値を３で割ったあまりは2です。");
		}

	}

}
