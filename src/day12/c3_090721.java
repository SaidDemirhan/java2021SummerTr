package day12;

import java.util.Scanner;

public class c3_090721 {

	public static void main(String[] args) {
		//Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, 
		//sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
		//- Ilk harf buyuk harf olmali
		// - Son harf kucuk harf olmali
		// - Sifre bosluk icermemeli
		// - Sifre uzunlugu en az 8 karakter olmali

		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen Sifrenizi giriniz: ");
		
		String sifre= scan.nextLine();
				
		boolean ilkHarfKont= sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
		boolean sonHarfKont= sifre.charAt(sifre.length()-1)>= 'a';
		
		boolean spaceKont= !sifre.contains(" ");
		boolean uzunlukKont= sifre.length()>=8;
		
		if (ilkHarfKont && sonHarfKont && uzunlukKont&&spaceKont) {
			System.out.println("Sifre basari ile tanimlandi");
		}else {
			System.out.println("Islem basarisiz, Lütfen sifrenizi yeniden giriniz!");
		}
		
		
		
		
		
		
		
		
	}

}
