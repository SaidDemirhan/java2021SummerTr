package day04_increment_matematiksel_islemler;

public class C01_IncrementDecrement {

	public static void main(String[] args) {
		int sayi1=10;
		int sayi2=20;
		sayi1-=5;								//5
		sayi2+=10;								//30
		System.out.println(sayi2/sayi1);			//30/5=6

		sayi1*=2;								//10
		sayi2++;								//31
		System.out.println(sayi2/sayi1);			//31/10=3
		
		sayi1/=2;								//5
		double sayi3= sayi2/10;
		System.out.println(sayi3);				//3.0
		
		System.out.println(sayi1*sayi2);		//5*31=155
		
		System.out.println(sayi1*sayi3);		//15.0
		
		sayi3= (double)sayi2/10;					//31.0/10=3.1    sayi3 artik double degeri almis oldu ve öyle devam edecek
		System.out.println(sayi3);				//3.1
		
		System.out.println(sayi2);				//31
		sayi2+=0.2;
		System.out.println(sayi2);				//31
		
	}

}
