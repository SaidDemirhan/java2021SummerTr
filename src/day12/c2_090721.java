package day12;

import java.util.Scanner;

public class c2_090721 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
		// kart no : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen adinizi giriniz enter a basip soyadinizi giriniz: ");
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		System.out.println("Kredi karti numaranizi giriniz: ");
		
		String kkNo=scan.nextLine();
		
		String adDuzenlenmis= name.substring(0,1).toUpperCase() + name.substring(1).replaceAll("\\w", "*"); //Space leri gösterir
		
		String soyadDuzenlenmis=surname.substring(0,1).toUpperCase()+ surname.substring(1).replaceAll("\\S", "*" );  //space disindaki her sey
		
		String kkNoDuzenlenmis= "**** **** **** "+ kkNo.substring(8);

		System.out.println("isim-soyisim : " + adDuzenlenmis+" "+ soyadDuzenlenmis+ "\nkart no : " +kkNoDuzenlenmis);
		
	}

}
