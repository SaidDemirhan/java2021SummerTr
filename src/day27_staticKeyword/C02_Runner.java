package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access")//39. satirdan geldi.
	public static void main(String[] args) {
		// C01 deki variabel lara ulasmak istesem;
		
		//ilk once c01 deki variabel larin instance mi yoksa static mi olduguna bakmam geekir.
		
		//örnegin sayi ve str instance variabel dir. 
		
		//eger bunlara ulasmak istiyorsak ancak obje uzerinden ulasabiliriz.

		C01 obj1=new C01();
		
		System.out.println(obj1.str); 		//Yasasin java

		obj1.str="yasasin faruk";
		
		System.out.println(obj1.str);		//yasasin faruk
		
		
		
		
		C01 obj2=new C01();// yeni bir oje olusturunca orijinaline doner.
		
		System.out.println(obj2.str);     //Yasasin java
		
		
		
		//sayi2 variabel i static old icin objeye ihtiyac duyulMAZ!!!!
		
		System.out.println(C01.sayi2);  //default deger 0 yazar. OBJESIz
		
		
		C01 obj3 =new C01();
		
		obj3.sayi2=27; // alti sari cizgili ama cte vermez. basina unlem koyar
		// java daha kestirmesi varken niye yolu uzattin diye sikayet eder.
		// kodun calismasina ama engel degildir,
		
		//uzrine gelip bu hatayi onylayabilirsin main method uzerine bir uyari yazar 
		
		//@SuppressWarnings("static-access") seklinde
				
		System.out.println(obj3.sayi2);    //27 yazdirir.
		
		
		C01.sayi2=34;
		
		System.out.println(C01.sayi2); //34 yazdirir. 0 yazdirmaz cünku yeni atadik
		//ulasilabilen her obje ve her class icin ortaktir.
		
		//degisince her yerde degisir.
		
		System.out.println(obj2.sayi2);  //34
		System.out.println(obj1.sayi2);	 //34  örneklerindeki gibi
		
	
	
	
	
	}

}
