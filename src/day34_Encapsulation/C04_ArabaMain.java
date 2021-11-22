package day34_Encapsulation;

public class C04_ArabaMain {

	public static void main(String[] args) {
		C05_Araba volvo=new C05_Araba("xc90", "beyaz", -3000, -2020);

		C05_Araba audi=new C05_Araba("Q7", "siyah", 2800, 2021);
	
		C05_Araba honda=new C05_Araba();
	
	honda.model="accord";
	honda.renk= "gri";
	honda.setMotor(1600);
	honda.setYil(1999);
	
	System.out.println("Honda Yil: "+honda.getYil());
	System.out.println("Honda Motor: "+honda.getMotor());
	
	System.out.println("Volvo yil: "+volvo.getYil());
	System.out.println("Volvo motor: "+ volvo.getMotor());
	
	}

}
