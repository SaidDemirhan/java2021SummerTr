package day20;

import java.util.Arrays;

public class C3_190721araryiBuyuktenKucugeSirala {

	public static void main(String[] args) {
		// Verilen array i buyukten kucuge siraayan bir method yaziniz.

		int arr[] = { 3, 15, 10, 11, 9 };

		arr = arrayiSirala(arr); // sonra return yaparak arr yazdik

		arr = arrayiTerstenSirala(arr);

		System.out.println(Arrays.toString(arr)); // [15, 11, 10, 9, 3]
	}

	private static int[] arrayiTerstenSirala(int[] arr) {
		int[] temp = new int[arr.length]; // eski arr ile ayni uzunlukta yeni bir array olusturduk
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length - 1 - i];

		}

		return temp;

	}

	private static int[] arrayiSirala(int[] arr) {
		// �ncelikle k�cukten buyuge siralamaliyiz.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		return arr;
	}

}
