package Day44_02;

import day34_Encapsulation.C02_insanMain;

/*
 * 2) insan classina sub class olacak Calisan class creat ediniz  fields:private int calisanId;
    calisanId==0 ise calisan degil aksi durumda calısan oldugunu kontrol edip id si ile  yazdirinz
    3 farkli obj ile ozellikleriniz yazdiriniz
 */
public class Calisan extends Insan {

	private int calisanId;

	public Calisan(String isim, String soyisim, int calisanId) { // alinan metodlar degistirilebildi calisani ekledik
		super(isim, soyisim);
		this.calisanId = calisanId;
	}

	@Override
	public void calis() {
		if (calisanId == 0) {
			System.out.println("sirket calisani degil");
			System.out.println("sahsin id i : " + calisanId+"\n");
		} else {
			System.out.println("sirket calisanidir");
			System.out.println("calisan id i ; " + calisanId+"\n");
		}

	}

	public static void main(String[] args) {
		Calisan sekreter = new Calisan("merve ", "aslan", 0);
		Calisan QATester = new Calisan("mete ", "guclu", 1453);
		Calisan Dev = new Calisan("mert ", "karlan", 1605);
		
		sekreter.bilgilendirme();
		sekreter.calis();
		
		QATester.bilgilendirme();
		QATester.calis();
		
		Dev.bilgilendirme();
		Dev.calis();
		
		
		
	}

}
