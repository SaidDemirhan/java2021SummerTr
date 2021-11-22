package day17;

import java.util.Scanner;

public class C5_150721whileloop {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere sayi isteyin toplam 200 olana kadar sayi istemeye devam edin.
		//200 u gectiginde kullaniicin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin.
		
		//forloop ile yapabilmek icin tekrar sayisini bilmemiz lazim
		// while loop ta ise bitirme kosulu onemlidir.
		
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		while (toplam<200) {
		System.out.println("Lütfen toplamamk icin bir tam sayi giriniz: ");
		sayi=scan.nextInt();
		
		toplam+=sayi;
		sayac++;
		}
		//toplamin 200 u gectiginden eminiz.
		
		System.out.println("toplam "+ sayac+" adet sayi girdiniz ve bu sayilarin toplami "+toplam+" oldu.");
		
		
		
		// eger adim sayisi bilinmiyor veya ongorulemiyorsa for loop degil de while loop kullank daha mantiklidir.
		//adimlar belli ise for loop kullanmak daha mantikli olabilir. 
		//2 fazla satir yazmaktan ve degisimi unutup sonsuz loop tan kacinmis olursunuz.
		
scan.close();
	}

}
