package day28_staticBlock_passByValue;

public class C01_StaticBlock {

	static int sayi=10;
	
	static {
		System.out.println("Static block calisti");
		
		sayi=20;
	}
	
	static {										// birden fazla eklenebilir
	System.out.println("2.Static block calisti");
	
	sayi=30;
}
	
	public static void main(String[] args) {


		System.out.println("main medhodun ilk satirinda sayi: "+sayi);
		//main medhodun ilk satirinda sayi: 30
		
		
		//LOCAL DE STATIC VARIABEL OLUSTURULAMAZ
	}

}
