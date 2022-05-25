/*前問を書き換えて右のように”式を表示するプログラムを作成せよ”*/
package chap04_14;

import java.util.Scanner;

public class E04_14 {
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
			//足す数を出力していく
			System.out.print(i);
			//+の出力をおこなうiがnと同値の時は出力しない
			if (i !=n ) {
				// + の出力
				System.out.print(" + ");
			}
			//sumにiを加算していく
			sum += i;
		}	
		//合計を出力する
		System.out.println(" = " + sum);
	}
}
