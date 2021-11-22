package day21_multiDimensionelArrays;

import java.util.Arrays;

public class multidimensionelarray {

	public static void main(String[] args) {
		int arr[][] = { { 1 }, { 2, 3, 4 }, { 5, 6, 7, 8 } };
		// bu arrayi nested for loop ile yazdiralim

		for (int i = 0; i < arr.length; i++) { // bu loop outer arrayin elementlerini grtirir.
			// arr[i] ile yazdiramayiz icteki elementleri //arr[0] arr[1] arr[2]

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); // 1 2 3 4 5 6 7 8 seklinde yazar
			}

			System.out.println(""); // döngude alta gecer yazdirir.

		}
		System.out.println("");

		System.out.println(Arrays.deepToString(arr));
	}

}
