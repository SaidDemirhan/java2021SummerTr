package day07_ifelseif;

import java.util.Scanner;

public class C5_ifelseif01 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen diktortgenin kenarlarindan birini girip entera basiniz \nsonrasinda diger uzunlugu girip entere basiniz.");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1<=0||kenar2<0) {
			System.out.println("L�tfen gecerli bir uzunluk giriniz.");
		}
		else if (kenar1==kenar2) {
			System.out.println("Girdiginiz deger karedeir.");
		}	
		else   {
			System.out.println("Girdiginiz deger kare degildir.");
		}

	}

}
