package day18;

public class C4_160721scope {
	
	int sayi1;
	int sayi2=10;
	
	
	String str1;
	String str2="Java";
	// static olmayan variable lar static olmayanlardan ulasilamaz.
	static boolean anladinMi;
	// static olarak tanimlanan variabeller class icinde her yerden kullanilabilir.
	// (Static olsun veya olmasin her method dan ulasilabilir ve kullanabiliriz.)
	static boolean biliyorMusun=true;
	// class level da olusturulan varabeller deger atanmadan da kullanilabilir.
	//eger biz deger atamazsak java class leveldaki variable lara default degerler atar. 
	//sayisal degerler icin 0 atar. boolean degerler icin false String icin null ve char icin ' '
	
// main method uzerindeki bu variabeller class level olarak bilinir
	public static void main(String[] args) {
		// 
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		// System.out.println(i);  //scope disinda i yi kullanamayiz
		
		// i=10 		//scope disinda i yi kullanamayiz
		
		
		
		
		//sayi++;
		//System.out.println(sayi);
		
		//method1();  static klubune uye olmadigi icin calismaz
		method2(); 
		
		System.out.println("main method icinde anladinMi nin degeri" +anladinMi);
		anladinMi=true;
		//System.out.println(str1);
		
	}
	
	
	public void method1() {
		System.out.println("Method1 calisti");
		sayi1=20;
		System.out.println(anladinMi);
		System.out.println(str1);
	}

	public static void method2() {
		System.out.println("method2 calisti");
		System.out.println(biliyorMusun);
		//System.out.println(sayi2);
		
	}
	
	
}
