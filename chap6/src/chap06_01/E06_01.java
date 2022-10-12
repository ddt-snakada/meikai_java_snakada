/*要素型がdouble型で要素数が5の配列を生成して、その全要素を表示するプログラムを作成せよ*/
package chap06_01;

public class E06_01 {
	public static void main(String[] args) {
		// 表示する配列の定義
		double[] displayArray = new double[5];
		// 配列の0に値を入れておく
		displayArray[0] = 1;
		// 配列の2に値を入れておく
		displayArray[2] = 3.3;
		// 配列の3に値を入れておく
		displayArray[3] = -1;
		// 配列の4に値を入れておく
		displayArray[4] = -1.8;
		// 配列のサイズだけループを行う
		for (int i = 0; i < displayArray.length; i++) {
			// 配列を表示する。
			System.out.println("a[" + i + "] = " + displayArray[i]);
		}
	}

}
