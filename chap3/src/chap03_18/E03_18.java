/*月1~12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ*/
package chap03_18;

import java.util.Scanner;
import java.util.Random;
public class E03_18 {

	public static void main(String[] args){
		//入力の表示
		System.out.print("整数値:");
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//整数を読み込む
		int number = stdIn.nextInt();
		//スイッチ分で分岐する
		switch(number) {
			//12であれば冬
			case 12:
			//1であれば冬
			case 1: 
			//2であれば冬
			case 2: System.out.print("冬");
					//スイッチ文から抜ける
					break;
			//3であれば春
			case 3: 
			//4であれば春
			case 4: 
			//5であれば春
			case 5: System.out.print("春");
				//スイッチ文から抜ける
				break;
			//6であれば夏
			case 6: 
			//7であれば夏
			case 7:
			//8であれば夏
			case 8: System.out.print("夏");
				//スイッチ文から抜ける
				break;
			//6であれば夏
			case 9: 
			//7であれば夏
			case 10:
			//8であれば夏
			case 11: System.out.print("秋");
				//スイッチ文から抜ける
				break;
			//デフォルトであればエラーを表示
			default:System.out.print("ERROR");
					//スイッチ文から抜ける
					break;
		}
		                    
		
	}

}
