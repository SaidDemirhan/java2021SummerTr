package day18;

import java.util.Scanner;

public class C1_160721WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan 2pozitif sayi isteyin
		// kullanici negatif sayi girdiginde girilen sayilari negatif girerse yeniden
		// isteyin
		// dogru giris yapildiginda well done ve sayilarin carpimini yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 2 pozitif tam sayi giriniz.");

		int sayi1 = 0;
		int sayi2 = 0;

		while (!(sayi1 > 0 && sayi2 > 0)) { // sayi1<=0||sayi2<=0 da yazabiliriz.
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();

			if (sayi1 > 0 && sayi2 > 0) {
				System.out.println("well done\ngirilen sayilarin carpimi: " + sayi1 * sayi2);
			} else {
				System.out.println("Lütfen 2 pozitif tam sayi giriniz!");
			}
		}

		scan.close();
	}

}
