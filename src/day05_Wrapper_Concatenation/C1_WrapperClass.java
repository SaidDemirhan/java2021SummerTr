package day05_Wrapper_Concatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {
		String isim="Mehmet";
		int sayi=10;
		System.out.println(isim.charAt(2));	
		// isim dedigimizde bircok medhod listeleniyor, cunku isim variablenin data turu String
		//ve String non -Primitiv dir.
		// non primitiv degerin yaninda methodlar da vardir
		//sayi sayi  variable inin data turu int
		//ve ve int primitiv dir.
		// primitive data turleri  ssadece value a sahiptirler ve methodlari yoltur.
		
		// java primitive  data turleri icin de methodlarin kullanilmasi icin 
		//her primitive data turu icin bir Wrapper Class olusturmustur.
		
		Integer sayi2=10;
		System.out.println(sayi2.MAX_VALUE);
		System.out.println(sayi2.MIN_VALUE);
		
		
		Short sayi3=0;
		System.out.println(sayi3.MAX_VALUE);
		System.out.println(sayi3.MIN_VALUE);
		
		//Wrapper Class kullanimina bir örnek
		String okulNo="858";
				
				// Eger String bir variable sadece sayilardan olusuyorsa  bu String i int a cevirebiliriz.
				int okulNoSayiOlarak= Integer.parseInt(okulNo);
		// System.out.println(okulNo++);   okul no string olarak tanimlandigi icin matematiksel islem yapilamaz.
				
				System.out.println(okulNoSayiOlarak++);
				
				
		Character basHarf='a';
				
				
				System.out.println(Character.toUpperCase('a'));	//buzuk A zaydirir.
				

				
				
				
				
				
	}

}
