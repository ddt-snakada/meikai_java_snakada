/*右に示すように、２つの整数を読み込んで、それらの差が１０以下であれば、「それらの差は１０以下です。」と表示し、そうでなければ「それらの差は11以上です。」
 * と表示するプログラムを作成せよ*/
package chap03_11;

import java.util.Scanner;

public class E03_11 {

	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//Aの読み込みの表示
		System.out.print("整数値A:");
		//テキスト指定の整数値Aを読み込む
		int intNumberA = stdIn.nextInt();
		//読み込みの表示
		System.out.print("整数値B:");
		//テキスト指定の整数値Bを読み込む
		int intNumberB = stdIn.nextInt();
		//A-Bを求め変数に代入する
		int difference = intNumberA - intNumberB;
		//差が-10以上10以下の場合
		if(difference>=-10 && difference <= 10) {
			//差が10以下を出力
			System.out.println("それらの差は10以下です。");
		//それ以外の場合
		}else {
			//差が10以上を出力
			System.out.println("それらの差は10以上です。");
		}
	}

}
