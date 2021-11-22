package day22_23_arraylist;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class c7_fibonacci {

	public static void main(String[] args) {
		int sayi1=0;
		int sayi2=1;
		int sayi3=sayi1+sayi2;
		
		int count=0;
		
		List<Integer>istenenSayilar=new ArrayList<>();
		
		do {
			sayi1=sayi2;
			sayi2=sayi3;
			sayi3=sayi2+sayi3;
					
			if (sayi3>100) {
				istenenSayilar.add(sayi3);
				count++;
			}
			
			
		} while (count<20);
		
		
		
	}

}
