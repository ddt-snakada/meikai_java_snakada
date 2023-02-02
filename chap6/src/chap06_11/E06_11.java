/* 連続する要素が同じ値をもつことのないように演習6-9のプログラムを改良したプログラムを作成せよ。
 * たとえば{1,3,5,6,1,2}とならないようにすること。(配列の要素数は10以下であるとする。) */
package chap06_11;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.Random;

public class E06_11 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);
		System.out.print("配列の要素数:");
		int arraySize = standardInput.nextInt();
		int[] intArray = new int[arraySize];
		int randomNumber;
		ArrayList<Integer> usedNumberList = new ArrayList<Integer>();
		
		for (int j = 0; j < arraySize; ) {
			randomNumber = random.nextInt(10) + 1;
			if (usedNumberList.contains(randomNumber)) {
				// 生成した乱数が使用リストに含まれていた場合ループを再び行う
				continue;
			} 
			intArray[j] = randomNumber;
			usedNumberList.add(randomNumber);
			j++;
		}	

		int index = 0;
		// 拡張for文で全要素を走査する
		for (int intNumber :intArray) {
			// 代入した結果を表示
			System.out.println("intArray[" + index + "]= " + intNumber);
			index++;
		}
	}		
}
