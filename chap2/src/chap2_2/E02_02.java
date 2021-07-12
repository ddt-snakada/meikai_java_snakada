//３つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ
package chap2_2;

public class E02_02 {

	public static void main(String[] args) {
		//3つの数を定義する
		int number1,number2,number3;
		//1を代入する
		number1 = 1;
		//2を代入する
		number2 = 2;
		//3を代入する
		number3 = 3;
		//合計と平均を格納する変数を定義する
		int sum,average;
		//合計値を計算する
		sum = number1 + number2 + number3;
		System.out.println("合計値は" + sum + "です。");
		//平均値を計算する
		average = sum / 3;
		System.out.println("平均値は" + average + "です。");
	}

}
