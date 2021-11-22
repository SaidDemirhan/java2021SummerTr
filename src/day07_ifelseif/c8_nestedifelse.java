package day07_ifelseif;

import java.util.Scanner;

public class c8_nestedifelse {

	public static void main(String[] args) {
		// Kullanicidan cinsiyet ve yas aliniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
		// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz ve enetra basiniz \nErkek icin E bayan icin K giriniz.");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yasinizi tam sayi olarak giriniz:");
		
		int yas=scan.nextInt();
		
		
		if (cinsiyet=='K') { //kadinsa
			if (yas>=60) 
				System.out.println("emekli olabilirsin");
			} else {  
			System.out.println("emekli olamazsin");
		    }
		}
			
		else if (cinsiyet=='E') {  //erkekse
			if (yas>=65) {
				System.out.println("emekli olabilirsin");}
			else   {	
				
				System.out.println("emekli olamazsin \nDaha " +(65-yas) +" yil calismalisin." );
			}
				
		}		else //yanlis giris
				
				System.out.println("yanlis giris Erkek icin E bayan icin K giriniz.");
		
			
			}
			}
			
		
		
		
		
		
		
	}

}
