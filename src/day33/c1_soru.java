package day33;

public class c1_soru {

	public static void main(String[] args) {
		/*
		 * Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi
		 * ters çeviren ve cümlenin palindrom olup olmadığını kontrol eden (büyük/küçük
		 * harf duyarlılığı olmadan) bir Java programı yazın. (without case sensitivity)
		 * Eg : input : I love Java Output: "Reversed sentence : avaJ evol I . It is not
		 * a palindrome"
		 */

		//scanner ile de alisak direkt sb nin icine alabilirdik.
		
		StringBuilder sb= new StringBuilder("tras neden sart");
		
		
		
		String tersString= sb.reverse().toString();
		
		if (tersString.equalsIgnoreCase(tersString)) {
			System.out.println("Girdiginiz ifade POLINDROME ifadedir: "+tersString);
		}
		else {
			System.out.println("Girdiginiz ifade Polindrome ifade degildir: "+tersString);
		}
	}

}
