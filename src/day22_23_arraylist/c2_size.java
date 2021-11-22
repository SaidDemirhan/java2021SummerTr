package day22_23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class c2_size {

	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
		sayilar.add(20);
		System.out.println(sayilar); // [10, 20]
		System.out.println(sayilar.size()); // 2
		System.out.println(sayilar.isEmpty()); // false

		sayilar.add(30);
		sayilar.add(40);

		System.out.println(sayilar); // [10, 20, 30, 40]

		System.out.println(sayilar.remove(2)); // 30

		int silinenEleman = sayilar.remove(2); // 30 silinmis sonra aklamek istersek kalsin diye

		System.out.println(sayilar); // [10, 40]

		sayilar.add(silinenEleman);

		System.out.println(sayilar); // [10, 20, 40]

		// sayilar.add(20); //hata verir index algilar

		List<String> isimler = new ArrayList<>();

		isimler.add("ali");
		isimler.add("ayse");
		isimler.add("zeki");

		System.out.println(isimler.remove("zeki")); // true
		System.out.println(isimler); // [ali, ayse]

		isimler.remove("ayse");
		System.out.println(isimler); // [ali]

		boolean sonuc = isimler.remove("mehmet"); // mehmet yok ki
		if (sonuc) {
			System.out.println("mehmeti buldum ve sildim.");
		} else {
			System.out.println("mehmeti bulamadim ve silemedim");
		}
		// eger index olarak remove kullanirsak neyi sildi ise onu getiri ama string
		// kullanirsak true oder false
		// olarak kaldirip kaldirmadigini bize gösteriyor.

		isimler.remove(0); //listemi bosaldi []
		System.out.println(isimler);  //[]
		
		isimler.add("ali");
		isimler.add("ayse");
		isimler.add("zeki");

		
		System.out.println(isimler); //[ali, ayse, zeki]
		
		isimler.removeAll(isimler);  //Tum hepsini bosaltir.
		
		System.out.println(isimler);  //[]
		
	}

}
