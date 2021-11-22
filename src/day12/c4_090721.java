package day12;

import java.util.Scanner;

public class c4_090721 {

	public static void main(String[] args) {
		//Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		//$harften az veya cok ise hata mesaji ver.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen 4 harfli bir kelime giriniz:");
		
		String kelime= scan.nextLine();
		
				if (kelime.length()!=4) {
					System.out.println("Lütfen 4 harfli bir kelime giriniz");
				}else {
					System.out.print(kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
				}
			
		
		
		
	}

}
