package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class c5_ifstatement04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen kenar uzunluklarindan birini tam sayi olarak giriniz");
		
		int kenar1=scan.nextInt();
		
		System.out.println("Lütfen kenar uzunluklarindan digerini tam sayi olarak giriniz");
		
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("Karedir");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("Kare degildir.");
		}
		
		

	}

}
