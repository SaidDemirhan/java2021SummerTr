package day17;

import java.util.Scanner;

public class C4_150721 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen pozitif bir sayi giriniz: ");

		int sayi = scan.nextInt();

		int i = sayi;
		int rakamlarTop = 0;
		int rakam = 0;

		while (i > 0) {
			rakam = i % 10;
			rakamlarTop += rakam;
			i /= 10;

		}
		
		System.out.println("Girdiginiz " + sayi + " sayisinin rakamlar toplami : " + rakamlarTop);
		
		scan.close();
	}

}
