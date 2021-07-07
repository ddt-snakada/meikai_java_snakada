/*List3-5の最後のelseを else if (n == 0)に変更したらどうなる検討せよ*/
//***検討***
//elseのパターンにおいても実質的に条件がn==0しかあてはまらないので
//else if (n == 0)でも結果は変わらない

package chap03_03;
import java.util.Scanner;
public class E03_03 {

	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("整数値:");
		//nは本文通りに記述
		int n = stdIn.nextInt();
		//nが0より大きい場合
		if (n > 0) 
			// 結果を表示する
			System.out.print("その値は正です");
		else if (n < 0)
			// 結果を表示する
			System.out.print("その値は負です");
		else if (n == 0)
			// 結果を表示する
			System.out.print("その値は0です");
		
	}

}
