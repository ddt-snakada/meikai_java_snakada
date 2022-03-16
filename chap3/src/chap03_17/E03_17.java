/*0,1,2のいずれかの値乱数を生成し、0であれば”グー”を1であれば”チョキ”を、2であれば”パー”を表示するプログラムを作成せよ*/
package chap03_17;

import java.util.Random;
public class E03_17 {

	public static void main(String[] args){
		//ランダムクラスのインスタンスを生成する
		Random random = new Random();
		//乱数を生成する
		int randomNumber = random.nextInt(3);
		//スイッチ分で分岐する
		switch(randomNumber) {
			//0であればグーを表示
			case 0: System.out.print("グー");
					//スイッチ文から抜ける
					break;
			//1であればグーを表示
			case 1: System.out.print("チョキ");
					//スイッチ文から抜ける
					break;
			//2であればグーを表示
			case 2: System.out.print("パー");
					//スイッチ文から抜ける
					break;
			//デフォルトであればエラーを表示
			default:System.out.print("ERROR");
					//スイッチ文から抜ける
					break;
		}
		                    
		
	}

}
