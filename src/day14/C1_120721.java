package day14;

import java.util.Scanner;

public class C1_120721 {

	public static void main(String[] args) {

		// Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		// sifirdan buyuk mu kucuk mu oldugunu,
		// ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin
		// toplamini,
		// 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scan.nextInt();

		tekMiCiftMiYazdir(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklariYazdir(sayi);

	}

	public static void istenenBasamaklariYazdir(int sayi) {
		if (sayi<100 && sayi > 0) {
			System.out.println("Girdiginiz sayinin birler basamagi : " + sayi % 10);
		} else {

			int rakamlarToplami = 0;
			int rakam = 0;

			rakam = sayi % 10;
			rakamlarToplami += rakam; // birler
			sayi /= 10;

			rakam = sayi % 10;
			rakamlarToplami += rakam; // onlar
			sayi /= 10;

			rakam = sayi % 10;
			rakamlarToplami += rakam; // yuzler
			sayi /= 10;

			System.out.println("sayinin birler onlar ve yuzler basamagindaki sayilar toplami: " + rakamlarToplami);

		}

	}

	public static void sifirlaKarsilastir(int sayi) {
		if (sayi > 0) {
			System.out.println("Girilen sayi pozitiftir.");
		} else if (sayi < 0) {
			System.out.println("Girilen sayi negatiftir.");
		} else {
			System.out.println("0 Sayisi pozitif ya da negatif degildir.");
		}

	}

	public static void tekMiCiftMiYazdir(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("Girilen sayi cift sayidir.");
		} else {
			System.out.println("Girilen sayi tek sayidir");
		}

	}

}
