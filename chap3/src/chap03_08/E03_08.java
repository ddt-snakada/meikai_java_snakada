/*キーボードから読み込んだ点数に応じて、優/良/可/不可を判定して表示するプログラムを作成せよ。
 * 判定は以下のように行うこと
 * 0~59→不可　60~69 70~79 80~100*/
package chap03_08;
import java.util.Scanner;

public class E03_08 {

	public static void main(String[] args) {
	    //スキャナークラスのインスタンスを作成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの出力
		System.out.println("読み込む数値:");
		//数値の読み込み
		int point = stdIn.nextInt();
		//80以上の場合
		if(point>=80) {
			//優を出力する
			System.out.println("優");
		//70以上の場合
		}else if (point >= 70) {
			//良を出力する
			System.out.println("良");
					
		//60以上の場合
		}else if (point >= 60) {
			//可を出力する
			System.out.println("可");
		//それ以外の場合不可を出力する
		}else {
			System.out.println("不可");
		}
		
	}

}
