package day17;

import java.util.Scanner;

public class C$_150721 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden 
		//baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
		//Kullanicinin hata yapmadigini farz edin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen harf giriniz: ");
		
		
		char harf1=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen harf giriniz: ");
		
		char harf2=scan.next().toUpperCase().charAt(0);
		
		
		char harf=harf1;
		while (harf<=harf2) {
			
			System.out.print(harf+" ");
			harf++;
		}
	}

}
