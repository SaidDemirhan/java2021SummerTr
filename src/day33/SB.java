package day33;

public class SB {

	public static void main(String[] args) {

		String str="Hayat";
				
		StringBuilder sb =new StringBuilder("Hayat");
		
		System.out.println(str.equals(sb));		//karsilastir false
		
		//System.out.println(str==sb); //== gibi calismasina ragmen hata verir datatype farkli
		
		System.out.println(str.equals(sb.toString())); //true stringe cevirdigi icin
		
		System.out.println(sb.equals(sb.toString())); //false cevirdigimiz icin dt farkli oldu
		
		System.out.println(sb.append(" güzedir")); //Hayat güzedir
		
		System.out.println(sb.append(str,2,5)); //Hayat güzediryat seklinde ekler
		
		
		
		
		
		
	}

}
