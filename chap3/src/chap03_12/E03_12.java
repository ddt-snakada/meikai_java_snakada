//キーボードから読み込んだ３つの整数値の最小値を求めて表示するプログラムを作成せよ
package chap03_12;

import java.util.Scanner;

public class E03_12 {

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
		//最小値を入れる変数
		int min = intNumberA;
		//BがAより小さい場合は最小値をBに更新する
		if(intNumberB < intNumberA) min = intNumberB;
		//CがBより小さい場合は最小値をBに更新する
		if(intNumberC < intNumberB) min = intNumberC;
		//最小値を出力する
		System.out.print("最小値:" + min);
	}
}
