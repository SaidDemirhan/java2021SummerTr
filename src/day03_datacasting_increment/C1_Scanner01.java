package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen adinizi ve soyadinizi yaziniz, \nadinizi girdikten sonra ENTER`a basiniz.");
		
		String name = scan.nextLine();
		String surname = scan.nextLine();
		
		System.out.println("\nKAYIT BILGISI\nAdiniz : " + name + "\nSoyadiniz : " + surname + "\nKaydiniz tamamlanmistir, tesekkür ederiz.");
		
		scan.close();
	}

}
