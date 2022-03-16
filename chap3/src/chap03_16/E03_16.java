/*三つの整数を読み込んで昇順にソートするプログラムを作成せよ*/
package chap03_16;

import java.util.Scanner;
public class E03_16 {

	public static void main(String[] args){

		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("整数値1:");
		//整数値1を読み込む
		int intNumber_1 = stdIn.nextInt();
		//読み込みの表示
		System.out.print("整数値2:");
		//整数値2を読み込む
		int intNumber_2 = stdIn.nextInt();
		//読み込みの表示
		System.out.print("整数値3:");
		//整数値3を読み込む
		int intNumber_3 = stdIn.nextInt();
		// 最大値と中央値と最小値を定義する
		int max,middle,min;
		//整数値1と整数値2の大小を比較1し整数値1が小さい場合
		if (intNumber_2 > intNumber_1) {
			//最小値を整数値1にする
			min = intNumber_1;
			//最大値を整数値2にする
			max = intNumber_2;
			//整数値1と整数値2の大小を比較1し整数値1が大きい場合
		} else {
			//最小値を整数値2にする
			min = intNumber_2;
			//最大値を整数値1にする
			max = intNumber_1;			
		}
		//整数値3と最大値を比較し整数値3が大きい場合
		if (intNumber_3 > max) {
			//整数値3が大きいので中央の値に前の最大値を入れる
			middle = max;
			//整数値3が大きいので最大値を更新する
			max = intNumber_3;
			//整数値3と最大値を比較し整数値3が小さい場合
		} else {
			//整数値3と最小値を比較し整数値3が大きい場合
			if (intNumber_3 > min) {
				//整数値3を中央値にする
				middle = intNumber_3;
				//整数値3と最小値を比較し整数値3が小さい場合
			} else {
				//整数値3が小さいので中央の値に前の最大値を入れる
				middle = min;
				//整数値3が小さいので最小値を更新する
				min = intNumber_3;
			}
		}
		//ソートを表示する
		System.out.print("昇順にソートしました。\n" + min + "\n" + middle + "\n" + max);
		
	}

}
