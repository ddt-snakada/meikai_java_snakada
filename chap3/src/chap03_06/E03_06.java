/*正の整数を読み込んで、それが10の倍数であれば「その値は10の倍数です。」と表示し、そうで
 * なければ「その値は10の倍数ではありません」と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は「正でない値が入力されました。」と表示すること
 * */
package chap03_06;
import java.util.Scanner;
public class E03_06 {
	public static void main(String[] args){
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("整数値:");
		//テキスト指定の整数値を読み込む
		int intNumber = stdIn.nextInt();
		//0以下の場合
		if(intNumber <= 0){
			//正でない表示
			System.out.print("正でない値が入力されました。");
		// 10で割ったあまりが0の場合10の倍数
		}else if((intNumber % 10) == 0){
			//10の倍数表示
			System.out.print("その値は10の倍数です。");
		//上記以外の場合
		}else{
			//10の倍数でない表示
			System.out.print("その値は10の倍数ではありません");
		}
		
	}
}
