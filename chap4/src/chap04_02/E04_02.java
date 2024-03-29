/*2桁の整数値(10~99)を当てさせる数あてゲームを作成せよ*/
package chap04_02;

import java.util.Scanner;
import java.util.Random;

public class E04_02{

	public static void main(String[] args) {
		//乱数を生成するインスタンを生成する
		Random rand = new Random(); 
		//整数値の入力をするインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//正解を作成する
		int correctAnswer = rand.nextInt(89) + 10;
		//数あてゲーム開始の宣言
		System.out.println("数あてゲーム開始!!");
		//数あてゲームの説明
		System.out.println("10~99の数を当ててください.");
		//プレイヤーが入力するための変数
		int enteredNumber;
		//入力からヒントまでをループする
		do {
			//問いかけ
			System.out.print("いくつかな？");
			//標準入力を行う　
			enteredNumber = stdIn.nextInt();
			//答えより入力の数が大きい場合
			if(enteredNumber > correctAnswer) {
				//ヒントの出力
				System.out.print("もっと小さい数だよ");
			//答えより入力の数が小さい場合
			}else if (enteredNumber < correctAnswer) {
				//負数であることを出力する
				System.out.println("もっと大きい数だよ");
			}
		//正解と一致するまでループする
		}while(enteredNumber != correctAnswer);
		//正解であることを表示する
		System.out.println("正解です。");
	}

}
