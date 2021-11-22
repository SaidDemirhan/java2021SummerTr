package day14;

import java.util.Scanner;

public class C4_120721 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		// kredi karti numarasini alin.
		// Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
		// KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
		// duzelten 2 method yazin,
		// ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen adinizi  giriniz: ");

		
		
		

		String musteriIsmi = scan.next();

		musteriIsmi=ismiDuzelt(musteriIsmi);
		
		System.out.println("L�tfen soyadinizi giriniz: ");
		
		String musteriSoyismi=scan.next();
		
		musteriSoyismi=ismiDuzelt(musteriSoyismi);
		
		System.out.println("L�tfen kredikarti numaranizi bosluksuz giriniz: ");
		
		String kkNo=scan.next();
		
		kkNo=kkNoDuzelt(kkNo);
		
		//syso buraya yaz!
		
		scan.close();
	}

	public static String kkNoDuzelt(String kkNo) {
		kkNo=kkNo.replace(" ", "");
		kkNo=kkNo.substring(0,4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+kkNo.substring(12,16);
		return kkNo;
	}

	public static String ismiDuzelt(String musteriIsmi) {
		musteriIsmi = musteriIsmi.trim();

		musteriIsmi = musteriIsmi.substring(0, 1).toUpperCase() + musteriIsmi.substring(1).toLowerCase();
		return musteriIsmi;
	}

}
