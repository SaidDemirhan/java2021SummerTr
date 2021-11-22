package day36_inheritance;

public class memur extends muhasebe {

	//3)Memur class oluşturunuz iki memurun saat ucreti 20 tl ve 25  den maasının  ve diğer bilgilerini yazdırınız

	public static void main(String[] args) {
		memur m1=new memur();
		memur m2=new memur();
		
		m1.isim="cumali";
		m1.soyisim="Korkmaz";
		m1.adres="falan fesmmekan";
		m1.saatUcreti=20;
		m1.statu="Chef";
		m1.tel="05361526549";
		m1.id=m1.idAta();
		m1.maas= m1.maasHesapla();
		
		System.out.println(m1.isim+" "+
		m1.soyisim+" "+
		m1.adres+" "+
		m1.saatUcreti+" "+
		m1.statu+" "+
		m1.tel+" "+
		m1.id+" "+
		m1.maas);
	}
}
