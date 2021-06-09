/*プログラム中の終端を示す;が欠如しているとどうなるか。プログラムをコンパイルして検証せよ。 */

/* ; がないことによりコンパイラがスクリプトの終端を判断できなくなり
 * コンパイル時にエラーがでてコンパイルできない
 * 下記は検証したプログラム*/

package chap1_1;

public class E01_01 {
	public static void main(String[] args) {
		//エラーがでるためコメントアウト
		//System.out.println("初めてのjavaプログラム")
		System.out.println("画面に出力しています");
	}
}
