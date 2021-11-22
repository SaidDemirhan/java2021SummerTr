package day22_23_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class c3_set {

	public static void main(String[] args) {
		// verilen bir array de tekrar edenelementleri silip tekrarsiz yeni bir array
		// haline getirin.

		int arr[] = { 2, 3, 5, 7, 3, 5, 2, 6, 3, 1, 4, 2, 3 };

		List<Integer> sayilar = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (!sayilar.contains(arr[i])) {
				sayilar.add(arr[i]);
			}
		}

		System.out.println(sayilar);      //[2, 3, 5, 7, 6, 1, 4]
		Collections.sort(sayilar);
		
		System.out.println(sayilar);      //[1, 2, 3, 4, 5, 6, 7]
		
		//bu elementleri yeni Array e ekleyelim
		
		int yeniArr[]= new int[sayilar.size()];
		
		for (int i = 0; i < yeniArr.length; i++) {
			
			yeniArr[i]=sayilar.get(i);
			
			}
		
		System.out.println("tekrarsiz array : " + Arrays.toString(yeniArr));   
		
		//tekrarsiz array : [1, 2, 3, 4, 5, 6, 7]
	}

}
