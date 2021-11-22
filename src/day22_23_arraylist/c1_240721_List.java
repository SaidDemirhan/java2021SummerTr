package day22_23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class c1_240721_List {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		isimler.add("Ali");
		System.out.println(isimler); // [Ali]

		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		isimler.add("Ali");

		System.out.println(isimler); // [Ali, Veli, Ayse, Fatma, Ali]

		isimler.add("hasan,cemal,yasar"); // tek isim olarak kabul eder

		System.out.println(isimler); // [Ali, Veli, Ayse, Fatma, Ali, hasan,cemal,yasar]

		// ozel indexe eklemek istersek

		isimler.add(3, "nihan");

		System.out.println(isimler); // [Ali, Veli, Ayse, nihan, Fatma, Ali, hasan,cemal,yasar]

		isimler.add(0, "mehmet");

		System.out.println(isimler); // [mehmet, Ali, Veli, Ayse, nihan, Fatma, Ali, hasan,cemal,yasar]

		List<String> yeniList = new ArrayList<>();

		yeniList.add("Faruk");

		System.out.println(yeniList); // [Faruk]

		yeniList.addAll(isimler); // eski listeyi arkasina ekler

		System.out.println(yeniList); // [Faruk, mehmet, Ali, Veli, Ayse, nihan, Fatma, Ali, hasan,cemal,yasar]

		List<Integer> sayilar = new ArrayList<>(); // data turu olarak int yazsak kabul etmiyor primitive old icin bu
													// non primitive

		sayilar.add(5);

		
		//yeniList.addAll(sayilar); //string e int eklenemez.
		//farkli bir data turunden liste veya element ekleyemeyiz.

	}

}
