package day11;

import java.util.Scanner;

public class c2_080721 {

	public static void main(String[] args) {
		

		
		
		
		
		//Soru 1) Kullanicidan email adresini 
		//girmesini isteyin, mail @gmail.com iceriyorsa   
		//“Email adresiniz kaydedildi”, icermiyorsa 
		//“Lutfen gmail mail adresinizi giriniz.. “ yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen e mail adresinizi giriniz.");
		
		String email= scan.next();
		
		if (email.contains("@gmail.com")) {
			System.out.println("Email adresiniz kaydedildi");
		}else {
			System.out.println("Lütfen gmail adresi giriniz");
		}
		
		
		
		
		
		
		
	}

}
