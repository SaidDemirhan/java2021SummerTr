package day07_ifelseif;

import java.util.Scanner;

public class c8_nestedifels {

	public static void main(String[] args) {
		/*
		 * Nested If kullanarak asagidaki soruyu cozen kodu yaziniz. Kullanicidan bir
		 * sifre girmesini isteyin Eger ilk harf buyuk harf ise “A” olup olmadigini
		 * kontrol edin. Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre”
		 * yazdirin. Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk
		 * harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 */

		
		
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Vize 1 notunu giriniz : ");
		double vize1=scanner.nextDouble();
		
		System.out.print("Vize 2 notunu giriniz : ");
		double vize2=scanner.nextDouble();
		
		System.out.print("Final notunu giriniz : ");
		double finalNotu=scanner.nextDouble();
		
		double gecmeNotu= (vize1+vize2)/2*0.3+finalNotu*0.7;
				
				System.out.println("Notunuz: "+gecmeNotu);
				
				
				
	}

}
