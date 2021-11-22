package day31varargs;

public class varargsArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };

		arrTopla(arr);
		varargsTopla(1, 3, 5, 7, 9);

		System.out.println(arrTopla(arr));
		System.out.println(varargsTopla(1, 3, 5, 7, 9));
		System.out.println(varargsTopla(arr));
		
		
		//varargs array gibi davrandigi icin herhangi bir parametre olarak alinabilir...
	}

	private static int varargsTopla(int... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		return toplam;
	}

	private static int arrTopla(int[] arr) {
		int topla = 0;

		for (int each : arr) {

			topla += each;

		}

		return topla;

	}

}
