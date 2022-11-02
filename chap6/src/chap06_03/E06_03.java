/*要素型がdouble型で要素数が5の配列に対して先頭から順に1.1、2.2、3.3、4.4、5.5を代入して表示するプログラムを作成せよ*/
package chap06_03;

public class E06_03 {
	public static void main(String[] args) {
		// 表示する配列の定義と代入
		double[] displayArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		// 配列のサイズだけループを行う
		for (int i = 0; i < displayArray.length; i++) {
			// 配列を表示する。
			System.out.println("displayArray[" + i + "] = " + displayArray[i]);
		}
	}

}