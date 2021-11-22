package day24_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class c3_eachforLoop {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
	       list1.add("ALI");
	       list1.add("Veli");
	       list1.add("Ayse");
	       list1.add("Fatma");
	       list1.add("Omer");
	       
	       
	       List<String> list2= new ArrayList<>();
	       list2.add("Ali");
	       list2.add("Kemal");
	       list2.add("Hatice");
	       list2.add("FATma");
	       list2.add("Omer");
	       list2.add("Yusuf");
	       
	       
	       //listeleri karsilastirip ortaklari yazdiralim
	       
	       
	       // bu listedeki isimlerden uzunlugu 4 harften fazla olan isimleri yazdiralim
	       //for -each loop imdex veya size bakmadan tek tek tum elementleri bize getirir.
	       
	       for (String each : list1) {
			//1.gelecek elementlerin data turu ne(String)
	    	   //2.getirdigi elementlere verilen gecici isim(each)
	    	   //genelde each veya w ismi kullaniliyor.
	    	   		//3.elementlerin gelecegi Collection(list2) ayrica (Array) de var
	    	   
	    	   //System.out.print(each+" ");  //siralamanin hicbir önemi yok //ALI Veli Ayse Fatma Omer
	    	   
	    	   
	    	   if (each.length()>4) {
	    		   System.out.print(each+" "); //sadece //Fatma yazdirdi
			}
	    	   
	    	   
		}

	}

}
