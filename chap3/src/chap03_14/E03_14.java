/*List3-13と同様に、２つの整数値を読み込んで、小さい方の値と大きい方の値の両方を表示するプログラムを作成せよ。ただし、二つの整数値が等しい場合は、
 * 右に示すように「二つの値は同じです」と表示すること
 */
 
package chap03_14;

import java.util.Scanner;

public class E03_14 {
	
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//Aの読み込みの表示
		System.out.print("整数a:");
		//整数Aを読み込む
		int intNumberA = stdIn.nextInt();
		//読み込みの表示
		System.out.print("整数b:");
		//整数Bを読み込む
		int intNumberB = stdIn.nextInt();
		//最大値と最小値を入れる変数
		int min, max;
		//Aの方が大きい場合
		if(intNumberB < intNumberA) {
			//最大値にAを代入する
			max = intNumberA;
			//最大値にBを代入する
			min = intNumberB;
		//それ以外の場合
		}else {
			//最大値にBを代入する
			max = intNumberB;
			//最小値にAを代入する
			min = intNumberA;
		}
		//最大値をと最小値が同じ場合
		if(max == min) {
			//同じであることを出力
			System.out.print("二つの値は同じです");
		//それ以外の場合
		}else {
			//小さい方を出力
			System.out.println("小さい方の値は:" + min + "です");
			//大きい方を出力
			System.out.println("大きい方の値は:" + max + "です");
		}
	}
}
