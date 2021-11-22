package day18;

public class c5_160721scope {
	//7-eger birden fazla local de yani method da kullanacaginiz variable varsa bunu class level da yani burda olusturmalisiniz.
	//8-variable nin static olup olmamasina karar vermek icin kullanacagimiz local leri bilmeliyiz.
	// eger kullanilacak locakl static ise o zaman variable i static yapmak zorundayiz.
	
	int sayiClass10=10;
	static int sayiClassStatic;

	public static void main(String[] args) {
		//5- class level de olmayan variable lara local variable deniyor
		//6-local variable lar static olarak tanimlanamaz.
		int sayiMain=10;
		//System.out.println(sayiClass); //ulasilamiyor
		sayiClassStatic++;		//ulasiabiliyor
		//local variable lar  deger atanmadan olusturulabilir  ama deger atanmadan kullanilamaz.
	}

	public void method1() {
		//System.out.println(sayiMain); //kullanilamaz
	}
	
	public static void method2() {
		//System.out.println(sayiMain);   //kullanilamaz
	}
}
