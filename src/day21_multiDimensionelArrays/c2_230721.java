package day21_multiDimensionelArrays;

public class c2_230721 {

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		// ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

		int[][] arr= {{1,9,3},{7,5,16}};
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				carpim*= arr[i] [j];
				System.out.print(arr[i] [j]);
			}
				
		}
		
		System.out.println("");
		System.out.println("Tum elementlerin carpimi: "+carpim);
		
		
		
		
	}

}
