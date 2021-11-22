package day38;

public class Runner {

	public static void main(String[] args) {

		Cat c1=new Cat();//psiz bir obje olusturduk//data type i cat clasindan

		//inheritance ta variable call:
		
		System.out.println(c1.a);//5 animal dan getirdi
		System.out.println(c1.c);//9 cat tan getirdi ama mammal da da vardi
		System.out.println(c1.d);//5 cat tan getirdi
		System.out.println(c1.m);//4
		
		//ayni isimli variable lar önce objenin kendi classinda aranir yoksa 
		//parent(ler)indeki variabellardan varsa alir getirir.
		
		//inheritance ta method call:
			
		c1.mM(); //animal mammal //animal class tan getirdi
		c1.mC(); //cat//kendi clasindan getirdi mammal da olmasina ragmen
		c1.mA(); //mammal// animal da olmasina ragmen mammal dan geldi
		/*
		 * method call edilirken karar verici cost dir.
		 * child den parente dogru arayarak gider ve ilk buldugunu getirir.
		 * 
		 * Data type ile cont asagidaki gibi farkli 
		 * claslar olursa (???variable cagirirken)
		 * parent clas tan baslanir
		 */
		
		Mammal c2=new Cat("x");
		
		System.out.println(c2.a);//5//animal
		System.out.println(c2.c);//7//mammal
		System.out.println(c2.m);//4//mammal
	
/*
 * c2 objesinin klasi mammal dir
 * o yuzden cat takini getirmedi	
 */
	c2.mA();//mamal
	c2.mC();//mamal
	c2.mM();//animal
	
	Mammal m1=new Mammal();
	Animal c3=new Cat();
	
	
	
	}

}
