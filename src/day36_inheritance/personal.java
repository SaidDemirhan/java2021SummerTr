package day36_inheritance;

public class personal {

/*	1) Personel class oluşturunuz id(int), isim(String), soyisim(String),adres(String), 
tel(String), instance veriable bululundursun.
bu class 1000 den başlayarak id atayan bir method barındırsın
*/
	
	public int id;
	public String isim;
	public String soyisim;
	public String adres;
	public String tel;
	
	public static int sayac=1000;
	
	public int idAta() {
		this.id=++sayac;
		return id;
	}
	
}
