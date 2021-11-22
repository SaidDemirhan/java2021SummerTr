package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class c3_ifels05 {

	public static void main(String[] args) {
		//Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
		//65’den buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen yasinizi giriniz: ");
		
		int yas= scan.nextInt();
		
		if (yas<=65) {
			System.out.println("emekli olamazsin.");
			
		} else {
			System.out.println("emekli olabilirsin.");
		}
			
		scan.close();
	}
	
	
}
