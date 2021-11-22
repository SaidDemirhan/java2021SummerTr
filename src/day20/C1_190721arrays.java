package day20;

import java.util.Arrays;

public class C1_190721arrays {

	public static void main(String[] args) {
		// Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin. 
		//Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

		int arr[]= {1,2,3};
		int temp =arr[0];
		arr[0]=arr[1];  
		arr[1]=arr[2];
		arr[2]=temp;
		
		System.out.println(Arrays.toString(arr)); 		//[2, 3, 1]
		
		//array in butun elementlerini bir sola tasiyacak kod yazin.
		
		int arr2[]= {1,2,9,4,6,8};
		
		temp=arr2[0];
		
		for (int i = 0; i < arr2.length-1; i++) {
			arr2[i]=arr2[i+1]; 		// eger böyle yazdirirsak [3,9,4,6,8,8] olacak 
		}
			System.out.println(Arrays.toString(arr2));  //[3,9,4,6,8,8]
			arr2[arr2.length-1]=temp;
			System.out.println(Arrays.toString(arr2));
			
			
			
			
		
		
		
	}

}
