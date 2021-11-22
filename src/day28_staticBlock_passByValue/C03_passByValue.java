package day28_staticBlock_passByValue;

public class C03_passByValue {

	public static void main(String[] args) {

		int fiyat = 100;
		// bu methodla %10 indirim yapipip yeni fiyati döndürelim
		
		System.out.println(indirimYap(fiyat)); //90

		System.out.println("method calistiktan sonra: "+ fiyat); //100
		//assgment yapmadigimiz icin 100 yazdirir.
	}

	private static int indirimYap(int fiyat) { //variable olusturuldu ama lokal

		fiyat = fiyat * 90 / 100;
		
		System.out.println("methoddaki fiyat "+ fiyat);

		return fiyat;
	}

}
