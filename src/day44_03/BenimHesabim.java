package day44_03;
/*
 * 2)Banka class'in sup class'i BenimHesabim class creat ediniz
     p'li bakiye print eden constructor creat ediniz
 */
public class BenimHesabim extends Banka{

	@Override
	public double paraYatir(double miktar) {
		super.bakiye+=miktar;
		return bakiye;
	}

	@Override
	public double paraCek(double miktar) {
		super.bakiye-=miktar;
		return bakiye;
	}
public BenimHesabim(double bakiye) {
	super.bakiye=bakiye;
	System.out.println("Bakiyeniz: \t"+bakiye);
}
}
