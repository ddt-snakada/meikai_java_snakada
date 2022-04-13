/*読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ 表示は*と+を交互に行うこと*/
package chap04_07;
import java.util.Scanner;
public class E04_07 {
	public static void main(String[] args) {
		//スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("何個表示しますか");
		//表示する整数値を読み込む
		int diplayNumber = stdIn.nextInt();
		//loopCountを定義する
		int loopCount = 0;
		//ループを開始する
		while (loopCount < diplayNumber) {
			//loopCountが2の倍数のとき
			if(loopCount%2 == 0) {
				//*を表示する
				System.out.print("*");
			}else {
				//+を表示する
				System.out.print("+");
			}
			//loopCountをインクリメントする
			loopCount++;
		}
	}
}
