package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_ifstatement02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz");
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi%2==0) {
			
			System.out.println("girdiginiz sayi cift sayi");
		}
	
		if (girilenSayi%2==1) {
			
			System.out.println("girdiginiz sayi tek sayi");
		}
		
		if (girilenSayi<0) {
			
			System.out.println("Lütfen pozitif bir tam sayi giriniz");
		}
		
		
		scan.close();
	
	}

}
