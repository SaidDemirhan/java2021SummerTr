package day16;

public class C1_140721nestedForLoop {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.print("*" + " ");
		}
		System.out.println(" ");

		for (int i = 1; i <= 4; i++) {
			System.out.print(i);

		}
		System.out.println("");
		for (int i = 1; i <= 4; i++) {

			System.out.print(2 * i);

		}
		System.out.println("");
		for (int i = 1; i <= 4; i++) {

			System.out.print(3 * i);

		}

		System.out.println("");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("(" + i + "," + j + ") ");
			}
			System.out.println("");
		}

	}

}
