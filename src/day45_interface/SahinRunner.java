package day45_interface;

public class SahinRunner {
public static void main(String[] args) {
	Sahin s1=new Sahin();
	s1.ayna();
	s1.ebat();
	s1.jant();
	s1.kapi();
	s1.kaporta();
	s1.koltuk();
	s1.motor();
	s1.sunroof();
	s1.yakit();
	System.out.println(icDonanim.music);
	// music s1. ile gelmedi.
	//s1.kumas="deri"; yeniden assgn edilemez.
	
	System.out.println(icDonanim.RENK);
	System.out.println(disDonanim.RENK);
	System.out.println(lastik.RENK);
	
	System.out.println(s1.sisLamp());// obje ile parent interface den concrete method call ettik
	System.out.println(disDonanim.boya()); //interface name ile getirdik
}
}
