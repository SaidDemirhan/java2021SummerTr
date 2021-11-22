package day41_exeption;

import java.util.Scanner;

public class C1 {
	// kullanicidan alacaginiz iki tam sayinin bölumunu yazdiriniz.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bölunen sayiyi giriniz:");

		int sayi1 = scan.nextInt();

		System.out.println("Lütfen bölen sayiyi giriniz");

		int sayi2 = scan.nextInt();

		try {
			System.out.println("bölüm :" + sayi1 / sayi2);
		} catch (ArithmeticException e) {
			System.out.println("bolme isleminde bölen 0 olamaz");
		}
		/*
		 * e : ArithmeticException Class' indan data type' i ArithmeticException olan
		 * bir exception obje manuel handle yaptik
		 * 
		 */

		scan.close();
	}

}
