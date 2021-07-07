/*二つの整数値を読み込んで、その差を表示するプログラムを作成せよ*/
package chap03_10;

import java.util.Scanner;

public class E03_10 {
	public static void main(String[] args) {
	    //スキャナークラスのインスタンスを作成する
		Scanner stdIn = new Scanner(System.in);
		//読み込み1の出力
		System.out.println("読み込む一番目の整数:");
		//数値の読み込み
		int realNumber1 = stdIn.nextInt();
		//読み込み2の出力
		System.out.println("読み込む二番目の整数:");
		//数値の読み込み
		int realNumber2 = stdIn.nextInt();		
		//最初の入力が大きいか同じ場合
		if(realNumber1 >= realNumber2) {
			//差を出力する
			System.out.println("差は" + (realNumber1 - realNumber2)+ "です。");
		//それ以外の場合
		}else {
			//差を出力する
			System.out.println("差は" + (realNumber2 - realNumber1) + "です。");
		}
		
	}
}
