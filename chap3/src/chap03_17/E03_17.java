/*0,1,2のいずれかの値乱数を生成し、0であれば”グー”を1であれば”チョキ”を、2であれば”パー”を表示するプログラムを作成せよ*/
package chap03_17;

import java.util.Scanner;
import java.util.Random;
public class E03_17 {

	public static void main(String[] args){
		//ランダムクラスのインスタンスを生成する
		Random random = new Random();
		//乱数を生成する
		int randomNumber = random.nextInt(3);
		
		switch(randomNumber) {
			case 0: System.out.print("グー");
					break;
			case 1: System.out.print("チョキ");
					break;
			case 2: System.out.print("パー");
					break;
			default:System.out.print("ERROR");
					break;
		}
		                    
		
	}

}
