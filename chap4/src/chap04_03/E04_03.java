/*右に示すように、２つの整数値を読み込んで、小さいほうの数以上で大きいほうの
数以下の全整数を小さい方から順に表示するプログラムを作成せよ*/

package chap04_03;
import java.util.Scanner;

public class E04_03 {
	public static void main(String[] args) {
		//整数値の入力をするインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//整数Aの表示をする
		System.out.print("整数A：");
		//整数Aを読み込む
		int aNumber = stdIn.nextInt();
		//整数Bの表示をする
		System.out.print("整数B：");
		//整数Bを読み込む
		int bNumber = stdIn.nextInt();		
		//大きい数の変数
		int bigNumber;
		//小さい数の変数
		int smallNumber;
		//大小を判定するaが大きい場合
		if(aNumber >= bNumber) {
			//大きい数にaを代入する
			bigNumber = aNumber;
			//小さい数にbを代入する
			smallNumber = bNumber;
		//bが大きい場合
		}else {
			//大きい数にBを代入する
			bigNumber = bNumber;
			//小さい数にAを代入する
			smallNumber = aNumber;
		}
		//ループする
		do {
			//小さい数を表示していく
			System.out.print(smallNumber + " ");
			//小さい数に1をたしていく
			smallNumber += 1;
		//小さい数が大きい数を超えるまでループする
		}while(smallNumber <= bigNumber);
	}
}
