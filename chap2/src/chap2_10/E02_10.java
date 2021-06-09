/*右に示すように、名前の姓と名とを個別キーボードから読み込んで、挨拶を行うプログラムを作成せよ*/
package chap2_10;
// スキャナクラスをインポートする
import java.util.Scanner;
public class E02_10 {
	//main関数を定義する
	public static void main(String[] args) {
		// スキャナクラスのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//姓を入力する
		String firstName = stdIn.next();
		//名を入力する
		String lastName = stdIn.next();
		//挨拶をする
		System.out.println("こんにちは" + firstName + lastName + "さん。");
	}
}
