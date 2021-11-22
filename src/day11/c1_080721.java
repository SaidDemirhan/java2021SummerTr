package day11;

import java.util.Scanner;

public class c1_080721 {

	public static void main(String[] args) {
		//kullaanicidan bir cumle ve bir kelime alin cumlede kelimenin kelimenin kullanilip kullsnilmadigini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Lütfen bir kelime giriniz");
		String kelime=scan.next().toLowerCase();
		
		if (cumle.indexOf(kelime)!=-1) {
			System.out.println("Kelime cumlede kullanilmis");
		}else {
			System.out.println("Kelime cümlede kullanilmamis");
		}
		
		
		if (cumle.contains(kelime)) {
			System.out.println("kelime cumlede kullanilmis");
		}else {
			System.out.println("Kelime cumlede kullanilmamis");
		}
		
		
		
		
	}

}
