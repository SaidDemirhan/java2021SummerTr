package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class c4_ifstatement03 {
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen istediginiz gun icin ilk harfi giriniz");
		
		//String harf=scan.next();	//tek karakter char olarak da alinabilir 
									//ama non-primitive oldugu icin method lari yoktur, 
									//o y�zden String olarak alinabilir.
		
		char harf1=scan.next().toLowerCase().charAt(0);		//toLowerCase k�ck harfe cevirir. toUpperCase b�y�k harfe d�nd�r�r
		if (harf1=='p') {								//(harf1=='p' ||'P') seklinde de ayri ayri hepsine yazilabilir.
			System.out.println("ptesi,persembe,pazar");
		}

		if (harf1=='s') {								//(harf1=='p' ||'P') seklinde de ayri ayri hepsine yazilabilir.
			System.out.println("sali");
		}
		
		if (harf1=='c') {								//(harf1=='p' ||'P') seklinde de ayri ayri hepsine yazilabilir.
			System.out.println("ctesi,carsamba, cuma");
		}
		if (harf1!= 'p'&& harf1!='s'&& harf1!='c') {
			System.out.println("L�tfen gecerli bir harf giriniz");
			
		}
		
		
		
		
	}

}
