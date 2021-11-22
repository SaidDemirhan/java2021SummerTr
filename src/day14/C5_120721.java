package day14;

public class C5_120721 {

	public static void main(String[] args) {		//overloading
		
		String str="Java candir";
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5,7));
		
		
		
		
		
		String isim="Said";
		String soyisim="Demirhan";
		
		int sayi1=10;
		int sayi2=20;
		
		double sayi3=15.0;
		double sayi4=3.14;
		
		toplama (isim,soyisim);
		toplama (sayi1,sayi2);
		toplama (sayi3,sayi4);
		
		toplama (20,45.3);
		
		toplama (45.3,20);
		
	}

	private static void toplama(double sayi3, double sayi4) {
		System.out.println(sayi3+sayi4);
		System.out.println("1.method");
	}

	private static void toplama(double sayi3, int sayi2) {
		System.out.println(sayi3+sayi2);
		System.out.println("2.method");
	}
	
	private static void toplama(int sayi1, double sayi3) {
		System.out.println(sayi1+sayi3);
		System.out.println("3.method");
	}
	
	private static void toplama(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
		System.out.println("4.method");
	}

	private static void toplama(String isim, String soyisim) {
		System.out.println(isim+soyisim);
		
	}

}
