package day24_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class c5_forEachLoop {

	public static void main(String[] args) {
		/*
		 * Soru 3: iki String array olusturunuz ve bu array’lerdeki ortak elemanlari
		 * For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman
		 * yoksa ekrana “Ortak eleman yok” yazdiriniz
		 * 
		 */

		String arr1[]= {"A","b","C","d"};
		String arr2[]= {"A","z","W","d","E"};
		
		List <String> ortaklar=new ArrayList<>();
		
		for (String each1 : arr1) {
			
			for (String each2 : arr2) {
				
				if (each1.equals(each2)) { //.equalsIgnoreCase yazarsak buyuk kucuk farketmeden listeye ekler. 
					ortaklar.add(each1);
				}
				
				
				
			}
		}
		
		if (ortaklar.isEmpty()) {
			System.out.println("Ortak eleman yok");
		}else {
			System.out.println(ortaklar); //[A, d]
		}
		
		
		
		
	}

}
