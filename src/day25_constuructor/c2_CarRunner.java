package day25_constuructor;

public class c2_CarRunner {

	public static void main(String[] args) {


		c1 car1= new c1();
		
		// bir esitlikte sol taraf decloration
		//declaration da data turu variabel ismi
		//String str= "Mehmet";
		//data turu class ismi olabilir
		//Primitive data turlerini  java olusturmustur,
		// biz primitive data turu olusturamayiz
		//non primitiv data turlerini hem java hem biz olusturabiliriz
		//C1 car1 yazdigimizda hem clas ismi hem de car1 objesini n non primitive data turudur
		//new C1(); esitligin sag tarafi deger olusturma
		//new keyvorddur ve yeni bir obje olusturacagimizi ifade eder
		//c1(); ise costructor dir.
	car1.fiyat=10000;
	car1.ilanNo=1001;
	car1.marka="Toyota";
	car1.model="Corolla";
	car1.yil=2020;
	// variabeller sadece deger atamasi yapar
	System.out.println(car1.fiyat+" " +car1.ilanNo+" "+car1.marka+" "+
	car1.model+" "+car1.yil);
	
	
	car1.maxHiz(200);
	car1.yakit("dizel");
	// method larin ne yapacagini sahip oldugu method belirler.
	// 
	System.out.println();
	// bir arac daha olusturmak istersek
	
	c1 car2 =new c1();
	
	car2.fiyat=15000;
	car2.ilanNo=1002;
	car2.marka="Toyota";
	car2.model="Avensis";
	car2.yil=2010;
	
	
	System.out.println(car2.fiyat+" " +car2.ilanNo+" "+car2.marka+" "+
			car2.model+" "+car2.yil);
	
	car2.yakit("benzin"); 
	//car2.yakit("dizel"); java buna izin vermez
	
	}

}
