/*正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。素数とは2以上n未満のいずれの数でも割り切れない整数nのことである*/
package chap04_24;

import java.util.Scanner;

public class E04_24 {
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		// 読み込みの表示
		System.out.print("正の整数は:");
		// 整数値を読み込む
		int digitNumber = stdIn.nextInt();
		//1の場合の素数判定を行う
		if (digitNumber == 1 ) {
			//素数ではない表示
			System.out.println(digitNumber + "は素数ではありません");
		//2,3の場合の素数判定を行う
		}else if (digitNumber == 2 || digitNumber == 3) {
			//素数である表示
			System.out.println(digitNumber + "は素数です");
		//2の倍数の素数判定
		}else if(digitNumber%2 == 0 ) {
			//素数ではない表示
			System.out.println(digitNumber + "は素数ではありません");
		//それ以外の素数判定
		}else {
			//判定数を少なくするたるために平方根の整数値を求める
			int sqrtNumber = (int) Math.sqrt(digitNumber);
			//素数判定ようのフラグ
			boolean isPrimeNumber = true;
			//3より大きい奇数が読み込んだ整数値で割り切れるかを奇数が平方根の整数値以下の間求める
			for (int oddNumber = 3; oddNumber <= sqrtNumber; oddNumber = oddNumber + 2) {
				//奇数値で割り切れる場合はループから抜ける
				if(digitNumber % oddNumber == 0) {
					//素数判定をfalseにする
					isPrimeNumber = false;
					//ループから抜ける
					break;
				}
			}
			//ループからぬけた後に素数判定
			if(isPrimeNumber) {
				//素数である表示
				System.out.println(digitNumber + "は素数です");
			//素数出ない場合
			}else {
				//素数ではない表示
				System.out.println(digitNumber + "は素数ではありません");
			}
			
		}
	}
}
