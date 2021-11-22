package day07_ifelseif;

import java.util.Scanner;

public class c7_ifelseif03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Notunuzu giriniz:");
		
		double not=scan.nextDouble();
		
		if (not<0 ||not>100) {
			System.out.println("Lutfen gecerli bir not giriniz.");
		}
		else if (not<50) {
			System.out.println("D");
		}
		else if (not<60) {
			System.out.println("C");
		}
		else if (not<80) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
		
		
		/*
		if (calisanKadinsa) {
			if (yas>=60) {"emekli olabilirsin"} else   {"emekli olamazsin"}}
		else {
			if (yas>=65) {"emekli olabilirsin"} else   {"emekli olamazsin"}

		
		}
		*/
		
	}

}
