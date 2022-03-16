/*二つの実数値を読み込んで、大きい方の値を表示するプログラムを作成せよ*/


package chap03_09;

import java.util.Scanner;

public class E03_09 {
	public static void main(String[] args){
	    //スキャナークラスのインスタンスを作成する
		Scanner stdIn = new Scanner(System.in);
		//読み込み1の出力
		System.out.println("読み込む一番目の実数:");
		//数値の読み込み
		double realNumber1 = stdIn.nextDouble();
		//読み込み2の出力
		System.out.println("読み込む二番目の実数:");
		//数値の読み込み
		double realNumber2 = stdIn.nextDouble();		
		//最初の入力が大きいか同じ場合
		if(realNumber1 >= realNumber2){
			//大きい数を出力する
			System.out.println("大きい数は" + realNumber1 + "です。");
		//それ以外の場合後の入力を出力する
		}else{
			//後半の入力を出力する
			System.out.println("大きい数は" + realNumber2 + "です。");
		}
		
	}
}
