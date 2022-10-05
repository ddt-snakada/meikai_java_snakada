/*要素型がint型で要素数が5の配列に対して先頭から順に５、４、３、２、１を代入して表示するプログラムを作成せよ*/
package chap06_02;

public class E06_02 {
	public static void main(String[] args) {
		// 表示する配列の定義
		int[] displayArray = new int[5];
		// 配列に代入するための変数を宣言
		int inNumber;
		// 配列のサイズだけループを行う
		for (int i = 0; i < displayArray.length; i++) {
			// 配列に代入する数を計算する
			inNumber = displayArray.length - i;
			// 配列に 5,4,3,2,1を代入する
			displayArray[i] = inNumber;
			// 配列を表示する。
			System.out.println("a[" + i + "] = " + displayArray[i]);
		}
	}

}
