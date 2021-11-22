package day13;

import java.util.Scanner;

public class c3_100721 {

	public static void main(String[] args) {
		
		
		//Kullanicidan 2 tamsayi isteyin
        // bu sayilarin toplamlarini ve carpimlarini 2 ayri method' da hesaplayip yazdirin
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lütfen 2 adet tam sayi giriniz:");
		
		int sayi1=scan.nextInt();
		int sayi2= scan.nextInt();
		
		// 1 ben method a ne gönderecegim?		2 sayi gonderecegim
		// 2 method ne yapacak?					Sayilari toplayip yazdiracak
		// 3 method ne döndürecek?				
		
		
		
		
		/*
		 * Method olusturmanin kolay yolu
		 * method ismini ve parametreleri yazin
		 */
		
		toplama(sayi1,sayi2);
		 

		
		carpma(sayi1,sayi2);
		
		carpma (sayi1+3,sayi2*2);
		
		toplama(sayi1+3,sayi2+1);
		
		sayi1=20;
		sayi2=15;
		
		toplama(sayi1,sayi2);
		carpma(sayi1,sayi2);
		
		sayi2=40;
		toplama(sayi1,sayi2);
		
		// sonuckod bloklarini tekrar tekrar yazdirma yerine bu sekilde methodlarla yapmak dahab oratikk olacaktir
	}

	// bir method  sadece konsolda bir sey ler yazdiracaksa return type void olur.
	
	// bu durumda return keyword a ihtiyac olmaz
	
	// ve METHOD BIZE BIR SONUC DÖNDURMEZ.
	public static void carpma(int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin carpimi : " + sayi1*sayi2);
		
	}

	public static void toplama (int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin toplami : " + (sayi1+sayi2));
		
	}

}
