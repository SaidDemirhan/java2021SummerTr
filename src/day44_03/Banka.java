package day44_03;

/*
 * 1) Abstract Banka class creat ediniz. fields: double Bakiye;
        p'li constructor creat ediniz
        p'siz constructor --> print:Hesap hareketleri...
        p'li paraYatir ve p'li paraCek abs method creat ediniz
 */
public abstract class Banka {

	double bakiye;

	

	public Banka(double bakiye) {
		
		this.bakiye = bakiye;
	}

	public Banka() {
		System.out.println("Hesap hareketleri...");
	}

	public abstract double paraYatir(double miktar);

	public abstract double paraCek(double miktar);

}
