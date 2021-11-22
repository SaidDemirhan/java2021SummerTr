package day19arrays;

import java.util.Arrays;

public class C1_170721arrays {

	public static void main(String[] args) {

		short arr1 []= new short[5]; 	//short array in degil icine koyulacak degerlerin data turu
		//data turu non primitive 
		//eger non primitive bir detayi direkt syso ile yazdirmaya calisirsak java arr1 in ref bilgisini yazdirir.
		
		
		System.out.println(arr1); 			//[S@5d22bbb7
		
		System.out.println();

		//Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu  array’i yazdirin.
		
		
		String isimler[]=new String[4];
		isimler[0]="Ali";
		isimler[1]="Veli";
		isimler[2]="Ayse";
		isimler[3]="Fatma";
		
		
		//oder
		
		String isimler2[]= {"ali","veli","ayse","fatma"};
		
		//isimler array indeki veli yerine hasan yazalim
		
		isimler[1]="Hasan";
		
		//isimler[5]="Hakan";	//Java . idex var mi yok mu bilmiyor syntax acisindan sorun olmadigi icin hata vermiyor.
		//calistirilinca run yapilinca hata verir. 5, indexi bulmadigi icin rte verir.
		
		System.out.println(isimler.length); 	//4
		
		System.out.println(isimler[3]); 	//Fatma
		
		System.out.println(isimler2[1]);  	//veli
		
			
			
			
		
	//tum elemanlari yazdirma
			//1. yol loop kullanma
			for (int i = 0; i < isimler2.length; i++) {
				System.out.print(isimler2[i]+" ");
				
			//2. yol Arrays class indan yardim aliriz.
				
			
			
			}
			System.out.println(" ");
			System.out.print(Arrays.toString(isimler));
			
			// eger array i direkt olarak yazdirmak isterseniz bir ustteki methodu (Arrays.toString) kullanmaliyiz 
			//ve parametre olarak array in adini yazmaliyiz.
			
			
	}

}
