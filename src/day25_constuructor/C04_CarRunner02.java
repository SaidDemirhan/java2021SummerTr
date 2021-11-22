package day25_constuructor;

public class C04_CarRunner02 {

	public static void main(String[] args) {
		//ilk deger attamasi yapmadan bos bir car olusturmak istiyorsak
		//default constructor yeterli olur.
		
		
		
		c1 car1=new c1();
		
		//Dahaönce olusturmustuk sirf bu yuzden yeniden deger girmek zorundayiz.
		
		car1.ilanNo=1003;
		car1.fiyat=12000;
		//........
		System.out.println(car1.fiyat+" " +car1.ilanNo+" "+car1.marka+" "+
				car1.model+" "+car1.yil);
		
		// eger objeyi olustururken deger de atamak istiyorsak
		//parametreleri costructor olusturmak gerekir.
		
		c1 car2 =new c1(1004, "Honda", "civic",2010,20000);
		
		System.out.println(car2.fiyat+" " +car2.ilanNo+" "+car2.marka+" "+
				car2.model+" "+car2.yil);
		
		
		c1 car3= new c1(1005,"mercedes",50000);
		
		System.out.println(car3.fiyat+" " +car3.ilanNo+" "+car3.marka+" "+
				car3.model+" "+car3.yil);
	}

}
