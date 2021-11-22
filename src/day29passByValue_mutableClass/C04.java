package day29passByValue_mutableClass;

public class C04 {

	public static void main(String[] args) {


		String A="Ali";
		String B="Ali";
		String C=B+"";
		String D= "Ali";
		
		System.out.println(A.equals(C)); //true
		System.out.println(A.equals(B)); //true
		
		System.out.println(A==C); //false
		System.out.println(A==B); //true
		System.out.println(D==C); //false
		
		
		String E= new String ("Ali");
			//Aslinda string non pririmitive oldugundan new kelimesi kullanmak gerekir
		//ama cok kullanildigi icin Stringe özel olarak kullanmadan da olusturabliyorz
		System.out.println(E);//Ali
		
		String F=new String ("Ali");
		
				System.out.println(E.equals(F)); //true
				
				System.out.println(E==F); //false
				
	}

}
