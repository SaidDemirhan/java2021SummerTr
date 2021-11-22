package day41_exeption;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;

		while (count <= 3) {
			System.out.println("Lütfen bölunen sayiyi giriniz:");

			int sayi1 = scan.nextInt();

			System.out.println("Lütfen bölen sayiyi giriniz");

			int sayi2 = scan.nextInt();

			try {
				System.out.println("bölüm :" + sayi1 / sayi2);
			} catch (ArithmeticException e) {
				System.out.println("bolme isleminde bölen 0 olamaz");
				System.out.println(e.getMessage()); //by zero
				e.printStackTrace(); //at day41_exeption.C2.main(C2.java:21)
				
				
			}
			count++;
			
			System.out.println("bunu okuduysan kodun buraya kadar calismistir.");
		}
		scan.close();

	}

}
