package day14;

import java.util.Scanner;

public class C2_120721 {

	public static void main(String[] args) {
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
		// degerini girerse,
		// kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		// Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi
		// girdiniz, ben toplayamam” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac adet sayiyi toplamak istiyorsun");

		int sayiAdeti = scan.nextInt();

		if (sayiAdeti < 2) {
			System.out.println("Tek sayi toplanmaz ki?");
		} else if (sayiAdeti == 2) {
			ikiSayiTopla();

		} else if (sayiAdeti == 3) {
			ucSayiTopla();
		} else if (sayiAdeti == 4) {
			dortSayiTopla();
		} else {
			System.out.println("Cok sayi girdiniz, ben toplayamam!!!");
		}


	}

	private static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 4 tam sayi giriniz: ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		int sayi4 = scan.nextInt();

		System.out.println(
				"4 sayi girmeyi tercih ettiniz. \nGirilen sayilarin toplami: " + (sayi1 + sayi2 + sayi3 + sayi4));

	}

	private static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 3 tam sayi giriniz: ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		System.out.println("3 sayi girmeyi tercih ettiniz. \nGirilen sayilarin toplami: " + (sayi1 + sayi2 + sayi3));

	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki tam sayi giriniz: ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		System.out.println("iki sayi girmeyi tercih ettiniz. \nGirilen sayilarin toplami: " + (sayi1 + sayi2));

	}

}
