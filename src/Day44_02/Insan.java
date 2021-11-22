package Day44_02;

/*
 1)  abstract  bir insan class creat ediniz. fields:  private String isim;
 private String soyisim;
 p'li constructor  creat ediniz
 abs calis method creat ediniz
 concrete bilgilendirme method creat ediniz-->fields print etsin
 concrete isimDegistir  method creat ediniz-->fields parametre alsin atama yapsin
 */
public abstract class Insan {

	private String isim;

	private String soyisim;

	public Insan(String isim, String soyisim) {
		
		this.isim = isim;
		this.soyisim = soyisim;
		
		
	}

	public abstract void calis();
	
	public void bilgilendirme() {
		System.out.println("isim: "+this.isim+"\nSoyisim: "+this.soyisim+"\n");
	}
	
	public void isimDegistir(String isim,String soyisim) {
		this.isim=isim;
		this.soyisim=soyisim;
	}
	
}
