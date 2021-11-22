package day15;

import java.util.Scanner;

public class C8_faktoryel {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’den kucuk bir sayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bir sayi giriniz: ");
		int sayi=scan.nextInt();
		
		int faktoryel=1;
		
		for (int i = 1; i <=sayi; i++) {
			faktoryel*=i;
		}
		
		System.out.println("Girdiginiz sorunu faktöryeli: " +faktoryel);
		
		
		
		scan.close();
	}

}
