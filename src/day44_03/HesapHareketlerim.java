package day44_03;
// 3) HesapHareketlerim claaas,nda obj ile islemler yapip yazdiriniz
public class HesapHareketlerim {

	public static void main(String[] args) {
		BenimHesabim obj=new BenimHesabim(2625);
		
		System.out.println("Yatirilan: \t"+obj.paraYatir(3500));
		System.out.println("Cekilen: \t"+obj.paraCek(2750));
	}
}
