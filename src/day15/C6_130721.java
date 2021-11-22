package day15;

import java.util.Scanner;

public class C6_130721 {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen tersten yazdirmak icin bir string yaziniz: ");

		String kelime =scan.nextLine();
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.print(kelime.substring(kelime.length()-1-i,kelime.length()-i));
		}
		System.out.println(" ");
		for (int i = kelime.length()-1; i>=0; i--) {
			System.out.print(kelime.substring(i, i+1));
		}
		
		
		
		
		
		
		scan.close();
	}

}
