/*２つの整数値を読み込んで、降順にソートするプログラムを作成せよ。*/
package chap03_15;

import java.util.Scanner;

public class E03_15 {
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
		//BがAより大きい場合
		if(intNumberB > intNumberA) {
			//一時的に保存する変数
			int tmp = intNumberA;
			//AにBの値を代入する
			intNumberA = intNumberB; 
			//Bに元のAの値を代入する
			intNumberB = tmp; 
		}
		//ソート順を説明する
		System.out.println("A>=Bとなるようソートしました。");
		//小さい方を出力
		System.out.println("整数aは:" + intNumberA + "です");
		//大きい方を出力
		System.out.println("整数bは:" + intNumberB + "です");
		
	}
}
