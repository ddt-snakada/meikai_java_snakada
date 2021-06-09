//三角の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ
package chap2_6;
//javaのスキャナークラスをインポートする
import java.util.Scanner;

public class E02_06 {
	// main関数を定義する
	public static void main(String[] args) {
		// スキャナークラスのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		// 高さを読み込む
		double height = stdIn.nextDouble();
		// 底辺を読み込む
		double triangleBase = stdIn.nextDouble();
		//面積の変数を定義する
		double area;
		//面積を求める
		area = triangleBase * height * 1/2;
		//画面に出力する
		System.out.println("面積は"+ area + "です");
	}
}
