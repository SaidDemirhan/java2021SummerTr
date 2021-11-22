package day42_exeption;

public class Exceptions08 {

	public static void main(String[] args) {

		//int sayi = 34;
		String str = "1453";

		//String str1=sayi; //cte hatasidir checked exception dir. eslesen bir variabel var ama data tipe eslesmiyor.
		//checked exception ClassCast
		
		int okulNo=Integer.parseInt(str);
		
		System.out.println("okul no; "+ okulNo);
		
		System.out.println(str+35);//145335 concat olur str oldugu icin
		
		System.out.println(okulNo+35);//1488
		
		//String str1 ="14a3";
		
		//int strSayi=Integer.parseInt(str1);// java.lang.NumberFormatException unchecked
		
		//Object sayi3=45; // data type tum classs lari atasi
		//String strSayi2=(String)sayi3;// java.lang.ClassCastException
		//data casting yaparken uygun olmayan islemdir ve unchecked dir.
		
		
	}

}
