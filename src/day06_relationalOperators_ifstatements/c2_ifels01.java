package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class c2_ifels01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lüütfen dikdortgenin kenar uzunluklarini giriniz \nilk kenari girince enter e basiniz.");
		
		double kenar1=scan.nextDouble();
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girdiginiz degerler kare olusturur.");
		}else {
				System.out.println("girdiginiz degerler kare degildir");
			}
		
				
		
	}

}
