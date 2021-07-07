/*二つの整数値を読み込んで、その前者約数であれば「BはAの約数です。」と表示し、そうでなければ「BはAの約数ではありません」と表示するプログラムを作成せよ*/
package chap03_02;
import java.util.Scanner;
public class E03_02 {

	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("整数値A:");
		//整数値をA読み込む
		int readNumberA = stdIn.nextInt();
		//読み込みの表示
		System.out.print("整数値B:");
		//整数値をA読み込む
		int readNumberB = stdIn.nextInt();
		//Bで割ったあまりが0の場合
		if ((readNumberA % readNumberB) == 0) {
			//約数であることを表示
			System.out.print("BはAの約数です。");
		//Bで割ったあまりが0でない場合
		}else {
			//約数でないことを表示
			System.out.print("BはAの約数ではありません。");
		}
	}

}
