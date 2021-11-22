package day27_staticKeyword;

public class C03_StaticKeyword {
	static int sayi = 15;
	String isim = "mehmet";

	public static void main(String[] args) {
		/*
		 * bir Method veya variabel i static yapmanin faydasi
		 * 
		 * ulasmak istedigimizde ClassIsmi.MethodIsmi yazmak yeterli olur zb.
		 * Arrays.toString() methodu static olarak hazirlandigi icin bunu yazarak
		 * rahatlikla kullanabiliyoruz.
		 * 
		 * ancak Mesela bir okul uygulamasinda okul ismini static yaparsak her yerden
		 * okul ismine ulasabilir. ama bir ögrenci okul adini degistirirse herkes icin
		 * okul adi kalici olarak degismis olur bu da istenmeyen bir durumdur.
		 * 
		 */

		sayi=20; //ulasiriz
		
		// isim =" buna ulasamayiz "
		
		staticMethod();		//cagirabiliriz
		//staticOlmayanMethod();   cagiraamyiz
		
	}

	public static void staticMethod() {
		System.out.println("staticMethod");
		
		
		sayi=30;		//ulastik
		
		//str="ulasamadik";
		
		//staticOlmayanMethod();  calismadi
		
	}

	public void staticOlmayanMethod() {
		System.out.println("staticOlmayanMethod");
		
		
		staticMethod(); //ulasabiliyoruz.
		
		sayi=25; //ulastik
		
		isim="ulasabildik";
		
	}

}
