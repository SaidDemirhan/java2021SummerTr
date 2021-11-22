package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class c3_ifels02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Lütfen bir karakter giriniz:");
	
		char karakter= scan.next().charAt(0);
		
		if (karakter>='A'&& karakter<='Z'||karakter>='a'&& karakter<='z' ) {
			
			System.out.println("Girilen karakter Harftir.");}
		else {
			System.out.println("girilen karakter harf degildir");
		}
	
	
	
	
	}
	
	
	

}
