package day25_constuructor;

public class C03 {
	
	int sayi=10;
	String isim="Mehmet";
	
	//ayni package daki farkli class lardan bu modifier e pubblic olmasa bile ulasilabilir.
	
	
	public static void main(String[] args) {
		
		//sayi=20;	sayi degiskeni static olmadigi icin static olan methodlarda ulasamayiz
		// deneme(); deneme methodu static olmadigi icin main method dan cagirilamaz.
		
		C03 obj1=new C03();
		obj1.deneme();
		
		//Ayni class ta oldugunuz halde static olmadigi icin ulasamadigimiz variabel lere
		//obje ile ulasabiliriz
	}
	public void deneme() {
		
		
		
	}
}
