/*読み込んだ値が1未満であれば改行文字を出力しないようにlist4-11を書き換えたプログラムを作成せよ*/
package chap04_10;
import java.util.Scanner;
public class E04_10 {
	public static void main(String[] args) {
		//スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//読み込みの表示
		System.out.print("何個*を表示しますか");
		//nを読み込む
		int n = stdIn.nextInt();
		//n回ループする
		for(int i = 0; i < n; i++) 
			//*を表示する
			System.out.print("*");
		//1以上である場合に改行を出力する
		if(n >= 1) {
			//改行を表示する
			System.out.println();
		}
	}
}
