package day36_inheritance;

public class muhasebe extends personal{
	/*
	 * Muhasebe class oluşturunuz saatUcreti (int), statü(String), maas(int)
	 * instance veriable bululundursun. bu classsaatucretini 8 ve 30 ile carparak
	 * maaas hesaplayan bir method barındırsın
	 */

	

	public String statu;
	public int maas;
	public int saatUcreti;
	
	public int maasHesapla() {
		maas=saatUcreti*8*30;
		
		return maas;
	}
}
