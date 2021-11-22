package day10;

import java.util.Scanner;

public class stringManipullation {

	public static void main(String[] args) {


		String name1= "Ali Can";
		String name2= "Ali Can";
		String name3= name1+"";
		String name4= "Ali";
		String name5= "Can";
		String name6= name4+" "+name5;
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals(name6));
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name2==name6);
		
		String name7="Ali Can";
		String name8="ALI CAN";
		String name9="ali can";
		String name10="AliCan";
		
		System.out.println(name1.equals(name7));
		System.out.println(name1.equalsIgnoreCase(name9));
		
		System.out.println(name7.equalsIgnoreCase(name9));
		System.out.println(name8.equalsIgnoreCase(name9));
		System.out.println(name9.equalsIgnoreCase(name10));
		
		
		String str="";
		System.out.println(str.length());
		
		// str2=null;
				
				// System.out.println(str.length()); // hata verir
		
		String str3="lihkvflBYLJPWEPFLHOÄÖAFPEFJJFJFÄHVBÖAFJFPÄAJFÖUGUCFuFEF3456789i8ihriuwrrjpr/(%Ö$ämioweshf";
		
		System.out.println(str3.length()-1);
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cumle yaziniz");
		
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Kelime giriniz");
		String kelime= scan.next().toLowerCase();
		
		int ilkkullanimindexi= cumle.indexOf(kelime);
		int sonkullanimindexi= cumle.lastIndexOf(kelime);
		
		System.out.println(ilkkullanimindexi);
		System.out.println(sonkullanimindexi);
		
		if (ilkkullanimindexi==-1) {
			System.out.println("girilen kelime kullanilmamis");
		}else if (ilkkullanimindexi==sonkullanimindexi){
			System.out.println("1 kez kullanilmis");
		}else {
			System.out.println("Birden fazla girilen kelime kullanilmis.");
		}
		
		
		
		
		
		
	}

}
