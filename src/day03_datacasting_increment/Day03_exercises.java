package day03_datacasting_increment;

public class Day03_exercises {

	public static void main(String[] args) {
		//Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde 
		//birer degisken olusturup adim adim widening yapin ve yazdirin
		
		byte sayi1=4;
		System.out.println(sayi1);
		short sayi2= sayi1;
		System.out.println(sayi2);
		int sayi3=sayi2;
		System.out.println(sayi3);
		float sayi4=sayi3;
		System.out.println(sayi4);
		double sayi5=sayi4;
		System.out.println(sayi5);
		
		//Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		
		int sayi6= 6;
		System.out.println(sayi6);
		short sayi7=(short)sayi6;
		System.out.println(sayi7);
		byte sayi8=(byte) sayi7;
		System.out.println(sayi8);
		
		//Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
		
		float sayi9 = 28.891f;
		System.out.println(sayi9);
		
		//Soru 4 ) double 255.36 sayisini int�a ve sonra da olusturdugunuz int sayiyi byte�a cevirip yazdirin
		
		double sayi10= 255.36;
		int sayi11=(int) sayi10;
		System.out.println(sayi11);
		byte sayi12= (byte)sayi11;
		System.out.println(sayi12);
		
		//Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		
		int sayi13= 48;
		int sayi14= 12;
		System.out.println("b�l�m sonucu= " +(sayi13/sayi14));
				
		//Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		
		int sayi15=250;
		double sayi16= 12.5555555;
		System.out.println("b�l�m sonucu= " +(sayi15/sayi16));
		
		//Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim

		byte sayi17=4;
		
		short sayi18= 21;
		
		int sayi19=84;
		
		long sayi20=256;
		
		float sayi21=2.5f;
		
		double sayi22=250.0;
		
		System.out.println("islem sonucu= " +(sayi20/(sayi19/sayi18*sayi17)+(sayi22/sayi21)));
		
		
		
		
		
	}	

}
