//キーボードから読み込んだ３つの整数値の中央値を求めて表示するプログラムを作成せよ
package chap03_13;

import java.util.Scanner;

public class E03_13 {
	
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//Aの読み込みの表示
		System.out.print("整数A:");
		//テキスト指定の整数Aを読み込む
		int intNumberA = stdIn.nextInt();
		//読み込みの表示
		System.out.print("整数B:");
		//テキスト指定の整数Bを読み込む
		int intNumberB = stdIn.nextInt();
		System.out.print("整数C:");
		//テキスト指定の整数cを読み込む
		int intNumberC = stdIn.nextInt();
		//中央値を入れる変数にCを代入する
		int median = intNumberC;
		//大きい数を保持する変数にAを代入する
		int largeNumber = intNumberA;
		//小さい数を保持する変数にBを代入する
		int smallNumber = intNumberB;
		//BがAより大きい場合
		if(intNumberA < intNumberB) {
			//大きい数を保持する変数にBを代入する
			largeNumber = intNumberB;
			//小さい数を保持する変数にAを代入する
			smallNumber = intNumberA;
		}
		//大きいかずがCより小さい場合
		if(largeNumber < intNumberC) {
			//中央値を大きい数に更新する
			median = largeNumber;
		}
		//小さい数がCより大きい場合
		if(smallNumber > intNumberC) {
			//中央値を小さい数に更新する
			median = smallNumber;
		}
		//中央値を出力する
		System.out.print("中央値:" + median);
	}
}
