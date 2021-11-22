package day17;

import java.util.Scanner;

public class c1150721 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir rakam girmesini isteyin ve girilrn rakama göre
		// asagidaki sekli cizdirin.
		// *
		// **
		// ***
		// ***

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz");
		int rakam = scan.nextInt();
		
		for (int satirNo = 1; satirNo <=rakam; satirNo++) {
			
			for (int i = 1; i <=satirNo; i++) {
				
				System.out.print("* ");
			}
			
			System.out.println("");
			
			
		}

	}

}
