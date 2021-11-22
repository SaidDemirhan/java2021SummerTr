package day24_forEachLoops;

public class c7_runner {

	public static void main(String[] args) {
		// Runner  yani run edici
		// c06 yi calistirmak uzere olusturulan class tir.

		
		c6 obj1=new c6();
		
		//Scanner scan=new Scanner(System.in);
		//derken scanner class in dan yeni bir object uretiyoruz.
		//scan obje sinin parametresini System.in ile belirliyoruz.
		
		obj1.isim="Mehmet Tekstil";
		obj1.telefon="3126589452";
		
		System.out.println(obj1.isim+" "+obj1.telefon);    //Mehmet Tekstil 3126589452
		
		//obj1 in istedigim özelliklerine (variable) deger atayabiliriz
		// eger deger atamazsak;
		System.out.println(obj1.isciSayisi);   //40
		//ege rdeger atamazsak ilk atanan degeri getirir.
		
		//bir isimle object olusturma sadece 1 kez olusturulabilir ama 
		//olusturulan objenin ozellikleri istendigi kadar degistirilebilir.
		//bu class ta yeni bir object uretemiyoruz:
		c6 obj2= new c6();   //bunu java kaul etmiyor
		
		obj2.isciSayisi+=50;
		System.out.println(obj2.isciSayisi); //90
		
		obj2.isciSayisi-=10;
		System.out.println(obj2.isciSayisi); //80
		System.out.println(obj1.isciSayisi); //40
	}

}
