package day36_inheritance;

public class isci extends muhasebe {
	//4)isci class oluşturunuz iki iscinim   saat ucreti 10 tl ve 15  den maasının  ve diğer bilgilerini yazdırınız
	public static void main(String[] args) {
		isci A=new isci();
		isci B=new isci();
		
		A.isim="haluk";
		A.saatUcreti=10;
		A.maas=A.maasHesapla();
		A.id=A.idAta();

		B.isim="hatun";
		B.saatUcreti=15;
		B.maas=B.maasHesapla();
		B.id=B.idAta();
		
		System.out.println(A.isim+" "+
		A.saatUcreti+" "+
		A.maas+" "+A.id);
		
		System.out.println(B.isim+" "+
				B.saatUcreti+" "+
				B.maas+" "+B.id);
	}

}
