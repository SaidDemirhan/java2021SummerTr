package day31varargs;

import java.util.Scanner;

public class varargsUygulamalari {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method
		// olusturunuz

		concat("Said", "Demirhan");

	}

	private static void concat(String... cumle) {

		String tamami = "";
		for (String each : cumle) {
			tamami = tamami.concat(each + " ");
		}
		System.out.println(tamami);

		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen enter a basarak 4 adet sayi giriniz: ");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		topla(a, b, c, d);
		scan.close();
	}

	private static void topla(int a, int... sayi) {

		int toplam = 0;

		for (int each : sayi) {
			toplam += each;

		}

		System.out.println("ilk sayi disindakilerin toplami: " + toplam);

		int sonuc = toplam * a;

		System.out.println("Genel sonucumuz: " + sonuc);

	}

}
