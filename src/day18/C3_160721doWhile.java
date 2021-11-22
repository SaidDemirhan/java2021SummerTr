package day18;

import java.util.Scanner;

public class C3_160721doWhile {

	public static void main(String[] args) {
		// Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin,
		// islemi bitirmek icin 0’a basmasini soyleyin.
		// Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
		// girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

		double sayi = 5;
		int count = 0;
		double sayilarToplami = 0;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Lütfen toplamak icin pozitif sayilar girin,\nislemi bitirmek iin 0 a basin.");
			sayi = scan.nextDouble();

			if (sayi > 0) {
				sayilarToplami += sayi;
				count++;
			} else if (sayi < 0) {
				System.out.println("negatif sayi girdiginiz icin bu girdiginiz degeri yok sayiyorum.");
			}

			// Kullanicidan alinan sayiyi pozitif mi negatif mi diye kontrol edelim

		} while (sayi != 0.0);
		System.out.println("girdiginiz sayilardan" + count + "tenesi pozitifti\nGirdiginiz gecerli sayilarin toplami"
				+ sayilarToplami);

	}

}
