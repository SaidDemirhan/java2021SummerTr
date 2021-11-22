package day27_staticKeyword;

public class C01 {

	
	int sayi =10;
	String str= "Yasasin java";
	
	static int sayi2; 
	
	public static void main(String[] args) {
		// yukaridakilere ulasmak icin constructor kullanmaliyiz.
		//ancak obje uzerinden ulasabiliriz.
		//su an bu class ta sedece default ama görunmeyen bir constructor vardir
		
		C01 obj1=new C01();
		//soldakki c01 class ismi ve ayni zamanda datu turudur
		//sagdaki C01() ise bir constructor dir
		
		//obj1.sayi;  //bu cte verir ya atama yapmaliyiz ya da yazdirmaliyiz
		
		System.out.println(obj1.sayi);    //10 yazdirir cunku intence de 10deger atanmis.
		
		obj1.sayi=44; //bu sekilde yeniden atayabiliyoruz
		
		System.out.println(obj1.sayi);   //44
		
		//System.out.println(sayi); bu sekilde sayiyi yazdiramayiz hata verir degistirsek de.
		
		//ama untma her metod kendi icinde degisimler kalir 
		
		//mesela yeni bir obje olusturalim 
		
		C01 obj2=new C01();
		
		System.out.println(obj2.sayi);  //10 olarak baslar.
		
		
		
		
		
	}

}
