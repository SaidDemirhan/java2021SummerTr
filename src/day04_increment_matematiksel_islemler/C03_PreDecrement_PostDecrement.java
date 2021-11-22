package day04_increment_matematiksel_islemler;

public class C03_PreDecrement_PostDecrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		int sayi2= sayi1--;			// önce islem yapacak sonra azaltacak
		System.out.println("post deccrement ten sonra; " + sayi1);		//19
		System.out.println("post deccrement ten sonra; " + sayi2);		//20
		
		System.out.println(--sayi2);	//19
		System.out.println(sayi2--);	//19
		System.out.println(sayi2);		//18
	}

}
