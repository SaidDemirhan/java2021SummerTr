package day04_increment_matematiksel_islemler;

public class C3_Modulus {

	public static void main(String[] args) {
		//5496 sayisinin rakamlar toplamini bulalim
		
		int sayi= 5496;
		int rakamlarToplami=0;
			// bir sayinin rakamlar toplamini bulmak icin her basamak degerine 3 islem yapariz
		    // bu satirda sayi 5496, rakamlartoplami=0
		
		System.out.println(sayi);
		
			//1. sayi%10 ile son basamagi elde ederiz
		int rakam=sayi%10;
		
			//2. bu rakami rakamlaeToplamina ekleriz.
		rakamlarToplami+=rakam;
			//3. degerini aldigimiz son basmaktan kurtulmak icin 10a böleriz
		sayi/=10;
		
		System.out.println(sayi);		//549 int oldugu icin virgullu ifadeden kurtuluruz.
										//rakamlarToplami=6
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;

		System.out.println(sayi);		//54 int oldugu icin virgullu ifadeden kurtuluruz.
										//rakamlarToplami=15
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;

		System.out.println(sayi);		//5 int oldugu icin virgullu ifadeden kurtuluruz.
										//rakamlarToplami=19
		
		rakam=sayi%10;					//5 10 a bölünmez
		rakamlarToplami+=rakam;
		sayi/=10;						//5/10=0

		System.out.println(sayi);		// sayi=0 oldu. rakamlarToplami=24.
		System.out.println(rakamlarToplami + rakam);					
	}

}
