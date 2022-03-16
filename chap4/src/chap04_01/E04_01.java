/*読み込んだ整数値の符号を判定するlist3-5のプログラムを、好きなだけ何度でも繰り返して入力・表示できるようにプログラムを作成せよ*/
package chap04_01;

import java.util.Scanner;

public class E04_01 {

	public static void main(String[] args) {
		//整数値の入力をするインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//以下からループする
		do {
			//整数値の入力を促す
			System.out.print("整数値:");
			//標準入力を行う　変数名はテキストをそのまま引用
			int n = stdIn.nextInt();
			//0より大きい場合(テキスト引用のためブロックにはしない)
			if(n > 0) 
				//正数である出力をする
				System.out.println("その値は正です。");
			//0より小さい場合
			else if (n < 0)
				//負数であることを出力する
				System.out.println("その値は負です。");
			//0の場合
			else
				//0であることを出力する
				System.out.println("その値は0です。");	
		//無限ループする
		}while(true);
	}

}
