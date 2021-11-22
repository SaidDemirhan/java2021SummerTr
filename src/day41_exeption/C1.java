package day41_exeption;

import java.util.Scanner;

public class C1 {
	// kullanicidan alacaginiz iki tam sayinin b�lumunu yazdiriniz.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen b�lunen sayiyi giriniz:");

		int sayi1 = scan.nextInt();

		System.out.println("L�tfen b�len sayiyi giriniz");

		int sayi2 = scan.nextInt();

		try {
			System.out.println("b�l�m :" + sayi1 / sayi2);
		} catch (ArithmeticException e) {
			System.out.println("bolme isleminde b�len 0 olamaz");
		}
		/*
		 * e : ArithmeticException Class' indan data type' i ArithmeticException olan
		 * bir exception obje manuel handle yaptik
		 * 
		 */

		scan.close();
	}

}
