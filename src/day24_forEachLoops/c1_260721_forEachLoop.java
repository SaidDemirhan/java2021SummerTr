package day24_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c1_260721_forEachLoop {

	public static void main(String[] args) {
		/*
		 * 1)Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. Kullanici
		 * yeter yazana kadar isim istemeye devam edin. Kullanici isim girmeyi
		 * bitirdiginde toplam kac isim girdigini ve bunlardan kac tanesinin asagidaki
		 * listede olan isimlerden oldugunu yazdirin isimList=Ali , Veli, Ayse, Fatma,
		 * Zeki, Kemal Not : kucuk buyuk harf onemli degil
		 */
		Scanner scan = new Scanner(System.in);
		List<String> girilenIsimler = new ArrayList<>();
		String isim;

		do {
			System.out.println("Lütfen listeye eklemek icin bir isim giriniz\nbitirmek icin yeter yaziniz: ");

			isim = scan.nextLine();

			if (!isim.equalsIgnoreCase("yeter")) {// yeter degilse isim listeye eklenir
				girilenIsimler.add(isim);
			}
		} while (!isim.equalsIgnoreCase("yeter"));

		System.out.println(girilenIsimler);

		//Karsilastirmak istedigimiz listeyi olusturalim
		//Listenin uzunlugu degismwyecegi icin arra olusturup list e cevirebiliriz
		//böylece 6 ismi tek tek eklemek zorunda kalmam
		String isimler[]= {"Ali","Veli","Ayse","Fatma","Zeki"};
		List<String> isimList= Arrays.asList(isimler);
		
		//elimizde iki liste var
		//bir tanesi girilen isimler listesi digeri karsilastiracagimiz liste (isimList)
		
		System.out.println("toplam: "+girilenIsimler.size()+" isim girdiniz");
		int count=0;
		
		for (int i = 0; i < girilenIsimler.size(); i++) {
			
			if (isimList.contains(girilenIsimler.get(i))) {
				count++; // eger cagirdigim isim isimListte varsa bir arttirilir.
			}
			
			
		}
		
		System.out.println("girdiginiz isimlerden "+ count+ " tanesi listede zaten kayitliymis");
		
		scan.close();
	}

}
