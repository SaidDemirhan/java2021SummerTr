package day15;

import java.util.Scanner;

public class C7_130721 {

	public static void main(String[] args) {
		// // Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.

		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen tersten yazdirmak icin bir string yaziniz: ");

		String kelime =scan.nextLine();
		
		String terstenKelime="";
		for (int i = 0; i < kelime.length(); i++) {
			terstenKelime+=kelime.substring(kelime.length()-1-i, kelime.length()-i); //burasi �nemli
		}
		
		System.out.println(terstenKelime);
		scan.close();
	}

}
