package day20;

import java.util.Arrays;

public class C1_190721 {

	public static void main(String[] args) {
		String str = "Java candir.";

		// split methodu bize bir aary döner
		// dönen arrayi ya direkt yazdirmaliyiz,
		System.out.println(Arrays.toString(str.split(",")));

		// ya da
		String bolunmusKelimeArray[] = str.split(",");
		System.out.println(bolunmusKelimeArray);

		String bolunmusKelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2));

		System.out.println(bolunmusKelimeArray2.length);
		
		String bolunmusKelimeArray3[] = str.split("");
		System.out.println(Arrays.toString(bolunmusKelimeArray3));
		
		
		
		String cumle ="Java ögren, rahat yasa"; //kac kelimeden olustugunu bul
		
		String kelimeArrayi[]= cumle.split(" ");
		System.out.println("kelime sayisi: "+ kelimeArrayi.length);
		
		
		//harf sayisi
		
		String cumle2= cumle.replaceAll("W", "");
		System.out.println(cumle2);
		System.out.println(cumle2.length()); //18
		
		
		String harfArrayi[]=cumle2.split("");
		System.out.println(harfArrayi.length);
		
		
		
	}

}
