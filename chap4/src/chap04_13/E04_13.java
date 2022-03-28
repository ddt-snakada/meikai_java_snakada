/*1からnまでの和を求めるlist4-10をfor分で実践せよ*/
package chap04_13;

import java.util.Scanner;

public class E04_13 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//和を求める宣言
		System.out.println("1からnまでの和を求めます");
		//nを定義する
		int n;
		//xが0より大きくなるまで入力を繰り返す
		for(n = 0; n <= 0; ) {
			//xに数値を入力する
			n = stdIn.nextInt();
		}
		int sum = 0; 
		//iとsumをfor文ないで定義しiをnと同値になるまでインクリメントしていく
		for(int i = 1 ; i <= n; i++) {
			//sumにiを加算していく
			sum += i;
		}	
		//合計を出力する
		System.out.println("1から" + n + "までの和は" + sum + "です。");
	}
}
