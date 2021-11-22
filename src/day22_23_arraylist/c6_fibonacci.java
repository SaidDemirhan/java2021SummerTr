package day22_23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class c6_fibonacci {

	public static void main(String[] args) {
		// 100 den buyuk ilk 20 fibonacci sayisini list olarak yazdirin.
		
		List <Integer> fibonacci= new ArrayList <>();
		
		List <Integer> istenenSayilar= new ArrayList <>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		
		int count=0;
		
		int sayi =1;
		int i=1;
		
		
		do {
			sayi= fibonacci.get(i-1)+fibonacci.get(i);
			fibonacci.add(sayi);
			
			if (sayi>100) {
				istenenSayilar.add(sayi);
				count++;
			}
			
			i++;
		} while (count<=20);
		 
	System.out.println(istenenSayilar);
	
	
	System.out.println(fibonacci);
	}

}
