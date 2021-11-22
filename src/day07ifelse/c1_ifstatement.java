package day07ifelse;

import java.util.Scanner;

public class c1_ifstatement {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen gün ismini giriniz: ");

		String gunIsmi=scan.next().toLowerCase();
		
		//bayrak kullanimi(Flag)
		int flag=0;
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")|| gunIsmi.equals ("carsamba")||
				gunIsmi.equals("persembe")||gunIsmi.equals("cuma")) {
			
			System.out.println("Girdiginiz gun hafta icidir");
			flag++;
		}
		
		if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println("Girdiginiz gun hafta sonudur");
			flag++;
		
		
	}

		//pazar yazdigimizda flag=1  2. if body si calisacak
		//sali yasak flag=1			1. if body si calisacak
		// peezer diye yanlis yazarsak  flag=0 kalacak
		
		if (flag==0) {
			System.out.println("lütfen gecerli bir gün ismi giriniz");
		}
			
		}
}
