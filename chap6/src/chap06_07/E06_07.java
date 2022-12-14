/*LIST6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである、
 * 最も末尾側に位置する要素を見つけるプログラムを作成せよ */
package chap06_07;
import java.util.Random;
import java.util.Scanner;
public class E06_07 {
	public static void main(String[] args) {
		// ランダムクラスのインスタンスを生成する
		Random rand = new Random();
		// スキャナークラスのインプットを生成する
		Scanner standardInput = new Scanner(System.in);
		// 配列の要素数の定数
		final int ARRAY_SIZE = 12;
		// ランダム数値の最大値の定数
		final int RANDOM_MAX_SIZE = 10;
		// 配列を宣言
		int[] numberArray = new int[ARRAY_SIZE]; 
		// 配列のサイズだけループ
		for (int j = 0; j < ARRAY_SIZE; j++) {
			// 配列にランダム数値を入れる
			numberArray[j] = rand.nextInt(RANDOM_MAX_SIZE);
		}
		// 文の表示
		System.out.print("配列numberArray全要素の値\n{");
		for (int j = 0; j < ARRAY_SIZE; j++) {
			// 配列の値を表示
			System.out.print(numberArray[j] + " ");
		}
		// 文の表示
		System.out.println("}");
		// 文の表示
		System.out.print("探す値:");
		// 探す値の入力
		int key = standardInput.nextInt();
		// 探す値のインデックスを宣言
		int index;
		// 配列の末尾からでくりめんとしていく
		for ( index = ARRAY_SIZE - 1; index >= 0; index--) {
			if (numberArray[index] == key) {
				break;
			}
		}
			// 配列の値を表示
		if (index >= 0) {
			System.out.println("それはnumberArray["+ index + "]にあります。 ");
		}else {
			System.out.println("それはありません。");
		}
	}		
}
