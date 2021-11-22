package day03_datacasting_increment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		
		double sayi1= 200.14;
		
		int sayi2= (int)sayi1;
		
		System.out.println("double degisken= " +sayi2);

		byte sayi3= (byte) sayi1;
		
		System.out.println("byte degisken= " +sayi3);
		
		int sayi4=95;
		
		int sayi5=5;
		
		System.out.println("Bölme Sonucu= " + (sayi4 / sayi5));
		
		double sayi6=2000;
		
		System.out.println(sayi6/sayi5);
		
		double sayi7=5;
		
		System.out.println(sayi4/sayi7);
		
		int numA=2;
		numA =numA + 3;
		numA+=3;
		
		System.out.println(numA);

	}

}
