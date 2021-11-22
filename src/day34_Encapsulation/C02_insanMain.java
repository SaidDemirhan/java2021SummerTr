package day34_Encapsulation;

public class C02_insanMain {
	public static void main(String[] args) {

		C01_Ademoglu insan1 = new C01_Ademoglu(); //obje olusturduk
		//insan1.age = -47;
		insan1.name = "onur";
		insan1.surname = "enes";
		
		insan1.yasAta(-47);
		
		System.out.println(insan1.name);//onur
		System.out.println(insan1.surname);//enes
		System.out.println(insan1.yasGoster());//47
		
		C03 insan2= new C03();
		
		insan2.setAge(-34);
		System.out.println(insan2.getAge());//34
	}
}
