package day19arrays;

import java.util.Arrays;

public class C2_array {

	public static void main(String[] args) {

		int arr[]=new int[5];
		System.out.println(Arrays.toString(arr));

		//bir kez olusturulan array in sonradan uzunlugunu degistirebilir miyim?
		
		//yani [0, 0, 0, 0, 0, 5]
		
		//arr[5]=5; hata vermiyor calismadan ama calisinca rte olur.
		
		//!!! array in lengt i sonradan degistirilemez,
		//array i kullanissiz yapan bu özelligidir.
		
		
		arr[2]=1;
		System.out.println(Arrays.toString(arr));
		
		
		arr= new int[6];  //yepyeni 1 alti bardaklik araay olusturuyor ve öncekini ölduruyor.
		
		System.out.println(Arrays.toString(arr));
	}

}
