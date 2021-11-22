package day25_constuructor;

public class c1 {

	public int ilanNo;
	public String marka;
	public String model="yazilmadi";


	public int yil;
	public int fiyat;

	
	//constructor olusturmanin kisa yolu;
	
	//source>contructor field>sec>genere et.
	
	public c1(int ilanNo, String marka, String model, int yil) {
		super();
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}

	c1(int ilanNo, String marka, String model, int yil, int fiyat) {

		// local de oldugu icin esitlemek gerekiyor
		this.ilanNo = ilanNo;
		// bu class taki ilan no instance variable ina parametre olarak gelen ilan no
		// daaki degeri atar
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		this.fiyat=fiyat;
		

	}

	// eger parametreli bir istructor olusturursak kendi yaptigini java öldurur.

	// aksama olmamasi icin parametresiz bir costructor u kendimiz extra
	// olusturmaliyiz.

	// hemen onu da olusturalim

	c1() {

	}
	// iste bu kadar....

	c1(int ilanNo, String marka, int fiyat) {

		this.ilanNo=ilanNo;
		this.marka=marka;
		this.fiyat=fiyat;
	}
	// bir tane bos olduktan sonra baska da olusturabiliriz.

	public void maxHiz(int hiz) {

		System.out.println("Araba " + hiz + " km hiz yapar.");
	}

	public void yakit(String yakitTuru) {

		System.out.println("Araba yakit olarak " + yakitTuru + " kullanir.");
	}

}
