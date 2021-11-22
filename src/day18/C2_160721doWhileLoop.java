package day18;

import java.util.Scanner;

public class C2_160721doWhileLoop {

	public static void main(String[] args) {
		// Kullanicidan 2pozitif sayi isteyin
				// kullanici negatif sayi girdiginde girilen sayilari negatif girerse yeniden
				// isteyin
				// dogru giris yapildiginda well done ve sayilarin carpimini yazdirin.

				Scanner scan = new Scanner(System.in);
				System.out.println("Lütfen 2 pozitif tam sayi giriniz.");

				int sayi1 = 5;
				int sayi2 = 10;			//hicbir onemi yok kac atandiginin

				do {
					
					sayi1 = scan.nextInt();
					sayi2 = scan.nextInt();
					
					if (sayi1 > 0 && sayi2 > 0) {
						System.out.println("well done\ngirilen sayilarin carpimi: " + sayi1 * sayi2);
					} else {
						System.out.println("Lütfen 2 pozitif tam sayi giriniz!");
					}
					
					
					
				} while (!(sayi1 > 0 && sayi2 > 0));
				
				
				
				
				
				

				scan.close();

	}

}
