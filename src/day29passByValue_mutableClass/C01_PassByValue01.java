package day29passByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue01 {

	public static void main(String[] args) {
		/*
		 * elemanlarini artirmayi deneyelim - 1. Method’da elemanlari for each loop
		 * kullanarak artirin - 2. Method’da elemanlari set method’u kullanarak artirin
		 * - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini
		 * kontrol edelim.
		 */

		List<Integer> sayiList = new ArrayList<>();
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);

		System.out.println("ilk listemiz " + sayiList); // ilk listemiz [10, 11, 12]

		forLoopIleArttir(sayiList);

	}

	private static void forLoopIleArttir(List<Integer> sayiList) {
		// foor each Loop ile elemanlarini arttiralim

		System.out.println("foreach loop ile arttirdigimiz elementler");
		for (Integer each : sayiList) {
			each+=2;
			
			System.out.print(each+" "); //12 13 14 
		}
		System.out.println();
		System.out.println("Foreach loop tan sonra list"+sayiList); //[10, 11, 12]
		
		
		//forloopla yapalim
		// yaptik ama olmadi
		
		setIleArttir(sayiList);
		
		
		
		
		}

	private static void setIleArttir(List<Integer> sayiList) {
		// set ile elemanlari arttiralim
		
		for (int i = 0; i < sayiList.size(); i++) {
			sayiList.set(i, sayiList.get(i)+5);
			
			
		}
		
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
