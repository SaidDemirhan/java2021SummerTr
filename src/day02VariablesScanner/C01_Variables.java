package day02VariablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		String kelime="Merhaba!";	//satirdaki kod sonunda mutlaka ; kullanilmalidir.
		System.out.println(kelime);
		System.out.println("kelime");
		
		int sayi=25;
		System.out.println("Girilen Sayi:"+ sayi);
		
		boolean tatildeMi=false;
		
		System.out.println(tatildeMi);
		
		boolean tatildeMiydin=true;
		
		System.out.println("bu sene tatile gittiniz mi?" + tatildeMiydin);
		
		String name="Said";
		String surname="Demirhan";
		
		System.out.println("Isminiz: " + name);
		System.out.println("Soyisminiz: " + surname);
		
		int sayi1=10;
		byte sayi2=5;
		System.out.println("iki sayinin toplami= " + (sayi1 + sayi2));
		
		int sayi3= 15;
		double sayi4= 3.14;
		System.out.println("iki sayinin toplami= " + (sayi3 + sayi4));
		
		int sayi5=20;
		char karakter='?';
		
		System.out.println("iki sayinin toplami= " + (sayi5 + karakter));
	}

}
