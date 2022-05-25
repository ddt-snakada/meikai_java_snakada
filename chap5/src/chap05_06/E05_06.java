/*List5-9のように、float型を0.0から1.0まで0.001ずつ増やしていく様子と、list5-10の
ようにint型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、
横にならべて表示するプログラムを作成せよ*/
package chap05_06;

import java.util.Scanner;

public class E05_06 {
	public static void main(String[] args) {	
		//ヘッダ部分の表示
		System.out.println("  float        int");
		//点線の表示
		System.out.println("---------------------");
		//int型の変数宣言
		int intNumber =0;
		//ループを1000回する floatNumberは0.001を足していき、intNumberはインクリメントする
		for (float floatNumber = 0.0F; floatNumber <=1.0F; floatNumber+= 0.001F,intNumber++) {
			//floatNumberを8桁表示 
			System.out.printf("%9f", floatNumber);
			//行間を表示
			System.out.print("   ");
			//intNumberを1000で割った表示するための変数の宣言
			float intNumberDisplay = (float)intNumber / 1000;
			//intNumberを1000で割った値を8桁表示 
			System.out.printf("%9f\n",intNumberDisplay);
		}
	}

}
