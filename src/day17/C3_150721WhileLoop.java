package day17;

public class C3_150721WhileLoop {

	public static void main(String[] args) {
		// Soru 1 ) While loop kullanarak 3 den 13 e kadar(dahil) tum tek tamsayilari
		// ekrana yazdiriniz.

		int i = 3;

		while (i <= 13) {
			if (i % 2 == 1) {
				System.out.print(i+" ");
			}

			i++;
		}

	}

}
